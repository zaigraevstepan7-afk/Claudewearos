package k0;

import w2.d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 {
    public final f1.j1 A;
    public final f1.j1 B;

    /* renamed from: a, reason: collision with root package name */
    public a1 f9264a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.t1 f9265b;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f9266c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.j f9267d;

    /* renamed from: e, reason: collision with root package name */
    public l3.z f9268e;

    /* renamed from: f, reason: collision with root package name */
    public final f1.j1 f9269f;

    /* renamed from: g, reason: collision with root package name */
    public final f1.j1 f9270g;

    /* renamed from: h, reason: collision with root package name */
    public t2.w f9271h;

    /* renamed from: i, reason: collision with root package name */
    public final f1.j1 f9272i;
    public g3.f j;

    /* renamed from: k, reason: collision with root package name */
    public final f1.j1 f9273k;

    /* renamed from: l, reason: collision with root package name */
    public final f1.j1 f9274l;

    /* renamed from: m, reason: collision with root package name */
    public final f1.j1 f9275m;

    /* renamed from: n, reason: collision with root package name */
    public final f1.j1 f9276n;

    /* renamed from: o, reason: collision with root package name */
    public final f1.j1 f9277o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9278p;

    /* renamed from: q, reason: collision with root package name */
    public final f1.j1 f9279q;

    /* renamed from: r, reason: collision with root package name */
    public final ac.d f9280r;

    /* renamed from: s, reason: collision with root package name */
    public final f1.j1 f9281s;

    /* renamed from: t, reason: collision with root package name */
    public final f1.j1 f9282t;

    /* renamed from: u, reason: collision with root package name */
    public ej.c f9283u;

    /* renamed from: v, reason: collision with root package name */
    public final z f9284v;

    /* renamed from: w, reason: collision with root package name */
    public final z f9285w;

    /* renamed from: x, reason: collision with root package name */
    public final z f9286x;

    /* renamed from: y, reason: collision with root package name */
    public final c2.h f9287y;

    /* renamed from: z, reason: collision with root package name */
    public long f9288z;

    public t0(a1 a1Var, f1.t1 t1Var, d2 d2Var) {
        this.f9264a = a1Var;
        this.f9265b = t1Var;
        this.f9266c = d2Var;
        t0.j jVar = new t0.j(18, false);
        g3.f fVar = g3.g.f7099a;
        long j = g3.m0.f7143b;
        l3.t tVar = new l3.t(fVar, j, (g3.m0) null);
        jVar.f15363b = tVar;
        jVar.f15364c = new com.google.android.material.datepicker.o(fVar, tVar.f9938b);
        this.f9267d = jVar;
        Boolean bool = Boolean.FALSE;
        this.f9269f = f1.s.A(bool);
        this.f9270g = f1.s.A(new s3.f(0));
        this.f9272i = f1.s.A(null);
        this.f9273k = f1.s.A(k0.f9150a);
        this.f9274l = f1.s.A(bool);
        this.f9275m = f1.s.A(bool);
        this.f9276n = f1.s.A(bool);
        this.f9277o = f1.s.A(bool);
        this.f9278p = true;
        this.f9279q = f1.s.A(Boolean.TRUE);
        this.f9280r = new ac.d(d2Var, 16);
        this.f9281s = f1.s.A(bool);
        this.f9282t = f1.s.A(bool);
        this.f9283u = new g3.y(17);
        this.f9284v = new z(this, 1);
        this.f9285w = new z(this, 2);
        this.f9286x = new z(this, 3);
        this.f9287y = c2.e0.g();
        this.f9288z = c2.w.f3058h;
        this.A = f1.s.A(new g3.m0(j));
        this.B = f1.s.A(new g3.m0(j));
    }

    public final k0 a() {
        return (k0) this.f9273k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f9269f.getValue()).booleanValue();
    }

    public final t2.w c() {
        t2.w wVar = this.f9271h;
        if (wVar == null || !wVar.E()) {
            return null;
        }
        return wVar;
    }

    public final s1 d() {
        return (s1) this.f9272i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new g3.m0(j));
    }

    public final void f(long j) {
        this.A.setValue(new g3.m0(j));
    }
}
