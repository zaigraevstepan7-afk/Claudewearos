package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f2 implements qj.z, c2 {

    /* renamed from: d, reason: collision with root package name */
    public static final h f6297d = new h();

    /* renamed from: a, reason: collision with root package name */
    public final ti.h f6298a;

    /* renamed from: b, reason: collision with root package name */
    public final f2 f6299b = this;

    /* renamed from: c, reason: collision with root package name */
    public volatile ti.h f6300c;

    public f2(ti.h hVar) {
        this.f6298a = hVar;
    }

    @Override // qj.z
    public final ti.h Q() {
        ti.h hVarV;
        ti.h hVar = this.f6300c;
        if (hVar == null || hVar == f6297d) {
            u1.f fVar = (u1.f) this.f6298a.C(u1.f.f16570b);
            ti.h e2Var = fVar != null ? new e2(fVar, this) : ti.i.f16336a;
            synchronized (this.f6299b) {
                try {
                    ti.h hVar2 = this.f6300c;
                    if (hVar2 == null) {
                        ti.h hVar3 = this.f6298a;
                        hVarV = hVar3.V(new qj.g1((qj.e1) hVar3.C(qj.w.f13632b))).V(ti.i.f16336a).V(e2Var);
                    } else if (hVar2 == f6297d) {
                        ti.h hVar4 = this.f6298a;
                        qj.g1 g1Var = new qj.g1((qj.e1) hVar4.C(qj.w.f13632b));
                        g1Var.m(new d0(0));
                        hVarV = hVar4.V(g1Var).V(ti.i.f16336a).V(e2Var);
                    } else {
                        hVarV = hVar2;
                    }
                    this.f6300c = hVarV;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hVar = hVarV;
        }
        fj.l.c(hVar);
        return hVar;
    }

    @Override // f1.c2
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.f6299b) {
            try {
                ti.h hVar = this.f6300c;
                if (hVar == null) {
                    this.f6300c = f6297d;
                } else {
                    qj.b0.g(hVar, new d0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f1.c2
    public final void c() {
        b();
    }

    @Override // f1.c2
    public final void d() {
    }
}
