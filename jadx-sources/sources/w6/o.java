package w6;

import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final e7.b f18834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18835b;

    /* renamed from: c, reason: collision with root package name */
    public final fj.j f18836c;

    /* renamed from: d, reason: collision with root package name */
    public final pi.m f18837d = u6.v.Q(new q0.k(this, 19));

    /* JADX WARN: Multi-variable type inference failed */
    public o(e7.b bVar, String str, ej.e eVar) {
        this.f18834a = bVar;
        this.f18835b = str;
        this.f18836c = (fj.j) eVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ej.e, fj.j] */
    @Override // w6.b
    public final Object J(ej.e eVar, vi.c cVar) {
        n nVar = (n) cVar.getContext().C(n.f18832b);
        m mVar = nVar != null ? nVar.f18833a : null;
        if (mVar != null) {
            return eVar.invoke(mVar, cVar);
        }
        m mVar2 = new m(this.f18836c, (e7.a) this.f18837d.getValue());
        return b0.G(new n(mVar2), new t0.f(eVar, (ti.c) null, mVar2), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        pi.m mVar = this.f18837d;
        if (mVar.f13008b != pi.n.f13010a) {
            ((e7.a) mVar.getValue()).close();
        }
    }
}
