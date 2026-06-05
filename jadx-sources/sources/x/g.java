package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h0.f f19528a;

    /* renamed from: b, reason: collision with root package name */
    public final qj.l f19529b;

    public g(h0.f fVar, qj.l lVar) {
        this.f19528a = fVar;
        this.f19529b = lVar;
    }

    public final String toString() {
        String strJ;
        qj.l lVar = this.f19529b;
        qj.y yVar = (qj.y) lVar.f13597e.C(qj.y.f13640c);
        String str = yVar != null ? yVar.f13641b : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        x8.a.n(16);
        String string = Integer.toString(iHashCode, 16);
        fj.l.e(string, "toString(...)");
        sb2.append(string);
        if (str == null || (strJ = t.m1.j("[", str, "](")) == null) {
            strJ = "(";
        }
        sb2.append(strJ);
        sb2.append("currentBounds()=");
        sb2.append(this.f19528a.a());
        sb2.append(", continuation=");
        sb2.append(lVar);
        sb2.append(')');
        return sb2.toString();
    }
}
