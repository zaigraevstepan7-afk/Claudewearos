package w3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18536a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18537b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f18538c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18539d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18540e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18541f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18542g;

    public u() {
        e0 e0Var = e0.f18499a;
        this.f18536a = true;
        this.f18537b = true;
        this.f18538c = e0Var;
        this.f18539d = true;
        this.f18540e = true;
        this.f18541f = "";
        this.f18542g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f18536a == uVar.f18536a && this.f18537b == uVar.f18537b && this.f18538c == uVar.f18538c && this.f18539d == uVar.f18539d && this.f18540e == uVar.f18540e && this.f18542g == uVar.f18542g;
    }

    public final int hashCode() {
        return (gk.b.i(gk.b.i((this.f18538c.hashCode() + gk.b.i(Boolean.hashCode(this.f18536a) * 31, 31, this.f18537b)) * 31, 31, this.f18539d), 31, this.f18540e) + this.f18542g) * 31;
    }
}
