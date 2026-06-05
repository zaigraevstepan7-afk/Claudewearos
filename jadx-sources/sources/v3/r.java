package v3;

import a2.e0;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import v2.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends v1.n implements a2.v, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View H;
    public ViewTreeObserver I;
    public final q J = new q(this, 0);
    public final q K = new q(this, 1);

    @Override // a2.v
    public final void P0(a2.s sVar) {
        sVar.e(false);
        sVar.a(this.J);
        sVar.d(this.K);
    }

    @Override // v1.n
    public final void i1() {
        ViewTreeObserver viewTreeObserver = v2.n.A(this).getViewTreeObserver();
        this.I = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // v1.n
    public final void j1() {
        ViewTreeObserver viewTreeObserver = this.I;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.I = null;
        v2.n.A(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.H = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z2;
        boolean z10;
        if (v2.n.y(this).G == null) {
            return;
        }
        View viewC = j.c(this);
        a2.m focusOwner = ((w2.t) v2.n.z(this)).getFocusOwner();
        r1 r1VarZ = v2.n.z(this);
        if (view == null || view.equals(r1VarZ)) {
            z2 = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewC.getParent()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (view2 == null || view2.equals(r1VarZ)) {
            z10 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewC.getParent()) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (z2 && z10) {
            this.H = view2;
            return;
        }
        if (!z10) {
            if (!z2) {
                this.H = null;
                return;
            }
            this.H = null;
            if (q1().v1().a()) {
                ((a2.q) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        this.H = view2;
        e0 e0VarQ1 = q1();
        int iOrdinal = e0VarQ1.v1().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new b3.e();
        }
        a2.d.w(e0VarQ1);
    }

    public final e0 q1() {
        boolean z2;
        if (!this.f17565a.G) {
            s2.a.b("visitLocalDescendants called on an unattached node");
        }
        v1.n nVar = this.f17565a;
        if ((nVar.f17568d & 1024) != 0) {
            boolean z10 = false;
            for (v1.n nVar2 = nVar.f17570f; nVar2 != null; nVar2 = nVar2.f17570f) {
                if ((nVar2.f17567c & 1024) != 0) {
                    v1.n nVarE = nVar2;
                    g1.e eVar = null;
                    while (nVarE != null) {
                        if (nVarE instanceof e0) {
                            e0 e0Var = (e0) nVarE;
                            if (z10) {
                                return e0Var;
                            }
                            z2 = false;
                            z10 = true;
                        } else {
                            z2 = true;
                        }
                        if (z2 && (nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                            int i10 = 0;
                            for (v1.n nVar3 = ((v2.k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                if ((nVar3.f17567c & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nVarE = nVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new g1.e(new v1.n[16]);
                                        }
                                        if (nVarE != null) {
                                            eVar.b(nVarE);
                                            nVarE = null;
                                        }
                                        eVar.b(nVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nVarE = v2.n.e(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }
}
