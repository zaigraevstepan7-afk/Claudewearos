package b0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q1 implements t2.q0, m1 {

    /* renamed from: a, reason: collision with root package name */
    public final g f1401a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.f f1402b;

    public q1(g gVar, v1.f fVar) {
        this.f1401a = gVar;
        this.f1402b = fVar;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        return d.n(this, s3.a.j(j), s3.a.i(j), s3.a.h(j), s3.a.g(j), s0Var.I0(this.f1401a.a()), s0Var, list, new t2.f1[list.size()], list.size());
    }

    @Override // b0.m1
    public final void b(int i10, t2.s0 s0Var, int[] iArr, int[] iArr2) {
        this.f1401a.c(s0Var, i10, iArr, s0Var.getLayoutDirection(), iArr2);
    }

    @Override // b0.m1
    public final int c(t2.f1 f1Var) {
        return f1Var.f15551b;
    }

    @Override // b0.m1
    public final int d(t2.f1 f1Var) {
        return f1Var.f15550a;
    }

    @Override // b0.m1
    public final long e(boolean z2, int i10, int i11, int i12) {
        return !z2 ? s3.b.a(i10, i11, 0, i12) : uk.c.B(i10, i11, 0, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return fj.l.b(this.f1401a, q1Var.f1401a) && fj.l.b(this.f1402b, q1Var.f1402b);
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1401a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iI0, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            t2.p0 p0Var = (t2.p0) list.get(i11);
            float fL = d.l(d.k(p0Var));
            if (fL == 0.0f) {
                int iMin2 = Math.min(p0Var.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.v0(iMin2));
            } else if (fL > 0.0f) {
                f10 += fL;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            t2.p0 p0Var2 = (t2.p0) list.get(i12);
            float fL2 = d.l(d.k(p0Var2));
            if (fL2 > 0.0f) {
                iMax = Math.max(iMax, p0Var2.v0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1401a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            t2.p0 p0Var = (t2.p0) list.get(i12);
            float fL = d.l(d.k(p0Var));
            int iO = p0Var.O(i10);
            if (fL == 0.0f) {
                i11 += iO;
            } else if (fL > 0.0f) {
                f10 += fL;
                iMax = Math.max(iMax, Math.round(iO / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f10) + i11;
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1401a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            t2.p0 p0Var = (t2.p0) list.get(i12);
            float fL = d.l(d.k(p0Var));
            int iV = p0Var.V(i10);
            if (fL == 0.0f) {
                i11 += iV;
            } else if (fL > 0.0f) {
                f10 += fL;
                iMax = Math.max(iMax, Math.round(iV / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f10) + i11;
    }

    public final int hashCode() {
        return this.f1402b.hashCode() + (this.f1401a.hashCode() * 31);
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1401a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iI0, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            t2.p0 p0Var = (t2.p0) list.get(i11);
            float fL = d.l(d.k(p0Var));
            if (fL == 0.0f) {
                int iMin2 = Math.min(p0Var.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.l(iMin2));
            } else if (fL > 0.0f) {
                f10 += fL;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            t2.p0 p0Var2 = (t2.p0) list.get(i12);
            float fL2 = d.l(d.k(p0Var2));
            if (fL2 > 0.0f) {
                iMax = Math.max(iMax, p0Var2.l(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // b0.m1
    public final t2.r0 j(t2.f1[] f1VarArr, t2.s0 s0Var, int[] iArr, int i10, int i11) {
        return s0Var.B(i10, i11, qi.t.f13521a, new p1(f1VarArr, this, i11, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f1401a + ", verticalAlignment=" + this.f1402b + ')';
    }
}
