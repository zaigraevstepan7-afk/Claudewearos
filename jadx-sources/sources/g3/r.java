package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o3.c f7173a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7175c;

    public r(o3.c cVar, int i10, int i11) {
        this.f7173a = cVar;
        this.f7174b = i10;
        this.f7175c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f7173a.equals(rVar.f7173a) && this.f7174b == rVar.f7174b && this.f7175c == rVar.f7175c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7175c) + gk.b.g(this.f7174b, this.f7173a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f7173a);
        sb2.append(", startIndex=");
        sb2.append(this.f7174b);
        sb2.append(", endIndex=");
        return m6.a.g(sb2, this.f7175c, ')');
    }
}
