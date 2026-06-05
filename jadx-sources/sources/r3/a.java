package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f13664a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f13664a, ((a) obj).f13664a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13664a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f13664a + ')';
    }
}
