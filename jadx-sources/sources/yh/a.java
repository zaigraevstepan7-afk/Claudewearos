package yh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20309b;

    public a(String str, String str2) {
        this.f20308a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f20309b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f20308a.equals(aVar.f20308a) && this.f20309b.equals(aVar.f20309b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20308a.hashCode() ^ 1000003) * 1000003) ^ this.f20309b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f20308a);
        sb2.append(", version=");
        return m6.a.j(sb2, this.f20309b, "}");
    }
}
