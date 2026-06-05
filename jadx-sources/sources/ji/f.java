package ji;

import c2.e0;
import c2.w;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final f f8972f = new f(0.0f, 31, 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f8973a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8974b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8975c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8976d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8977e;

    public f(float f10, int i10, long j) {
        float f11 = (i10 & 1) != 0 ? 24.0f : 4.0f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11 / 6.0f) & 4294967295L);
        j = (i10 & 4) != 0 ? w.c(w.f3052b, 0.1f) : j;
        f10 = (i10 & 8) != 0 ? 1.0f : f10;
        this.f8973a = f11;
        this.f8974b = jFloatToRawIntBits;
        this.f8975c = j;
        this.f8976d = f10;
        this.f8977e = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (s3.f.e(this.f8973a, fVar.f8973a) && this.f8974b == fVar.f8974b && w.d(this.f8975c, fVar.f8975c) && Float.compare(this.f8976d, fVar.f8976d) == 0 && this.f8977e == fVar.f8977e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ = gk.b.j(Float.hashCode(this.f8973a) * 31, this.f8974b, 31);
        int i10 = w.f3059i;
        return Integer.hashCode(this.f8977e) + gk.b.f(this.f8976d, gk.b.j(iJ, this.f8975c, 31), 31);
    }

    public final String toString() {
        String strF = s3.f.f(this.f8973a);
        String strA = s3.g.a(this.f8974b);
        String strJ = w.j(this.f8975c);
        String strI = e0.I(this.f8977e);
        StringBuilder sbM = m1.m("Shadow(radius=", strF, ", offset=", strA, ", color=");
        sbM.append(strJ);
        sbM.append(", alpha=");
        sbM.append(this.f8976d);
        sbM.append(", blendMode=");
        return m6.a.j(sbM, strI, ")");
    }
}
