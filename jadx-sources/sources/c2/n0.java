package c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends e0 {

    /* renamed from: f, reason: collision with root package name */
    public final b2.d f3022f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3023g;

    public n0(b2.d dVar) {
        j jVarA;
        this.f3022f = dVar;
        if (wd.a.J(dVar)) {
            jVarA = null;
        } else {
            jVarA = l.a();
            j.c(jVarA, dVar);
        }
        this.f3023g = jVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return fj.l.b(this.f3022f, ((n0) obj).f3022f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3022f.hashCode();
    }

    @Override // c2.e0
    public final b2.c o() {
        b2.d dVar = this.f3022f;
        return new b2.c(dVar.f1506a, dVar.f1507b, dVar.f1508c, dVar.f1509d);
    }
}
