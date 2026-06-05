package u6;

import c1.s3;
import c1.z2;
import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t extends fj.j implements ej.e {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.A = i13;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                a2.a0 a0Var = (a2.a0) obj;
                a2.a0 a0Var2 = (a2.a0) obj2;
                v.j0 j0Var = (v.j0) this.f6792b;
                if (j0Var.G && (zA = ((a2.b0) a0Var2).a()) != ((a2.b0) a0Var).a()) {
                    ej.c cVar = j0Var.K;
                    if (cVar != null) {
                        cVar.invoke(Boolean.valueOf(zA));
                    }
                    v.b bVar = v.k0.H;
                    ti.c cVar2 = null;
                    if (zA) {
                        qj.b0.w(j0Var.e1(), null, new z2(j0Var, cVar2, 14), 3);
                        fj.v vVar = new fj.v();
                        v2.n.t(j0Var, new s3(28, vVar, j0Var));
                        f0.k0 k0Var = (f0.k0) vVar.f6807a;
                        if (k0Var != null) {
                            k0Var.a();
                        } else {
                            k0Var = null;
                        }
                        j0Var.M = k0Var;
                        i1 i1Var = j0Var.N;
                        if (i1Var != null && i1Var.w1().G && j0Var.G) {
                            v2.n.j(j0Var, bVar);
                        }
                    } else {
                        f0.k0 k0Var2 = j0Var.M;
                        if (k0Var2 != null) {
                            k0Var2.b();
                        }
                        j0Var.M = null;
                        if (j0Var.G) {
                            v2.n.j(j0Var, bVar);
                        }
                    }
                    v2.n.o(j0Var);
                    z.k kVar = j0Var.J;
                    if (kVar != null) {
                        if (zA) {
                            z.d dVar = j0Var.L;
                            if (dVar != null) {
                                j0Var.t1(kVar, new z.e(dVar));
                                j0Var.L = null;
                            }
                            z.d dVar2 = new z.d();
                            j0Var.t1(kVar, dVar2);
                            j0Var.L = dVar2;
                        } else {
                            z.d dVar3 = j0Var.L;
                            if (dVar3 != null) {
                                j0Var.t1(kVar, new z.e(dVar3));
                                j0Var.L = null;
                            }
                        }
                    }
                }
                break;
            default:
                a2.a0 a0Var3 = (a2.a0) obj;
                a2.a0 a0Var4 = (a2.a0) obj2;
                v3.t tVar = (v3.t) this.f6792b;
                if (tVar.G && (zA2 = ((a2.b0) a0Var4).a()) != ((a2.b0) a0Var3).a()) {
                    f0.k0 k0Var3 = null;
                    if (zA2) {
                        fj.v vVar2 = new fj.v();
                        v2.n.t(tVar, new a2.d0(16, vVar2, tVar));
                        f0.k0 k0Var4 = (f0.k0) vVar2.f6807a;
                        if (k0Var4 != null) {
                            k0Var4.a();
                            k0Var3 = k0Var4;
                        }
                        tVar.K = k0Var3;
                    } else {
                        f0.k0 k0Var5 = tVar.K;
                        if (k0Var5 != null) {
                            k0Var5.b();
                        }
                        tVar.K = null;
                    }
                }
                break;
        }
        return pi.o.f13011a;
    }
}
