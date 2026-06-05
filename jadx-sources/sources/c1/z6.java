package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z6 implements ej.e {
    public final /* synthetic */ float A;
    public final /* synthetic */ p1.e B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1.o f2953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2.w0 f2954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f2956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.k f2957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2958f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ej.a f2959z;

    public z6(v1.o oVar, c2.w0 w0Var, long j, float f10, z.k kVar, boolean z2, ej.a aVar, float f11, p1.e eVar) {
        this.f2953a = oVar;
        this.f2954b = w0Var;
        this.f2955c = j;
        this.f2956d = f10;
        this.f2957e = kVar;
        this.f2958f = z2;
        this.f2959z = aVar;
        this.A = f11;
        this.B = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            t2.m mVar = g2.f2117a;
            v1.o oVarF = d1.i.f(v.n.k(b7.b(this.f2953a.c(v2.f2762b), this.f2954b, b7.c(this.f2955c, this.f2956d, i0Var), null, ((s3.c) i0Var.j(w2.f1.f18262h)).w0(this.A)), this.f2957e, a5.a(0.0f, 7), this.f2958f, null, this.f2959z, 24));
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, true);
            int iT = f1.s.t(i0Var);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarF);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
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
            this.B.invoke(i0Var, 0);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
