package v1;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17574b;

    public r(float f10) {
        this.f17574b = f10;
    }

    @Override // v2.x0
    public final n d() {
        s sVar = new s();
        sVar.H = this.f17574b;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Float.compare(this.f17574b, ((r) obj).f17574b) == 0;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        ((s) nVar).H = this.f17574b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17574b);
    }

    public final String toString() {
        return gk.b.o(new StringBuilder("ZIndexElement(zIndex="), this.f17574b, ')');
    }
}
