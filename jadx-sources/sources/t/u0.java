package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final float f15292a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15293b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15294c;

    public u0(float f10, float f11, Object obj) {
        this.f15292a = f10;
        this.f15293b = f11;
        this.f15294c = obj;
    }

    @Override // t.j
    public final q1 a(p1 p1Var) {
        Object obj = this.f15294c;
        return new ag.i(this.f15292a, this.f15293b, obj == null ? null : (p) p1Var.f15249a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (u0Var.f15292a == this.f15292a && u0Var.f15293b == this.f15293b && fj.l.b(u0Var.f15294c, this.f15294c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f15294c;
        return Float.hashCode(this.f15293b) + gk.b.f(this.f15292a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ u0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
