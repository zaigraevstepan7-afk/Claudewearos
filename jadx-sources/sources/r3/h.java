package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f13676a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f13676a == ((h) obj).f13676a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13676a);
    }

    public final String toString() {
        int i10 = this.f13676a;
        return i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
