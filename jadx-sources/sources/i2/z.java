package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8337c;

    public z(float f10) {
        super(3);
        this.f8337c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f8337c, ((z) obj).f8337c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8337c);
    }

    public final String toString() {
        return gk.b.o(new StringBuilder("RelativeVerticalTo(dy="), this.f8337c, ')');
    }
}
