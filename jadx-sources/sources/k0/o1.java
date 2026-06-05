package k0;

import x.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o1 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f9197a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.y f9198b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.y f9199c;

    public o1(f2 f2Var, final p1 p1Var) {
        this.f9197a = f2Var;
        final int i10 = 0;
        this.f9198b = f1.s.q(new ej.a() { // from class: k0.n1
            @Override // ej.a
            public final Object a() {
                switch (i10) {
                    case 0:
                        p1 p1Var2 = p1Var;
                        return Boolean.valueOf(p1Var2.f9230a.g() < p1Var2.f9231b.g());
                    default:
                        return Boolean.valueOf(p1Var.f9230a.g() > 0.0f);
                }
            }
        });
        final int i11 = 1;
        this.f9199c = f1.s.q(new ej.a() { // from class: k0.n1
            @Override // ej.a
            public final Object a() {
                switch (i11) {
                    case 0:
                        p1 p1Var2 = p1Var;
                        return Boolean.valueOf(p1Var2.f9230a.g() < p1Var2.f9231b.g());
                    default:
                        return Boolean.valueOf(p1Var.f9230a.g() > 0.0f);
                }
            }
        });
    }

    @Override // x.f2
    public final boolean a() {
        return this.f9197a.a();
    }

    @Override // x.f2
    public final Object b(v.f1 f1Var, ej.e eVar, vi.c cVar) {
        return this.f9197a.b(f1Var, eVar, cVar);
    }

    @Override // x.f2
    public final boolean c() {
        return ((Boolean) this.f9199c.getValue()).booleanValue();
    }

    @Override // x.f2
    public final boolean d() {
        return ((Boolean) this.f9198b.getValue()).booleanValue();
    }

    @Override // x.f2
    public final float e(float f10) {
        return this.f9197a.e(f10);
    }
}
