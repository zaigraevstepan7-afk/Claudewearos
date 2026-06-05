package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f14739a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14740b;

    /* renamed from: c, reason: collision with root package name */
    public final t3.a f14741c;

    public e(float f10, float f11, t3.a aVar) {
        this.f14739a = f10;
        this.f14740b = f11;
        this.f14741c = aVar;
    }

    @Override // s3.c
    public final long J(float f10) {
        return hj.a.D(4294967296L, this.f14741c.a(f10));
    }

    @Override // s3.c
    public final float N(long j) {
        if (p.a(o.b(j), 4294967296L)) {
            return this.f14741c.b(o.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // s3.c
    public final float e() {
        return this.f14739a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f14739a, eVar.f14739a) == 0 && Float.compare(this.f14740b, eVar.f14740b) == 0 && fj.l.b(this.f14741c, eVar.f14741c);
    }

    public final int hashCode() {
        return this.f14741c.hashCode() + gk.b.f(this.f14740b, Float.hashCode(this.f14739a) * 31, 31);
    }

    @Override // s3.c
    public final float r0() {
        return this.f14740b;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f14739a + ", fontScale=" + this.f14740b + ", converter=" + this.f14741c + ')';
    }
}
