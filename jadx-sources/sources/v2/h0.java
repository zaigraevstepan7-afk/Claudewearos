package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements e2.d {

    /* renamed from: a, reason: collision with root package name */
    public final e2.b f17669a = new e2.b();

    /* renamed from: b, reason: collision with root package name */
    public m f17670b;

    @Override // e2.d
    public final ac.d C0() {
        return this.f17669a.f5738b;
    }

    @Override // s3.c
    public final int E0(long j) {
        return this.f17669a.E0(j);
    }

    @Override // e2.d
    public final void H0(long j, float f10, long j4, e2.e eVar) {
        this.f17669a.H0(j, f10, j4, eVar);
    }

    @Override // s3.c
    public final int I0(float f10) {
        return this.f17669a.I0(f10);
    }

    @Override // s3.c
    public final long J(float f10) {
        return this.f17669a.J(f10);
    }

    @Override // s3.c
    public final long K(long j) {
        return this.f17669a.K(j);
    }

    @Override // e2.d
    public final long L0() {
        return this.f17669a.L0();
    }

    @Override // s3.c
    public final float N(long j) {
        return this.f17669a.N(j);
    }

    @Override // s3.c
    public final long Q0(long j) {
        return this.f17669a.Q0(j);
    }

    @Override // e2.d
    public final void R(long j, long j4, long j10, float f10, int i10) {
        this.f17669a.R(j, j4, j10, f10, i10);
    }

    @Override // e2.d
    public final void S(long j, float f10, float f11, long j4, long j10, e2.e eVar) {
        this.f17669a.S(j, f10, f11, j4, j10, eVar);
    }

    @Override // e2.d
    public final void S0(c2.j jVar, long j, e2.e eVar) {
        this.f17669a.S0(jVar, j, eVar);
    }

    @Override // e2.d
    public final void T(c2.g gVar, long j, long j4, long j10, float f10, c2.n nVar, int i10) {
        this.f17669a.T(gVar, j, j4, j10, f10, nVar, i10);
    }

    @Override // e2.d
    public final void T0(c2.j jVar, c2.s sVar, float f10, e2.e eVar, int i10) {
        this.f17669a.T0(jVar, sVar, f10, eVar, i10);
    }

    @Override // e2.d
    public final void W(c2.s sVar, long j, long j4, float f10, e2.e eVar, c2.n nVar, int i10) {
        this.f17669a.W(sVar, j, j4, f10, eVar, nVar, i10);
    }

    @Override // s3.c
    public final float W0(long j) {
        return this.f17669a.W0(j);
    }

    @Override // e2.d
    public final void Y0(c2.g gVar, c2.n nVar) {
        this.f17669a.Y0(gVar, nVar);
    }

    @Override // s3.c
    public final long Z(float f10) {
        return this.f17669a.Z(f10);
    }

    @Override // e2.d
    public final long a() {
        return this.f17669a.a();
    }

    @Override // s3.c
    public final float e() {
        return this.f17669a.e();
    }

    @Override // e2.d
    public final void e0(long j, long j4, long j10, float f10, e2.e eVar, int i10) {
        this.f17669a.e0(j, j4, j10, f10, eVar, i10);
    }

    public final void f() {
        e2.b bVar = this.f17669a;
        c2.u uVarH = bVar.f5738b.h();
        j jVar = this.f17670b;
        if (jVar == null) {
            throw t.m1.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        v1.n nVar = (v1.n) jVar;
        v1.n nVarE = nVar.f17565a.f17570f;
        if (nVarE == null || (nVarE.f17568d & 4) == 0) {
            nVarE = null;
        } else {
            while (nVarE != null) {
                int i10 = nVarE.f17567c;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    nVarE = nVarE.f17570f;
                }
            }
            nVarE = null;
        }
        if (nVarE == null) {
            i1 i1VarV = n.v(jVar, 4);
            if (i1VarV.w1() == nVar.f17565a) {
                i1VarV = i1VarV.I;
                fj.l.c(i1VarV);
            }
            i1VarV.L1(uVarH, (f2.b) bVar.f5738b.f374c);
            return;
        }
        g1.e eVar = null;
        while (nVarE != null) {
            if (nVarE instanceof m) {
                m mVar = (m) nVarE;
                f2.b bVar2 = (f2.b) bVar.f5738b.f374c;
                i1 i1VarV2 = n.v(mVar, 4);
                long jS = cg.b.S(i1VarV2.f15552c);
                f0 f0Var = i1VarV2.H;
                f0Var.getClass();
                ((w2.t) i0.a(f0Var)).getSharedDrawScope().l(uVarH, jS, i1VarV2, mVar, bVar2);
            } else if ((nVarE.f17567c & 4) != 0 && (nVarE instanceof k)) {
                int i11 = 0;
                for (v1.n nVar2 = ((k) nVarE).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                    if ((nVar2.f17567c & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            nVarE = nVar2;
                        } else {
                            if (eVar == null) {
                                eVar = new g1.e(new v1.n[16]);
                            }
                            if (nVarE != null) {
                                eVar.b(nVarE);
                                nVarE = null;
                            }
                            eVar.b(nVar2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            nVarE = n.e(eVar);
        }
    }

    @Override // e2.d
    public final void f0(long j, long j4, long j10, long j11, e2.e eVar) {
        this.f17669a.f0(j, j4, j10, j11, eVar);
    }

    @Override // e2.d
    public final s3.m getLayoutDirection() {
        return this.f17669a.f5737a.f5734b;
    }

    @Override // s3.c
    public final float h0(int i10) {
        return this.f17669a.h0(i10);
    }

    @Override // e2.d
    public final void k0(c2.p0 p0Var, float f10, long j) {
        this.f17669a.k0(p0Var, f10, j);
    }

    public final void l(c2.u uVar, long j, i1 i1Var, m mVar, f2.b bVar) {
        m mVar2 = this.f17670b;
        this.f17670b = mVar;
        s3.m mVar3 = i1Var.H.S;
        e2.b bVar2 = this.f17669a;
        s3.c cVarK = bVar2.f5738b.k();
        ac.d dVar = bVar2.f5738b;
        s3.m mVarS = dVar.s();
        c2.u uVarH = dVar.h();
        long jY = dVar.y();
        f2.b bVar3 = (f2.b) dVar.f374c;
        dVar.O(i1Var);
        dVar.P(mVar3);
        dVar.N(uVar);
        dVar.Q(j);
        dVar.f374c = bVar;
        uVar.f();
        try {
            mVar.O0(this);
            uVar.q();
            dVar.O(cVarK);
            dVar.P(mVarS);
            dVar.N(uVarH);
            dVar.Q(jY);
            dVar.f374c = bVar3;
            this.f17670b = mVar2;
        } catch (Throwable th2) {
            uVar.q();
            dVar.O(cVarK);
            dVar.P(mVarS);
            dVar.N(uVarH);
            dVar.Q(jY);
            dVar.f374c = bVar3;
            throw th2;
        }
    }

    @Override // s3.c
    public final float l0(float f10) {
        return f10 / this.f17669a.e();
    }

    @Override // e2.d
    public final void n0(f2.b bVar, long j, ej.c cVar) {
        bVar.e(this, getLayoutDirection(), j, new a2.n(this, this.f17670b, cVar, 4));
    }

    public final void r(c2.s sVar, long j, long j4, long j10, float f10, e2.e eVar) {
        e2.b bVar = this.f17669a;
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        bVar.f5737a.f5735c.l(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), bVar.l(sVar, eVar, f10, null, 3, 1));
    }

    @Override // s3.c
    public final float r0() {
        return this.f17669a.r0();
    }

    @Override // s3.c
    public final float w0(float f10) {
        return this.f17669a.e() * f10;
    }
}
