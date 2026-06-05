package rc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f14345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14346b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14347c;

    public i(int i10, int i11, boolean z2) {
        this.f14345a = i10;
        this.f14346b = i11;
        this.f14347c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            i iVar = (i) ((q) obj);
            if (this.f14345a == iVar.f14345a && this.f14346b == iVar.f14346b && this.f14347c == iVar.f14347c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f14347c ? 1237 : 1231) ^ ((((this.f14345a ^ 1000003) * 1000003) ^ this.f14346b) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f14345a + ", clickPrerequisite=" + this.f14346b + ", notificationFlowEnabled=" + this.f14347c + "}";
    }
}
