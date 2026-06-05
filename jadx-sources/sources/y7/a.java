package y7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20228a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20229b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20230c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20231d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20228a == aVar.f20228a && this.f20229b == aVar.f20229b && this.f20230c == aVar.f20230c && this.f20231d == aVar.f20231d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r02 = this.f20228a;
        int i10 = r02;
        if (this.f20229b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f20230c) {
            i11 = i10 + 256;
        }
        return this.f20231d ? i11 + 4096 : i11;
    }

    public final String toString() {
        return "[ Connected=" + this.f20228a + " Validated=" + this.f20229b + " Metered=" + this.f20230c + " NotRoaming=" + this.f20231d + " ]";
    }
}
