package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final float f14742a;

    public /* synthetic */ f(float f10) {
        this.f14742a = f10;
    }

    public static final /* synthetic */ f a(float f10) {
        return new f(f10);
    }

    public static int b(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return 0;
        }
        return Float.compare(f10, f11);
    }

    public static final boolean e(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static String f(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.f14742a, ((f) obj).f14742a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f14742a, ((f) obj).f14742a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14742a);
    }

    public final String toString() {
        return f(this.f14742a);
    }
}
