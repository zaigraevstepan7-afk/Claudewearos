package v;

import x.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v1 implements f2 {
    public static final qh.c j = new qh.c(4, new ua.a(3), new ta.n(19));

    /* renamed from: a, reason: collision with root package name */
    public final f1.g1 f17307a;

    /* renamed from: f, reason: collision with root package name */
    public float f17312f;

    /* renamed from: h, reason: collision with root package name */
    public final f1.y f17314h;

    /* renamed from: i, reason: collision with root package name */
    public final f1.y f17315i;

    /* renamed from: b, reason: collision with root package name */
    public final f1.g1 f17308b = new f1.g1(0);

    /* renamed from: c, reason: collision with root package name */
    public final f1.g1 f17309c = new f1.g1(0);

    /* renamed from: d, reason: collision with root package name */
    public final z.k f17310d = new z.k();

    /* renamed from: e, reason: collision with root package name */
    public final f1.g1 f17311e = new f1.g1(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);

    /* renamed from: g, reason: collision with root package name */
    public final x.n f17313g = new x.n(new q0.i(this, 12));

    public v1(int i10) {
        this.f17307a = new f1.g1(i10);
        final int i11 = 0;
        this.f17314h = f1.s.q(new ej.a(this) { // from class: v.u1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v1 f17292b;

            {
                this.f17292b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i11) {
                    case 0:
                        v1 v1Var = this.f17292b;
                        return Boolean.valueOf(v1Var.f17307a.g() < v1Var.f17311e.g());
                    default:
                        return Boolean.valueOf(this.f17292b.f17307a.g() > 0);
                }
            }
        });
        final int i12 = 1;
        this.f17315i = f1.s.q(new ej.a(this) { // from class: v.u1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v1 f17292b;

            {
                this.f17292b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i12) {
                    case 0:
                        v1 v1Var = this.f17292b;
                        return Boolean.valueOf(v1Var.f17307a.g() < v1Var.f17311e.g());
                    default:
                        return Boolean.valueOf(this.f17292b.f17307a.g() > 0);
                }
            }
        });
    }

    @Override // x.f2
    public final boolean a() {
        return this.f17313g.a();
    }

    @Override // x.f2
    public final Object b(f1 f1Var, ej.e eVar, vi.c cVar) {
        Object objB = this.f17313g.b(f1Var, eVar, cVar);
        return objB == ui.a.f17085a ? objB : pi.o.f13011a;
    }

    @Override // x.f2
    public final boolean c() {
        return ((Boolean) this.f17315i.getValue()).booleanValue();
    }

    @Override // x.f2
    public final boolean d() {
        return ((Boolean) this.f17314h.getValue()).booleanValue();
    }

    @Override // x.f2
    public final float e(float f10) {
        return this.f17313g.e(f10);
    }
}
