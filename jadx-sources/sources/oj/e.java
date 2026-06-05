package oj;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f12545a;

    public static long a(long j) {
        long jB = d.b();
        c cVar = c.f12536b;
        l.f(cVar, "unit");
        return (1 | (j - 1)) == Long.MAX_VALUE ? a.r(cg.b.F(j)) : cg.b.L(jB, j, cVar);
    }

    public static final long b(long j, long j4) {
        int i10 = d.f12544b;
        c cVar = c.f12536b;
        l.f(cVar, "unit");
        if (((j4 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? cg.b.F(j) : cg.b.L(j, j4, cVar);
        }
        if (j != j4) {
            return a.r(cg.b.F(j4));
        }
        f fVar = a.f12531b;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        l.f(eVar, "other");
        return a.e(b(this.f12545a, eVar.f12545a), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f12545a == ((e) obj).f12545a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12545a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f12545a + ')';
    }
}
