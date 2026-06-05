package nc;

import android.os.RemoteException;
import com.anonlab.voidlauncher.LauncherApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: h, reason: collision with root package name */
    public static v2 f12248h;

    /* renamed from: f, reason: collision with root package name */
    public m1 f12254f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12249a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f12251c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12252d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12253e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final fc.s f12255g = new fc.s(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12250b = new ArrayList();

    static {
        new HashSet(Arrays.asList(fc.b.APP_OPEN_AD, fc.b.INTERSTITIAL, fc.b.REWARDED));
    }

    public static v2 c() {
        v2 v2Var;
        synchronized (v2.class) {
            try {
                if (f12248h == null) {
                    f12248h = new v2();
                }
                v2Var = f12248h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v2Var;
    }

    public final void a() {
        try {
            this.f12254f.zzk();
            this.f12254f.zzl(null, new xd.b(null));
        } catch (RemoteException e10) {
            rc.k.h("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public final void b(LauncherApplication launcherApplication) {
        if (this.f12254f == null) {
            this.f12254f = (m1) new n(s.f12202f.f12204b, launcherApplication).d(launcherApplication, false);
        }
    }
}
