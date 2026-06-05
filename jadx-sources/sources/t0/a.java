package t0;

import android.graphics.Rect;
import android.view.View;
import g3.k0;
import g3.m0;
import java.lang.ref.WeakReference;
import k0.z;
import l3.t;
import qj.b0;
import qj.s1;
import tj.a0;
import tj.h0;
import tj.i0;
import w2.d2;
import w2.f1;
import w2.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements l3.o {

    /* renamed from: a, reason: collision with root package name */
    public l f15338a;

    /* renamed from: b, reason: collision with root package name */
    public s1 f15339b;

    /* renamed from: c, reason: collision with root package name */
    public q f15340c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f15341d;

    @Override // l3.o
    public final void a(t tVar, l3.n nVar, k0 k0Var, f1.d dVar, b2.c cVar, b2.c cVar2) {
        q qVar = this.f15340c;
        if (qVar != null) {
            n nVar2 = qVar.f15396m;
            synchronized (nVar2.f15370c) {
                try {
                    nVar2.j = tVar;
                    nVar2.f15378l = nVar;
                    nVar2.f15377k = k0Var;
                    nVar2.f15379m = cVar;
                    nVar2.f15380n = cVar2;
                    if (nVar2.f15372e || nVar2.f15371d) {
                        nVar2.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // l3.o
    public final void b(t tVar, l3.j jVar, ab.m mVar, z zVar) {
        j(new d.b(tVar, this, jVar, mVar, zVar, 5));
    }

    @Override // l3.o
    public final void c() {
        j(null);
    }

    @Override // l3.o
    public final void d() {
        d2 d2Var;
        l lVar = this.f15338a;
        if (lVar == null || (d2Var = (d2) v2.n.h(lVar, f1.f18270q)) == null) {
            return;
        }
        ((g1) d2Var).b();
    }

    @Override // l3.o
    public final void e() {
        s1 s1Var = this.f15339b;
        if (s1Var != null) {
            s1Var.e(null);
        }
        this.f15339b = null;
        a0 a0VarI = i();
        if (a0VarI != null) {
            h0 h0Var = (h0) a0VarI;
            synchronized (h0Var) {
                h0Var.u(h0Var.o() + h0Var.D, h0Var.C, h0Var.o() + h0Var.D, h0Var.o() + h0Var.D + h0Var.E);
            }
        }
    }

    @Override // l3.o
    public final void f(b2.c cVar) {
        Rect rect;
        q qVar = this.f15340c;
        if (qVar != null) {
            qVar.f15395l = new Rect(hj.a.H(cVar.f1502a), hj.a.H(cVar.f1503b), hj.a.H(cVar.f1504c), hj.a.H(cVar.f1505d));
            if (!qVar.j.isEmpty() || (rect = qVar.f15395l) == null) {
                return;
            }
            qVar.f15385a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // l3.o
    public final void g() {
        d2 d2Var;
        l lVar = this.f15338a;
        if (lVar == null || (d2Var = (d2) v2.n.h(lVar, f1.f18270q)) == null) {
            return;
        }
        ((g1) d2Var).a();
    }

    @Override // l3.o
    public final void h(t tVar, t tVar2) {
        q qVar = this.f15340c;
        if (qVar != null) {
            boolean z2 = (m0.b(qVar.f15392h.f9938b, tVar2.f9938b) && fj.l.b(qVar.f15392h.f9939c, tVar2.f9939c)) ? false : true;
            qVar.f15392h = tVar2;
            int size = qVar.j.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) ((WeakReference) qVar.j.get(i10)).get();
                if (rVar != null) {
                    rVar.f15403g = tVar2;
                }
            }
            n nVar = qVar.f15396m;
            synchronized (nVar.f15370c) {
                nVar.j = null;
                nVar.f15378l = null;
                nVar.f15377k = null;
                nVar.f15379m = null;
                nVar.f15380n = null;
            }
            if (fj.l.b(tVar, tVar2)) {
                if (z2) {
                    j jVar = qVar.f15386b;
                    int iF = m0.f(tVar2.f9938b);
                    int iE = m0.e(tVar2.f9938b);
                    m0 m0Var = qVar.f15392h.f9939c;
                    int iF2 = m0Var != null ? m0.f(m0Var.f7145a) : -1;
                    m0 m0Var2 = qVar.f15392h.f9939c;
                    jVar.m().updateSelection((View) jVar.f15363b, iF, iE, iF2, m0Var2 != null ? m0.e(m0Var2.f7145a) : -1);
                    return;
                }
                return;
            }
            if (tVar != null && (!fj.l.b(tVar.f9937a.f7081b, tVar2.f9937a.f7081b) || (m0.b(tVar.f9938b, tVar2.f9938b) && !fj.l.b(tVar.f9939c, tVar2.f9939c)))) {
                j jVar2 = qVar.f15386b;
                jVar2.m().restartInput((View) jVar2.f15363b);
                return;
            }
            int size2 = qVar.j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                r rVar2 = (r) ((WeakReference) qVar.j.get(i11)).get();
                if (rVar2 != null) {
                    t tVar3 = qVar.f15392h;
                    j jVar3 = qVar.f15386b;
                    if (rVar2.f15406k) {
                        rVar2.f15403g = tVar3;
                        if (rVar2.f15405i) {
                            jVar3.m().updateExtractedText((View) jVar3.f15363b, rVar2.f15404h, m.d(tVar3));
                        }
                        m0 m0Var3 = tVar3.f9939c;
                        long j = tVar3.f9938b;
                        int iF3 = m0Var3 != null ? m0.f(m0Var3.f7145a) : -1;
                        m0 m0Var4 = tVar3.f9939c;
                        jVar3.m().updateSelection((View) jVar3.f15363b, m0.f(j), m0.e(j), iF3, m0Var4 != null ? m0.e(m0Var4.f7145a) : -1);
                    }
                }
            }
        }
    }

    public final a0 i() {
        h0 h0Var = this.f15341d;
        if (h0Var != null) {
            return h0Var;
        }
        if (!s0.d.f14713a) {
            return null;
        }
        h0 h0VarA = i0.a(0, 2, sj.a.f15041c);
        this.f15341d = h0VarA;
        return h0VarA;
    }

    public final void j(d.b bVar) {
        l lVar = this.f15338a;
        if (lVar == null) {
            return;
        }
        s1 s1VarW = null;
        ab.q qVar = new ab.q(bVar, this, lVar, s1VarW, 9);
        if (lVar.G) {
            qj.z zVarE1 = lVar.e1();
            qj.a0 a0Var = qj.a0.f13538a;
            s1VarW = b0.w(zVarE1, null, new f(lVar, qVar, s1VarW, 1), 1);
        }
        this.f15339b = s1VarW;
    }

    public final void k(l lVar) {
        if (this.f15338a != lVar) {
            a0.a.c("Expected textInputModifierNode to be " + lVar + " but was " + this.f15338a);
        }
        this.f15338a = null;
    }
}
