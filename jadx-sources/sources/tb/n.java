package tb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f16293a;

    /* renamed from: b, reason: collision with root package name */
    public final t f16294b;

    public n(u uVar, t tVar) {
        this.f16293a = uVar;
        this.f16294b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f16293a;
            if (uVar != null ? uVar.equals(((n) vVar).f16293a) : ((n) vVar).f16293a == null) {
                t tVar = this.f16294b;
                if (tVar != null ? tVar.equals(((n) vVar).f16294b) : ((n) vVar).f16294b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f16293a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f16294b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f16293a + ", mobileSubtype=" + this.f16294b + "}";
    }
}
