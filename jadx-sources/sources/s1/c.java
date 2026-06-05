package s1;

import f1.i0;
import f1.m;
import f1.r1;
import f1.r2;
import f1.s;
import f1.t1;
import java.util.Map;
import pi.o;
import q.g0;
import q.n0;
import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final qh.c f14721e = new qh.c(4, new ra.a(10, 0), new p0(1));

    /* renamed from: a, reason: collision with root package name */
    public final Map f14722a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f14723b;

    /* renamed from: c, reason: collision with root package name */
    public e f14724c;

    /* renamed from: d, reason: collision with root package name */
    public final q0.i f14725d;

    public c(Map map) {
        this.f14722a = map;
        long[] jArr = n0.f13108a;
        this.f14723b = new g0();
        this.f14725d = new q0.i(this, 5);
    }

    @Override // s1.b
    public final void a(Object obj, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(533563200);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(this) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            i0Var.d0(obj);
            Object objQ = i0Var.Q();
            f1.f fVar = m.f6385a;
            if (objQ == fVar) {
                q0.i iVar = this.f14725d;
                if (!((Boolean) iVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f14722a.get(obj);
                r2 r2Var = h.f14730a;
                i iVar2 = new i(new f(map, iVar));
                i0Var.l0(iVar2);
                objQ = iVar2;
            }
            i iVar3 = (i) objQ;
            s.b(new r1[]{h.f14730a.a(iVar3), b7.a.f1610a.a(iVar3)}, eVar, i0Var, (i11 & 112) | 8);
            boolean zH = i0Var.h(this) | i0Var.h(obj) | i0Var.h(iVar3);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new ab.m(this, obj, iVar3, 19);
                i0Var.l0(objQ2);
            }
            s.c(o.f13011a, (ej.c) objQ2, i0Var);
            if (i0Var.f6336y && i0Var.G.f8121i == i0Var.f6337z) {
                i0Var.f6337z = -1;
                i0Var.f6336y = false;
            }
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(this, obj, eVar, i10, 8);
        }
    }
}
