package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15579a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f15580b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum f15581c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum f15582d;

    public /* synthetic */ j(p0 p0Var, Enum r2, Enum r32, int i10) {
        this.f15579a = i10;
        this.f15580b = p0Var;
        this.f15581c = r2;
        this.f15582d = r32;
    }

    @Override // t2.p0
    public final int O(int i10) {
        switch (this.f15579a) {
        }
        return this.f15580b.O(i10);
    }

    @Override // t2.p0
    public final int V(int i10) {
        switch (this.f15579a) {
        }
        return this.f15580b.V(i10);
    }

    @Override // t2.p0
    public final f1 Y(long j) {
        switch (this.f15579a) {
            case 0:
                s sVar = (s) this.f15581c;
                t tVar = (t) this.f15582d;
                t tVar2 = t.f15635a;
                p0 p0Var = this.f15580b;
                if (tVar == tVar2) {
                    return new l(sVar == s.f15633b ? p0Var.V(s3.a.g(j)) : p0Var.O(s3.a.g(j)), s3.a.c(j) ? s3.a.g(j) : 32767, 0);
                }
                return new l(s3.a.d(j) ? s3.a.h(j) : 32767, sVar == s.f15633b ? p0Var.l(s3.a.h(j)) : p0Var.v0(s3.a.h(j)), 0);
            case 1:
                t0 t0Var = (t0) this.f15581c;
                u0 u0Var = (u0) this.f15582d;
                u0 u0Var2 = u0.f15647a;
                p0 p0Var2 = this.f15580b;
                if (u0Var == u0Var2) {
                    return new l(t0Var == t0.f15639b ? p0Var2.V(s3.a.g(j)) : p0Var2.O(s3.a.g(j)), s3.a.c(j) ? s3.a.g(j) : 32767, 1);
                }
                return new l(s3.a.d(j) ? s3.a.h(j) : 32767, t0Var == t0.f15639b ? p0Var2.l(s3.a.h(j)) : p0Var2.v0(s3.a.h(j)), 1);
            default:
                v2.k1 k1Var = (v2.k1) this.f15581c;
                v2.l1 l1Var = (v2.l1) this.f15582d;
                v2.l1 l1Var2 = v2.l1.f17721a;
                p0 p0Var3 = this.f15580b;
                if (l1Var == l1Var2) {
                    return new l(k1Var == v2.k1.f17711b ? p0Var3.V(s3.a.g(j)) : p0Var3.O(s3.a.g(j)), s3.a.c(j) ? s3.a.g(j) : 32767, 2);
                }
                return new l(s3.a.d(j) ? s3.a.h(j) : 32767, k1Var == v2.k1.f17711b ? p0Var3.l(s3.a.h(j)) : p0Var3.v0(s3.a.h(j)), 2);
        }
    }

    @Override // t2.p0
    public final Object c0() {
        switch (this.f15579a) {
        }
        return this.f15580b.c0();
    }

    @Override // t2.p0
    public final int l(int i10) {
        switch (this.f15579a) {
        }
        return this.f15580b.l(i10);
    }

    @Override // t2.p0
    public final int v0(int i10) {
        switch (this.f15579a) {
        }
        return this.f15580b.v0(i10);
    }
}
