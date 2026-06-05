package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f13684a;

    public /* synthetic */ k(int i10) {
        this.f13684a = i10;
    }

    public static final /* synthetic */ k a() {
        return new k(3);
    }

    public static String b(int i10) {
        return i10 == 1 ? "Left" : i10 == 2 ? "Right" : i10 == 3 ? "Center" : i10 == 4 ? "Justify" : i10 == 5 ? "Start" : i10 == 6 ? "End" : i10 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f13684a == ((k) obj).f13684a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13684a);
    }

    public final String toString() {
        return b(this.f13684a);
    }
}
