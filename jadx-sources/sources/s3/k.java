package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f14746e = new k(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f14747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14749c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14750d;

    public k(int i10, int i11, int i12, int i13) {
        this.f14747a = i10;
        this.f14748b = i11;
        this.f14749c = i12;
        this.f14750d = i13;
    }

    public final int a() {
        return this.f14750d - this.f14748b;
    }

    public final long b() {
        return (this.f14747a << 32) | (this.f14748b & 4294967295L);
    }

    public final int c() {
        return this.f14749c - this.f14747a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f14747a == kVar.f14747a && this.f14748b == kVar.f14748b && this.f14749c == kVar.f14749c && this.f14750d == kVar.f14750d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14750d) + gk.b.g(this.f14749c, gk.b.g(this.f14748b, Integer.hashCode(this.f14747a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f14747a);
        sb2.append(", ");
        sb2.append(this.f14748b);
        sb2.append(", ");
        sb2.append(this.f14749c);
        sb2.append(", ");
        return m6.a.g(sb2, this.f14750d, ')');
    }
}
