package m2;

import p2.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f11259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11260b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11261c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11262d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11263e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11264f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11265g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11266h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11267i;

    public b(long j, long j4, long j10, boolean z2, float f10, long j11, long j12, boolean z10) {
        this.f11259a = j;
        this.f11260b = j4;
        this.f11261c = j10;
        this.f11262d = z2;
        this.f11263e = f10;
        this.f11264f = j11;
        this.f11265g = j12;
        this.f11266h = z10;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) v.j(this.f11259a)) + ", uptimeMillis=" + this.f11260b + ", position=" + ((Object) b2.b.h(this.f11261c)) + ", pressed=" + this.f11262d + ", pressure=" + this.f11263e + ", previousUptimeMillis=" + this.f11264f + ", previousPosition=" + ((Object) b2.b.h(this.f11265g)) + ", previousPressed=" + this.f11266h + ", isConsumed=" + this.f11267i + ')';
    }
}
