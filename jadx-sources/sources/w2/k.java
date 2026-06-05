package w2;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends v1.n implements a3.a, v2.z1, n2.e, v2.w, v2.e2, v2.j {
    public final c2.x0 H = new c2.x0(this, 20);
    public final /* synthetic */ t I;

    public k(t tVar) {
        this.I = tVar;
    }

    @Override // n2.e
    public final boolean A(KeyEvent keyEvent) {
        return false;
    }

    @Override // v2.e2
    public final Object D() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // n2.e
    public final boolean Q(KeyEvent keyEvent) {
        a2.f fVar;
        int[] iArr = a2.h.f23a;
        long jB = n2.d.b(keyEvent);
        boolean z2 = true;
        if (n2.a.a(jB, n2.a.f11868b)) {
            fVar = new a2.f(2);
        } else if (n2.a.a(jB, n2.a.f11869c)) {
            fVar = new a2.f(1);
        } else if (n2.a.a(jB, n2.a.f11881p)) {
            fVar = new a2.f(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            fVar = n2.a.a(jB, n2.a.f11873g) ? new a2.f(4) : n2.a.a(jB, n2.a.f11872f) ? new a2.f(3) : (n2.a.a(jB, n2.a.f11870d) || n2.a.a(jB, n2.a.C)) ? new a2.f(5) : (n2.a.a(jB, n2.a.f11871e) || n2.a.a(jB, n2.a.D)) ? new a2.f(6) : (n2.a.a(jB, n2.a.f11874h) || n2.a.a(jB, n2.a.f11883r) || n2.a.a(jB, n2.a.E)) ? new a2.f(7) : (n2.a.a(jB, n2.a.f11867a) || n2.a.a(jB, n2.a.f11886u)) ? new a2.f(8) : null;
        }
        if (fVar != null) {
            int i10 = fVar.f19a;
            if (n2.d.c(keyEvent) == 2) {
                t tVar = this.I;
                a2.e0 e0VarF = ((a2.q) tVar.getFocusOwner()).f();
                if (e0VarF == null || !e0VarF.H || !tVar.z(i10)) {
                    Boolean boolE = ((a2.q) tVar.getFocusOwner()).e(i10, tVar.getEmbeddedViewFocusRect(), new c2.x0(fVar, 19));
                    if (!(boolE != null ? boolE.booleanValue() : true)) {
                        if (i10 != 1 && i10 != 2) {
                            z2 = false;
                        }
                        if (z2) {
                            Integer numC = a2.h.c(i10);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = tVar.getRootView();
                            fj.l.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, tVar.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(tVar)) {
                                return ((a2.q) tVar.getFocusOwner()).h(i10);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // a3.a
    public final Object d1(v2.i1 i1Var, a2.d0 d0Var, vi.c cVar) {
        long jQ0 = i1Var.q0(0L);
        b2.c cVar2 = (b2.c) d0Var.a();
        b2.c cVarI = cVar2 != null ? cVar2.i(jQ0) : null;
        if (cVarI != null) {
            this.I.requestRectangleOnScreen(new Rect((int) cVarI.f1502a, (int) cVarI.f1503b, (int) cVarI.f1504c, (int) cVarI.f1505d), false);
        }
        return pi.o.f13011a;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        t2.f1 f1VarY = p0Var.Y(j);
        return s0Var.D0(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, this.H, new s.w(f1VarY, 4));
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
    }
}
