package ga;

import b2.e;
import c2.e0;
import c2.l0;
import c2.m0;
import c2.w0;
import fj.l;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7267a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7268b;

    public /* synthetic */ c(float f10, int i10) {
        this.f7267a = i10;
        this.f7268b = f10;
    }

    @Override // c2.w0
    public final e0 b(long j, m mVar, s3.c cVar) {
        switch (this.f7267a) {
            case 0:
                l.f(mVar, "layoutDirection");
                l.f(cVar, "density");
                float fD = e.d(j) * this.f7268b;
                float fD2 = e.d(j) * 0.5f;
                if (fD < 0.0f) {
                    fD = 0.0f;
                }
                if (fD <= fD2) {
                    fD2 = fD;
                }
                return fD2 == 0.0f ? new m0(new b2.c(0.0f, 0.0f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)))) : new l0(cg.b.A(j, fD2));
            default:
                l.f(mVar, "layoutDirection");
                l.f(cVar, "density");
                float fW0 = cVar.w0(this.f7268b);
                float fD3 = e.d(j) * 0.5f;
                if (fW0 < 0.0f) {
                    fW0 = 0.0f;
                }
                if (fW0 <= fD3) {
                    fD3 = fW0;
                }
                return fD3 == 0.0f ? new m0(new b2.c(0.0f, 0.0f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)))) : new l0(cg.b.A(j, fD3));
        }
    }
}
