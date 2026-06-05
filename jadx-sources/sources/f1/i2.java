package f1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i2 extends f0.i0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f6338b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6339c;

    /* renamed from: d, reason: collision with root package name */
    public q.h0 f6340d;

    /* renamed from: e, reason: collision with root package name */
    public q.h0 f6341e;

    /* renamed from: f, reason: collision with root package name */
    public sj.r f6342f;

    /* renamed from: g, reason: collision with root package name */
    public final ab.k f6343g;

    /* renamed from: h, reason: collision with root package name */
    public final t1.f f6344h;

    public i2() {
        super(1);
        this.f6343g = new ab.k(this, 18);
        b0.g2 g2Var = new b0.g2(this, 9);
        t1.m.e(t1.m.f15469a);
        synchronized (t1.m.f15471c) {
            t1.m.f15476h = qi.l.J0((List) t1.m.f15476h, g2Var);
        }
        this.f6344h = new t1.f(g2Var, 0);
    }

    @Override // f0.i0
    public final void d(sj.r rVar) {
        this.f6339c = null;
        this.f6341e = null;
    }

    @Override // f0.i0
    public final void e() {
        synchronized (this.f6149a) {
            try {
                this.f6338b = this.f6339c;
                if (this.f6341e == null) {
                    this.f6340d = null;
                } else {
                    if (this.f6340d == null) {
                        q.h0 h0Var = q.o0.f13110a;
                        this.f6340d = new q.h0();
                    }
                    q.h0 h0Var2 = this.f6340d;
                    this.f6340d = this.f6341e;
                    this.f6341e = h0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f0.i0
    public final void g() {
        this.f6344h.a();
        this.f6339c = null;
        this.f6341e = null;
        synchronized (this.f6149a) {
            this.f6342f = null;
            this.f6338b = null;
            this.f6340d = null;
        }
    }

    @Override // f0.i0
    public final ej.c o(sj.r rVar) {
        sj.r rVar2 = this.f6342f;
        if (rVar2 != null && !rVar2.equals(rVar)) {
            o1.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f6342f = rVar;
        return this.f6343g;
    }

    @Override // f0.i0
    public final void p(sj.g gVar) {
        this.f6342f = null;
        this.f6339c = null;
        this.f6341e = null;
        e();
    }
}
