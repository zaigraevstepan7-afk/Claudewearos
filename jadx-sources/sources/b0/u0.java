package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1445d;

    public u0(int i10, int i11, int i12, int i13) {
        this.f1442a = i10;
        this.f1443b = i11;
        this.f1444c = i12;
        this.f1445d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f1442a == u0Var.f1442a && this.f1443b == u0Var.f1443b && this.f1444c == u0Var.f1444c && this.f1445d == u0Var.f1445d;
    }

    public final int hashCode() {
        return (((((this.f1442a * 31) + this.f1443b) * 31) + this.f1444c) * 31) + this.f1445d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f1442a);
        sb2.append(", top=");
        sb2.append(this.f1443b);
        sb2.append(", right=");
        sb2.append(this.f1444c);
        sb2.append(", bottom=");
        return m6.a.g(sb2, this.f1445d, ')');
    }
}
