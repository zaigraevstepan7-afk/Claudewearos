package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b2 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final q.u f6270a = new q.u();

    /* renamed from: b, reason: collision with root package name */
    public final q.b0 f6271b = new q.b0();

    /* renamed from: c, reason: collision with root package name */
    public final Object f6272c;

    public b2(Object obj) {
        this.f6272c = obj;
    }

    public final void a(v2.f2 f2Var, p1.k kVar) {
        Exception exc;
        q.u uVar = this.f6270a;
        int i10 = uVar.f13137b;
        q.b0 b0Var = new q.b0();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            q.b0 b0Var2 = this.f6271b;
            if (i11 >= i10) {
                if (i12 != b0Var2.f13034b) {
                    n.a("Applier operation size mismatch");
                }
                b0Var2.d();
                uVar.f13137b = 0;
                f2Var.m();
                return;
            }
            int i13 = i11 + 1;
            try {
                try {
                    switch (uVar.c(i11)) {
                        case 0:
                            f2Var.i();
                            i11 = i13;
                        case 1:
                            int i14 = i12 + 1;
                            f2Var.e(b0Var2.f(i12));
                            i12 = i14;
                            i11 = i13;
                        case 2:
                            int i15 = i11 + 2;
                            i11 += 3;
                            f2Var.h(uVar.c(i13), uVar.c(i15));
                        case 3:
                            int i16 = i11 + 2;
                            try {
                                int i17 = i11 + 3;
                                try {
                                    i11 += 4;
                                    f2Var.g(uVar.c(i13), uVar.c(i16), uVar.c(i17));
                                } catch (Exception e10) {
                                    exc = e10;
                                    i11 = i17;
                                    break;
                                }
                            } catch (Exception e11) {
                                exc = e11;
                                i11 = i16;
                                break;
                            }
                        case 4:
                            f2Var.a();
                            i11 = i13;
                        case 5:
                            i11 += 2;
                            int i18 = i12 + 1;
                            f2Var.c(uVar.c(i13), b0Var2.f(i12));
                            i12 = i18;
                        case 6:
                            i11 += 2;
                            try {
                                uVar.c(i13);
                                int i19 = i12 + 1;
                                i12 = i19;
                            } catch (Exception e12) {
                                exc = e12;
                                break;
                            }
                        case 7:
                            int i20 = i12 + 1;
                            Object objF = b0Var2.f(i12);
                            fj.l.d(objF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            fj.y.c(2, objF);
                            i12 += 2;
                            f2Var.p((ej.e) objF, b0Var2.f(i20));
                            i11 = i13;
                        case 8:
                            Object obj = f2Var.f17643c;
                            if (obj instanceof i) {
                                i iVar = (i) obj;
                                if (kVar.f12654f.k(iVar)) {
                                    iVar.b();
                                }
                            }
                            b0Var.a(obj);
                            f2Var.f();
                            i11 = i13;
                        default:
                            i11 = i13;
                    }
                } catch (Throwable th2) {
                    f2Var.m();
                    throw th2;
                }
            } catch (Exception e13) {
                exc = e13;
                i11 = i13;
            }
            exc = e12;
            throw new k(b0Var2, b0Var, uVar, i11 - 1, exc);
        }
    }

    @Override // f1.a
    public final void c(int i10, Object obj) {
        q.u uVar = this.f6270a;
        uVar.a(5);
        uVar.a(i10);
        this.f6271b.a(obj);
    }

    @Override // f1.a
    public final void e(Object obj) {
        this.f6270a.a(1);
        this.f6271b.a(obj);
    }

    @Override // f1.a
    public final void f() {
        this.f6270a.a(8);
    }

    @Override // f1.a
    public final void g(int i10, int i11, int i12) {
        q.u uVar = this.f6270a;
        uVar.a(3);
        uVar.a(i10);
        uVar.a(i11);
        uVar.a(i12);
    }

    @Override // f1.a
    public final void h(int i10, int i11) {
        q.u uVar = this.f6270a;
        uVar.a(2);
        uVar.a(i10);
        uVar.a(i11);
    }

    @Override // f1.a
    public final void i() {
        this.f6270a.a(0);
    }

    @Override // f1.a
    public final void l(int i10, Object obj) {
        q.u uVar = this.f6270a;
        uVar.a(6);
        uVar.a(i10);
        this.f6271b.a(obj);
    }

    @Override // f1.a
    public final Object n() {
        return this.f6272c;
    }

    @Override // f1.a
    public final void p(ej.e eVar, Object obj) {
        this.f6270a.a(7);
        q.b0 b0Var = this.f6271b;
        b0Var.a(eVar);
        b0Var.a(obj);
    }
}
