package zg;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    public final long f20611c;

    public o(Long l10, r rVar) {
        super(rVar);
        this.f20611c = l10.longValue();
    }

    @Override // zg.n
    public final int b(n nVar) {
        long j = ((o) nVar).f20611c;
        char[] cArr = ug.l.f17082a;
        long j4 = this.f20611c;
        if (j4 < j) {
            return -1;
        }
        return j4 == j ? 0 : 1;
    }

    @Override // zg.n
    public final int e() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f20611c == oVar.f20611c && this.f20609a.equals(oVar.f20609a);
    }

    @Override // zg.r
    public final String g(int i10) {
        return m1.v(i(i10), "number:") + ug.l.a(this.f20611c);
    }

    @Override // zg.r
    public final Object getValue() {
        return Long.valueOf(this.f20611c);
    }

    public final int hashCode() {
        long j = this.f20611c;
        return this.f20609a.hashCode() + ((int) (j ^ (j >>> 32)));
    }

    @Override // zg.r
    public final r m(r rVar) {
        return new o(Long.valueOf(this.f20611c), rVar);
    }
}
