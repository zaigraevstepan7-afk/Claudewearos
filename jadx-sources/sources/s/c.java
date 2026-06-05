package s;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends fj.m implements ej.c {
    public static final c A;
    public static final c B;
    public static final c C;

    /* renamed from: b, reason: collision with root package name */
    public static final c f14565b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f14566c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f14567d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f14568e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f14569f;

    /* renamed from: z, reason: collision with root package name */
    public static final c f14570z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14571a;

    static {
        int i10 = 1;
        f14565b = new c(i10, 0);
        f14566c = new c(i10, 1);
        f14567d = new c(i10, 2);
        f14568e = new c(i10, 3);
        f14569f = new c(i10, 4);
        f14570z = new c(i10, 5);
        A = new c(i10, 6);
        B = new c(i10, 7);
        C = new c(i10, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f14571a = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14571a) {
            case 0:
                s0 s0VarA = n0.c(t.d.t(220, 90, null, 4), 2).a(new s0(new d1((u0) null, (b1) null, (e0) null, new y0(c2.a1.f2962b, t.d.t(220, 90, null, 4)), (LinkedHashMap) null, 119)));
                t0 t0VarD = n0.d(t.d.t(90, 0, null, 6), 2);
                int i10 = j.f14633b;
                return new f0(s0VarA, t0VarD);
            case 1:
                return obj;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                long jB = c2.w.b(((c2.w) obj).f3060a, d2.d.f4652x);
                return new t.o(c2.w.e(jB), c2.w.i(jB), c2.w.h(jB), c2.w.f(jB));
            case 4:
                long j = ((c2.a1) obj).f2964a;
                return new t.m(c2.a1.b(j), c2.a1.c(j));
            case 5:
                t.m mVar = (t.m) obj;
                return new c2.a1(c2.e0.h(mVar.f15229a, mVar.f15230b));
            case 6:
                return t.d.s(0.0f, 0.0f, null, 7);
            case 7:
                long j4 = ((s3.l) obj).f14751a;
                long j10 = 0;
                return new s3.l((j10 & 4294967295L) | (j10 << 32));
            case 8:
                return n0.f14649c;
            case 9:
                return new s3.l((((int) (((s3.l) obj).f14751a & 4294967295L)) & 4294967295L) | (0 << 32));
            default:
                return new s3.l((((int) (((s3.l) obj).f14751a & 4294967295L)) & 4294967295L) | (0 << 32));
        }
    }
}
