package f0;

import v2.z1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 extends v1.n implements z1 {
    public ej.a H;
    public r0 I;
    public o1 J;
    public boolean K;
    public d3.k L;
    public final t0 M = new t0(this, 0);
    public t0 N;

    public w0(ej.a aVar, r0 r0Var, o1 o1Var, boolean z2) {
        this.H = aVar;
        this.I = r0Var;
        this.J = o1Var;
        this.K = z2;
        q1();
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    public final void q1() {
        this.L = new d3.k(new u0(this, 0), new u0(this, 1));
        this.N = this.K ? new t0(this, 1) : null;
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        d3.x.g(zVar);
        zVar.b(d3.v.N, this.M);
        if (this.J == o1.f19664a) {
            d3.k kVar = this.L;
            if (kVar == null) {
                fj.l.l("scrollAxisRange");
                throw null;
            }
            d3.y yVar = d3.v.f4797w;
            lj.d dVar = d3.x.f4803a[13];
            zVar.b(yVar, kVar);
        } else {
            d3.k kVar2 = this.L;
            if (kVar2 == null) {
                fj.l.l("scrollAxisRange");
                throw null;
            }
            d3.y yVar2 = d3.v.f4796v;
            lj.d dVar2 = d3.x.f4803a[12];
            zVar.b(yVar2, kVar2);
        }
        t0 t0Var = this.N;
        if (t0Var != null) {
            zVar.b(d3.m.f4738f, new d3.a(null, t0Var));
        }
        zVar.b(d3.m.C, new d3.a(null, new c2.x0(new u0(this, 2), 3)));
        d3.d dVarE = this.I.e();
        d3.y yVar3 = d3.v.f4781f;
        lj.d dVar3 = d3.x.f4803a[24];
        zVar.b(yVar3, dVarE);
    }
}
