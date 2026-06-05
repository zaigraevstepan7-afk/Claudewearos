package g0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f6957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s3.m f6958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f6959c;

    public /* synthetic */ p(h0 h0Var, s3.m mVar, float f10) {
        this.f6957a = h0Var;
        this.f6958b = mVar;
        this.f6959c = f10;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        h0 h0Var = this.f6957a;
        boolean zS = u1.b.s(h0Var, fFloatValue);
        if (h0Var.k().f6998e != o1.f19664a) {
            if (this.f6958b != s3.m.f14752a) {
                zS = !zS;
            }
        }
        int i10 = h0Var.k().f6995b;
        float fL = i10 == 0 ? 0.0f : u1.b.l(h0Var) / i10;
        float f10 = fL - ((int) fL);
        char c6 = Math.abs(fFloatValue) >= h0Var.f6902n.w0(y.k.f20151a) ? fFloatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c6 == 0) {
            fFloatValue2 = Math.abs(f10) > this.f6959c ? fFloatValue3 : fFloatValue3;
        } else if (c6 != 1) {
            if (c6 != 2) {
                fFloatValue2 = 0.0f;
            }
        }
        return Float.valueOf(fFloatValue2);
    }
}
