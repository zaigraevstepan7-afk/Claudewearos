package f0;

import android.os.Trace;
import java.util.List;
import t2.m1;
import t2.n1;
import t2.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6226a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.d f6227b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.c f6228c;

    /* renamed from: d, reason: collision with root package name */
    public s3.a f6229d;

    /* renamed from: e, reason: collision with root package name */
    public n1 f6230e;

    /* renamed from: f, reason: collision with root package name */
    public m1 f6231f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6232g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6233h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6234i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6235k;

    /* renamed from: l, reason: collision with root package name */
    public y0 f6236l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6237m;

    /* renamed from: n, reason: collision with root package name */
    public long f6238n;

    /* renamed from: o, reason: collision with root package name */
    public long f6239o;

    /* renamed from: p, reason: collision with root package name */
    public long f6240p = oj.d.b();

    /* renamed from: q, reason: collision with root package name */
    public boolean f6241q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f6242r;

    public z0(a1 a1Var, int i10, ac.d dVar, ej.c cVar) {
        this.f6242r = a1Var;
        this.f6226a = i10;
        this.f6227b = dVar;
        this.f6228c = cVar;
    }

    @Override // f0.n0
    public final void a() {
        this.f6237m = true;
    }

    public final void b() {
        m1 m1Var = this.f6231f;
        if (m1Var != null) {
            m1Var.cancel();
        }
        this.f6231f = null;
        n1 n1Var = this.f6230e;
        if (n1Var != null) {
            n1Var.a();
        }
        this.f6230e = null;
        this.f6236l = null;
    }

    public final boolean c(a aVar) {
        boolean zD;
        if (!this.f6242r.f6104a) {
            return false;
        }
        if (this.f6237m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(aVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(aVar);
        }
        u3.a.o(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // f0.n0
    public final void cancel() {
        if (this.f6233h) {
            return;
        }
        this.f6233h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(f0.a r22) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.z0.d(f0.a):boolean");
    }

    public final boolean e() {
        m1 m1Var;
        return this.f6234i || ((m1Var = this.f6231f) != null && m1Var.e());
    }

    public final void f(long j) {
        if (this.f6233h) {
            a0.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f6232g) {
            a0.a.a("Request was already measured!");
        }
        this.f6232g = true;
        n1 n1Var = this.f6230e;
        if (n1Var == null) {
            a0.a.b("performComposition() must be called before performMeasure()");
            throw new b3.e();
        }
        int iB = n1Var.b();
        for (int i10 = 0; i10 < iB; i10++) {
            n1Var.d(i10, j);
        }
    }

    public final void g(Object obj, Object obj2, c cVar) {
        m1 cVar2;
        m1 m1Var = this.f6231f;
        if (m1Var == null) {
            a1 a1Var = this.f6242r;
            ej.e eVarA = ((a0) a1Var.f6105b).a(this.f6226a, obj, obj2);
            t2.m0 m0VarA = ((p1) a1Var.f6106c).a();
            if (m0VarA.f15600a.G()) {
                m0VarA.k(obj, eVarA, true);
                cVar2 = new qh.c(5, m0VarA, obj);
            } else {
                cVar2 = new q5.b(6, m0VarA, obj);
            }
            m1Var = cVar2;
            this.f6231f = m1Var;
            this.j = obj;
        }
        this.f6241q = false;
        while (!m1Var.e() && !this.f6241q) {
            m1Var.a(new ac.l(8, this, cVar));
        }
        j();
        if (this.f6241q) {
            cVar.f6116b = c.a(this.f6239o, cVar.f6116b);
        } else {
            cVar.f6115a = c.a(this.f6239o, cVar.f6115a);
        }
    }

    public final y0 h() {
        n1 n1Var = this.f6230e;
        if (n1Var == null) {
            a0.a.b("Should precompose before resolving nested prefetch states");
            throw new b3.e();
        }
        fj.v vVar = new fj.v();
        n1Var.e(new ab.k(vVar, 15));
        List list = (List) vVar.f6807a;
        if (list != null) {
            return new y0(this, list);
        }
        return null;
    }

    public final boolean i(long j, long j4) {
        if (this.f6237m) {
            j4 = 0;
        }
        return j > j4;
    }

    public final void j() {
        long jB = oj.d.b();
        long jB2 = oj.e.b(jB, this.f6240p);
        long j = jB2 >> 1;
        oj.f fVar = oj.a.f12531b;
        if ((((int) jB2) & 1) != 0) {
            j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
        }
        this.f6239o = j;
        long j4 = this.f6238n - j;
        this.f6238n = j4;
        this.f6240p = jB;
        u3.a.o(j4, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f6226a + ", constraints = " + this.f6229d + ", isComposed = " + e() + ", isMeasured = " + this.f6232g + ", isCanceled = " + this.f6233h + " }";
    }
}
