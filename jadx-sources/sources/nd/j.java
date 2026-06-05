package nd;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static j f12288b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12289a;

    public j(Context context, int i10) {
        switch (i10) {
            case 1:
                fj.l.f(context, "context");
                this.f12289a = context;
                break;
            default:
                this.f12289a = context.getApplicationContext();
                break;
        }
    }

    public static j a(Context context) {
        e0.i(context);
        synchronized (j.class) {
            if (f12288b == null) {
                m mVar = q.f12298a;
                synchronized (q.class) {
                    if (q.f12300c == null) {
                        q.f12300c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f12288b = new j(context, 0);
            }
        }
        return f12288b;
    }

    public static final n c(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < nVarArr.length; i10++) {
                if (nVarArr[i10].equals(oVar)) {
                    return nVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z2) {
        PackageInfo packageInfo2;
        if (!z2) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z2 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z2 ? c(packageInfo2, p.f12297a) : c(packageInfo2, p.f12297a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public z4.e b() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f12289a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listR0 = qi.l.R0(arrayList);
        if (listR0.isEmpty()) {
            return null;
        }
        Iterator it = listR0.iterator();
        z4.e eVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                fj.l.d(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                z4.e eVar2 = (z4.e) objNewInstance;
                if (!eVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (eVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    eVar = eVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return eVar;
    }
}
