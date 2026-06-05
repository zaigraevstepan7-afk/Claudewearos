package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f7187c = new v(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7189b;

    public v() {
        this.f7188a = false;
        this.f7189b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f7188a == vVar.f7188a && this.f7189b == vVar.f7189b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7189b) + (Boolean.hashCode(this.f7188a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f7188a + ", emojiSupportMatch=" + ((Object) i.a(this.f7189b)) + ')';
    }

    public v(int i10, boolean z2) {
        this.f7188a = z2;
        this.f7189b = i10;
    }
}
