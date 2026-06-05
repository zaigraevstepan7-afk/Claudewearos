package j0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8600a;

    public c(float f10) {
        this.f8600a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            a0.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // j0.a
    public final float a(long j, s3.c cVar) {
        return (this.f8600a / 100.0f) * b2.e.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f8600a, ((c) obj).f8600a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8600a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f8600a + "%)";
    }
}
