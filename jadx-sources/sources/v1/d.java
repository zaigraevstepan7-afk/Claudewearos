package v1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f17554a;

    public d(float f10) {
        this.f17554a = f10;
    }

    @Override // v1.c
    public final long a(long j, long j4, s3.m mVar) {
        long j10 = ((((int) (j4 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j4 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f10 = 1;
        float f11 = (this.f17554a + f10) * (((int) (j10 >> 32)) / 2.0f);
        float f12 = (f10 - 1.0f) * (((int) (j10 & 4294967295L)) / 2.0f);
        return (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f17554a, ((d) obj).f17554a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f17554a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f17554a + ", verticalBias=-1.0)";
    }
}
