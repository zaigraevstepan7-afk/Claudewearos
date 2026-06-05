package v2;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f2 implements f1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17641a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17642b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Object f17643c;

    public f2(f0 f0Var) {
        this.f17641a = f0Var;
        this.f17643c = f0Var;
    }

    public final void a() {
        this.f17642b.clear();
        this.f17643c = this.f17641a;
        ((f0) this.f17641a).P();
    }

    @Override // f1.a
    public final void c(int i10, Object obj) {
        ((f0) this.f17643c).A(i10, (f0) obj);
    }

    @Override // f1.a
    public final void e(Object obj) {
        this.f17642b.add(this.f17643c);
        this.f17643c = obj;
    }

    @Override // f1.a
    public final void f() {
        e3.b rectManager;
        w1.c cVar;
        e3.b rectManager2;
        f0 f0Var = (f0) this.f17643c;
        b1 b1Var = f0Var.Y;
        if (!f0Var.G()) {
            s2.a.a("onReuse is only expected on attached node");
        }
        v3.w wVar = f0Var.H;
        if (wVar != null) {
            View view = wVar.f17829b;
            if (view.getParent() != wVar) {
                wVar.addView(view);
            } else {
                wVar.f17833f.a();
            }
        }
        t2.m0 m0Var = f0Var.f17623a0;
        if (m0Var != null) {
            m0Var.i(false);
        }
        f0Var.M = false;
        if (f0Var.f17637j0) {
            f0Var.f17637j0 = false;
        } else {
            v1.n nVar = b1Var.f17585e;
            for (v1.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f17569e) {
                if (nVar2.G) {
                    nVar2.l1();
                }
            }
            for (v1.n nVar3 = nVar; nVar3 != null; nVar3 = nVar3.f17569e) {
                if (nVar3.G) {
                    nVar3.n1();
                }
            }
            while (nVar != null) {
                if (nVar.G) {
                    nVar.h1();
                }
                nVar = nVar.f17569e;
            }
        }
        int i10 = f0Var.f17624b;
        r1 r1Var = f0Var.G;
        if (r1Var != null && (rectManager2 = ((w2.t) r1Var).getRectManager()) != null) {
            rectManager2.f(f0Var);
        }
        f0Var.f17624b = d3.p.f4762a.addAndGet(1);
        r1 r1Var2 = f0Var.G;
        if (r1Var2 != null) {
            w2.t tVar = (w2.t) r1Var2;
            tVar.getLayoutNodes().g(i10);
            tVar.getLayoutNodes().i(f0Var.f17624b, f0Var);
        }
        for (v1.n nVar4 = b1Var.f17586f; nVar4 != null; nVar4 = nVar4.f17570f) {
            nVar4.g1();
        }
        b1Var.e();
        if (b1Var.d(8)) {
            f0Var.E();
        }
        f0.W(f0Var);
        r1 r1Var3 = f0Var.G;
        if (r1Var3 != null && (cVar = ((w2.t) r1Var3).f18402j0) != null) {
            w2.t tVar2 = cVar.f18170c;
            yh.c cVar2 = cVar.f18168a;
            q.w wVar2 = cVar.A;
            if (wVar2.f(i10)) {
                cVar2.u(tVar2, i10, false);
            }
            d3.n nVarW = f0Var.w();
            if (nVarW != null && nVarW.f4758a.b(d3.v.f4792r)) {
                wVar2.a(f0Var.f17624b);
                cVar2.u(tVar2, f0Var.f17624b, true);
            }
        }
        r1 r1Var4 = f0Var.G;
        if (r1Var4 == null || (rectManager = ((w2.t) r1Var4).getRectManager()) == null) {
            return;
        }
        rectManager.e(f0Var);
    }

    @Override // f1.a
    public final void g(int i10, int i11, int i12) {
        ((f0) this.f17643c).K(i10, i11, i12);
    }

    @Override // f1.a
    public final void h(int i10, int i11) {
        ((f0) this.f17643c).Q(i10, i11);
    }

    @Override // f1.a
    public final void i() {
        this.f17643c = f1.s.B(this.f17642b);
    }

    @Override // f1.a
    public final /* bridge */ /* synthetic */ void l(int i10, Object obj) {
    }

    @Override // f1.a
    public final void m() {
        r1 r1Var = ((f0) this.f17641a).G;
        if (r1Var != null) {
            ((w2.t) r1Var).B();
        }
    }

    @Override // f1.a
    public final Object n() {
        return this.f17643c;
    }
}
