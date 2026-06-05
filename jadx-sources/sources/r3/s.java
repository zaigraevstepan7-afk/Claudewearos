package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f13698c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f13699d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f13700a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13701b;

    public s(int i10, boolean z2) {
        this.f13700a = i10;
        this.f13701b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f13700a == sVar.f13700a && this.f13701b == sVar.f13701b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13701b) + (Integer.hashCode(this.f13700a) * 31);
    }

    public final String toString() {
        return equals(f13698c) ? "TextMotion.Static" : equals(f13699d) ? "TextMotion.Animated" : "Invalid";
    }
}
