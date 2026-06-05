package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final char f14124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14125b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14126c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14127d = "16:9";

    public p1(char c6, String str, String str2) {
        this.f14124a = c6;
        this.f14125b = str;
        this.f14126c = str2;
    }

    public final String a() {
        return this.f14125b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f14124a == p1Var.f14124a && this.f14125b.equals(p1Var.f14125b) && this.f14126c.equals(p1Var.f14126c) && this.f14127d.equals(p1Var.f14127d);
    }

    public final int hashCode() {
        return this.f14127d.hashCode() + t.m1.c(t.m1.c(Character.hashCode(this.f14124a) * 31, 31, this.f14125b), 31, this.f14126c);
    }

    public final String toString() {
        return "WhatsNewFeature(icon=" + this.f14124a + ", title=" + this.f14125b + ", description=" + this.f14126c + ", imagePlaceholder=" + this.f14127d + ")";
    }
}
