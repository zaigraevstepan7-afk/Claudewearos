package d2;

import c2.e0;
import c2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f4654e;

    /* renamed from: f, reason: collision with root package name */
    public final q f4655f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4656g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f4654e = qVar;
        this.f4655f = qVar2;
        float[] fArr = a.f4620b.f4621a;
        s sVar = qVar.f4681d;
        float[] fArr2 = qVar.f4686i;
        s sVar2 = qVar2.f4681d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.f4663b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f4686i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f4656g = fArrG;
    }

    @Override // d2.g
    public final long a(long j) {
        float fI = w.i(j);
        float fH = w.h(j);
        float f10 = w.f(j);
        float fE = w.e(j);
        m mVar = this.f4654e.f4692p;
        float fB = (float) mVar.b(fI);
        float fB2 = (float) mVar.b(fH);
        float fB3 = (float) mVar.b(f10);
        float[] fArr = this.f4656g;
        float f11 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f12 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f13 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        q qVar = this.f4655f;
        float fB4 = (float) qVar.f4689m.b(f11);
        m mVar2 = qVar.f4689m;
        return e0.b(fB4, (float) mVar2.b(f12), (float) mVar2.b(f13), fE, qVar);
    }
}
