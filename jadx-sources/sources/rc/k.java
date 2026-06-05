package rc;

import android.util.Log;
import com.google.android.gms.internal.ads.zzfvt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final zzfvt f14352a = zzfvt.zza(4000);

    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void b(String str) {
        if (j(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z2 = true;
            for (String str2 : f14352a.zzd(str)) {
                if (z2) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z2 = false;
            }
        }
    }

    public static void c(String str, Throwable th2) {
        if (j(3)) {
            Log.d("Ads", str, th2);
        }
    }

    public static void d(String str) {
        if (j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z2 = true;
            for (String str2 : f14352a.zzd(str)) {
                if (z2) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z2 = false;
            }
        }
    }

    public static void e(String str, Throwable th2) {
        if (j(6)) {
            Log.e("Ads", str, th2);
        }
    }

    public static void f(String str) {
        if (j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z2 = true;
            for (String str2 : f14352a.zzd(str)) {
                if (z2) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z2 = false;
            }
        }
    }

    public static void g(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z2 = true;
            for (String str2 : f14352a.zzd(str)) {
                if (z2) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z2 = false;
            }
        }
    }

    public static void h(String str, Throwable th2) {
        if (j(5)) {
            Log.w("Ads", str, th2);
        }
    }

    public static void i(String str, Exception exc) {
        if (j(5)) {
            if (exc != null) {
                h(a(str), exc);
            } else {
                g(a(str));
            }
        }
    }

    public static boolean j(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
