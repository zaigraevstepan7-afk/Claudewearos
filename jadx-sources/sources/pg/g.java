package pg;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f12897c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f12898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f12899e;

    public g(q qVar, String str, long j, o oVar, s sVar) {
        this.f12899e = qVar;
        this.f12895a = str;
        this.f12896b = j;
        this.f12897c = oVar;
        this.f12898d = sVar;
    }

    @Override // pg.k
    public final void a(Map map) {
        q qVar = this.f12899e;
        HashMap map2 = qVar.f12937n;
        p1.l lVar = qVar.f12948y;
        if (lVar.A()) {
            lVar.l(null, this.f12895a + " response: " + map, new Object[0]);
        }
        long j = this.f12896b;
        if (((o) map2.get(Long.valueOf(j))) == this.f12897c) {
            map2.remove(Long.valueOf(j));
            String str = (String) map.get("s");
            boolean zEquals = str.equals("ok");
            s sVar = this.f12898d;
            if (zEquals) {
                sVar.b(null, null);
            } else {
                sVar.b(str, (String) map.get("d"));
            }
        } else if (lVar.A()) {
            lVar.l(null, "Ignoring on complete for put " + j + " because it was removed already.", new Object[0]);
        }
        qVar.b();
    }
}
