package p2;

import v2.c2;
import v2.d1;
import v2.e2;
import v2.w1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g extends v1.n implements e2, w1, v2.i {
    public v2.l H;
    public a I;
    public boolean J;

    public g(a aVar, v2.l lVar) {
        this.H = lVar;
        this.I = aVar;
    }

    @Override // v2.w1
    public final long G() {
        v2.l lVar = this.H;
        if (lVar == null) {
            return c2.f17593a;
        }
        s3.c cVar = v2.n.y(this).R;
        int i10 = c2.f17594b;
        return d1.h(cVar.I0(lVar.f17713a), cVar.I0(lVar.f17714b), cVar.I0(lVar.f17715c), cVar.I0(lVar.f17716d));
    }

    @Override // v2.w1
    public final void V() {
        u1();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v2.w1
    public final void a0(n nVar, o oVar, long j) {
        if (oVar == o.f12744b) {
            ?? r32 = nVar.f12734a;
            int size = r32.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (t1(((w) r32.get(i10)).f12768i)) {
                    int i11 = nVar.f12739f;
                    if (i11 == 4) {
                        this.J = true;
                        s1();
                        return;
                    } else {
                        if (i11 == 5) {
                            u1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // v1.n
    public final void j1() {
        u1();
    }

    public final void q1() {
        a aVar;
        fj.v vVar = new fj.v();
        v2.n.C(this, new f(1));
        g gVar = (g) vVar.f6807a;
        if (gVar == null || (aVar = gVar.I) == null) {
            aVar = this.I;
        }
        r1(aVar);
    }

    public abstract void r1(t tVar);

    public final void s1() {
        fj.r rVar = new fj.r();
        rVar.f6803a = true;
        v2.n.E(this, new e(rVar));
        if (rVar.f6803a) {
            q1();
        }
    }

    public abstract boolean t1(int i10);

    public final void u1() {
        if (this.J) {
            this.J = false;
            if (this.G) {
                fj.v vVar = new fj.v();
                v2.n.C(this, new o2.j(vVar, 1));
                g gVar = (g) vVar.f6807a;
                if (gVar != null) {
                    gVar.q1();
                } else {
                    r1(null);
                }
            }
        }
    }
}
