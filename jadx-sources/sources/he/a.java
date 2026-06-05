package he;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import nd.f;
import nd.g;
import nd.h;
import nd.i;
import yd.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7887a = f.f12280b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7888b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f7889c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f7890d;

    public static void a(Context context) throws h, g {
        Context context2;
        Context contextCreatePackageContext;
        e0.j(context, "Context must not be null");
        f7887a.getClass();
        AtomicBoolean atomicBoolean = i.f12283a;
        f fVar = f.f12280b;
        int iD = fVar.d(context, 11925000);
        if (iD != 0) {
            Intent intentB = fVar.b(context, "e", iD);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iD);
            if (intentB != null) {
                throw new h(iD);
            }
            throw new g(iD);
        }
        synchronized (f7888b) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = e.c(context, e.f20283d, "com.google.android.gms.providerinstaller.dynamite").f20293a;
            } catch (yd.a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                try {
                    if (f7890d == null) {
                        Class cls = Long.TYPE;
                        f7890d = contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    f7890d.invoke(null, context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2));
                } catch (Exception e11) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                }
            }
            if (contextCreatePackageContext != null) {
                b(contextCreatePackageContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new g(8);
            }
        }
    }

    public static void b(Context context, String str) throws IllegalAccessException, IllegalArgumentException, g, InvocationTargetException {
        try {
            if (f7889c == null) {
                f7889c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f7889c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage())));
            }
            throw new g(8);
        }
    }
}
