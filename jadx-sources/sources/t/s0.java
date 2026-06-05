package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f15279a;

    public s0(int i10) {
        this.f15279a = i10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s0) && ((s0) obj).f15279a == this.f15279a;
    }

    public final int hashCode() {
        return this.f15279a;
    }

    @Override // t.j
    public final s1 a(p1 p1Var) {
        return new t7.m(this.f15279a);
    }
}
