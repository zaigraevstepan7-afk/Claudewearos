package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f15302a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15303b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15304c;

    public v1(s1 s1Var, long j) {
        r0 r0Var = r0.f15268a;
        this.f15302a = s1Var;
        this.f15303b = (s1Var.t() + s1Var.o()) * 1000000;
        this.f15304c = j * 1000000;
    }

    @Override // t.q1
    public final boolean a() {
        return true;
    }

    @Override // t.q1
    public final long b(p pVar, p pVar2, p pVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j4 = j + this.f15304c;
        if (j4 <= 0) {
            return 0L;
        }
        long j10 = this.f15303b;
        r0 r0Var = r0.f15268a;
        return j4 - ((j4 / j10) * j10);
    }

    @Override // t.q1
    public final p d(long j, p pVar, p pVar2, p pVar3) {
        return this.f15302a.d(c(j), pVar, pVar2, e(j, pVar, pVar3, pVar2));
    }

    public final p e(long j, p pVar, p pVar2, p pVar3) {
        long j4 = this.f15304c;
        long j10 = j + j4;
        long j11 = this.f15303b;
        return j10 > j11 ? this.f15302a.k(j11 - j4, pVar, pVar3, pVar2) : pVar2;
    }

    @Override // t.q1
    public final p k(long j, p pVar, p pVar2, p pVar3) {
        return this.f15302a.k(c(j), pVar, pVar2, e(j, pVar, pVar3, pVar2));
    }
}
