package i2;

import f1.j1;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends h2.b {
    public final e0 A;
    public final j1 B;
    public float C;
    public c2.n D;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f8279f = f1.s.A(new b2.e(0));

    /* renamed from: z, reason: collision with root package name */
    public final j1 f8280z = f1.s.A(Boolean.FALSE);

    public j0(c cVar) {
        e0 e0Var = new e0(cVar);
        e0Var.f8221f = new a2.f0(this, 3);
        this.A = e0Var;
        this.B = new j1(pi.o.f13011a, f1.f.f6290d);
        this.C = 1.0f;
    }

    @Override // h2.b
    public final boolean b(float f10) {
        this.C = f10;
        return true;
    }

    @Override // h2.b
    public final boolean e(c2.n nVar) {
        this.D = nVar;
        return true;
    }

    @Override // h2.b
    public final long h() {
        return ((b2.e) this.f8279f.getValue()).f1514a;
    }

    @Override // h2.b
    public final void i(v2.h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        c2.n nVar = this.D;
        e0 e0Var = this.A;
        if (nVar == null) {
            nVar = (c2.n) e0Var.f8222g.getValue();
        }
        if (((Boolean) this.f8280z.getValue()).booleanValue() && h0Var.getLayoutDirection() == s3.m.f14753b) {
            long jL0 = bVar.L0();
            ac.d dVar = bVar.f5738b;
            long jY = dVar.y();
            dVar.h().f();
            try {
                ((ld.i) dVar.f373b).S(-1.0f, 1.0f, jL0);
                e0Var.e(h0Var, this.C, nVar);
            } finally {
                m1.r(dVar, jY);
            }
        } else {
            e0Var.e(h0Var, this.C, nVar);
        }
        this.B.getValue();
    }
}
