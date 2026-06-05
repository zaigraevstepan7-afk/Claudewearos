package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f15117a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f15118b;

    public c0(float f10, float f11, float f12) {
        this.f15117a = f12;
        t0 t0Var = new t0();
        t0Var.f15288a = 1.0f;
        t0Var.f15289b = Math.sqrt(50.0d);
        t0Var.f15290c = 1.0f;
        if (f10 < 0.0f) {
            q0.a("Damping ratio must be non-negative");
        }
        t0Var.f15290c = f10;
        double d10 = t0Var.f15289b;
        if (((float) (d10 * d10)) <= 0.0f) {
            q0.a("Spring stiffness constant must be positive.");
        }
        t0Var.f15289b = Math.sqrt(f11);
        this.f15118b = t0Var;
    }

    @Override // t.a0
    public final float b(long j, float f10, float f11, float f12) {
        t0 t0Var = this.f15118b;
        t0Var.f15288a = f11;
        return Float.intBitsToFloat((int) (t0Var.a(f10, f12, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // t.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r33, float r34, float r35) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c0.c(float, float, float):long");
    }

    @Override // t.a0
    public final float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // t.a0
    public final float e(long j, float f10, float f11, float f12) {
        t0 t0Var = this.f15118b;
        t0Var.f15288a = f11;
        return Float.intBitsToFloat((int) (t0Var.a(f10, f12, j / 1000000) >> 32));
    }
}
