package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final fk.g f7166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7168c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7169d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7170e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7171f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7172g;

    public q(fk.g gVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f7166a = gVar;
        this.f7167b = i10;
        this.f7168c = i11;
        this.f7169d = i12;
        this.f7170e = i13;
        this.f7171f = f10;
        this.f7172g = f11;
    }

    public final b2.c a(b2.c cVar) {
        return cVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f7171f) & 4294967295L));
    }

    public final long b(long j, boolean z2) {
        if (z2) {
            long j4 = m0.f7143b;
            if (m0.b(j, j4)) {
                return j4;
            }
        }
        int i10 = m0.f7144c;
        int i11 = (int) (j >> 32);
        int i12 = this.f7167b;
        return e0.b(i11 + i12, ((int) (j & 4294967295L)) + i12);
    }

    public final b2.c c(b2.c cVar) {
        float f10 = -this.f7171f;
        return cVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    public final int d(int i10) {
        int i11 = this.f7168c;
        int i12 = this.f7167b;
        return cg.b.p(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f7166a.equals(qVar.f7166a) && this.f7167b == qVar.f7167b && this.f7168c == qVar.f7168c && this.f7169d == qVar.f7169d && this.f7170e == qVar.f7170e && Float.compare(this.f7171f, qVar.f7171f) == 0 && Float.compare(this.f7172g, qVar.f7172g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7172g) + gk.b.f(this.f7171f, gk.b.g(this.f7170e, gk.b.g(this.f7169d, gk.b.g(this.f7168c, gk.b.g(this.f7167b, this.f7166a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f7166a);
        sb2.append(", startIndex=");
        sb2.append(this.f7167b);
        sb2.append(", endIndex=");
        sb2.append(this.f7168c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f7169d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f7170e);
        sb2.append(", top=");
        sb2.append(this.f7171f);
        sb2.append(", bottom=");
        return gk.b.o(sb2, this.f7172g, ')');
    }
}
