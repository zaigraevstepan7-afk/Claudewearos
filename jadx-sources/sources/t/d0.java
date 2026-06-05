package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15145a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15146b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15147c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15148d;

    public d0(int i10, int i11, w wVar) {
        this.f15145a = i10;
        this.f15146b = wVar;
        this.f15147c = i10 * 1000000;
        this.f15148d = i11 * 1000000;
    }

    @Override // t.a0
    public final float b(long j, float f10, float f11, float f12) {
        long j4 = j - this.f15148d;
        if (j4 < 0) {
            j4 = 0;
        }
        long j10 = this.f15147c;
        long j11 = j4 > j10 ? j10 : j4;
        if (j11 == 0) {
            return f12;
        }
        return (e(j11, f10, f11, f12) - e(j11 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // t.a0
    public final long c(float f10, float f11, float f12) {
        return this.f15148d + this.f15147c;
    }

    @Override // t.a0
    public final float e(long j, float f10, float f11, float f12) {
        long j4 = j - this.f15148d;
        if (j4 < 0) {
            j4 = 0;
        }
        long j10 = this.f15147c;
        if (j4 > j10) {
            j4 = j10;
        }
        float fC = this.f15146b.c(this.f15145a == 0 ? 1.0f : j4 / j10);
        return (f11 * fC) + ((1 - fC) * f10);
    }
}
