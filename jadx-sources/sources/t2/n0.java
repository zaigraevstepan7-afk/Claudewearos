package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15609b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15610c;

    public /* synthetic */ n0(Object obj, int i10) {
        this.f15609b = i10;
        this.f15610c = obj;
    }

    @Override // s3.c
    public final float e() {
        switch (this.f15609b) {
            case 0:
                return ((v2.n0) this.f15610c).e();
            default:
                return ((w2.t) this.f15610c).getDensity().e();
        }
    }

    @Override // t2.e1
    public float l(o oVar) {
        float fIntBitsToFloat;
        int iR0;
        switch (this.f15609b) {
            case 0:
                ej.e eVar = oVar.f15611a;
                if (eVar != null) {
                    return ((Number) eVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                v2.n0 n0Var = (v2.n0) this.f15610c;
                if (n0Var.D) {
                    return Float.NaN;
                }
                v2.n0 n0Var2 = n0Var;
                while (true) {
                    m.m mVar = n0Var2.F;
                    if (!Float.isNaN((mVar == null || (iR0 = qi.k.r0((o[]) mVar.f11125b, oVar)) < 0) ? Float.NaN : ((float[]) mVar.f11126c)[iR0])) {
                        n0Var2.O0(n0Var.d1(), oVar);
                        w wVarZ0 = n0Var2.Z0();
                        w wVarZ02 = n0Var.Z0();
                        switch (oVar.f15612b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (wVarZ02.i0(wVarZ0, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (wVarZ0.I() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (wVarZ02.i0(wVarZ0, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (wVarZ0.I() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    v2.n0 n0VarF1 = n0Var2.f1();
                    if (n0VarF1 == null) {
                        n0Var2.O0(n0Var.d1(), oVar);
                        return Float.NaN;
                    }
                    n0Var2 = n0VarF1;
                }
                break;
            default:
                return super.l(oVar);
        }
    }

    @Override // t2.e1
    public final s3.m r() {
        switch (this.f15609b) {
            case 0:
                return ((v2.n0) this.f15610c).getLayoutDirection();
            default:
                return ((w2.t) this.f15610c).getLayoutDirection();
        }
    }

    @Override // s3.c
    public final float r0() {
        switch (this.f15609b) {
            case 0:
                return ((v2.n0) this.f15610c).r0();
            default:
                return ((w2.t) this.f15610c).getDensity().r0();
        }
    }

    @Override // t2.e1
    public final int x() {
        switch (this.f15609b) {
            case 0:
                return ((v2.n0) this.f15610c).z0();
            default:
                return ((w2.t) this.f15610c).getRoot().Z.f17703p.f15550a;
        }
    }
}
