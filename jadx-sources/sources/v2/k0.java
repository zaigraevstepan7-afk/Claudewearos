package v2;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 implements s3.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17706a;

    /* renamed from: b, reason: collision with root package name */
    public long f17707b = 9223372034707292159L;

    /* renamed from: c, reason: collision with root package name */
    public long f17708c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f17709d;

    public k0(n0 n0Var) {
        this.f17709d = n0Var;
    }

    @Override // s3.c
    public final float e() {
        return this.f17709d.e();
    }

    public final void f(t2.o oVar, float f10) {
        n0 n0Var = this.f17709d;
        m.m mVar = n0Var.F;
        if (mVar == null) {
            mVar = new m.m();
            n0Var.F = mVar;
        }
        int iR0 = qi.k.r0((t2.o[]) mVar.f11125b, oVar);
        if (iR0 >= 0) {
            float[] fArr = (float[]) mVar.f11126c;
            if (fArr[iR0] != f10) {
                fArr[iR0] = f10;
                ((byte[]) mVar.f11127d)[iR0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) mVar.f11127d;
                if (bArr[iR0] == 2) {
                    bArr[iR0] = 0;
                    return;
                }
                return;
            }
        }
        int i10 = mVar.f11124a;
        t2.o[] oVarArr = (t2.o[]) mVar.f11125b;
        if (i10 == oVarArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(oVarArr, i11);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            mVar.f11125b = (t2.o[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) mVar.f11126c, i11);
            fj.l.e(fArrCopyOf, "copyOf(...)");
            mVar.f11126c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) mVar.f11127d, i11);
            fj.l.e(bArrCopyOf, "copyOf(...)");
            mVar.f11127d = bArrCopyOf;
        }
        ((t2.o[]) mVar.f11125b)[i10] = oVar;
        ((byte[]) mVar.f11127d)[i10] = 3;
        ((float[]) mVar.f11126c)[i10] = f10;
        mVar.f11124a++;
    }

    @Override // s3.c
    public final float r0() {
        return this.f17709d.r0();
    }
}
