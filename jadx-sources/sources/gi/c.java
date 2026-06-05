package gi;

import fj.l;
import t2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements fi.a {

    /* renamed from: a, reason: collision with root package name */
    public final fi.a f7428a;

    /* renamed from: b, reason: collision with root package name */
    public final fi.a f7429b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7430c;

    public c(fi.a aVar, fi.a aVar2) {
        l.f(aVar, "backdrop1");
        l.f(aVar2, "backdrop2");
        this.f7428a = aVar;
        this.f7429b = aVar2;
        this.f7430c = aVar.a() || aVar2.a();
    }

    @Override // fi.a
    public final boolean a() {
        return this.f7430c;
    }

    @Override // fi.a
    public final void b(e2.d dVar, s3.c cVar, w wVar, ej.c cVar2) {
        l.f(dVar, "<this>");
        l.f(cVar, "density");
        this.f7428a.b(dVar, cVar, wVar, cVar2);
        this.f7429b.b(dVar, cVar, wVar, cVar2);
    }
}
