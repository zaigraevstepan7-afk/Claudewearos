package b0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 implements t2.q0, m1 {

    /* renamed from: a, reason: collision with root package name */
    public final i f1280a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.e f1281b;

    public b0(i iVar, v1.e eVar) {
        this.f1280a = iVar;
        this.f1281b = eVar;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        return d.n(this, s3.a.i(j), s3.a.j(j), s3.a.g(j), s3.a.h(j), s0Var.I0(this.f1280a.a()), s0Var, list, new t2.f1[list.size()], list.size());
    }

    @Override // b0.m1
    public final void b(int i10, t2.s0 s0Var, int[] iArr, int[] iArr2) {
        this.f1280a.b(i10, s0Var, iArr, iArr2);
    }

    @Override // b0.m1
    public final int c(t2.f1 f1Var) {
        return f1Var.f15550a;
    }

    @Override // b0.m1
    public final int d(t2.f1 f1Var) {
        return f1Var.f15551b;
    }

    @Override // b0.m1
    public final long e(boolean z2, int i10, int i11, int i12) {
        return !z2 ? s3.b.a(0, i12, i10, i11) : uk.c.A(0, i12, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return fj.l.b(this.f1280a, b0Var.f1280a) && this.f1281b.equals(b0Var.f1281b);
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1280a.a());
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
            int iV0 = p0Var.v0(i10);
            if (fL == 0.0f) {
                i11 += iV0;
            } else if (fL > 0.0f) {
                f10 += fL;
                iMax = Math.max(iMax, Math.round(iV0 / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f10) + i11;
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1280a.a());
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
                int iMin2 = Math.min(p0Var.l(com.google.android.gms.common.api.f.API_PRIORITY_OTHER), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.O(iMin2));
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
                iMax = Math.max(iMax, p0Var2.O(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1280a.a());
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
                int iMin2 = Math.min(p0Var.l(com.google.android.gms.common.api.f.API_PRIORITY_OTHER), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.V(iMin2));
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
                iMax = Math.max(iMax, p0Var2.V(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1281b.f17555a) + (this.f1280a.hashCode() * 31);
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        int iI0 = rVar.I0(this.f1280a.a());
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
            int iL = p0Var.l(i10);
            if (fL == 0.0f) {
                i11 += iL;
            } else if (fL > 0.0f) {
                f10 += fL;
                iMax = Math.max(iMax, Math.round(iL / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f10) + i11;
    }

    @Override // b0.m1
    public final t2.r0 j(final t2.f1[] f1VarArr, final t2.s0 s0Var, final int[] iArr, int i10, final int i11) {
        return s0Var.B(i11, i10, qi.t.f13521a, new ej.c() { // from class: b0.a0
            @Override // ej.c
            public final Object invoke(Object obj) {
                t2.e1 e1Var = (t2.e1) obj;
                t2.f1[] f1VarArr2 = f1VarArr;
                int length = f1VarArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    t2.f1 f1Var = f1VarArr2[i12];
                    int i14 = i13 + 1;
                    fj.l.c(f1Var);
                    Object objC0 = f1Var.c0();
                    n1 n1Var = objC0 instanceof n1 ? (n1) objC0 : null;
                    s3.m layoutDirection = s0Var.getLayoutDirection();
                    f0 f0Var = n1Var != null ? n1Var.f1383c : null;
                    int i15 = i11;
                    e1Var.z(f1Var, f0Var != null ? f0Var.f1310a.a(f1Var.f15550a, i15, layoutDirection) : this.f1281b.a(f1Var.f15550a, i15, layoutDirection), iArr[i13], 0.0f);
                    i12++;
                    i13 = i14;
                }
                return pi.o.f13011a;
            }
        });
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f1280a + ", horizontalAlignment=" + this.f1281b + ')';
    }
}
