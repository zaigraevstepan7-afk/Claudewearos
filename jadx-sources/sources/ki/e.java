package ki;

import c2.e0;
import c2.m0;
import fj.l;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final c f9654a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9655b;

    public e(c cVar, d dVar) {
        this.f9654a = cVar;
        this.f9655b = dVar;
    }

    @Override // ki.f
    public final float[] a(long j, m mVar, fi.e eVar) {
        l.f(mVar, "layoutDirection");
        l.f(eVar, "density");
        float fW0 = eVar.w0(this.f9654a.f9652a);
        float[] fArr = new float[4];
        for (int i10 = 0; i10 < 4; i10++) {
            fArr[i10] = fW0;
        }
        return fArr;
    }

    @Override // c2.w0
    public final e0 b(long j, m mVar, s3.c cVar) {
        l.f(mVar, "layoutDirection");
        l.f(cVar, "density");
        float fW0 = cVar.w0(this.f9654a.f9652a);
        return fW0 <= 0.0f ? new m0(new b2.c(0.0f, 0.0f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)))) : this.f9655b.a(fW0, fW0, fW0, fW0, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9654a.equals(eVar.f9654a) && this.f9655b.equals(eVar.f9655b);
    }

    public final int hashCode() {
        return (Float.hashCode(this.f9654a.f9652a) * 31) - 403522412;
    }

    public final String toString() {
        return "RoundedRectangle(cornerRadius=" + this.f9654a + ", style=" + this.f9655b + ")";
    }
}
