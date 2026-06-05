package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f19671a;

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f19672b;

    static {
        int i10 = 3;
        ti.c cVar = null;
        f19671a = new o0(i10, cVar, 0);
        f19672b = new o0(i10, cVar, 1);
    }

    public static v1.o a(v1.o oVar, r0 r0Var, o1 o1Var, boolean z2, z.k kVar, boolean z10, ej.f fVar, boolean z11, int i10) {
        if ((i10 & 4) != 0) {
            z2 = true;
        }
        boolean z12 = z2;
        if ((i10 & 8) != 0) {
            kVar = null;
        }
        return oVar.c(new n0(r0Var, o1Var, z12, kVar, (i10 & 16) != 0 ? false : z10, f19671a, fVar, (i10 & 128) != 0 ? false : z11));
    }

    public static final r0 b(ej.c cVar, f1.i0 i0Var) {
        f1.a1 a1VarK = f1.s.K(cVar, i0Var);
        Object objQ = i0Var.Q();
        if (objQ == f1.m.f6385a) {
            k kVar = new k(new ta.v(a1VarK, 4));
            i0Var.l0(kVar);
            objQ = kVar;
        }
        return (r0) objQ;
    }

    public static final long c(long j) {
        return mk.b.f(Float.isNaN(s3.q.b(j)) ? 0.0f : s3.q.b(j), Float.isNaN(s3.q.c(j)) ? 0.0f : s3.q.c(j));
    }
}
