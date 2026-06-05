package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f9881a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9882b;

    public a0(g3.f fVar, n nVar) {
        this.f9881a = fVar;
        this.f9882b = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return fj.l.b(this.f9881a, a0Var.f9881a) && fj.l.b(this.f9882b, a0Var.f9882b);
    }

    public final int hashCode() {
        return this.f9882b.hashCode() + (this.f9881a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f9881a) + ", offsetMapping=" + this.f9882b + ')';
    }
}
