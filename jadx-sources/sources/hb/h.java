package hb;

import c1.u6;
import p2.k0;
import qj.b0;
import qj.z;
import t.u0;
import v.j1;
import v1.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final z f7797a;

    /* renamed from: b, reason: collision with root package name */
    public final kj.e f7798b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7799c;

    /* renamed from: d, reason: collision with root package name */
    public final ej.e f7800d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f7801e;

    /* renamed from: f, reason: collision with root package name */
    public final ej.f f7802f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f7803g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f7804h;

    /* renamed from: i, reason: collision with root package name */
    public final u0 f7805i;
    public final u0 j;

    /* renamed from: k, reason: collision with root package name */
    public final u0 f7806k;

    /* renamed from: l, reason: collision with root package name */
    public final t.c f7807l;

    /* renamed from: m, reason: collision with root package name */
    public final t.c f7808m;

    /* renamed from: n, reason: collision with root package name */
    public final t.c f7809n;

    /* renamed from: o, reason: collision with root package name */
    public final t.c f7810o;

    /* renamed from: p, reason: collision with root package name */
    public final t.c f7811p;

    /* renamed from: q, reason: collision with root package name */
    public final j1 f7812q;

    /* renamed from: r, reason: collision with root package name */
    public final p7.k f7813r;

    /* renamed from: s, reason: collision with root package name */
    public final o f7814s;

    public h(z zVar, float f10, kj.e eVar, float f11, float f12, ej.e eVar2, ej.c cVar, ej.f fVar) {
        fj.l.f(zVar, "animationScope");
        this.f7797a = zVar;
        this.f7798b = eVar;
        this.f7799c = f12;
        this.f7800d = eVar2;
        this.f7801e = cVar;
        this.f7802f = fVar;
        this.f7803g = new u0(1.0f, 1000.0f, Float.valueOf(f11));
        this.f7804h = new u0(0.5f, 300.0f, Float.valueOf(10.0f * f11));
        Float fValueOf = Float.valueOf(0.001f);
        this.f7805i = new u0(1.0f, 1000.0f, fValueOf);
        this.j = new u0(0.6f, 250.0f, fValueOf);
        this.f7806k = new u0(0.7f, 250.0f, fValueOf);
        this.f7807l = t.d.a(f10, f11);
        this.f7808m = t.d.a(0.0f, 5.0f);
        this.f7809n = t.d.a(0.0f, 0.001f);
        this.f7810o = t.d.a(1.0f, 0.001f);
        this.f7811p = t.d.a(1.0f, 0.001f);
        this.f7812q = new j1();
        this.f7813r = new p7.k(19);
        this.f7814s = k0.a(v1.l.f17564b, pi.o.f13011a, new u6(this, 2));
    }

    public final float a() {
        return ((Number) this.f7809n.e()).floatValue();
    }

    public final float b() {
        float fC = c();
        kj.e eVar = this.f7798b;
        return (fC - ((Number) eVar.b()).floatValue()) / (((Number) eVar.e()).floatValue() - ((Number) eVar.b()).floatValue());
    }

    public final float c() {
        return ((Number) this.f7807l.e()).floatValue();
    }

    public final void d(float f10) {
        b0.w(this.f7797a, null, new g(this, ((Number) cg.b.s(Float.valueOf(f10), this.f7798b)).floatValue(), null), 3);
    }
}
