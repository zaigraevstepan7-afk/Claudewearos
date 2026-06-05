package w3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18490a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18491b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18492c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18493d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18495f;

    public d0(boolean z2, e0 e0Var, boolean z10, int i10) {
        f1.v vVar = m.f18526a;
        int i11 = !z2 ? 262152 : 262144;
        i11 = e0Var == e0.f18500b ? i11 | 8192 : i11;
        i11 = z10 ? i11 : i11 | 512;
        boolean z11 = e0Var == e0.f18499a;
        this.f18490a = i11;
        this.f18491b = z11;
        this.f18492c = true;
        this.f18493d = true;
        this.f18494e = true;
        this.f18495f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f18490a == d0Var.f18490a && this.f18491b == d0Var.f18491b && this.f18492c == d0Var.f18492c && this.f18493d == d0Var.f18493d && this.f18494e == d0Var.f18494e && this.f18495f == d0Var.f18495f;
    }

    public final int hashCode() {
        return (gk.b.i(gk.b.i(gk.b.i(gk.b.i(gk.b.i(this.f18490a * 31, 31, this.f18491b), 31, this.f18492c), 31, this.f18493d), 31, this.f18494e), 31, false) + this.f18495f) * 31;
    }
}
