package b0;

import c1.e8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f1431a;

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f1432b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f1433c;

    /* renamed from: d, reason: collision with root package name */
    public static final h2 f1434d;

    /* renamed from: e, reason: collision with root package name */
    public static final h2 f1435e;

    /* renamed from: f, reason: collision with root package name */
    public static final h2 f1436f;

    /* renamed from: g, reason: collision with root package name */
    public static final h2 f1437g;

    /* renamed from: h, reason: collision with root package name */
    public static final h2 f1438h;

    /* renamed from: i, reason: collision with root package name */
    public static final h2 f1439i;

    static {
        g0 g0Var = g0.f1334b;
        f1431a = new i0(g0Var, 1.0f);
        g0 g0Var2 = g0.f1333a;
        f1432b = new i0(g0Var2, 1.0f);
        g0 g0Var3 = g0.f1335c;
        f1433c = new i0(g0Var3, 1.0f);
        v1.e eVar = v1.b.F;
        int i10 = 0;
        f1434d = new h2(g0Var, new g2(eVar, i10), eVar);
        v1.e eVar2 = v1.b.E;
        f1435e = new h2(g0Var, new g2(eVar2, i10), eVar2);
        v1.f fVar = v1.b.D;
        int i11 = 1;
        f1436f = new h2(g0Var2, new g2(fVar, i11), fVar);
        v1.f fVar2 = v1.b.C;
        f1437g = new h2(g0Var2, new g2(fVar2, i11), fVar2);
        v1.g gVar = v1.b.f17551e;
        int i12 = 2;
        f1438h = new h2(g0Var3, new g2(gVar, i12), gVar);
        v1.g gVar2 = v1.b.f17547a;
        f1439i = new h2(g0Var3, new g2(gVar2, i12), gVar2);
    }

    public static final v1.o a(v1.o oVar, float f10, float f11) {
        return oVar.c(new a2(f10, f11));
    }

    public static v1.o b(v1.o oVar) {
        return oVar.c(f1433c);
    }

    public static final v1.o c(float f10, v1.o oVar) {
        return oVar.c(f10 == 1.0f ? f1431a : new i0(g0.f1334b, f10));
    }

    public static final v1.o e(float f10, v1.o oVar) {
        return oVar.c(new s1(0.0f, f10, 0.0f, f10, true, 5));
    }

    public static v1.o f(v1.o oVar, float f10, float f11, int i10) {
        return oVar.c(new s1(0.0f, (i10 & 1) != 0 ? Float.NaN : f10, 0.0f, (i10 & 2) != 0 ? Float.NaN : f11, true, 5));
    }

    public static final v1.o g(float f10, v1.o oVar) {
        return oVar.c(new s1(0.0f, f10, 0.0f, f10, false, 5));
    }

    public static final v1.o h(v1.o oVar) {
        float f10 = c1.n0.f2460b;
        return oVar.c(new s1(f10, f10, f10, f10, false));
    }

    public static final v1.o i(v1.o oVar, float f10, float f11) {
        return oVar.c(new s1(f10, f11, f10, f11, false));
    }

    public static v1.o j(v1.o oVar, float f10, float f11, float f12, float f13, int i10) {
        return oVar.c(new s1(f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, false));
    }

    public static final v1.o k(float f10, v1.o oVar) {
        return oVar.c(new s1(f10, f10, f10, f10, true));
    }

    public static final v1.o l(v1.o oVar, float f10, float f11) {
        return oVar.c(new s1(f10, f11, f10, f11, true));
    }

    public static final v1.o m(v1.o oVar, float f10, float f11, float f12, float f13) {
        return oVar.c(new s1(f10, f11, f12, f13, true));
    }

    public static /* synthetic */ v1.o n(v1.o oVar, float f10, float f11, int i10) {
        float f12 = e8.f2072b;
        if ((i10 & 2) != 0) {
            f12 = Float.NaN;
        }
        return m(oVar, f10, f12, f11, Float.NaN);
    }

    public static final v1.o o(float f10, v1.o oVar) {
        return oVar.c(new s1(f10, 0.0f, f10, 0.0f, true, 10));
    }

    public static final v1.o p(v1.o oVar, float f10, float f11) {
        return oVar.c(new s1(f10, 0.0f, f11, 0.0f, true, 10));
    }

    public static v1.o q(v1.o oVar) {
        v1.f fVar = v1.b.D;
        return oVar.c(fj.l.b(fVar, fVar) ? f1436f : fj.l.b(fVar, v1.b.C) ? f1437g : new h2(g0.f1333a, new g2(fVar, 1), fVar));
    }

    public static v1.o r(v1.o oVar) {
        v1.g gVar = v1.b.f17551e;
        return oVar.c(gVar.equals(gVar) ? f1438h : gVar.equals(v1.b.f17547a) ? f1439i : new h2(g0.f1335c, new g2(gVar, 2), gVar));
    }

    public static v1.o s(v1.o oVar, int i10) {
        v1.e eVar = v1.b.F;
        return oVar.c(eVar.equals(eVar) ? f1434d : eVar.equals(v1.b.E) ? f1435e : new h2(g0.f1334b, new g2(eVar, 0), eVar));
    }
}
