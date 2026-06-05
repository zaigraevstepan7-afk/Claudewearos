package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f7112a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f7112a == ((i) obj).f7112a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7112a);
    }

    public final String toString() {
        return a(this.f7112a);
    }
}
