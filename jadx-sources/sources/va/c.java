package va;

import android.graphics.Rect;
import b0.b0;
import b0.t1;
import b0.z;
import c1.v7;
import c2.w;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.q2;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ej.e {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17911a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi.p f17912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.a f17913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17916f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17917z;

    public /* synthetic */ c(mi.p pVar, a1 a1Var, ej.a aVar, String str, String str2, a1 a1Var2, q2 q2Var) {
        this.f17912b = pVar;
        this.f17914d = a1Var;
        this.f17913c = aVar;
        this.f17915e = str;
        this.f17916f = str2;
        this.f17917z = a1Var2;
        this.A = q2Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17911a) {
            case 0:
                ((Integer) obj2).getClass();
                f.a((v) this.f17914d, (Rect) this.f17915e, this.f17912b, (ej.c) this.f17916f, this.f17913c, (ej.a) this.f17917z, (ej.a) this.A, (i0) obj, f1.s.O(24577));
                break;
            default:
                a1 a1Var = (a1) this.f17914d;
                String str = (String) this.f17915e;
                String str2 = (String) this.f17916f;
                a1 a1Var2 = (a1) this.f17917z;
                q2 q2Var = (q2) this.A;
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v1.l lVar = v1.l.f17564b;
                    v1.o oVarX = b0.d.x(lVar, 0.0f, 64, 0.0f, 0.0f, 13);
                    b0 b0VarA = z.a(b0.j.g(8), v1.b.F, i0Var, 54);
                    int iHashCode = Long.hashCode(i0Var.T);
                    n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, oVarX);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var);
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    long j = w.f3054d;
                    v7.a(str, null, j, hj.a.x(24), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597824, 0, 262058);
                    float f10 = 32;
                    v7.a(str2, b0.d.v(lVar, f10, 0.0f, 2), w.c(j, 0.7f), hj.a.x(14), null, null, 0L, new r3.k(3), 0L, 0, false, 0, 0, null, i0Var, 25008, 0, 261096);
                    b0.d.e(i0Var, t1.e(24, lVar));
                    m.d(((String) a1Var.getValue()).length(), 0, i0Var, ((Boolean) a1Var2.getValue()).booleanValue());
                    i0Var.p(true);
                    float fFloatValue = ((Number) q2Var.getValue()).floatValue();
                    boolean zF = i0Var.f(a1Var);
                    Object objQ = i0Var.Q();
                    f1.f fVar2 = f1.m.f6385a;
                    if (zF || objQ == fVar2) {
                        objQ = new ta.v(a1Var, 2);
                        i0Var.l0(objQ);
                    }
                    ej.c cVar = (ej.c) objQ;
                    boolean zF2 = i0Var.f(a1Var);
                    Object objQ2 = i0Var.Q();
                    if (zF2 || objQ2 == fVar2) {
                        objQ2 = new r0.d(a1Var, 25);
                        i0Var.l0(objQ2);
                    }
                    m.e(fFloatValue, this.f17912b, cVar, (ej.a) objQ2, null, i0Var, 0);
                    long jC = w.c(j, 0.8f);
                    long jX = hj.a.x(17);
                    Object objQ3 = i0Var.Q();
                    if (objQ3 == fVar2) {
                        objQ3 = m1.p(i0Var);
                    }
                    v1.o oVarK = v.n.k(lVar, (z.k) objQ3, null, false, null, this.f17913c, 28);
                    float f11 = 16;
                    v7.a("Cancel", b0.d.w(oVarK, f11, f11, f11, f10), jC, jX, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24966, 0, 262120);
                } else {
                    i0Var.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ c(v vVar, Rect rect, mi.p pVar, ej.c cVar, ej.a aVar, ej.a aVar2, ej.a aVar3, int i10) {
        this.f17914d = vVar;
        this.f17915e = rect;
        this.f17912b = pVar;
        this.f17916f = cVar;
        this.f17913c = aVar;
        this.f17917z = aVar2;
        this.A = aVar3;
    }
}
