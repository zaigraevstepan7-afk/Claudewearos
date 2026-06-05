package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f7134a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f7135b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f7136c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f7137d;

    public l0(f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4) {
        this.f7134a = f0Var;
        this.f7135b = f0Var2;
        this.f7136c = f0Var3;
        this.f7137d = f0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return fj.l.b(this.f7134a, l0Var.f7134a) && fj.l.b(this.f7135b, l0Var.f7135b) && fj.l.b(this.f7136c, l0Var.f7136c) && fj.l.b(this.f7137d, l0Var.f7137d);
    }

    public final int hashCode() {
        f0 f0Var = this.f7134a;
        int iHashCode = (f0Var != null ? f0Var.hashCode() : 0) * 31;
        f0 f0Var2 = this.f7135b;
        int iHashCode2 = (iHashCode + (f0Var2 != null ? f0Var2.hashCode() : 0)) * 31;
        f0 f0Var3 = this.f7136c;
        int iHashCode3 = (iHashCode2 + (f0Var3 != null ? f0Var3.hashCode() : 0)) * 31;
        f0 f0Var4 = this.f7137d;
        return iHashCode3 + (f0Var4 != null ? f0Var4.hashCode() : 0);
    }
}
