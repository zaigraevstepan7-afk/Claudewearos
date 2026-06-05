package androidx.recyclerview.widget;

import ah.d;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.k;
import cg.b;
import com.google.android.gms.common.api.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import qh.c;
import r5.g;
import t4.l0;
import t6.a1;
import t6.b1;
import t6.d0;
import t6.e0;
import t6.f0;
import t6.k0;
import t6.o;
import t6.p0;
import t6.q0;
import t6.t;
import t6.x0;
import t6.y0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends e0 implements p0 {
    public final c B;
    public final int C;
    public boolean D;
    public boolean E;
    public a1 F;
    public final Rect G;
    public final x0 H;
    public final boolean I;
    public int[] J;
    public final d K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1202p;

    /* renamed from: q, reason: collision with root package name */
    public final b1[] f1203q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1204r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1205s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1206t;

    /* renamed from: u, reason: collision with root package name */
    public int f1207u;

    /* renamed from: v, reason: collision with root package name */
    public final o f1208v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1209w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1211y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1210x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1212z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1202p = -1;
        this.f1209w = false;
        c cVar = new c(7);
        this.B = cVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new x0(this);
        this.I = true;
        this.K = new d(this, 29);
        d0 d0VarI = e0.I(context, attributeSet, i10, i11);
        int i12 = d0VarI.f15860a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f1206t) {
            this.f1206t = i12;
            g gVar = this.f1204r;
            this.f1204r = this.f1205s;
            this.f1205s = gVar;
            m0();
        }
        int i13 = d0VarI.f15861b;
        c(null);
        if (i13 != this.f1202p) {
            cVar.k();
            m0();
            this.f1202p = i13;
            this.f1211y = new BitSet(this.f1202p);
            this.f1203q = new b1[this.f1202p];
            for (int i14 = 0; i14 < this.f1202p; i14++) {
                this.f1203q[i14] = new b1(this, i14);
            }
            m0();
        }
        boolean z2 = d0VarI.f15862c;
        c(null);
        a1 a1Var = this.F;
        if (a1Var != null && a1Var.A != z2) {
            a1Var.A = z2;
        }
        this.f1209w = z2;
        m0();
        o oVar = new o();
        oVar.f15971a = true;
        oVar.f15976f = 0;
        oVar.f15977g = 0;
        this.f1208v = oVar;
        this.f1204r = g.b(this, this.f1206t);
        this.f1205s = g.b(this, 1 - this.f1206t);
    }

    public static int b1(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // t6.e0
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int iI0;
        if (v() != 0 && this.C != 0 && this.f15875g) {
            if (this.f1210x) {
                iI0 = J0();
                I0();
            } else {
                iI0 = I0();
                J0();
            }
            if (iI0 == 0 && N0() != null) {
                this.B.k();
                this.f15874f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return b.w(q0Var, this.f1204r, F0(z2), E0(z2), this, this.I, this.f1210x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int D0(k0 k0Var, o oVar, q0 q0Var) {
        b1 b1Var;
        ?? r82;
        int iH;
        int iE;
        int iM;
        int iE2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f1211y.set(0, this.f1202p, true);
        o oVar2 = this.f1208v;
        int i15 = oVar2.f15979i ? oVar.f15975e == 1 ? f.API_PRIORITY_OTHER : Integer.MIN_VALUE : oVar.f15975e == 1 ? oVar.f15977g + oVar.f15972b : oVar.f15976f - oVar.f15972b;
        int i16 = oVar.f15975e;
        for (int i17 = 0; i17 < this.f1202p; i17++) {
            if (!this.f1203q[i17].f15838a.isEmpty()) {
                a1(this.f1203q[i17], i16, i15);
            }
        }
        int i18 = this.f1210x ? this.f1204r.i() : this.f1204r.m();
        boolean z2 = false;
        while (true) {
            int i19 = oVar.f15973c;
            if (i19 < 0 || i19 >= q0Var.b() || (!oVar2.f15979i && this.f1211y.isEmpty())) {
                break;
            }
            View viewD = k0Var.d(oVar.f15973c);
            oVar.f15973c += oVar.f15974d;
            y0 y0Var = (y0) viewD.getLayoutParams();
            int iB = y0Var.f15893a.b();
            c cVar = this.B;
            int[] iArr = (int[]) cVar.f13507b;
            int i20 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i20 == -1) {
                if (R0(oVar.f15975e)) {
                    i12 = this.f1202p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f1202p;
                    i12 = i13;
                }
                b1 b1Var2 = null;
                if (oVar.f15975e == i14) {
                    int iM2 = this.f1204r.m();
                    int i21 = f.API_PRIORITY_OTHER;
                    while (i12 != i11) {
                        b1 b1Var3 = this.f1203q[i12];
                        int iF = b1Var3.f(iM2);
                        if (iF < i21) {
                            i21 = iF;
                            b1Var2 = b1Var3;
                        }
                        i12 += i10;
                    }
                } else {
                    int i22 = this.f1204r.i();
                    int i23 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        b1 b1Var4 = this.f1203q[i12];
                        int iH2 = b1Var4.h(i22);
                        if (iH2 > i23) {
                            b1Var2 = b1Var4;
                            i23 = iH2;
                        }
                        i12 += i10;
                    }
                }
                b1Var = b1Var2;
                cVar.A(iB);
                ((int[]) cVar.f13507b)[iB] = b1Var.f15842e;
            } else {
                b1Var = this.f1203q[i20];
            }
            y0Var.f16086e = b1Var;
            if (oVar.f15975e == 1) {
                r82 = 0;
                b(viewD, -1, false);
            } else {
                r82 = 0;
                b(viewD, 0, false);
            }
            if (this.f1206t == 1) {
                P0(viewD, e0.w(r82, this.f1207u, this.f15879l, r82, ((ViewGroup.MarginLayoutParams) y0Var).width), e0.w(true, this.f15882o, this.f15880m, D() + G(), ((ViewGroup.MarginLayoutParams) y0Var).height));
            } else {
                P0(viewD, e0.w(true, this.f15881n, this.f15879l, F() + E(), ((ViewGroup.MarginLayoutParams) y0Var).width), e0.w(false, this.f1207u, this.f15880m, 0, ((ViewGroup.MarginLayoutParams) y0Var).height));
            }
            if (oVar.f15975e == 1) {
                iE = b1Var.f(i18);
                iH = this.f1204r.e(viewD) + iE;
            } else {
                iH = b1Var.h(i18);
                iE = iH - this.f1204r.e(viewD);
            }
            if (oVar.f15975e == 1) {
                b1 b1Var5 = y0Var.f16086e;
                b1Var5.getClass();
                y0 y0Var2 = (y0) viewD.getLayoutParams();
                y0Var2.f16086e = b1Var5;
                ArrayList arrayList = b1Var5.f15838a;
                arrayList.add(viewD);
                b1Var5.f15840c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    b1Var5.f15839b = Integer.MIN_VALUE;
                }
                if (y0Var2.f15893a.h() || y0Var2.f15893a.k()) {
                    b1Var5.f15841d = b1Var5.f15843f.f1204r.e(viewD) + b1Var5.f15841d;
                }
            } else {
                b1 b1Var6 = y0Var.f16086e;
                b1Var6.getClass();
                y0 y0Var3 = (y0) viewD.getLayoutParams();
                y0Var3.f16086e = b1Var6;
                ArrayList arrayList2 = b1Var6.f15838a;
                arrayList2.add(0, viewD);
                b1Var6.f15839b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    b1Var6.f15840c = Integer.MIN_VALUE;
                }
                if (y0Var3.f15893a.h() || y0Var3.f15893a.k()) {
                    b1Var6.f15841d = b1Var6.f15843f.f1204r.e(viewD) + b1Var6.f15841d;
                }
            }
            if (O0() && this.f1206t == 1) {
                iE2 = this.f1205s.i() - (((this.f1202p - 1) - b1Var.f15842e) * this.f1207u);
                iM = iE2 - this.f1205s.e(viewD);
            } else {
                iM = this.f1205s.m() + (b1Var.f15842e * this.f1207u);
                iE2 = this.f1205s.e(viewD) + iM;
            }
            if (this.f1206t == 1) {
                e0.N(viewD, iM, iE, iE2, iH);
            } else {
                e0.N(viewD, iE, iM, iH, iE2);
            }
            a1(b1Var, oVar2.f15975e, i15);
            T0(k0Var, oVar2);
            if (oVar2.f15978h && viewD.hasFocusable()) {
                this.f1211y.set(b1Var.f15842e, false);
            }
            i14 = 1;
            z2 = true;
            i13 = 0;
        }
        if (!z2) {
            T0(k0Var, oVar2);
        }
        int iM3 = oVar2.f15975e == -1 ? this.f1204r.m() - L0(this.f1204r.m()) : K0(this.f1204r.i()) - this.f1204r.i();
        if (iM3 > 0) {
            return Math.min(oVar.f15972b, iM3);
        }
        return 0;
    }

    public final View E0(boolean z2) {
        int iM = this.f1204r.m();
        int i10 = this.f1204r.i();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iG = this.f1204r.g(viewU);
            int iD = this.f1204r.d(viewU);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z2) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z2) {
        int iM = this.f1204r.m();
        int i10 = this.f1204r.i();
        int iV = v();
        View view = null;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            int iG = this.f1204r.g(viewU);
            if (this.f1204r.d(viewU) > iM && iG < i10) {
                if (iG >= iM || !z2) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void G0(k0 k0Var, q0 q0Var, boolean z2) {
        int i10;
        int iK0 = K0(Integer.MIN_VALUE);
        if (iK0 != Integer.MIN_VALUE && (i10 = this.f1204r.i() - iK0) > 0) {
            int i11 = i10 - (-X0(-i10, k0Var, q0Var));
            if (!z2 || i11 <= 0) {
                return;
            }
            this.f1204r.q(i11);
        }
    }

    public final void H0(k0 k0Var, q0 q0Var, boolean z2) {
        int iM;
        int iL0 = L0(f.API_PRIORITY_OTHER);
        if (iL0 != Integer.MAX_VALUE && (iM = iL0 - this.f1204r.m()) > 0) {
            int iX0 = iM - X0(iM, k0Var, q0Var);
            if (!z2 || iX0 <= 0) {
                return;
            }
            this.f1204r.q(-iX0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return e0.H(u(0));
    }

    public final int J0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return e0.H(u(iV - 1));
    }

    public final int K0(int i10) {
        int iF = this.f1203q[0].f(i10);
        for (int i11 = 1; i11 < this.f1202p; i11++) {
            int iF2 = this.f1203q[i11].f(i10);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // t6.e0
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i10) {
        int iH = this.f1203q[0].h(i10);
        for (int i11 = 1; i11 < this.f1202p; i11++) {
            int iH2 = this.f1203q[i11].h(i10);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N0() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0():android.view.View");
    }

    @Override // t6.e0
    public final void O(int i10) {
        super.O(i10);
        for (int i11 = 0; i11 < this.f1202p; i11++) {
            b1 b1Var = this.f1203q[i11];
            int i12 = b1Var.f15839b;
            if (i12 != Integer.MIN_VALUE) {
                b1Var.f15839b = i12 + i10;
            }
            int i13 = b1Var.f15840c;
            if (i13 != Integer.MIN_VALUE) {
                b1Var.f15840c = i13 + i10;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // t6.e0
    public final void P(int i10) {
        super.P(i10);
        for (int i11 = 0; i11 < this.f1202p; i11++) {
            b1 b1Var = this.f1203q[i11];
            int i12 = b1Var.f15839b;
            if (i12 != Integer.MIN_VALUE) {
                b1Var.f15839b = i12 + i10;
            }
            int i13 = b1Var.f15840c;
            if (i13 != Integer.MIN_VALUE) {
                b1Var.f15840c = i13 + i10;
            }
        }
    }

    public final void P0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f15870b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.I(view));
        }
        y0 y0Var = (y0) view.getLayoutParams();
        int iB1 = b1(i10, ((ViewGroup.MarginLayoutParams) y0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) y0Var).rightMargin + rect.right);
        int iB12 = b1(i11, ((ViewGroup.MarginLayoutParams) y0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin + rect.bottom);
        if (v0(view, iB1, iB12, y0Var)) {
            view.measure(iB1, iB12);
        }
    }

    @Override // t6.e0
    public final void Q() {
        this.B.k();
        for (int i10 = 0; i10 < this.f1202p; i10++) {
            this.f1203q[i10].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(t6.k0 r17, t6.q0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(t6.k0, t6.q0, boolean):void");
    }

    public final boolean R0(int i10) {
        if (this.f1206t == 0) {
            return (i10 == -1) != this.f1210x;
        }
        return ((i10 == -1) == this.f1210x) == O0();
    }

    @Override // t6.e0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f15870b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f1202p; i10++) {
            this.f1203q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i10, q0 q0Var) {
        int iI0;
        int i11;
        if (i10 > 0) {
            iI0 = J0();
            i11 = 1;
        } else {
            iI0 = I0();
            i11 = -1;
        }
        o oVar = this.f1208v;
        oVar.f15971a = true;
        Z0(iI0, q0Var);
        Y0(i11);
        oVar.f15973c = iI0 + oVar.f15974d;
        oVar.f15972b = Math.abs(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // t6.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r9, int r10, t6.k0 r11, t6.q0 r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, t6.k0, t6.q0):android.view.View");
    }

    public final void T0(k0 k0Var, o oVar) {
        if (!oVar.f15971a || oVar.f15979i) {
            return;
        }
        if (oVar.f15972b == 0) {
            if (oVar.f15975e == -1) {
                U0(k0Var, oVar.f15977g);
                return;
            } else {
                V0(k0Var, oVar.f15976f);
                return;
            }
        }
        int i10 = 1;
        if (oVar.f15975e == -1) {
            int i11 = oVar.f15976f;
            int iH = this.f1203q[0].h(i11);
            while (i10 < this.f1202p) {
                int iH2 = this.f1203q[i10].h(i11);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i10++;
            }
            int i12 = i11 - iH;
            U0(k0Var, i12 < 0 ? oVar.f15977g : oVar.f15977g - Math.min(i12, oVar.f15972b));
            return;
        }
        int i13 = oVar.f15977g;
        int iF = this.f1203q[0].f(i13);
        while (i10 < this.f1202p) {
            int iF2 = this.f1203q[i10].f(i13);
            if (iF2 < iF) {
                iF = iF2;
            }
            i10++;
        }
        int i14 = iF - oVar.f15977g;
        V0(k0Var, i14 < 0 ? oVar.f15976f : Math.min(i14, oVar.f15972b) + oVar.f15976f);
    }

    @Override // t6.e0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewF0 = F0(false);
            View viewE0 = E0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iH = e0.H(viewF0);
            int iH2 = e0.H(viewE0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final void U0(k0 k0Var, int i10) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f1204r.g(viewU) < i10 || this.f1204r.p(viewU) < i10) {
                return;
            }
            y0 y0Var = (y0) viewU.getLayoutParams();
            y0Var.getClass();
            if (y0Var.f16086e.f15838a.size() == 1) {
                return;
            }
            b1 b1Var = y0Var.f16086e;
            ArrayList arrayList = b1Var.f15838a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            y0 y0Var2 = (y0) view.getLayoutParams();
            y0Var2.f16086e = null;
            if (y0Var2.f15893a.h() || y0Var2.f15893a.k()) {
                b1Var.f15841d -= b1Var.f15843f.f1204r.e(view);
            }
            if (size == 1) {
                b1Var.f15839b = Integer.MIN_VALUE;
            }
            b1Var.f15840c = Integer.MIN_VALUE;
            j0(viewU, k0Var);
        }
    }

    public final void V0(k0 k0Var, int i10) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f1204r.d(viewU) > i10 || this.f1204r.o(viewU) > i10) {
                return;
            }
            y0 y0Var = (y0) viewU.getLayoutParams();
            y0Var.getClass();
            if (y0Var.f16086e.f15838a.size() == 1) {
                return;
            }
            b1 b1Var = y0Var.f16086e;
            ArrayList arrayList = b1Var.f15838a;
            View view = (View) arrayList.remove(0);
            y0 y0Var2 = (y0) view.getLayoutParams();
            y0Var2.f16086e = null;
            if (arrayList.size() == 0) {
                b1Var.f15840c = Integer.MIN_VALUE;
            }
            if (y0Var2.f15893a.h() || y0Var2.f15893a.k()) {
                b1Var.f15841d -= b1Var.f15843f.f1204r.e(view);
            }
            b1Var.f15839b = Integer.MIN_VALUE;
            j0(viewU, k0Var);
        }
    }

    public final void W0() {
        if (this.f1206t == 1 || !O0()) {
            this.f1210x = this.f1209w;
        } else {
            this.f1210x = !this.f1209w;
        }
    }

    @Override // t6.e0
    public final void X(int i10, int i11) {
        M0(i10, i11, 1);
    }

    public final int X0(int i10, k0 k0Var, q0 q0Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        S0(i10, q0Var);
        o oVar = this.f1208v;
        int iD0 = D0(k0Var, oVar, q0Var);
        if (oVar.f15972b >= iD0) {
            i10 = i10 < 0 ? -iD0 : iD0;
        }
        this.f1204r.q(-i10);
        this.D = this.f1210x;
        oVar.f15972b = 0;
        T0(k0Var, oVar);
        return i10;
    }

    @Override // t6.e0
    public final void Y() {
        this.B.k();
        m0();
    }

    public final void Y0(int i10) {
        o oVar = this.f1208v;
        oVar.f15975e = i10;
        oVar.f15974d = this.f1210x != (i10 == -1) ? -1 : 1;
    }

    @Override // t6.e0
    public final void Z(int i10, int i11) {
        M0(i10, i11, 8);
    }

    public final void Z0(int i10, q0 q0Var) {
        int iN;
        int iN2;
        int i11;
        o oVar = this.f1208v;
        boolean z2 = false;
        oVar.f15972b = 0;
        oVar.f15973c = i10;
        t tVar = this.f15873e;
        if (tVar == null || !tVar.f16034e || (i11 = q0Var.f15996a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f1210x == (i11 < i10)) {
                iN = this.f1204r.n();
                iN2 = 0;
            } else {
                iN2 = this.f1204r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.f15870b;
        if (recyclerView == null || !recyclerView.f1201z) {
            oVar.f15977g = this.f1204r.h() + iN;
            oVar.f15976f = -iN2;
        } else {
            oVar.f15976f = this.f1204r.m() - iN2;
            oVar.f15977g = this.f1204r.i() + iN;
        }
        oVar.f15978h = false;
        oVar.f15971a = true;
        if (this.f1204r.k() == 0 && this.f1204r.h() == 0) {
            z2 = true;
        }
        oVar.f15979i = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // t6.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f1210x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.I0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f1210x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f1206t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // t6.e0
    public final void a0(int i10, int i11) {
        M0(i10, i11, 2);
    }

    public final void a1(b1 b1Var, int i10, int i11) {
        int i12 = b1Var.f15841d;
        int i13 = b1Var.f15842e;
        if (i10 != -1) {
            int i14 = b1Var.f15840c;
            if (i14 == Integer.MIN_VALUE) {
                b1Var.a();
                i14 = b1Var.f15840c;
            }
            if (i14 - i12 >= i11) {
                this.f1211y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = b1Var.f15839b;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) b1Var.f15838a.get(0);
            y0 y0Var = (y0) view.getLayoutParams();
            b1Var.f15839b = b1Var.f15843f.f1204r.g(view);
            y0Var.getClass();
            i15 = b1Var.f15839b;
        }
        if (i15 + i12 <= i11) {
            this.f1211y.set(i13, false);
        }
    }

    @Override // t6.e0
    public final void b0(int i10, int i11) {
        M0(i10, i11, 4);
    }

    @Override // t6.e0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // t6.e0
    public final void c0(k0 k0Var, q0 q0Var) {
        Q0(k0Var, q0Var, true);
    }

    @Override // t6.e0
    public final boolean d() {
        return this.f1206t == 0;
    }

    @Override // t6.e0
    public final void d0(q0 q0Var) {
        this.f1212z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // t6.e0
    public final boolean e() {
        return this.f1206t == 1;
    }

    @Override // t6.e0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof a1) {
            a1 a1Var = (a1) parcelable;
            this.F = a1Var;
            if (this.f1212z != -1) {
                a1Var.f15822a = -1;
                a1Var.f15823b = -1;
                a1Var.f15825d = null;
                a1Var.f15824c = 0;
                a1Var.f15826e = 0;
                a1Var.f15827f = null;
                a1Var.f15828z = null;
            }
            m0();
        }
    }

    @Override // t6.e0
    public final boolean f(f0 f0Var) {
        return f0Var instanceof y0;
    }

    @Override // t6.e0
    public final Parcelable f0() {
        int iH;
        int iM;
        int[] iArr;
        a1 a1Var = this.F;
        if (a1Var != null) {
            a1 a1Var2 = new a1();
            a1Var2.f15824c = a1Var.f15824c;
            a1Var2.f15822a = a1Var.f15822a;
            a1Var2.f15823b = a1Var.f15823b;
            a1Var2.f15825d = a1Var.f15825d;
            a1Var2.f15826e = a1Var.f15826e;
            a1Var2.f15827f = a1Var.f15827f;
            a1Var2.A = a1Var.A;
            a1Var2.B = a1Var.B;
            a1Var2.C = a1Var.C;
            a1Var2.f15828z = a1Var.f15828z;
            return a1Var2;
        }
        a1 a1Var3 = new a1();
        a1Var3.A = this.f1209w;
        a1Var3.B = this.D;
        a1Var3.C = this.E;
        c cVar = this.B;
        if (cVar == null || (iArr = (int[]) cVar.f13507b) == null) {
            a1Var3.f15826e = 0;
        } else {
            a1Var3.f15827f = iArr;
            a1Var3.f15826e = iArr.length;
            a1Var3.f15828z = (ArrayList) cVar.f13508c;
        }
        if (v() <= 0) {
            a1Var3.f15822a = -1;
            a1Var3.f15823b = -1;
            a1Var3.f15824c = 0;
            return a1Var3;
        }
        a1Var3.f15822a = this.D ? J0() : I0();
        View viewE0 = this.f1210x ? E0(true) : F0(true);
        a1Var3.f15823b = viewE0 != null ? e0.H(viewE0) : -1;
        int i10 = this.f1202p;
        a1Var3.f15824c = i10;
        a1Var3.f15825d = new int[i10];
        for (int i11 = 0; i11 < this.f1202p; i11++) {
            if (this.D) {
                iH = this.f1203q[i11].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.f1204r.i();
                    iH -= iM;
                }
            } else {
                iH = this.f1203q[i11].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iM = this.f1204r.m();
                    iH -= iM;
                }
            }
            a1Var3.f15825d[i11] = iH;
        }
        return a1Var3;
    }

    @Override // t6.e0
    public final void g0(int i10) {
        if (i10 == 0) {
            B0();
        }
    }

    @Override // t6.e0
    public final void h(int i10, int i11, q0 q0Var, k kVar) {
        o oVar;
        int iF;
        int iH;
        if (this.f1206t != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        S0(i10, q0Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f1202p) {
            this.J = new int[this.f1202p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f1202p;
            oVar = this.f1208v;
            if (i12 >= i14) {
                break;
            }
            if (oVar.f15974d == -1) {
                iF = oVar.f15976f;
                iH = this.f1203q[i12].h(iF);
            } else {
                iF = this.f1203q[i12].f(oVar.f15977g);
                iH = oVar.f15977g;
            }
            int i15 = iF - iH;
            if (i15 >= 0) {
                this.J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = oVar.f15973c;
            if (i17 < 0 || i17 >= q0Var.b()) {
                return;
            }
            kVar.a(oVar.f15973c, this.J[i16]);
            oVar.f15973c += oVar.f15974d;
        }
    }

    @Override // t6.e0
    public final int j(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return b.v(q0Var, this.f1204r, F0(z2), E0(z2), this, this.I);
    }

    @Override // t6.e0
    public final int k(q0 q0Var) {
        return C0(q0Var);
    }

    @Override // t6.e0
    public final int l(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return b.x(q0Var, this.f1204r, F0(z2), E0(z2), this, this.I);
    }

    @Override // t6.e0
    public final int m(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return b.v(q0Var, this.f1204r, F0(z2), E0(z2), this, this.I);
    }

    @Override // t6.e0
    public final int n(q0 q0Var) {
        return C0(q0Var);
    }

    @Override // t6.e0
    public final int n0(int i10, k0 k0Var, q0 q0Var) {
        return X0(i10, k0Var, q0Var);
    }

    @Override // t6.e0
    public final int o(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z2 = !this.I;
        return b.x(q0Var, this.f1204r, F0(z2), E0(z2), this, this.I);
    }

    @Override // t6.e0
    public final void o0(int i10) {
        a1 a1Var = this.F;
        if (a1Var != null && a1Var.f15822a != i10) {
            a1Var.f15825d = null;
            a1Var.f15824c = 0;
            a1Var.f15822a = -1;
            a1Var.f15823b = -1;
        }
        this.f1212z = i10;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // t6.e0
    public final int p0(int i10, k0 k0Var, q0 q0Var) {
        return X0(i10, k0Var, q0Var);
    }

    @Override // t6.e0
    public final f0 r() {
        return this.f1206t == 0 ? new y0(-2, -1) : new y0(-1, -2);
    }

    @Override // t6.e0
    public final f0 s(Context context, AttributeSet attributeSet) {
        return new y0(context, attributeSet);
    }

    @Override // t6.e0
    public final void s0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        int i12 = this.f1206t;
        int i13 = this.f1202p;
        if (i12 == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f15870b;
            Field field = l0.f15744a;
            iG2 = e0.g(i11, iHeight, recyclerView.getMinimumHeight());
            iG = e0.g(i10, (this.f1207u * i13) + iF, this.f15870b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f15870b;
            Field field2 = l0.f15744a;
            iG = e0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            iG2 = e0.g(i11, (this.f1207u * i13) + iD, this.f15870b.getMinimumHeight());
        }
        this.f15870b.setMeasuredDimension(iG, iG2);
    }

    @Override // t6.e0
    public final f0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y0((ViewGroup.MarginLayoutParams) layoutParams) : new y0(layoutParams);
    }

    @Override // t6.e0
    public final void y0(RecyclerView recyclerView, int i10) {
        t tVar = new t(recyclerView.getContext());
        tVar.f16030a = i10;
        z0(tVar);
    }
}
