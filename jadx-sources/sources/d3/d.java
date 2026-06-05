package d3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4715b;

    public d(int i10, int i11) {
        this.f4714a = i10;
        this.f4715b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4714a == dVar.f4714a && this.f4715b == dVar.f4715b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4715b) + (Integer.hashCode(this.f4714a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f4714a);
        sb2.append(", columnCount=");
        return m6.a.g(sb2, this.f4715b, ')');
    }
}
