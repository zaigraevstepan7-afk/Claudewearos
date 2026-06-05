package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d0 implements p0, e, uj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f16351a;

    public d0(r0 r0Var) {
        this.f16351a = r0Var;
    }

    @Override // uj.l
    public final e a(ti.h hVar, int i10, sj.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != sj.a.f15040b) ? i0.l(this, hVar, i10, aVar) : this;
    }

    @Override // tj.e
    public final Object c(f fVar, ti.c cVar) {
        return this.f16351a.c(fVar, cVar);
    }

    @Override // tj.p0
    public final Object getValue() {
        return this.f16351a.getValue();
    }
}
