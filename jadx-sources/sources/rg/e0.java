package rg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e0 extends f {

    /* renamed from: d, reason: collision with root package name */
    public final k f14405d;

    /* renamed from: e, reason: collision with root package name */
    public final mg.l f14406e;

    /* renamed from: f, reason: collision with root package name */
    public final wg.h f14407f;

    public e0(k kVar, mg.l lVar, wg.h hVar) {
        this.f14405d = kVar;
        this.f14406e = lVar;
        this.f14407f = hVar;
    }

    @Override // rg.f
    public final f a(wg.h hVar) {
        return new e0(this.f14405d, this.f14406e, hVar);
    }

    @Override // rg.f
    public final wg.d b(wg.c cVar, wg.h hVar) {
        return new wg.d(this, new mg.a(new mg.d(this.f14405d, hVar.f19305a), cVar.f19293b));
    }

    @Override // rg.f
    public final void c(mg.b bVar) {
        this.f14406e.c(bVar);
    }

    @Override // rg.f
    public final wg.h d() {
        return this.f14407f;
    }

    @Override // rg.f
    public final boolean e(f fVar) {
        return (fVar instanceof e0) && ((e0) fVar).f14406e.equals(this.f14406e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return e0Var.f14406e.equals(this.f14406e) && e0Var.f14405d.equals(this.f14405d) && e0Var.f14407f.equals(this.f14407f);
    }

    @Override // rg.f
    public final boolean f(int i10) {
        return i10 == 5;
    }

    public final int hashCode() {
        return this.f14407f.hashCode() + ((this.f14405d.hashCode() + (this.f14406e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
