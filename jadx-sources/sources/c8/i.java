package c8;

import t.m1;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f3121a;

    /* renamed from: b, reason: collision with root package name */
    public int f3122b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f3123c;

    /* renamed from: d, reason: collision with root package name */
    public String f3124d;

    /* renamed from: e, reason: collision with root package name */
    public t7.f f3125e;

    /* renamed from: f, reason: collision with root package name */
    public t7.f f3126f;

    /* renamed from: g, reason: collision with root package name */
    public long f3127g;

    /* renamed from: h, reason: collision with root package name */
    public long f3128h;

    /* renamed from: i, reason: collision with root package name */
    public long f3129i;
    public t7.c j;

    /* renamed from: k, reason: collision with root package name */
    public int f3130k;

    /* renamed from: l, reason: collision with root package name */
    public int f3131l;

    /* renamed from: m, reason: collision with root package name */
    public long f3132m;

    /* renamed from: n, reason: collision with root package name */
    public long f3133n;

    /* renamed from: o, reason: collision with root package name */
    public long f3134o;

    /* renamed from: p, reason: collision with root package name */
    public long f3135p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3136q;

    /* renamed from: r, reason: collision with root package name */
    public int f3137r;

    static {
        m.l("WorkSpec");
    }

    public i(String str, String str2) {
        t7.f fVar = t7.f.f16114c;
        this.f3125e = fVar;
        this.f3126f = fVar;
        this.j = t7.c.f16101i;
        this.f3131l = 1;
        this.f3132m = 30000L;
        this.f3135p = -1L;
        this.f3137r = 1;
        this.f3121a = str;
        this.f3123c = str2;
    }

    public final long a() {
        int i10;
        if (this.f3122b == 1 && (i10 = this.f3130k) > 0) {
            return Math.min(18000000L, this.f3131l == 2 ? this.f3132m * i10 : (long) Math.scalb(this.f3132m, i10 - 1)) + this.f3133n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f3133n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f3127g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.f3133n;
        if (j == 0) {
            j = this.f3127g + jCurrentTimeMillis2;
        }
        long j4 = this.f3129i;
        long j10 = this.f3128h;
        if (j4 != j10) {
            return j + j10 + (j == 0 ? j4 * (-1) : 0L);
        }
        return j + (j != 0 ? j10 : 0L);
    }

    public final boolean b() {
        return !t7.c.f16101i.equals(this.j);
    }

    public final boolean c() {
        return this.f3128h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3127g != iVar.f3127g || this.f3128h != iVar.f3128h || this.f3129i != iVar.f3129i || this.f3130k != iVar.f3130k || this.f3132m != iVar.f3132m || this.f3133n != iVar.f3133n || this.f3134o != iVar.f3134o || this.f3135p != iVar.f3135p || this.f3136q != iVar.f3136q || !this.f3121a.equals(iVar.f3121a) || this.f3122b != iVar.f3122b || !this.f3123c.equals(iVar.f3123c)) {
            return false;
        }
        String str = this.f3124d;
        if (str != null) {
            if (!str.equals(iVar.f3124d)) {
                return false;
            }
        } else if (iVar.f3124d != null) {
            return false;
        }
        return this.f3125e.equals(iVar.f3125e) && this.f3126f.equals(iVar.f3126f) && this.j.equals(iVar.j) && this.f3131l == iVar.f3131l && this.f3137r == iVar.f3137r;
    }

    public final int hashCode() {
        int iC = m1.c((y3.e.b(this.f3122b) + (this.f3121a.hashCode() * 31)) * 31, 31, this.f3123c);
        String str = this.f3124d;
        int iHashCode = (this.f3126f.hashCode() + ((this.f3125e.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f3127g;
        int i10 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f3128h;
        int i11 = (i10 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.f3129i;
        int iB = (y3.e.b(this.f3131l) + ((((this.j.hashCode() + ((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + this.f3130k) * 31)) * 31;
        long j11 = this.f3132m;
        int i12 = (iB + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f3133n;
        int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f3134o;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f3135p;
        return y3.e.b(this.f3137r) + ((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f3136q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return m6.a.j(new StringBuilder("{WorkSpec: "), this.f3121a, "}");
    }
}
