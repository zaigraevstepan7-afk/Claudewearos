package xd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.internal.e0;
import java.util.concurrent.atomic.AtomicBoolean;
import nd.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {
    private final String zza;
    private Object zzb;

    public d(String str) {
        this.zza = str;
    }

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) throws PackageManager.NameNotFoundException, c {
        Context contextCreatePackageContext;
        if (this.zzb == null) {
            e0.i(context);
            AtomicBoolean atomicBoolean = i.f12283a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new c("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) contextCreatePackageContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new c("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new c("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new c("Could not instantiate creator.", e12);
            }
        }
        return this.zzb;
    }
}
