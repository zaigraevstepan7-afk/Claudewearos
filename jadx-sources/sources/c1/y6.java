package c1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y6 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1.o f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2.w0 f2916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f2918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v.u f2919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f2920f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p1.e f2921z;

    public y6(v1.o oVar, c2.w0 w0Var, long j, float f10, v.u uVar, float f11, p1.e eVar) {
        this.f2915a = oVar;
        this.f2916b = w0Var;
        this.f2917c = j;
        this.f2918d = f10;
        this.f2919e = uVar;
        this.f2920f = f11;
        this.f2921z = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zT = i0Var.T(iIntValue & 1, (iIntValue & 3) != 2);
        pi.o oVar = pi.o.f13011a;
        if (!zT) {
            i0Var.W();
            return oVar;
        }
        v1.o oVarB = b7.b(this.f2915a, this.f2916b, b7.c(this.f2917c, this.f2918d, i0Var), this.f2919e, ((s3.c) i0Var.j(w2.f1.f18262h)).w0(this.f2920f));
        Object objQ = i0Var.Q();
        f1.f fVar = f1.m.f6385a;
        if (objQ == fVar) {
            objQ = new ab.d(17);
            i0Var.l0(objQ);
        }
        v1.o oVarA = d3.p.a(oVarB, false, (ej.c) objQ);
        Object objQ2 = i0Var.Q();
        if (objQ2 == fVar) {
            objQ2 = j1.f2263c;
            i0Var.l0(objQ2);
        }
        v1.o oVarA2 = p2.k0.a(oVarA, oVar, (PointerInputEventHandler) objQ2);
        t2.q0 q0VarD = b0.r.d(v1.b.f17547a, true);
        int iT = f1.s.t(i0Var);
        f1.n1 n1VarL = i0Var.l();
        v1.o oVarC = v1.a.c(i0Var, oVarA2);
        v2.h.f17668w.getClass();
        v2.f fVar2 = v2.g.f17645b;
        i0Var.e0();
        if (i0Var.S) {
            i0Var.k(fVar2);
        } else {
            i0Var.o0();
        }
        f1.s.M(v2.g.f17649f, i0Var, q0VarD);
        f1.s.M(v2.g.f17648e, i0Var, n1VarL);
        v2.e eVar = v2.g.f17650g;
        if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT))) {
            m6.a.l(iT, i0Var, iT, eVar);
        }
        f1.s.M(v2.g.f17647d, i0Var, oVarC);
        this.f2921z.invoke(i0Var, 0);
        i0Var.p(true);
        return oVar;
    }
}
