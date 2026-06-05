package h3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f7587a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7588b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7589c;

    public e(int i10, int i11, boolean z2) {
        this.f7587a = i10;
        this.f7588b = i11;
        this.f7589c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7587a == eVar.f7587a && this.f7588b == eVar.f7588b && this.f7589c == eVar.f7589c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7589c) + gk.b.g(this.f7588b, Integer.hashCode(this.f7587a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f7587a + ", end=" + this.f7588b + ", isRtl=" + this.f7589c + ')';
    }
}
