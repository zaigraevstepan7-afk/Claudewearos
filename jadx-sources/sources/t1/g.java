package t1;

import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public k f15438a;

    /* renamed from: b, reason: collision with root package name */
    public long f15439b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15440c;

    /* renamed from: d, reason: collision with root package name */
    public int f15441d;

    public g(long j, k kVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f15438a = kVar;
        this.f15439b = j;
        p0 p0Var = m.f15469a;
        if (j != 0) {
            k kVarD = d();
            long j4 = kVarD.f15464c;
            long[] jArr = kVarD.f15465d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j10 = kVarD.f15463b;
                if (j10 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j11 = kVarD.f15462a;
                    if (j11 != 0) {
                        j4 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                    }
                }
                j = iNumberOfTrailingZeros + j4;
            }
            synchronized (m.f15471c) {
                iA = m.f15474f.a(j);
            }
        } else {
            iA = -1;
        }
        this.f15441d = iA;
    }

    public static void q(g gVar) {
        m.f15470b.C(gVar);
    }

    public final void a() {
        synchronized (m.f15471c) {
            b();
            p();
        }
    }

    public void b() {
        m.f15472d = m.f15472d.e(g());
    }

    public abstract void c();

    public k d() {
        return this.f15438a;
    }

    public abstract ej.c e();

    public abstract boolean f();

    public long g() {
        return this.f15439b;
    }

    public int h() {
        return 0;
    }

    public abstract ej.c i();

    public final g j() {
        p1.l lVar = m.f15470b;
        g gVar = (g) lVar.get();
        lVar.C(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(a0 a0Var);

    public final void o() {
        int i10 = this.f15441d;
        if (i10 >= 0) {
            m.u(i10);
            this.f15441d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(k kVar) {
        this.f15438a = kVar;
    }

    public void s(long j) {
        this.f15439b = j;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g u(ej.c cVar);
}
