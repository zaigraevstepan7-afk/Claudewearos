package v1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f17555a;

    public e(float f10) {
        this.f17555a = f10;
    }

    public final int a(int i10, int i11, s3.m mVar) {
        float f10 = (i11 - i10) / 2.0f;
        s3.m mVar2 = s3.m.f14752a;
        float f11 = this.f17555a;
        if (mVar != mVar2) {
            f11 *= -1;
        }
        return m6.a.a(1, f11, f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f17555a, ((e) obj).f17555a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17555a);
    }

    public final String toString() {
        return gk.b.o(new StringBuilder("Horizontal(bias="), this.f17555a, ')');
    }
}
