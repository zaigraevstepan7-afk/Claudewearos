package s;

import java.util.LinkedHashMap;
import t.o1;
import t.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f14647a = new p1(c.f14569f, c.f14570z);

    /* renamed from: b, reason: collision with root package name */
    public static final t.u0 f14648b = t.d.s(0.0f, 400.0f, null, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final t.u0 f14649c;

    /* renamed from: d, reason: collision with root package name */
    public static final t.u0 f14650d;

    static {
        t.d.s(0.0f, 400.0f, null, 5);
        long j = 1;
        long j4 = (j & 4294967295L) | (j << 32);
        f14649c = t.d.s(0.0f, 400.0f, new s3.j(j4), 1);
        f14650d = t.d.s(0.0f, 400.0f, new s3.l(j4), 1);
    }

    public static s0 a(t.u0 u0Var, v1.e eVar) {
        return new s0(new d1((u0) null, (b1) null, new e0(eVar.equals(v1.b.E) ? v1.b.f17550d : eVar.equals(v1.b.G) ? v1.b.f17552f : v1.b.f17551e, new c(1, 9), u0Var), (y0) null, (LinkedHashMap) null, 123));
    }

    public static final s0 b(t.z zVar) {
        return new s0(new d1(new u0(zVar), (b1) null, (e0) null, (y0) null, (LinkedHashMap) null, 126));
    }

    public static /* synthetic */ s0 c(t.z zVar, int i10) {
        if ((i10 & 1) != 0) {
            zVar = t.d.s(0.0f, 400.0f, null, 5);
        }
        return b(zVar);
    }

    public static t0 d(t.z zVar, int i10) {
        if ((i10 & 1) != 0) {
            zVar = t.d.s(0.0f, 400.0f, null, 5);
        }
        return new t0(new d1(new u0(zVar), (b1) null, (e0) null, (y0) null, (LinkedHashMap) null, 126));
    }

    public static t0 e(t.u0 u0Var, v1.e eVar) {
        return new t0(new d1((u0) null, (b1) null, new e0(eVar.equals(v1.b.E) ? v1.b.f17550d : eVar.equals(v1.b.G) ? v1.b.f17552f : v1.b.f17551e, new c(1, 10), u0Var), (y0) null, (LinkedHashMap) null, 123));
    }

    public static final s0 f(ej.c cVar, o1 o1Var) {
        return new s0(new d1((u0) null, new b1(new m0(cVar, 0), o1Var), (e0) null, (y0) null, (LinkedHashMap) null, 125));
    }

    public static final t0 g(ej.c cVar, o1 o1Var) {
        return new t0(new d1((u0) null, new b1(new m0(cVar, 1), o1Var), (e0) null, (y0) null, (LinkedHashMap) null, 125));
    }
}
