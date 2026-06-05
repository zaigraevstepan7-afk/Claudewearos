package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1368a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1369b;

    public k0(int i10, int i11) {
        this.f1368a = i10;
        this.f1369b = i11;
    }

    @Override // b0.d2
    public final int a(s3.c cVar, s3.m mVar) {
        return 0;
    }

    @Override // b0.d2
    public final int b(s3.c cVar) {
        return 0;
    }

    @Override // b0.d2
    public final int c(s3.c cVar, s3.m mVar) {
        return this.f1368a;
    }

    @Override // b0.d2
    public final int d(s3.c cVar) {
        return this.f1369b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f1368a == k0Var.f1368a && this.f1369b == k0Var.f1369b;
    }

    public final int hashCode() {
        return ((this.f1368a * 31) + this.f1369b) * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f1368a);
        sb2.append(", top=");
        return m6.a.h(sb2, this.f1369b, ", right=0, bottom=0)");
    }
}
