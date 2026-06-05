package pg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f12900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f12902c;

    public h(q qVar, Long l10, m mVar) {
        this.f12902c = qVar;
        this.f12900a = l10;
        this.f12901b = mVar;
    }

    @Override // pg.k
    public final void a(Map map) {
        q qVar = this.f12902c;
        p1.l lVar = qVar.f12948y;
        ConcurrentHashMap concurrentHashMap = qVar.f12938o;
        Long l10 = this.f12900a;
        m mVar = (m) concurrentHashMap.get(l10);
        m mVar2 = this.f12901b;
        if (mVar == mVar2) {
            concurrentHashMap.remove(l10);
            mVar2.f12913b.a(map);
        } else if (lVar.A()) {
            lVar.l(null, "Ignoring on complete for get " + l10 + " because it was removed already.", new Object[0]);
        }
    }
}
