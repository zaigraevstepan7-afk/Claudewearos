package wg;

import java.util.Comparator;
import ug.l;
import zg.k;
import zg.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q5.b f19298a;

    public f(q5.b bVar) {
        this.f19298a = bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        l.c((cVar.f19295d == null || cVar2.f19295d == null) ? false : true);
        return ((k) this.f19298a.f13236c).compare(new p(cVar.f19295d, cVar.f19293b.f20605a), new p(cVar2.f19295d, cVar2.f19293b.f20605a));
    }
}
