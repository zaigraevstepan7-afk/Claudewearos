package d0;

import f0.m0;
import ib.v0;
import java.util.ArrayList;
import java.util.List;
import wa.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4430a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4431b;

    public /* synthetic */ r(int i10) {
        this.f4431b = i10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f4430a;
        int i11 = this.f4431b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                t1.g gVarF = t1.r.f();
                t1.r.n(gVarF, t1.r.k(gVarF), gVarF != null ? gVarF.e() : null);
                int i12 = m0Var.f6169a;
                if (i12 == -1) {
                    i12 = 2;
                }
                for (int i13 = 0; i13 < i12; i13++) {
                    m0Var.a(i11 + i13);
                }
                return pi.o.f13011a;
            default:
                v0 v0Var = (v0) obj;
                fj.l.f(v0Var, "<this>");
                v0 v0VarK = hj.a.K(hj.a.L(v0Var));
                List<wa.q> list = v0VarK.f8462a;
                ArrayList arrayList = new ArrayList(qi.m.s0(list));
                for (wa.q qVar : list) {
                    if (!(qVar instanceof wa.q)) {
                        throw new b3.e();
                    }
                    List<o0> list2 = qVar.f19135a;
                    ArrayList arrayList2 = new ArrayList(qi.m.s0(list2));
                    for (o0 o0Var : list2) {
                        xa.f fVar = o0Var.f19130a;
                        if (fVar.f19862a == i11) {
                            int i14 = xa.g.f19866a;
                            fVar = new xa.f(fVar.f19862a, fVar.f19863b, fVar.f19864c, Boolean.TRUE);
                        }
                        arrayList2.add(o0.a(o0Var, fVar));
                    }
                    arrayList.add(wa.q.a(qVar, arrayList2));
                }
                return hj.a.m(v0.a(v0VarK, arrayList, null, null, 0, null, null, null, null, null, null, 0.0f, null, 0, null, null, null, null, false, null, false, false, false, 8388606));
        }
    }

    public /* synthetic */ r(u uVar, int i10) {
        this.f4431b = i10;
    }
}
