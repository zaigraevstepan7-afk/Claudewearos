package d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4627a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4629c;

    public c(String str, long j, int i10) {
        this.f4627a = str;
        this.f4628b = j;
        this.f4629c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4629c == cVar.f4629c && fj.l.b(this.f4627a, cVar.f4627a)) {
            return b.a(this.f4628b, cVar.f4628b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int iHashCode = this.f4627a.hashCode() * 31;
        int i10 = b.f4626e;
        return gk.b.j(iHashCode, this.f4628b, 31) + this.f4629c;
    }

    public final String toString() {
        return this.f4627a + " (id=" + this.f4629c + ", model=" + ((Object) b.b(this.f4628b)) + ')';
    }
}
