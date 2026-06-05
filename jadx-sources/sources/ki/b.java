package ki;

import c2.e0;
import fj.l;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final d f9651a;

    public b(d dVar) {
        this.f9651a = dVar;
    }

    @Override // ki.f
    public final float[] a(long j, m mVar, fi.e eVar) {
        l.f(mVar, "layoutDirection");
        l.f(eVar, "density");
        float fD = b2.e.d(j) * 0.5f;
        float[] fArr = new float[4];
        for (int i10 = 0; i10 < 4; i10++) {
            fArr[i10] = fD;
        }
        return fArr;
    }

    @Override // c2.w0
    public final e0 b(long j, m mVar, s3.c cVar) {
        l.f(mVar, "layoutDirection");
        l.f(cVar, "density");
        float fD = b2.e.d(j) * 0.5f;
        return this.f9651a.a(fD, fD, fD, fD, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.b(this.f9651a, ((b) obj).f9651a);
    }

    public final int hashCode() {
        this.f9651a.getClass();
        return -403522412;
    }

    public final String toString() {
        return "CapsuleShape(style=" + this.f9651a + ")";
    }
}
