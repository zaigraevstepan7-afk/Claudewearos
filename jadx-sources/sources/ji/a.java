package ji;

import c2.e0;
import c2.w;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8959a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8960b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8961c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8962d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8963e;

    static {
        new a(0.0f, 0.0f, 31);
    }

    public a(float f10, float f11, int i10) {
        f10 = (i10 & 1) != 0 ? 24.0f : f10;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
        long jC = w.c(w.f3052b, 0.15f);
        f11 = (i10 & 8) != 0 ? 1.0f : f11;
        this.f8959a = f10;
        this.f8960b = jFloatToRawIntBits;
        this.f8961c = jC;
        this.f8962d = f11;
        this.f8963e = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (s3.f.e(this.f8959a, aVar.f8959a) && this.f8960b == aVar.f8960b && w.d(this.f8961c, aVar.f8961c) && Float.compare(this.f8962d, aVar.f8962d) == 0 && this.f8963e == aVar.f8963e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ = gk.b.j(Float.hashCode(this.f8959a) * 31, this.f8960b, 31);
        int i10 = w.f3059i;
        return Integer.hashCode(this.f8963e) + gk.b.f(this.f8962d, gk.b.j(iJ, this.f8961c, 31), 31);
    }

    public final String toString() {
        String strF = s3.f.f(this.f8959a);
        String strA = s3.g.a(this.f8960b);
        String strJ = w.j(this.f8961c);
        String strI = e0.I(this.f8963e);
        StringBuilder sbM = m1.m("InnerShadow(radius=", strF, ", offset=", strA, ", color=");
        sbM.append(strJ);
        sbM.append(", alpha=");
        sbM.append(this.f8962d);
        sbM.append(", blendMode=");
        return m6.a.j(sbM, strI, ")");
    }
}
