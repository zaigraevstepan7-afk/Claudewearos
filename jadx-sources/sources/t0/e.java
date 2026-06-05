package t0;

import a2.w;
import android.view.autofill.AutofillValue;
import d3.v;
import d3.x;
import d3.y;
import g3.e0;
import g3.m0;
import k0.t0;
import l3.a0;
import l3.t;
import l3.z;
import v0.u0;
import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends v2.k implements z1 {
    public a0 J;
    public t K;
    public t0 L;
    public boolean M;
    public l3.n N;
    public u0 O;
    public l3.j P;
    public w Q;

    public static void t1(t0 t0Var, String str, boolean z2) {
        if (z2) {
            z zVar = t0Var.f9268e;
            k0.z zVar2 = t0Var.f9284v;
            if (zVar == null) {
                int length = str.length();
                zVar2.invoke(new t(str, e0.b(length, length), 4));
            } else {
                t tVarI = t0Var.f9267d.i(qi.k.c0(new l3.g[]{new l3.d(), new l3.a(str, 1)}));
                zVar.a(null, tVarI);
                zVar2.invoke(tVarI);
            }
        }
    }

    @Override // v2.z1
    public final boolean X0() {
        return true;
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        g3.f fVar = this.K.f9937a;
        lj.d[] dVarArr = x.f4803a;
        y yVar = v.F;
        lj.d[] dVarArr2 = x.f4803a;
        lj.d dVar = dVarArr2[18];
        zVar.b(yVar, fVar);
        g3.f fVar2 = this.J.f9881a;
        y yVar2 = v.G;
        lj.d dVar2 = dVarArr2[19];
        zVar.b(yVar2, fVar2);
        long j = this.K.f9938b;
        y yVar3 = v.H;
        lj.d dVar3 = dVarArr2[20];
        zVar.b(yVar3, new m0(j));
        y yVar4 = v.f4793s;
        lj.d dVar4 = dVarArr2[9];
        zVar.b(yVar4, w1.k.f18180a);
        w1.f fVar3 = new w1.f(AutofillValue.forText(this.K.f9937a));
        y yVar5 = v.f4794t;
        lj.d dVar5 = dVarArr2[10];
        zVar.b(yVar5, fVar3);
        x.b(zVar, new d(this, 0));
        int i10 = this.P.f9917d;
        if (i10 == 6) {
            w1.m.f18186a.getClass();
            w1.e eVar = w1.l.f18184c;
            y yVar6 = v.f4792r;
            lj.d dVar6 = dVarArr2[8];
            zVar.b(yVar6, eVar);
        } else if (i10 == 7 || i10 == 8) {
            w1.m.f18186a.getClass();
            w1.e eVar2 = w1.l.f18183b;
            y yVar7 = v.f4792r;
            lj.d dVar7 = dVarArr2[8];
            zVar.b(yVar7, eVar2);
        } else if (i10 == 4) {
            w1.m.f18186a.getClass();
            w1.e eVar3 = w1.l.f18185d;
            y yVar8 = v.f4792r;
            lj.d dVar8 = dVarArr2[8];
            zVar.b(yVar8, eVar3);
        }
        if (!this.M) {
            zVar.b(v.j, pi.o.f13011a);
        }
        boolean z2 = this.M;
        y yVar9 = v.O;
        lj.d dVar9 = dVarArr2[28];
        zVar.b(yVar9, Boolean.valueOf(z2));
        x.a(zVar, new d(this, 1));
        int i11 = 2;
        if (z2) {
            zVar.b(d3.m.f4742k, new d3.a(null, new d(this, i11)));
            zVar.b(d3.m.f4746o, new d3.a(null, new d(this, zVar)));
        }
        zVar.b(d3.m.j, new d3.a(null, new ab.a0(this, 7)));
        int i12 = this.P.f9918e;
        c cVar = new c(this, 6);
        zVar.b(v.I, new l3.i(i12));
        zVar.b(d3.m.f4747p, new d3.a(null, cVar));
        zVar.b(d3.m.f4734b, new d3.a(null, new c(this, 7)));
        zVar.b(d3.m.f4735c, new d3.a(null, new c(this, 1)));
        if (!m0.c(this.K.f9938b)) {
            zVar.b(d3.m.f4748q, new d3.a(null, new c(this, 2)));
            if (this.M) {
                zVar.b(d3.m.f4749r, new d3.a(null, new c(this, 3)));
            }
        }
        if (this.M) {
            zVar.b(d3.m.f4750s, new d3.a(null, new c(this, 5)));
        }
    }
}
