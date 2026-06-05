package qc;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbfe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l0 extends rc.k {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13401b = 0;

    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z2 = true;
            for (String str2 : rc.k.f14352a.zzd(str)) {
                if (z2) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z2 = false;
            }
        }
    }

    public static void l(String str, Throwable th2) {
        if (m()) {
            Log.v("Ads", str, th2);
        }
    }

    public static boolean m() {
        return rc.k.j(2) && ((Boolean) zzbfe.zza.zze()).booleanValue();
    }
}
