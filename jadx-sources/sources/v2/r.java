package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends o0 {
    @Override // t2.p0
    public final int O(int i10) {
        q5.b bVarT = this.H.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.g(f0Var.Y.f17584d, f0Var.l(), i10);
    }

    @Override // v2.n0
    public final int P0(t2.a aVar) {
        r0 r0Var = this.H.H.Z.f17704q;
        fj.l.c(r0Var);
        g0 g0Var = r0Var.K;
        if (!r0Var.D) {
            j0 j0Var = r0Var.f17748f;
            if (j0Var.f17692d == b0.f17576b) {
                g0Var.f17657f = true;
                if (g0Var.f17653b) {
                    j0Var.f17694f = true;
                    j0Var.f17695g = true;
                }
            } else {
                g0Var.f17658g = true;
            }
        }
        r rVar = r0Var.A().f17752l0;
        if (rVar != null) {
            rVar.D = true;
        }
        r0Var.j0();
        r rVar2 = r0Var.A().f17752l0;
        if (rVar2 != null) {
            rVar2.D = false;
        }
        Integer num = (Integer) g0Var.f17660i.get(aVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.M.g(iIntValue, aVar);
        return iIntValue;
    }

    @Override // t2.p0
    public final int V(int i10) {
        q5.b bVarT = this.H.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.h(f0Var.Y.f17584d, f0Var.l(), i10);
    }

    @Override // t2.p0
    public final t2.f1 Y(long j) {
        N0(j);
        i1 i1Var = this.H;
        g1.e eVarY = i1Var.H.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            r0 r0Var = ((f0) objArr[i11]).Z.f17704q;
            fj.l.c(r0Var);
            r0Var.C = d0.f17604c;
        }
        f0 f0Var = i1Var.H;
        o0.l1(this, f0Var.P.a(this, f0Var.l(), j));
        return this;
    }

    @Override // t2.p0
    public final int l(int i10) {
        q5.b bVarT = this.H.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.i(f0Var.Y.f17584d, f0Var.l(), i10);
    }

    @Override // v2.o0
    public final void m1() {
        r0 r0Var = this.H.H.Z.f17704q;
        fj.l.c(r0Var);
        r0Var.Z0();
    }

    @Override // t2.p0
    public final int v0(int i10) {
        q5.b bVarT = this.H.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.f(f0Var.Y.f17584d, f0Var.l(), i10);
    }
}
