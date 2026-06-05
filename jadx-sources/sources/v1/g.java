package v1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f17557a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17558b;

    public g(float f10, float f11) {
        this.f17557a = f10;
        this.f17558b = f11;
    }

    @Override // v1.c
    public final long a(long j, long j4, s3.m mVar) {
        float f10 = (((int) (j4 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f11 = (((int) (j4 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        s3.m mVar2 = s3.m.f14752a;
        float f12 = this.f17557a;
        if (mVar != mVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        float f15 = (f13 + this.f17558b) * f11;
        return (Math.round(f15) & 4294967295L) | (Math.round(f14) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f17557a, gVar.f17557a) == 0 && Float.compare(this.f17558b, gVar.f17558b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17558b) + (Float.hashCode(this.f17557a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f17557a);
        sb2.append(", verticalBias=");
        return gk.b.o(sb2, this.f17558b, ')');
    }
}
