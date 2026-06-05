package ji;

import android.graphics.BlurMaskFilter;
import c2.b0;
import c2.e0;
import c2.u;
import fi.k;
import fj.l;
import pi.o;
import u6.v;
import v1.n;
import v2.h0;
import v2.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends n implements m {
    public k H;
    public ej.a I;
    public f2.b J;
    public final c2.h K = e0.g();

    public j(k kVar, ej.a aVar) {
        this.H = kVar;
        this.I = aVar;
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        f fVar = (f) this.I.a();
        if (fVar == null) {
            h0Var.f();
            return;
        }
        long j = fVar.f8974b;
        float f10 = fVar.f8973a;
        f2.b bVar2 = this.J;
        if (bVar2 != null) {
            long jA = bVar.a();
            s3.m layoutDirection = h0Var.getLayoutDirection();
            final float fW0 = h0Var.w0(f10);
            final float fW02 = h0Var.w0(Float.intBitsToFloat((int) (j >> 32)));
            final float fW03 = h0Var.w0(Float.intBitsToFloat((int) (j & 4294967295L)));
            float f11 = 4.0f * fW0;
            long jCeil = (((int) Math.ceil((Float.intBitsToFloat((int) (jA >> 32)) + f11) + fW02)) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (jA & 4294967295L)) + f11 + fW03)) & 4294967295L);
            final e0 e0VarB = ((fi.j) this.H.f6779g).b(jA, layoutDirection, h0Var);
            long j4 = fVar.f8975c;
            c2.h hVar = this.K;
            hVar.e(j4);
            float fW04 = h0Var.w0(f10);
            hVar.f2999a.setMaskFilter(fW04 > 0.0f ? new BlurMaskFilter(fW04, BlurMaskFilter.Blur.NORMAL) : null);
            bVar2.f(fVar.f8976d);
            int i10 = fVar.f8977e;
            f2.d dVar = bVar2.f6514a;
            if (dVar.f() != i10) {
                dVar.i(i10);
            }
            h0Var.n0(bVar2, jCeil, new ej.c() { // from class: ji.i
                @Override // ej.c
                public final Object invoke(Object obj) {
                    e0 e0Var = e0VarB;
                    j jVar = this;
                    e2.d dVar2 = (e2.d) obj;
                    l.f(dVar2, "$this$record");
                    float f12 = fW0 * 2.0f;
                    float f13 = fW02;
                    float f14 = f12 + f13;
                    float f15 = fW03;
                    float f16 = f12 + f15;
                    ((ld.i) dVar2.C0().f373b).U(f14, f16);
                    try {
                        u uVarH = dVar2.C0().h();
                        e0.l(uVarH, e0Var, jVar.K);
                        uVarH.p(-f13, -f15);
                        e0.l(uVarH, e0Var, h.f8980a);
                        uVarH.p(f13, f15);
                        ((ld.i) dVar2.C0().f373b).U(-f14, -f16);
                        return o.f13011a;
                    } catch (Throwable th2) {
                        ((ld.i) dVar2.C0().f373b).U(-f14, -f16);
                        throw th2;
                    }
                }
            });
            float f12 = 2.0f * (-fW0);
            ((ld.i) bVar.f5738b.f373b).U(f12, f12);
            try {
                v.C(h0Var, bVar2);
            } finally {
                float f13 = -f12;
                ((ld.i) bVar.f5738b.f373b).U(f13, f13);
            }
        }
        h0Var.f();
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        f2.b bVarB = v2.n.w(this).b();
        f2.d dVar = bVarB.f6514a;
        if (dVar.z() != 1) {
            dVar.N(1);
        }
        this.J = bVarB;
    }

    @Override // v1.n
    public final void j1() {
        b0 b0VarW = v2.n.w(this);
        f2.b bVar = this.J;
        if (bVar != null) {
            b0VarW.a(bVar);
            this.J = null;
        }
    }
}
