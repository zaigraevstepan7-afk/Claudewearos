package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h1 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15178a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15179b;

    public h1(Object obj, Object obj2) {
        this.f15178a = obj;
        this.f15179b = obj2;
    }

    @Override // t.g1
    public final Object b() {
        return this.f15178a;
    }

    @Override // t.g1
    public final Object c() {
        return this.f15179b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return fj.l.b(this.f15178a, g1Var.b()) && fj.l.b(this.f15179b, g1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f15178a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f15179b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
