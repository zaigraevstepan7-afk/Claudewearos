package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.datastore.preferences.protobuf.k;
import java.lang.reflect.Field;
import java.util.Arrays;
import m6.a;
import q5.b;
import t4.l0;
import t6.e0;
import t6.f0;
import t6.k0;
import t6.n;
import t6.p;
import t6.q;
import t6.q0;
import t6.r;
import u4.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final b K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new b(8);
        this.L = new Rect();
        m1(e0.I(context, attributeSet, i10, i11).f15861b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final boolean A0() {
        return this.f1172z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(q0 q0Var, r rVar, k kVar) {
        int i10;
        int i11 = this.F;
        for (int i12 = 0; i12 < this.F && (i10 = rVar.f16012d) >= 0 && i10 < q0Var.b() && i11 > 0; i12++) {
            kVar.a(rVar.f16012d, Math.max(0, rVar.f16015g));
            this.K.getClass();
            i11--;
            rVar.f16012d += rVar.f16013e;
        }
    }

    @Override // t6.e0
    public final int J(k0 k0Var, q0 q0Var) {
        if (this.f1162p == 0) {
            return this.F;
        }
        if (q0Var.b() < 1) {
            return 0;
        }
        return i1(q0Var.b() - 1, k0Var, q0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(k0 k0Var, q0 q0Var, boolean z2, boolean z10) {
        int i10;
        int iV;
        int iV2 = v();
        int i11 = 1;
        if (z10) {
            iV = v() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
        }
        int iB = q0Var.b();
        H0();
        int iM = this.f1164r.m();
        int i12 = this.f1164r.i();
        View view = null;
        View view2 = null;
        while (iV != i10) {
            View viewU = u(iV);
            int iH = e0.H(viewU);
            if (iH >= 0 && iH < iB && j1(iH, k0Var, q0Var) == 0) {
                if (((f0) viewU.getLayoutParams()).f15893a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f1164r.g(viewU) < i12 && this.f1164r.d(viewU) >= iM) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r23, int r24, t6.k0 r25, t6.q0 r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, t6.k0, t6.q0):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(k0 k0Var, q0 q0Var, r rVar, q qVar) {
        int i10;
        int i11;
        int i12;
        int iF;
        int iG;
        int iE;
        int iF2;
        int iW;
        int iW2;
        ?? r12;
        int i13;
        View viewB;
        int iL = this.f1164r.l();
        boolean z2 = iL != 1073741824;
        int i14 = v() > 0 ? this.G[this.F] : 0;
        if (z2) {
            n1();
        }
        boolean z10 = rVar.f16013e == 1;
        int iJ1 = this.F;
        if (!z10) {
            iJ1 = j1(rVar.f16012d, k0Var, q0Var) + k1(rVar.f16012d, k0Var, q0Var);
        }
        int i15 = 0;
        while (i15 < this.F && (i13 = rVar.f16012d) >= 0 && i13 < q0Var.b() && iJ1 > 0) {
            int i16 = rVar.f16012d;
            int iK1 = k1(i16, k0Var, q0Var);
            if (iK1 > this.F) {
                throw new IllegalArgumentException(a.h(gk.b.q("Item at position ", i16, " requires ", iK1, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iJ1 -= iK1;
            if (iJ1 < 0 || (viewB = rVar.b(k0Var)) == null) {
                break;
            }
            this.H[i15] = viewB;
            i15++;
        }
        if (i15 == 0) {
            qVar.f15993b = true;
            return;
        }
        if (z10) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.H[i10];
            n nVar = (n) view.getLayoutParams();
            int iK12 = k1(e0.H(view), k0Var, q0Var);
            nVar.f15969f = iK12;
            nVar.f15968e = i17;
            i17 += iK12;
            i10 += i12;
        }
        float f10 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.H[i19];
            if (rVar.f16018k != null) {
                r12 = 0;
                r12 = 0;
                if (z10) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z10) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f15870b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.I(view2));
            }
            l1(view2, iL, r12);
            int iE2 = this.f1164r.e(view2);
            if (iE2 > i18) {
                i18 = iE2;
            }
            float f11 = (this.f1164r.f(view2) * 1.0f) / ((n) view2.getLayoutParams()).f15969f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z2) {
            f1(Math.max(Math.round(f10 * this.F), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.H[i20];
                l1(view3, 1073741824, true);
                int iE3 = this.f1164r.e(view3);
                if (iE3 > i18) {
                    i18 = iE3;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.H[i21];
            if (this.f1164r.e(view4) != i18) {
                n nVar2 = (n) view4.getLayoutParams();
                Rect rect2 = nVar2.f15894b;
                int i22 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin;
                int i23 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin;
                int iH1 = h1(nVar2.f15968e, nVar2.f15969f);
                if (this.f1162p == 1) {
                    iW2 = e0.w(false, iH1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) nVar2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iW = e0.w(false, iH1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) nVar2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (x0(view4, iW2, iW, (f0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        qVar.f15992a = i18;
        if (this.f1162p != 1) {
            if (rVar.f16014f == -1) {
                int i24 = rVar.f16010b;
                iE = i24 - i18;
                iG = 0;
                iF = i24;
            } else {
                int i25 = rVar.f16010b;
                iF = i25 + i18;
                iG = 0;
                iE = i25;
            }
            iF2 = iG;
        } else if (rVar.f16014f == -1) {
            iF2 = rVar.f16010b;
            iG = iF2 - i18;
            iE = 0;
            iF = 0;
        } else {
            int i26 = rVar.f16010b;
            iF = 0;
            iG = i26;
            iF2 = i26 + i18;
            iE = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.H[i27];
            n nVar3 = (n) view5.getLayoutParams();
            if (this.f1162p != 1) {
                iG = G() + this.G[nVar3.f15968e];
                iF2 = this.f1164r.f(view5) + iG;
            } else if (T0()) {
                int iE4 = E() + this.G[this.F - nVar3.f15968e];
                iF = iE4;
                iE = iE4 - this.f1164r.f(view5);
            } else {
                iE = E() + this.G[nVar3.f15968e];
                iF = this.f1164r.f(view5) + iE;
            }
            e0.N(view5, iE, iG, iF, iF2);
            if (nVar3.f15893a.h() || nVar3.f15893a.k()) {
                qVar.f15994c = true;
            }
            qVar.f15995d = view5.hasFocusable() | qVar.f15995d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(k0 k0Var, q0 q0Var, p pVar, int i10) {
        n1();
        if (q0Var.b() > 0 && !q0Var.f16002g) {
            boolean z2 = i10 == 1;
            int iJ1 = j1(pVar.f15988b, k0Var, q0Var);
            if (z2) {
                while (iJ1 > 0) {
                    int i11 = pVar.f15988b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    pVar.f15988b = i12;
                    iJ1 = j1(i12, k0Var, q0Var);
                }
            } else {
                int iB = q0Var.b() - 1;
                int i13 = pVar.f15988b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iJ12 = j1(i14, k0Var, q0Var);
                    if (iJ12 <= iJ1) {
                        break;
                    }
                    i13 = i14;
                    iJ1 = iJ12;
                }
                pVar.f15988b = i13;
            }
        }
        g1();
    }

    @Override // t6.e0
    public final void W(k0 k0Var, q0 q0Var, View view, e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof n)) {
            V(view, eVar);
            return;
        }
        n nVar = (n) layoutParams;
        int iI1 = i1(nVar.f15893a.b(), k0Var, q0Var);
        if (this.f1162p == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(nVar.f15968e, nVar.f15969f, iI1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iI1, 1, nVar.f15968e, nVar.f15969f, false, false));
        }
    }

    @Override // t6.e0
    public final void X(int i10, int i11) {
        b bVar = this.K;
        bVar.q();
        ((SparseIntArray) bVar.f13236c).clear();
    }

    @Override // t6.e0
    public final void Y() {
        b bVar = this.K;
        bVar.q();
        ((SparseIntArray) bVar.f13236c).clear();
    }

    @Override // t6.e0
    public final void Z(int i10, int i11) {
        b bVar = this.K;
        bVar.q();
        ((SparseIntArray) bVar.f13236c).clear();
    }

    @Override // t6.e0
    public final void a0(int i10, int i11) {
        b bVar = this.K;
        bVar.q();
        ((SparseIntArray) bVar.f13236c).clear();
    }

    @Override // t6.e0
    public final void b0(int i10, int i11) {
        b bVar = this.K;
        bVar.q();
        ((SparseIntArray) bVar.f13236c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.b1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final void c0(k0 k0Var, q0 q0Var) {
        boolean z2 = q0Var.f16002g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z2) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                n nVar = (n) u(i10).getLayoutParams();
                int iB = nVar.f15893a.b();
                sparseIntArray2.put(iB, nVar.f15969f);
                sparseIntArray.put(iB, nVar.f15968e);
            }
        }
        super.c0(k0Var, q0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final void d0(q0 q0Var) {
        super.d0(q0Var);
        this.E = false;
    }

    @Override // t6.e0
    public final boolean f(f0 f0Var) {
        return f0Var instanceof n;
    }

    public final void f1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i10, int i11) {
        if (this.f1162p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int i1(int i10, k0 k0Var, q0 q0Var) {
        boolean z2 = q0Var.f16002g;
        b bVar = this.K;
        if (!z2) {
            int i11 = this.F;
            bVar.getClass();
            return b.p(i10, i11);
        }
        int iB = k0Var.b(i10);
        if (iB != -1) {
            int i12 = this.F;
            bVar.getClass();
            return b.p(iB, i12);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int j1(int i10, k0 k0Var, q0 q0Var) {
        boolean z2 = q0Var.f16002g;
        b bVar = this.K;
        if (!z2) {
            int i11 = this.F;
            bVar.getClass();
            return i10 % i11;
        }
        int i12 = this.J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = k0Var.b(i10);
        if (iB != -1) {
            int i13 = this.F;
            bVar.getClass();
            return iB % i13;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final int k(q0 q0Var) {
        return E0(q0Var);
    }

    public final int k1(int i10, k0 k0Var, q0 q0Var) {
        boolean z2 = q0Var.f16002g;
        b bVar = this.K;
        if (!z2) {
            bVar.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (k0Var.b(i10) != -1) {
            bVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final int l(q0 q0Var) {
        return F0(q0Var);
    }

    public final void l1(View view, int i10, boolean z2) {
        int iW;
        int iW2;
        n nVar = (n) view.getLayoutParams();
        Rect rect = nVar.f15894b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        int iH1 = h1(nVar.f15968e, nVar.f15969f);
        if (this.f1162p == 1) {
            iW2 = e0.w(false, iH1, i10, i12, ((ViewGroup.MarginLayoutParams) nVar).width);
            iW = e0.w(true, this.f1164r.n(), this.f15880m, i11, ((ViewGroup.MarginLayoutParams) nVar).height);
        } else {
            int iW3 = e0.w(false, iH1, i10, i11, ((ViewGroup.MarginLayoutParams) nVar).height);
            int iW4 = e0.w(true, this.f1164r.n(), this.f15879l, i12, ((ViewGroup.MarginLayoutParams) nVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        f0 f0Var = (f0) view.getLayoutParams();
        if (z2 ? x0(view, iW2, iW, f0Var) : v0(view, iW2, iW, f0Var)) {
            view.measure(iW2, iW);
        }
    }

    public final void m1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(a.d(i10, "Span count should be at least 1. Provided "));
        }
        this.F = i10;
        this.K.q();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final int n(q0 q0Var) {
        return E0(q0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final int n0(int i10, k0 k0Var, q0 q0Var) {
        n1();
        g1();
        return super.n0(i10, k0Var, q0Var);
    }

    public final void n1() {
        int iD;
        int iG;
        if (this.f1162p == 1) {
            iD = this.f15881n - F();
            iG = E();
        } else {
            iD = this.f15882o - D();
            iG = G();
        }
        f1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final int o(q0 q0Var) {
        return F0(q0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final int p0(int i10, k0 k0Var, q0 q0Var) {
        n1();
        g1();
        return super.p0(i10, k0Var, q0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t6.e0
    public final f0 r() {
        return this.f1162p == 0 ? new n(-2, -1) : new n(-1, -2);
    }

    @Override // t6.e0
    public final f0 s(Context context, AttributeSet attributeSet) {
        n nVar = new n(context, attributeSet);
        nVar.f15968e = -1;
        nVar.f15969f = 0;
        return nVar;
    }

    @Override // t6.e0
    public final void s0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.s0(rect, i10, i11);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f1162p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f15870b;
            Field field = l0.f15744a;
            iG2 = e0.g(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = e0.g(i10, iArr[iArr.length - 1] + iF, this.f15870b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f15870b;
            Field field2 = l0.f15744a;
            iG = e0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = e0.g(i11, iArr2[iArr2.length - 1] + iD, this.f15870b.getMinimumHeight());
        }
        this.f15870b.setMeasuredDimension(iG, iG2);
    }

    @Override // t6.e0
    public final f0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            n nVar = new n((ViewGroup.MarginLayoutParams) layoutParams);
            nVar.f15968e = -1;
            nVar.f15969f = 0;
            return nVar;
        }
        n nVar2 = new n(layoutParams);
        nVar2.f15968e = -1;
        nVar2.f15969f = 0;
        return nVar2;
    }

    @Override // t6.e0
    public final int x(k0 k0Var, q0 q0Var) {
        if (this.f1162p == 1) {
            return this.F;
        }
        if (q0Var.b() < 1) {
            return 0;
        }
        return i1(q0Var.b() - 1, k0Var, q0Var) + 1;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new b(8);
        this.L = new Rect();
        m1(i10);
    }

    public GridLayoutManager() {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new b(8);
        this.L = new Rect();
        m1(4);
    }
}
