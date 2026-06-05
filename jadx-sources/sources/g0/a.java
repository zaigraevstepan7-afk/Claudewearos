package g0;

import f1.f1;
import java.util.concurrent.CancellationException;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6849a;

    public a(h0 h0Var) {
        o1 o1Var = o1.f19664a;
        this.f6849a = h0Var;
    }

    @Override // o2.a
    public final long G0(int i10, long j, long j4) {
        if (i10 != 2) {
            return 0L;
        }
        o1 o1Var = o1.f19664a;
        if (Float.intBitsToFloat((int) (j4 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // o2.a
    public final Object Z0(long j, long j4, ti.c cVar) {
        o1 o1Var = o1.f19664a;
        o1 o1Var2 = o1.f19664a;
        return new s3.q(s3.q.a(j4, 0.0f, 0.0f, 1));
    }

    @Override // o2.a
    public final long c0(int i10, long j) {
        o1 o1Var = o1.f19664a;
        if (i10 != 1) {
            return 0L;
        }
        h0 h0Var = this.f6849a;
        com.google.android.gms.common.api.internal.i0 i0Var = h0Var.f6893d;
        com.google.android.gms.common.api.internal.i0 i0Var2 = h0Var.f6893d;
        if (Math.abs(((f1) i0Var.f3554d).g()) <= 1.0E-6d) {
            return 0L;
        }
        int i11 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i11)) <= 0.0f) {
            return 0L;
        }
        z zVarK = h0Var.k();
        float fG = ((f1) i0Var2.f3554d).g() * h0Var.m();
        float f10 = ((zVarK.f6995b + zVarK.f6996c) * (-Math.signum(((f1) i0Var2.f3554d).g()))) + fG;
        if (((f1) i0Var2.f3554d).g() > 0.0f) {
            fG = f10;
            f10 = fG;
        }
        float f11 = -h0Var.f6899k.e(-cg.b.o(Float.intBitsToFloat(i11), fG, f10));
        o1 o1Var2 = o1.f19664a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }
}
