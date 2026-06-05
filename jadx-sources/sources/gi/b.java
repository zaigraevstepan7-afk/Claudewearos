package gi;

import fj.l;
import t2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements fi.a {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f7427a;

    public b(ej.c cVar) {
        l.f(cVar, "onDraw");
        this.f7427a = cVar;
    }

    @Override // fi.a
    public final boolean a() {
        return false;
    }

    @Override // fi.a
    public final void b(e2.d dVar, s3.c cVar, w wVar, ej.c cVar2) {
        l.f(dVar, "<this>");
        l.f(cVar, "density");
        this.f7427a.invoke(dVar);
    }
}
