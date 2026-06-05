package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1276b;

    public a1(d2 d2Var, int i10) {
        this.f1275a = d2Var;
        this.f1276b = i10;
    }

    @Override // b0.d2
    public final int a(s3.c cVar, s3.m mVar) {
        if (((mVar == s3.m.f14752a ? 4 : 1) & this.f1276b) != 0) {
            return this.f1275a.a(cVar, mVar);
        }
        return 0;
    }

    @Override // b0.d2
    public final int b(s3.c cVar) {
        if ((this.f1276b & 32) != 0) {
            return this.f1275a.b(cVar);
        }
        return 0;
    }

    @Override // b0.d2
    public final int c(s3.c cVar, s3.m mVar) {
        if (((mVar == s3.m.f14752a ? 8 : 2) & this.f1276b) != 0) {
            return this.f1275a.c(cVar, mVar);
        }
        return 0;
    }

    @Override // b0.d2
    public final int d(s3.c cVar) {
        if ((this.f1276b & 16) != 0) {
            return this.f1275a.d(cVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return fj.l.b(this.f1275a, a1Var.f1275a) && this.f1276b == a1Var.f1276b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1276b) + (this.f1275a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f1275a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = d.f1298h;
        int i11 = this.f1276b;
        if ((i11 & i10) == i10) {
            d.z(sb4, "Start");
        }
        int i12 = d.j;
        if ((i11 & i12) == i12) {
            d.z(sb4, "Left");
        }
        if ((i11 & 16) == 16) {
            d.z(sb4, "Top");
        }
        int i13 = d.f1299i;
        if ((i11 & i13) == i13) {
            d.z(sb4, "End");
        }
        int i14 = d.f1300k;
        if ((i11 & i14) == i14) {
            d.z(sb4, "Right");
        }
        if ((i11 & 32) == 32) {
            d.z(sb4, "Bottom");
        }
        sb3.append(sb4.toString());
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
