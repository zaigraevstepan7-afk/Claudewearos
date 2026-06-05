package q0;

import c1.i8;
import k0.h1;
import k0.v;
import q.b0;
import v0.m0;
import v0.n0;
import v1.o;
import v2.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h {
    public static final o a(o oVar, ab.g gVar) {
        return oVar.c(new b(gVar));
    }

    public static final n0.c b(v2.j jVar) {
        n0.f fVar;
        m0.a aVar = new m0.a();
        n.B(jVar, d.f13158a, new i(0, new ab.k(aVar, 29), new h1(1, aVar, m0.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 2)));
        b0 b0Var = new b0();
        b0 b0Var2 = aVar.f11218a;
        Object[] objArr = b0Var2.f13033a;
        int i10 = b0Var2.f13034b;
        int i11 = 0;
        boolean z2 = true;
        n0.b bVar = null;
        while (true) {
            fVar = n0.f.f11851b;
            if (i11 >= i10) {
                break;
            }
            n0.b bVar2 = (n0.b) objArr[i11];
            if (!z2 || bVar2 != fVar) {
                if (bVar2 == fVar && bVar == fVar) {
                    z2 = false;
                    break;
                    break;
                }
                if (bVar2 != fVar) {
                    b0 b0Var3 = aVar.f11219b;
                    Object[] objArr2 = b0Var3.f13033a;
                    int i12 = b0Var3.f13034b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (!((Boolean) ((ej.c) objArr2[i13]).invoke(bVar2)).booleanValue()) {
                            z2 = false;
                            break;
                        }
                    }
                }
                b0Var.a(bVar2);
                z2 = false;
                bVar = bVar2;
            }
            i11++;
        }
        if (((n0.b) (b0Var.h() ? null : b0Var.f13033a[b0Var.f13034b - 1])) == fVar) {
            b0Var.k(b0Var.f13034b - 1);
        }
        g1.b bVar3 = b0Var.f13035c;
        if (bVar3 == null) {
            bVar3 = new g1.b(b0Var, 1);
            b0Var.f13035c = bVar3;
        }
        return new n0.c(bVar3);
    }

    public static final o c(m0 m0Var) {
        return new e(m0Var);
    }

    public static final o d(o oVar, t0.j jVar, i8 i8Var, n0 n0Var, v vVar) {
        return oVar.c(new j(jVar, i8Var, n0Var, vVar));
    }
}
