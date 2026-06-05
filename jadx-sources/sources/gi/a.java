package gi;

import e0.t;
import fj.l;
import t2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements fi.a {

    /* renamed from: a, reason: collision with root package name */
    public final fi.a f7424a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.e f7425b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7426c;

    public a(fi.a aVar, ej.e eVar) {
        l.f(aVar, "backdrop");
        this.f7424a = aVar;
        this.f7425b = eVar;
        this.f7426c = aVar.a();
    }

    @Override // fi.a
    public final boolean a() {
        return this.f7426c;
    }

    @Override // fi.a
    public final void b(e2.d dVar, s3.c cVar, w wVar, ej.c cVar2) {
        l.f(dVar, "<this>");
        l.f(cVar, "density");
        this.f7425b.invoke(dVar, new t(this, cVar, wVar, cVar2, 3));
    }
}
