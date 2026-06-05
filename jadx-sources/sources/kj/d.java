package kj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f9663a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9664b;

    public d(float f10, float f11) {
        this.f9663a = f10;
        this.f9664b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // kj.e
    public final Comparable b() {
        return Float.valueOf(this.f9663a);
    }

    @Override // kj.e
    public final Comparable e() {
        return Float.valueOf(this.f9664b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f9663a == dVar.f9663a && this.f9664b == dVar.f9664b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f9664b) + (Float.hashCode(this.f9663a) * 31);
    }

    @Override // kj.e
    public final boolean isEmpty() {
        return this.f9663a > this.f9664b;
    }

    public final String toString() {
        return this.f9663a + ".." + this.f9664b;
    }
}
