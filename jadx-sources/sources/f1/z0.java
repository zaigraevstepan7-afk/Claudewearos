package f1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 extends f0.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final q.g0 f6499b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6500c;

    /* renamed from: d, reason: collision with root package name */
    public final q.h0 f6501d;

    /* renamed from: e, reason: collision with root package name */
    public final q.g0 f6502e;

    /* renamed from: f, reason: collision with root package name */
    public final t1.f f6503f;

    public z0() {
        super(1);
        this.f6499b = yd.f.q();
        this.f6500c = new ArrayList();
        q.h0 h0Var = q.o0.f13110a;
        this.f6501d = new q.h0();
        this.f6502e = new q.g0();
        b0.g2 g2Var = new b0.g2(this, 7);
        t1.m.e(t1.m.f15469a);
        synchronized (t1.m.f15471c) {
            t1.m.f15476h = qi.l.J0((List) t1.m.f15476h, g2Var);
        }
        this.f6503f = new t1.f(g2Var, 0);
    }

    @Override // f0.i0
    public final void d(sj.r rVar) {
        this.f6500c.add(new x0(rVar));
    }

    @Override // f0.i0
    public final void e() {
        synchronized (this.f6149a) {
            try {
                ArrayList arrayList = this.f6500c;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y0 y0Var = (y0) arrayList.get(i10);
                    if (y0Var instanceof w0) {
                        yd.f.d(this.f6499b, ((w0) y0Var).f6469a, ((w0) y0Var).f6470b);
                    } else {
                        if (!(y0Var instanceof x0)) {
                            throw new b3.e();
                        }
                        yd.f.a0(this.f6499b, ((x0) y0Var).f6484a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6500c.clear();
    }

    @Override // f0.i0
    public final void g() {
        this.f6503f.a();
        this.f6500c.clear();
        this.f6502e.a();
        synchronized (this.f6149a) {
            this.f6499b.a();
        }
    }

    @Override // f0.i0
    public final ej.c o(sj.r rVar) {
        q.g0 g0Var = this.f6502e;
        ej.c c1Var = (ej.c) g0Var.g(rVar);
        if (c1Var == null) {
            c1Var = new b0.c1(18, this, rVar);
            int iF = g0Var.f(rVar);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = g0Var.f13075c;
            Object obj = objArr[iF];
            g0Var.f13074b[iF] = rVar;
            objArr[iF] = c1Var;
        }
        return c1Var;
    }

    @Override // f0.i0
    public final void p(sj.g gVar) {
        this.f6502e.k(gVar);
        d(gVar);
        e();
    }
}
