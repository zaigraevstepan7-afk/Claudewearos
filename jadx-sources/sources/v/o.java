package v;

import c1.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends v1.n implements v2.m, v2.m1, v2.z1 {
    public long H;
    public c2.s I;
    public float J;
    public c2.w0 K;
    public long L;
    public s3.m M;
    public c2.e0 N;
    public c2.w0 O;
    public c2.e0 P;

    @Override // v2.m1
    public final void F0() {
        this.L = 9205357640488583168L;
        this.M = null;
        this.N = null;
        this.O = null;
        v2.n.m(this);
    }

    @Override // v2.m
    public final void O0(v2.h0 h0Var) {
        c2.e0 e0Var;
        c2.s sVar;
        c2.j jVar;
        e2.b bVar = h0Var.f17669a;
        if (this.K == c2.e0.f2986b) {
            if (!c2.w.d(this.H, c2.w.f3058h)) {
                e2.d.c1(h0Var, this.H, 0L, 0L, 0.0f, null, 0, 126);
            }
            c2.s sVar2 = this.I;
            if (sVar2 != null) {
                e2.d.P(h0Var, sVar2, 0L, 0L, this.J, null, null, 0, 118);
            }
        } else {
            if (b2.e.a(bVar.a(), this.L) && h0Var.getLayoutDirection() == this.M && fj.l.b(this.O, this.K)) {
                e0Var = this.N;
                fj.l.c(e0Var);
            } else {
                v2.n.t(this, new s3(27, this, h0Var));
                e0Var = this.P;
                this.P = null;
            }
            this.N = e0Var;
            this.L = bVar.a();
            this.M = h0Var.getLayoutDirection();
            this.O = this.K;
            fj.l.c(e0Var);
            if (!c2.w.d(this.H, c2.w.f3058h)) {
                c2.e0.m(h0Var, e0Var, this.H);
            }
            c2.s sVar3 = this.I;
            if (sVar3 != null) {
                float f10 = this.J;
                boolean z2 = e0Var instanceof c2.m0;
                e2.g gVar = e2.g.f5743a;
                if (z2) {
                    b2.c cVar = ((c2.m0) e0Var).f3018f;
                    float f11 = cVar.f1502a;
                    float f12 = cVar.f1503b;
                    h0Var.W(sVar3, (4294967295L & Float.floatToRawIntBits(f12)) | (Float.floatToRawIntBits(f11) << 32), c2.e0.z(cVar), f10, gVar, null, 3);
                } else {
                    if (e0Var instanceof c2.n0) {
                        c2.n0 n0Var = (c2.n0) e0Var;
                        sVar = sVar3;
                        jVar = n0Var.f3023g;
                        if (jVar == null) {
                            b2.d dVar = n0Var.f3022f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f1513h >> 32));
                            float f13 = dVar.f1506a;
                            float f14 = dVar.f1507b;
                            long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
                            float fB = dVar.b();
                            float fA = dVar.a();
                            h0Var.r(sVar, jFloatToRawIntBits, (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), f10, gVar);
                        }
                    } else {
                        if (!(e0Var instanceof c2.l0)) {
                            throw new b3.e();
                        }
                        c2.j jVar2 = ((c2.l0) e0Var).f3016f;
                        sVar = sVar3;
                        jVar = jVar2;
                    }
                    h0Var.T0(jVar, sVar, f10, gVar, 3);
                }
            }
        }
        h0Var.f();
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        d3.x.e(zVar, this.K);
    }

    @Override // v2.z1
    public final boolean z() {
        return false;
    }
}
