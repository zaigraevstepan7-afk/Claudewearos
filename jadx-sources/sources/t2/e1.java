package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e1 implements s3.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15541a;

    public static void C(e1 e1Var, f1 f1Var, long j) {
        e1Var.getClass();
        f(e1Var, f1Var);
        f1Var.G0(s3.j.c(j, f1Var.f15554e), 0.0f, null);
    }

    public static void D(e1 e1Var, f1 f1Var, int i10, int i11) {
        long j = (i10 << 32) | (i11 & 4294967295L);
        if (e1Var.r() == s3.m.f14752a || e1Var.x() == 0) {
            f(e1Var, f1Var);
            f1Var.G0(s3.j.c(j, f1Var.f15554e), 0.0f, null);
        } else {
            int iX = (e1Var.x() - f1Var.f15550a) - ((int) (j >> 32));
            f(e1Var, f1Var);
            f1Var.G0(s3.j.c((iX << 32) | (((int) (j & 4294967295L)) & 4294967295L), f1Var.f15554e), 0.0f, null);
        }
    }

    public static void E(e1 e1Var, f1 f1Var, int i10, int i11) {
        int i12 = h1.f15575b;
        g1 g1Var = g1.f15560b;
        long j = (i10 << 32) | (i11 & 4294967295L);
        if (e1Var.r() == s3.m.f14752a || e1Var.x() == 0) {
            f(e1Var, f1Var);
            f1Var.G0(s3.j.c(j, f1Var.f15554e), 0.0f, g1Var);
        } else {
            int iX = (e1Var.x() - f1Var.f15550a) - ((int) (j >> 32));
            f(e1Var, f1Var);
            f1Var.G0(s3.j.c((iX << 32) | (((int) (j & 4294967295L)) & 4294967295L), f1Var.f15554e), 0.0f, g1Var);
        }
    }

    public static void G(e1 e1Var, f1 f1Var, int i10, int i11, ej.c cVar, int i12) {
        if ((i12 & 8) != 0) {
            int i13 = h1.f15575b;
            cVar = g1.f15560b;
        }
        e1Var.getClass();
        f(e1Var, f1Var);
        f1Var.G0(s3.j.c((i11 & 4294967295L) | (i10 << 32), f1Var.f15554e), 0.0f, cVar);
    }

    public static void I(e1 e1Var, f1 f1Var, long j, fi.d dVar, int i10) {
        ej.c cVar = dVar;
        if ((i10 & 4) != 0) {
            int i11 = h1.f15575b;
            cVar = g1.f15560b;
        }
        e1Var.getClass();
        f(e1Var, f1Var);
        f1Var.G0(s3.j.c(j, f1Var.f15554e), 0.0f, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(e1 e1Var, f1 f1Var) {
        e1Var.getClass();
        if (f1Var instanceof v2.y0) {
            ((v2.y0) f1Var).g0(e1Var.f15541a);
        }
    }

    public float l(o oVar) {
        return Float.NaN;
    }

    public abstract s3.m r();

    public abstract int x();

    public final void z(f1 f1Var, int i10, int i11, float f10) {
        f(this, f1Var);
        f1Var.G0(s3.j.c((i11 & 4294967295L) | (i10 << 32), f1Var.f15554e), f10, null);
    }
}
