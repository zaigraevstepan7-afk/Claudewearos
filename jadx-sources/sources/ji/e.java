package ji;

import android.os.Build;
import c2.b0;
import c2.e0;
import c2.l;
import c2.n0;
import c2.r;
import c2.u;
import fi.k;
import pi.o;
import u6.v;
import v1.n;
import v2.h0;
import v2.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends n implements m {
    public k H;
    public ej.a I;
    public f2.b J;
    public c2.j L;
    public final c2.h K = e0.g();
    public float M = Float.NaN;

    public e(k kVar, ej.a aVar) {
        this.H = kVar;
        this.I = aVar;
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        a aVar;
        c2.j jVarA;
        e2.b bVar = h0Var.f17669a;
        h0Var.f();
        if (Build.VERSION.SDK_INT >= 31 && (aVar = (a) this.I.a()) != null) {
            long j = aVar.f8960b;
            f2.b bVar2 = this.J;
            if (bVar2 != null) {
                long jA = bVar.a();
                s3.m layoutDirection = h0Var.getLayoutDirection();
                float fW0 = h0Var.w0(aVar.f8959a);
                final float fW02 = h0Var.w0(Float.intBitsToFloat((int) (j >> 32)));
                final float fW03 = h0Var.w0(Float.intBitsToFloat((int) (j & 4294967295L)));
                final e0 e0VarB = ((fi.j) this.H.f6779g).b(jA, layoutDirection, h0Var);
                if (e0VarB instanceof n0) {
                    jVarA = this.L;
                    if (jVarA == null) {
                        jVarA = l.a();
                        this.L = jVarA;
                    }
                } else {
                    jVarA = null;
                }
                this.K.e(aVar.f8961c);
                bVar2.f(aVar.f8962d);
                int i10 = aVar.f8963e;
                f2.d dVar = bVar2.f6514a;
                if (dVar.f() != i10) {
                    dVar.i(i10);
                }
                if (this.M != fW0) {
                    bVar2.h(fW0 > 0.0f ? new r(fW0, fW0, 3) : null);
                    this.M = fW0;
                }
                final c2.j jVar = jVarA;
                e2.d.s0(h0Var, bVar2, new ej.c() { // from class: ji.d
                    @Override // ej.c
                    public final Object invoke(Object obj) {
                        e2.d dVar2 = (e2.d) obj;
                        fj.l.f(dVar2, "$this$record");
                        u uVarH = dVar2.C0().h();
                        uVarH.f();
                        e0 e0Var = e0VarB;
                        fi.c.a(uVarH, e0Var, jVar);
                        e0.l(uVarH, e0Var, this.K);
                        float f10 = fW02;
                        float f11 = fW03;
                        uVarH.p(f10, f11);
                        e0.l(uVarH, e0Var, c.f8966a);
                        uVarH.p(-f10, -f11);
                        uVarH.q();
                        return o.f13011a;
                    }
                });
                u uVarH = bVar.f5738b.h();
                uVarH.f();
                fi.c.a(uVarH, e0VarB, jVar);
                v.C(h0Var, bVar2);
                uVarH.q();
            }
        }
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
