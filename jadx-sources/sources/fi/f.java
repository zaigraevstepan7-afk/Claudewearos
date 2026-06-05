package fi;

import android.graphics.RenderEffect;
import android.os.Build;
import b0.c1;
import c2.b0;
import f1.f1;
import f1.j1;
import fj.l;
import java.util.LinkedHashMap;
import qi.t;
import t2.p0;
import t2.r0;
import t2.s0;
import v1.n;
import v2.h0;
import v2.i1;
import v2.m;
import v2.m1;
import v2.o;
import v2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends n implements w, m, o, m1 {
    public a H;
    public k I;
    public ej.c J;
    public ej.c K;
    public gi.d L;
    public ej.e M;
    public ej.c N;
    public final e O;
    public f2.b P;
    public final d Q;
    public final j1 R;
    public final f1 S;
    public final d T;
    public final d U;

    public f(a aVar, k kVar, ej.c cVar, ej.c cVar2, gi.d dVar, ej.e eVar, ej.c cVar3) {
        l.f(aVar, "backdrop");
        l.f(cVar, "effects");
        this.H = aVar;
        this.I = kVar;
        this.J = cVar;
        this.K = cVar2;
        this.L = dVar;
        this.M = eVar;
        this.N = cVar3;
        this.O = new e(this);
        this.Q = new d(this, 1);
        this.R = new j1(null, f1.f.f6290d);
        this.S = new f1(0.0f);
        this.T = new d(this, 2);
        this.U = new d(this, 3);
    }

    @Override // v2.m1
    public final void F0() {
        v2.n.t(this, new a7.e(this, 7));
    }

    @Override // v2.o
    public final void N0(i1 i1Var) {
        if (i1Var.w1().G) {
            boolean zA = this.H.a();
            j1 j1Var = this.R;
            if (zA) {
                j1Var.setValue(i1Var);
            } else if (((t2.w) j1Var.getValue()) != null) {
                j1Var.setValue(null);
            }
            gi.d dVar = this.L;
            if (dVar != null) {
                dVar.f7433c.setValue(i1Var);
            }
        }
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        f2.b bVar;
        e eVar = this.O;
        eVar.getClass();
        e2.b bVar2 = h0Var.f17669a;
        float fE = bVar2.e();
        float fR0 = bVar2.r0();
        long jA = bVar2.a();
        s3.m layoutDirection = h0Var.getLayoutDirection();
        boolean z2 = (fE == eVar.f6754a && fR0 == eVar.f6755b && b2.e.a(jA, eVar.f6756c) && layoutDirection == eVar.f6757d) ? false : true;
        if (z2) {
            eVar.f6754a = fE;
            eVar.f6755b = fR0;
            eVar.f6756c = jA;
            l.f(layoutDirection, "<set-?>");
            eVar.f6757d = layoutDirection;
        }
        if (z2) {
            q1();
        }
        this.U.invoke(h0Var);
        ej.c cVar = this.N;
        if (cVar != null) {
            cVar.invoke(h0Var);
        }
        h0Var.f();
        gi.d dVar = this.L;
        if (dVar == null || (bVar = dVar.f7431a) == null) {
            return;
        }
        c.c(this, h0Var, bVar, cg.b.R(bVar2.a()), new d(this, 0));
    }

    @Override // v1.n
    public final void i1() {
        this.P = v2.n.w(this).b();
        v2.n.t(this, new a7.e(this, 7));
    }

    @Override // v1.n
    public final void j1() {
        b0 b0VarW = v2.n.w(this);
        f2.b bVar = this.P;
        if (bVar != null) {
            b0VarW.a(bVar);
            this.P = null;
        }
        e eVar = this.O;
        eVar.f6754a = 1.0f;
        eVar.f6755b = 1.0f;
        eVar.f6756c = 9205357640488583168L;
        eVar.f6757d = s3.m.f14752a;
        eVar.f6758e = 0.0f;
        eVar.f6759f = null;
        ((LinkedHashMap) eVar.f6760z.f10924b).clear();
        this.R.setValue(null);
        gi.d dVar = this.L;
        if (dVar != null) {
            dVar.f7433c.setValue(null);
        }
    }

    public final void q1() {
        if (Build.VERSION.SDK_INT >= 31) {
            ej.c cVar = this.J;
            e eVar = this.O;
            eVar.getClass();
            l.f(cVar, "effects");
            eVar.f6758e = 0.0f;
            eVar.f6759f = null;
            cVar.invoke(eVar);
            f2.b bVar = this.P;
            if (bVar != null) {
                RenderEffect renderEffect = eVar.f6759f;
                bVar.h(renderEffect != null ? new c2.m(renderEffect) : null);
            }
            this.S.h(eVar.f6758e);
        }
    }

    @Override // v2.w
    public final r0 r(s0 s0Var, p0 p0Var, long j) {
        l.f(p0Var, "measurable");
        t2.f1 f1VarY = p0Var.Y(j);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, t.f13521a, new c1(f1VarY, this));
    }
}
