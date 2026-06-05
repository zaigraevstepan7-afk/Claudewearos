package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.k;
import cg.b;
import m6.a;
import r5.g;
import t6.d0;
import t6.e0;
import t6.f0;
import t6.k0;
import t6.p;
import t6.p0;
import t6.q;
import t6.q0;
import t6.r;
import t6.s;
import t6.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends e0 implements p0 {
    public final p A;
    public final q B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f1162p;

    /* renamed from: q, reason: collision with root package name */
    public r f1163q;

    /* renamed from: r, reason: collision with root package name */
    public g f1164r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1165s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1166t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1167u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1168v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1169w;

    /* renamed from: x, reason: collision with root package name */
    public int f1170x;

    /* renamed from: y, reason: collision with root package name */
    public int f1171y;

    /* renamed from: z, reason: collision with root package name */
    public s f1172z;

    public LinearLayoutManager(int i10) {
        this.f1162p = 1;
        this.f1166t = false;
        this.f1167u = false;
        this.f1168v = false;
        this.f1169w = true;
        this.f1170x = -1;
        this.f1171y = Integer.MIN_VALUE;
        this.f1172z = null;
        this.A = new p();
        this.B = new q();
        this.C = 2;
        this.D = new int[2];
        a1(i10);
        c(null);
        if (this.f1166t) {
            this.f1166t = false;
            m0();
        }
    }

    @Override // t6.e0
    public boolean A0() {
        return this.f1172z == null && this.f1165s == this.f1168v;
    }

    public void B0(q0 q0Var, int[] iArr) {
        int i10;
        int iN = q0Var.f15996a != -1 ? this.f1164r.n() : 0;
        if (this.f1163q.f16014f == -1) {
            i10 = 0;
        } else {
            i10 = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i10;
    }

    public void C0(q0 q0Var, r rVar, k kVar) {
        int i10 = rVar.f16012d;
        if (i10 < 0 || i10 >= q0Var.b()) {
            return;
        }
        kVar.a(i10, Math.max(0, rVar.f16015g));
    }

    public final int D0(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f1164r;
        boolean z2 = !this.f1169w;
        return b.v(q0Var, gVar, K0(z2), J0(z2), this, this.f1169w);
    }

    public final int E0(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f1164r;
        boolean z2 = !this.f1169w;
        return b.w(q0Var, gVar, K0(z2), J0(z2), this, this.f1169w, this.f1167u);
    }

    public final int F0(q0 q0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        g gVar = this.f1164r;
        boolean z2 = !this.f1169w;
        return b.x(q0Var, gVar, K0(z2), J0(z2), this, this.f1169w);
    }

    public final int G0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f1162p == 1) ? 1 : Integer.MIN_VALUE : this.f1162p == 0 ? 1 : Integer.MIN_VALUE : this.f1162p == 1 ? -1 : Integer.MIN_VALUE : this.f1162p == 0 ? -1 : Integer.MIN_VALUE : (this.f1162p != 1 && T0()) ? -1 : 1 : (this.f1162p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.f1163q == null) {
            r rVar = new r();
            rVar.f16009a = true;
            rVar.f16016h = 0;
            rVar.f16017i = 0;
            rVar.f16018k = null;
            this.f1163q = rVar;
        }
    }

    public final int I0(k0 k0Var, r rVar, q0 q0Var, boolean z2) {
        int i10;
        int i11 = rVar.f16011c;
        int i12 = rVar.f16015g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                rVar.f16015g = i12 + i11;
            }
            W0(k0Var, rVar);
        }
        int i13 = rVar.f16011c + rVar.f16016h;
        while (true) {
            if ((!rVar.f16019l && i13 <= 0) || (i10 = rVar.f16012d) < 0 || i10 >= q0Var.b()) {
                break;
            }
            q qVar = this.B;
            qVar.f15992a = 0;
            qVar.f15993b = false;
            qVar.f15994c = false;
            qVar.f15995d = false;
            U0(k0Var, q0Var, rVar, qVar);
            if (!qVar.f15993b) {
                int i14 = rVar.f16010b;
                int i15 = qVar.f15992a;
                rVar.f16010b = (rVar.f16014f * i15) + i14;
                if (!qVar.f15994c || rVar.f16018k != null || !q0Var.f16002g) {
                    rVar.f16011c -= i15;
                    i13 -= i15;
                }
                int i16 = rVar.f16015g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    rVar.f16015g = i17;
                    int i18 = rVar.f16011c;
                    if (i18 < 0) {
                        rVar.f16015g = i17 + i18;
                    }
                    W0(k0Var, rVar);
                }
                if (z2 && qVar.f15995d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - rVar.f16011c;
    }

    public final View J0(boolean z2) {
        return this.f1167u ? N0(0, v(), z2) : N0(v() - 1, -1, z2);
    }

    public final View K0(boolean z2) {
        return this.f1167u ? N0(v() - 1, -1, z2) : N0(0, v(), z2);
    }

    @Override // t6.e0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View viewN0 = N0(v() - 1, -1, false);
        if (viewN0 == null) {
            return -1;
        }
        return e0.H(viewN0);
    }

    public final View M0(int i10, int i11) {
        int i12;
        int i13;
        H0();
        if (i11 <= i10 && i11 >= i10) {
            return u(i10);
        }
        if (this.f1164r.g(u(i10)) < this.f1164r.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f1162p == 0 ? this.f15871c.k(i10, i11, i12, i13) : this.f15872d.k(i10, i11, i12, i13);
    }

    public final View N0(int i10, int i11, boolean z2) {
        H0();
        int i12 = z2 ? 24579 : 320;
        return this.f1162p == 0 ? this.f15871c.k(i10, i11, i12, 320) : this.f15872d.k(i10, i11, i12, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View O0(t6.k0 r17, t6.q0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.H0()
            int r1 = r0.v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            r5.g r7 = r0.f1164r
            int r7 = r7.m()
            r5.g r8 = r0.f1164r
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = t6.e0.H(r12)
            r5.g r14 = r0.f1164r
            int r14 = r14.g(r12)
            r5.g r15 = r0.f1164r
            int r15 = r15.d(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            t6.f0 r13 = (t6.f0) r13
            t6.t0 r13 = r13.f15893a
            boolean r13 = r13.h()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.O0(t6.k0, t6.q0, boolean, boolean):android.view.View");
    }

    public final int P0(int i10, k0 k0Var, q0 q0Var, boolean z2) {
        int i11;
        int i12 = this.f1164r.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -Z0(-i12, k0Var, q0Var);
        int i14 = i10 + i13;
        if (!z2 || (i11 = this.f1164r.i() - i14) <= 0) {
            return i13;
        }
        this.f1164r.q(i11);
        return i11 + i13;
    }

    public final int Q0(int i10, k0 k0Var, q0 q0Var, boolean z2) {
        int iM;
        int iM2 = i10 - this.f1164r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -Z0(iM2, k0Var, q0Var);
        int i12 = i10 + i11;
        if (!z2 || (iM = i12 - this.f1164r.m()) <= 0) {
            return i11;
        }
        this.f1164r.q(-iM);
        return i11 - iM;
    }

    public final View R0() {
        return u(this.f1167u ? 0 : v() - 1);
    }

    public final View S0() {
        return u(this.f1167u ? v() - 1 : 0);
    }

    @Override // t6.e0
    public View T(View view, int i10, k0 k0Var, q0 q0Var) {
        int iG0;
        Y0();
        if (v() != 0 && (iG0 = G0(i10)) != Integer.MIN_VALUE) {
            H0();
            c1(iG0, (int) (this.f1164r.n() * 0.33333334f), false, q0Var);
            r rVar = this.f1163q;
            rVar.f16015g = Integer.MIN_VALUE;
            rVar.f16009a = false;
            I0(k0Var, rVar, q0Var, true);
            View viewM0 = iG0 == -1 ? this.f1167u ? M0(v() - 1, -1) : M0(0, v()) : this.f1167u ? M0(0, v()) : M0(v() - 1, -1);
            View viewS0 = iG0 == -1 ? S0() : R0();
            if (!viewS0.hasFocusable()) {
                return viewM0;
            }
            if (viewM0 != null) {
                return viewS0;
            }
        }
        return null;
    }

    public final boolean T0() {
        return C() == 1;
    }

    @Override // t6.e0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewN0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(viewN0 == null ? -1 : e0.H(viewN0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(k0 k0Var, q0 q0Var, r rVar, q qVar) {
        int iE;
        int i10;
        int i11;
        int iF;
        View viewB = rVar.b(k0Var);
        if (viewB == null) {
            qVar.f15993b = true;
            return;
        }
        f0 f0Var = (f0) viewB.getLayoutParams();
        if (rVar.f16018k == null) {
            if (this.f1167u == (rVar.f16014f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f1167u == (rVar.f16014f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        f0 f0Var2 = (f0) viewB.getLayoutParams();
        Rect rectI = this.f15870b.I(viewB);
        int i12 = rectI.left + rectI.right;
        int i13 = rectI.top + rectI.bottom;
        int iW = e0.w(d(), this.f15881n, this.f15879l, F() + E() + ((ViewGroup.MarginLayoutParams) f0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) f0Var2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) f0Var2).width);
        int iW2 = e0.w(e(), this.f15882o, this.f15880m, D() + G() + ((ViewGroup.MarginLayoutParams) f0Var2).topMargin + ((ViewGroup.MarginLayoutParams) f0Var2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) f0Var2).height);
        if (v0(viewB, iW, iW2, f0Var2)) {
            viewB.measure(iW, iW2);
        }
        qVar.f15992a = this.f1164r.e(viewB);
        if (this.f1162p == 1) {
            if (T0()) {
                iF = this.f15881n - F();
                iE = iF - this.f1164r.f(viewB);
            } else {
                iE = E();
                iF = this.f1164r.f(viewB) + iE;
            }
            if (rVar.f16014f == -1) {
                i10 = rVar.f16010b;
                i11 = i10 - qVar.f15992a;
            } else {
                i11 = rVar.f16010b;
                i10 = qVar.f15992a + i11;
            }
        } else {
            int iG = G();
            int iF2 = this.f1164r.f(viewB) + iG;
            if (rVar.f16014f == -1) {
                int i14 = rVar.f16010b;
                int i15 = i14 - qVar.f15992a;
                iF = i14;
                i10 = iF2;
                iE = i15;
                i11 = iG;
            } else {
                int i16 = rVar.f16010b;
                int i17 = qVar.f15992a + i16;
                iE = i16;
                i10 = iF2;
                i11 = iG;
                iF = i17;
            }
        }
        e0.N(viewB, iE, i11, iF, i10);
        if (f0Var.f15893a.h() || f0Var.f15893a.k()) {
            qVar.f15994c = true;
        }
        qVar.f15995d = viewB.hasFocusable();
    }

    public final void W0(k0 k0Var, r rVar) {
        if (!rVar.f16009a || rVar.f16019l) {
            return;
        }
        int i10 = rVar.f16015g;
        int i11 = rVar.f16017i;
        if (rVar.f16014f == -1) {
            int iV = v();
            if (i10 < 0) {
                return;
            }
            int iH = (this.f1164r.h() - i10) + i11;
            if (this.f1167u) {
                for (int i12 = 0; i12 < iV; i12++) {
                    View viewU = u(i12);
                    if (this.f1164r.g(viewU) < iH || this.f1164r.p(viewU) < iH) {
                        X0(k0Var, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iV - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewU2 = u(i14);
                if (this.f1164r.g(viewU2) < iH || this.f1164r.p(viewU2) < iH) {
                    X0(k0Var, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iV2 = v();
        if (!this.f1167u) {
            for (int i16 = 0; i16 < iV2; i16++) {
                View viewU3 = u(i16);
                if (this.f1164r.d(viewU3) > i15 || this.f1164r.o(viewU3) > i15) {
                    X0(k0Var, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iV2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewU4 = u(i18);
            if (this.f1164r.d(viewU4) > i15 || this.f1164r.o(viewU4) > i15) {
                X0(k0Var, i17, i18);
                return;
            }
        }
    }

    public final void X0(k0 k0Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewU = u(i10);
                k0(i10);
                k0Var.g(viewU);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewU2 = u(i12);
            k0(i12);
            k0Var.g(viewU2);
        }
    }

    public final void Y0() {
        if (this.f1162p == 1 || !T0()) {
            this.f1167u = this.f1166t;
        } else {
            this.f1167u = !this.f1166t;
        }
    }

    public final int Z0(int i10, k0 k0Var, q0 q0Var) {
        if (v() != 0 && i10 != 0) {
            H0();
            this.f1163q.f16009a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            c1(i11, iAbs, true, q0Var);
            r rVar = this.f1163q;
            int iI0 = I0(k0Var, rVar, q0Var, false) + rVar.f16015g;
            if (iI0 >= 0) {
                if (iAbs > iI0) {
                    i10 = i11 * iI0;
                }
                this.f1164r.q(-i10);
                this.f1163q.j = i10;
                return i10;
            }
        }
        return 0;
    }

    @Override // t6.p0
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        int i11 = (i10 < e0.H(u(0))) != this.f1167u ? -1 : 1;
        return this.f1162p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final void a1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a.d(i10, "invalid orientation:"));
        }
        c(null);
        if (i10 != this.f1162p || this.f1164r == null) {
            g gVarB = g.b(this, i10);
            this.f1164r = gVarB;
            this.A.f15987a = gVarB;
            this.f1162p = i10;
            m0();
        }
    }

    public void b1(boolean z2) {
        c(null);
        if (this.f1168v == z2) {
            return;
        }
        this.f1168v = z2;
        m0();
    }

    @Override // t6.e0
    public final void c(String str) {
        if (this.f1172z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    @Override // t6.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(t6.k0 r18, t6.q0 r19) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c0(t6.k0, t6.q0):void");
    }

    public final void c1(int i10, int i11, boolean z2, q0 q0Var) {
        int iM;
        this.f1163q.f16019l = this.f1164r.k() == 0 && this.f1164r.h() == 0;
        this.f1163q.f16014f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(q0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z10 = i10 == 1;
        r rVar = this.f1163q;
        int i12 = z10 ? iMax2 : iMax;
        rVar.f16016h = i12;
        if (!z10) {
            iMax = iMax2;
        }
        rVar.f16017i = iMax;
        if (z10) {
            rVar.f16016h = this.f1164r.j() + i12;
            View viewR0 = R0();
            r rVar2 = this.f1163q;
            rVar2.f16013e = this.f1167u ? -1 : 1;
            int iH = e0.H(viewR0);
            r rVar3 = this.f1163q;
            rVar2.f16012d = iH + rVar3.f16013e;
            rVar3.f16010b = this.f1164r.d(viewR0);
            iM = this.f1164r.d(viewR0) - this.f1164r.i();
        } else {
            View viewS0 = S0();
            r rVar4 = this.f1163q;
            rVar4.f16016h = this.f1164r.m() + rVar4.f16016h;
            r rVar5 = this.f1163q;
            rVar5.f16013e = this.f1167u ? 1 : -1;
            int iH2 = e0.H(viewS0);
            r rVar6 = this.f1163q;
            rVar5.f16012d = iH2 + rVar6.f16013e;
            rVar6.f16010b = this.f1164r.g(viewS0);
            iM = (-this.f1164r.g(viewS0)) + this.f1164r.m();
        }
        r rVar7 = this.f1163q;
        rVar7.f16011c = i11;
        if (z2) {
            rVar7.f16011c = i11 - iM;
        }
        rVar7.f16015g = iM;
    }

    @Override // t6.e0
    public final boolean d() {
        return this.f1162p == 0;
    }

    @Override // t6.e0
    public void d0(q0 q0Var) {
        this.f1172z = null;
        this.f1170x = -1;
        this.f1171y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void d1(int i10, int i11) {
        this.f1163q.f16011c = this.f1164r.i() - i11;
        r rVar = this.f1163q;
        rVar.f16013e = this.f1167u ? -1 : 1;
        rVar.f16012d = i10;
        rVar.f16014f = 1;
        rVar.f16010b = i11;
        rVar.f16015g = Integer.MIN_VALUE;
    }

    @Override // t6.e0
    public final boolean e() {
        return this.f1162p == 1;
    }

    @Override // t6.e0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof s) {
            s sVar = (s) parcelable;
            this.f1172z = sVar;
            if (this.f1170x != -1) {
                sVar.f16020a = -1;
            }
            m0();
        }
    }

    public final void e1(int i10, int i11) {
        this.f1163q.f16011c = i11 - this.f1164r.m();
        r rVar = this.f1163q;
        rVar.f16012d = i10;
        rVar.f16013e = this.f1167u ? 1 : -1;
        rVar.f16014f = -1;
        rVar.f16010b = i11;
        rVar.f16015g = Integer.MIN_VALUE;
    }

    @Override // t6.e0
    public final Parcelable f0() {
        s sVar = this.f1172z;
        if (sVar != null) {
            s sVar2 = new s();
            sVar2.f16020a = sVar.f16020a;
            sVar2.f16021b = sVar.f16021b;
            sVar2.f16022c = sVar.f16022c;
            return sVar2;
        }
        s sVar3 = new s();
        if (v() <= 0) {
            sVar3.f16020a = -1;
            return sVar3;
        }
        H0();
        boolean z2 = this.f1165s ^ this.f1167u;
        sVar3.f16022c = z2;
        if (z2) {
            View viewR0 = R0();
            sVar3.f16021b = this.f1164r.i() - this.f1164r.d(viewR0);
            sVar3.f16020a = e0.H(viewR0);
            return sVar3;
        }
        View viewS0 = S0();
        sVar3.f16020a = e0.H(viewS0);
        sVar3.f16021b = this.f1164r.g(viewS0) - this.f1164r.m();
        return sVar3;
    }

    @Override // t6.e0
    public final void h(int i10, int i11, q0 q0Var, k kVar) {
        if (this.f1162p != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        H0();
        c1(i10 > 0 ? 1 : -1, Math.abs(i10), true, q0Var);
        C0(q0Var, this.f1163q, kVar);
    }

    @Override // t6.e0
    public final void i(int i10, k kVar) {
        boolean z2;
        int i11;
        s sVar = this.f1172z;
        if (sVar == null || (i11 = sVar.f16020a) < 0) {
            Y0();
            z2 = this.f1167u;
            i11 = this.f1170x;
            if (i11 == -1) {
                i11 = z2 ? i10 - 1 : 0;
            }
        } else {
            z2 = sVar.f16022c;
        }
        int i12 = z2 ? -1 : 1;
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            kVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // t6.e0
    public final int j(q0 q0Var) {
        return D0(q0Var);
    }

    @Override // t6.e0
    public int k(q0 q0Var) {
        return E0(q0Var);
    }

    @Override // t6.e0
    public int l(q0 q0Var) {
        return F0(q0Var);
    }

    @Override // t6.e0
    public final int m(q0 q0Var) {
        return D0(q0Var);
    }

    @Override // t6.e0
    public int n(q0 q0Var) {
        return E0(q0Var);
    }

    @Override // t6.e0
    public int n0(int i10, k0 k0Var, q0 q0Var) {
        if (this.f1162p == 1) {
            return 0;
        }
        return Z0(i10, k0Var, q0Var);
    }

    @Override // t6.e0
    public int o(q0 q0Var) {
        return F0(q0Var);
    }

    @Override // t6.e0
    public final void o0(int i10) {
        this.f1170x = i10;
        this.f1171y = Integer.MIN_VALUE;
        s sVar = this.f1172z;
        if (sVar != null) {
            sVar.f16020a = -1;
        }
        m0();
    }

    @Override // t6.e0
    public int p0(int i10, k0 k0Var, q0 q0Var) {
        if (this.f1162p == 0) {
            return 0;
        }
        return Z0(i10, k0Var, q0Var);
    }

    @Override // t6.e0
    public final View q(int i10) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i10 - e0.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (e0.H(viewU) == i10) {
                return viewU;
            }
        }
        return super.q(i10);
    }

    @Override // t6.e0
    public f0 r() {
        return new f0(-2, -2);
    }

    @Override // t6.e0
    public final boolean w0() {
        if (this.f15880m != 1073741824 && this.f15879l != 1073741824) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t6.e0
    public void y0(RecyclerView recyclerView, int i10) {
        t tVar = new t(recyclerView.getContext());
        tVar.f16030a = i10;
        z0(tVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1162p = 1;
        this.f1166t = false;
        this.f1167u = false;
        this.f1168v = false;
        this.f1169w = true;
        this.f1170x = -1;
        this.f1171y = Integer.MIN_VALUE;
        this.f1172z = null;
        this.A = new p();
        this.B = new q();
        this.C = 2;
        this.D = new int[2];
        d0 d0VarI = e0.I(context, attributeSet, i10, i11);
        a1(d0VarI.f15860a);
        boolean z2 = d0VarI.f15862c;
        c(null);
        if (z2 != this.f1166t) {
            this.f1166t = z2;
            m0();
        }
        b1(d0VarI.f15863d);
    }

    @Override // t6.e0
    public final void S(RecyclerView recyclerView) {
    }

    public void V0(k0 k0Var, q0 q0Var, p pVar, int i10) {
    }
}
