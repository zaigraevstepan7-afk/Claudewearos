package pg;

import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f12905a;

    public j(q qVar) {
        this.f12905a = qVar;
    }

    @Override // pg.k
    public final void a(Map map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            return;
        }
        String str2 = (String) map.get("d");
        q qVar = this.f12905a;
        if (qVar.f12948y.A()) {
            qVar.f12948y.l(null, m1.k("Failed to send stats: ", str, " (message: ", str2, ")"), new Object[0]);
        }
    }
}
