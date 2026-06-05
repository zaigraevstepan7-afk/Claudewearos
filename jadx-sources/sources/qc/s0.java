package qc;

import android.os.Process;
import android.webkit.CookieManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class s0 extends a {
    public final CookieManager d() {
        mc.n nVar = mc.n.D;
        r0 r0Var = nVar.f11577c;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th2) {
                int i10 = l0.f13401b;
                rc.k.e("Failed to obtain CookieManager.", th2);
                nVar.f11582h.zzv(th2, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }
}
