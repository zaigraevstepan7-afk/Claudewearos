package i1;

import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends v {

    /* renamed from: b, reason: collision with root package name */
    public final v f8111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8112c;

    public f(v vVar, int i10) {
        this.f8111b = vVar;
        this.f8112c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fj.l.b(fVar.f8111b, this.f8111b) && fVar.f8112c == this.f8112c;
    }

    public final int hashCode() {
        return this.f8111b.hashCode() + (this.f8112c * 31);
    }
}
