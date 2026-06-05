package rg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x extends f {

    /* renamed from: d, reason: collision with root package name */
    public final wg.h f14489d;

    public x(wg.h hVar) {
        this.f14489d = hVar;
    }

    @Override // rg.f
    public final f a(wg.h hVar) {
        return new x(hVar);
    }

    @Override // rg.f
    public final wg.d b(wg.c cVar, wg.h hVar) {
        return null;
    }

    @Override // rg.f
    public final wg.h d() {
        return this.f14489d;
    }

    @Override // rg.f
    public final boolean e(f fVar) {
        return fVar instanceof x;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).f14489d.equals(this.f14489d);
    }

    @Override // rg.f
    public final boolean f(int i10) {
        return false;
    }

    public final int hashCode() {
        return this.f14489d.hashCode();
    }

    @Override // rg.f
    public final void c(mg.b bVar) {
    }
}
