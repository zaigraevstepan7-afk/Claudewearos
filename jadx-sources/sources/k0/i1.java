package k0;

import w2.d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9120a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9125f;

    public /* synthetic */ i1(t0 t0Var, a2.w wVar, boolean z2, v0.u0 u0Var, l3.n nVar) {
        this.f9122c = t0Var;
        this.f9123d = wVar;
        this.f9121b = z2;
        this.f9124e = u0Var;
        this.f9125f = nVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f9120a) {
            case 0:
                t0 t0Var = (t0) this.f9122c;
                a2.w wVar = (a2.w) this.f9123d;
                v0.u0 u0Var = (v0.u0) this.f9124e;
                l3.n nVar = (l3.n) this.f9125f;
                b2.b bVar = (b2.b) obj;
                if (t0Var.b()) {
                    d2 d2Var = t0Var.f9266c;
                    if (d2Var != null) {
                        ((w2.g1) d2Var).b();
                    }
                } else {
                    a2.w.a(wVar);
                }
                if (t0Var.b() && this.f9121b) {
                    if (t0Var.a() != k0.f9151b) {
                        s1 s1VarD = t0Var.d();
                        if (s1VarD != null) {
                            long j = bVar.f1500a;
                            t0.j jVar = t0Var.f9267d;
                            z zVar = t0Var.f9284v;
                            int iA = nVar.a(s1VarD.b(j, true));
                            zVar.invoke(l3.t.a((l3.t) jVar.f15363b, null, g3.e0.b(iA, iA), 5));
                            if (t0Var.f9264a.f9037a.f7081b.length() > 0) {
                                t0Var.f9273k.setValue(k0.f9152c);
                            }
                        }
                    } else {
                        u0Var.g(bVar);
                    }
                }
                break;
            default:
                g0.d dVar = (g0.d) this.f9122c;
                f1.a1 a1Var = (f1.a1) this.f9123d;
                f1.a1 a1Var2 = (f1.a1) this.f9124e;
                f1.a1 a1Var3 = (f1.a1) this.f9125f;
                float fFloatValue = ((Float) obj).floatValue();
                if (((wa.q0) a1Var.getValue()) != null && !this.f9121b) {
                    a1Var2.setValue(Boolean.TRUE);
                    a1Var3.setValue(null);
                    dVar.e(-fFloatValue);
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ i1(boolean z2, g0.d dVar, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3) {
        this.f9121b = z2;
        this.f9122c = dVar;
        this.f9123d = a1Var;
        this.f9124e = a1Var2;
        this.f9125f = a1Var3;
    }
}
