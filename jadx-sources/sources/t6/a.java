package t6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f15819a;

    /* renamed from: b, reason: collision with root package name */
    public int f15820b;

    /* renamed from: c, reason: collision with root package name */
    public int f15821c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i10 = this.f15819a;
            if (i10 != aVar.f15819a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.f15821c - this.f15820b) != 1 || this.f15821c != aVar.f15820b || this.f15820b != aVar.f15821c) {
                return this.f15821c == aVar.f15821c && this.f15820b == aVar.f15820b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f15819a * 31) + this.f15820b) * 31) + this.f15821c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f15819a;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f15820b);
        sb2.append("c:");
        return m6.a.h(sb2, this.f15821c, ",p:null]");
    }
}
