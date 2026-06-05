package g0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6930a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f6931b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f6932c;

    static {
        k0 k0Var = new k0();
        f6931b = k0Var;
        o1 o1Var = o1.f19664a;
        f6932c = new z(0, 0, 0, 0, 0, 0, y.l.f20153c, new j0(), qj.b0.b(ti.i.f16336a), k0Var, s3.b.b(0, 0, 0, 0, 15));
    }

    public static final long a(z zVar, int i10) {
        int i11 = zVar.f6996c;
        long j = i10 * (zVar.f6995b + i11);
        int i12 = -zVar.f6999f;
        long j4 = ((j + i12) + zVar.f6997d) - i11;
        int iB = (int) (zVar.f6998e == o1.f19665b ? zVar.b() >> 32 : zVar.b() & 4294967295L);
        long jP = j4 - (iB - cg.b.p(zVar.f7006n.a(iB, zVar.f6995b, i12, r1), 0, iB));
        if (jP < 0) {
            return 0L;
        }
        return jP;
    }

    public static final d b(int i10, ej.a aVar, f1.i0 i0Var, int i11) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        qh.c cVar = d.H;
        boolean zD = i0Var.d(i10) | i0Var.c(0.0f) | i0Var.f(aVar);
        Object objQ = i0Var.Q();
        if (zD || objQ == f1.m.f6385a) {
            objQ = new i0(i10, aVar);
            i0Var.l0(objQ);
        }
        d dVar = (d) s1.k.e(objArr, cVar, (ej.a) objQ, i0Var, 0);
        dVar.G.setValue(aVar);
        return dVar;
    }
}
