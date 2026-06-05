package v1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f17556a;

    public f(float f10) {
        this.f17556a = f10;
    }

    public final int a(int i10, int i11) {
        return m6.a.a(1, this.f17556a, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f17556a, ((f) obj).f17556a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17556a);
    }

    public final String toString() {
        return gk.b.o(new StringBuilder("Vertical(bias="), this.f17556a, ')');
    }
}
