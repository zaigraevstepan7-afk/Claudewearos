package c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends cg.b {

    /* renamed from: d, reason: collision with root package name */
    public final x f1865d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.t f1866e;

    public y(androidx.lifecycle.t tVar, x xVar) {
        fj.l.f(xVar, "callback");
        this.f1865d = xVar;
        this.f1866e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return fj.l.b(this.f1865d, yVar.f1865d) && fj.l.b(this.f1866e, yVar.f1866e);
    }

    public final int hashCode() {
        int iHashCode = this.f1865d.hashCode() * 31;
        androidx.lifecycle.t tVar = this.f1866e;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f1865d + ", owner=" + this.f1866e + ')';
    }
}
