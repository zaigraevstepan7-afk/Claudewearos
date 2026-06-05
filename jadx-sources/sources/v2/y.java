package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends i1 {

    /* renamed from: m0, reason: collision with root package name */
    public static final c2.h f17797m0;

    /* renamed from: k0, reason: collision with root package name */
    public w f17798k0;

    /* renamed from: l0, reason: collision with root package name */
    public x f17799l0;

    static {
        c2.h hVarG = c2.e0.g();
        hVarG.e(c2.w.f3056f);
        hVarG.k(1.0f);
        hVarG.l(1);
        f17797m0 = hVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(f0 f0Var, w wVar) {
        super(f0Var);
        this.f17798k0 = wVar;
        this.f17799l0 = f0Var.A != null ? new x(this) : null;
        if ((((v1.n) wVar).f17565a.f17567c & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // t2.f1
    public final void G0(long j, float f10, ej.c cVar) {
        M1(j, f10, cVar);
        if (this.C) {
            return;
        }
        H1();
        i1 i1Var = this.I;
        fj.l.c(i1Var);
        i1Var.D = this.D;
        e1().g();
        i1Var.D = false;
    }

    @Override // v2.i1
    public final void L1(c2.u uVar, f2.b bVar) {
        i1 i1Var;
        i1 i1Var2 = this.I;
        fj.l.c(i1Var2);
        i1Var2.p1(uVar, bVar);
        if (!((w2.t) i0.a(this.H)).getShowLayoutBounds() || (i1Var = this.I) == null) {
            return;
        }
        if (s3.l.b(this.f15552c, i1Var.f15552c) && s3.j.a(i1Var.S, 0L)) {
            return;
        }
        long j = this.f15552c;
        uVar.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f17797m0);
    }

    @Override // t2.p0
    public final int O(int i10) {
        w wVar = this.f17798k0;
        i1 i1Var = this.I;
        fj.l.c(i1Var);
        return wVar.b1(this, i1Var, i10);
    }

    @Override // v2.n0
    public final int P0(t2.a aVar) {
        x xVar = this.f17799l0;
        if (xVar == null) {
            return n.c(this, aVar);
        }
        q.a0 a0Var = xVar.M;
        int iD = a0Var.d(aVar);
        if (iD >= 0) {
            return a0Var.f13028c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // t2.p0
    public final int V(int i10) {
        w wVar = this.f17798k0;
        i1 i1Var = this.I;
        fj.l.c(i1Var);
        return wVar.R0(this, i1Var, i10);
    }

    @Override // t2.p0
    public final t2.f1 Y(long j) {
        N0(j);
        w wVar = this.f17798k0;
        i1 i1Var = this.I;
        fj.l.c(i1Var);
        P1(wVar.r(this, i1Var, j));
        G1();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y1(w wVar) {
        if (!wVar.equals(this.f17798k0) && (((v1.n) wVar).f17565a.f17567c & 512) != 0) {
            throw new ClassCastException();
        }
        this.f17798k0 = wVar;
    }

    @Override // t2.p0
    public final int l(int i10) {
        w wVar = this.f17798k0;
        i1 i1Var = this.I;
        fj.l.c(i1Var);
        return wVar.O(this, i1Var, i10);
    }

    @Override // v2.i1
    public final void r1() {
        if (this.f17799l0 == null) {
            this.f17799l0 = new x(this);
        }
    }

    @Override // v2.i1
    public final o0 u1() {
        return this.f17799l0;
    }

    @Override // t2.p0
    public final int v0(int i10) {
        w wVar = this.f17798k0;
        i1 i1Var = this.I;
        fj.l.c(i1Var);
        return wVar.C(this, i1Var, i10);
    }

    @Override // v2.i1
    public final v1.n w1() {
        return ((v1.n) this.f17798k0).f17565a;
    }
}
