package u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f16540a;

    /* renamed from: b, reason: collision with root package name */
    public g3.f f16541b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16542c = false;

    /* renamed from: d, reason: collision with root package name */
    public f f16543d = null;

    public j(g3.f fVar, g3.f fVar2) {
        this.f16540a = fVar;
        this.f16541b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return fj.l.b(this.f16540a, jVar.f16540a) && fj.l.b(this.f16541b, jVar.f16541b) && this.f16542c == jVar.f16542c && fj.l.b(this.f16543d, jVar.f16543d);
    }

    public final int hashCode() {
        int i10 = gk.b.i((this.f16541b.hashCode() + (this.f16540a.hashCode() * 31)) * 31, 31, this.f16542c);
        f fVar = this.f16543d;
        return i10 + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f16540a) + ", substitution=" + ((Object) this.f16541b) + ", isShowingSubstitution=" + this.f16542c + ", layoutCache=" + this.f16543d + ')';
    }
}
