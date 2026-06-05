package b0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.c f1440a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1441b;

    public u(v1.c cVar, boolean z2) {
        this.f1440a = cVar;
        this.f1441b = z2;
    }

    @Override // t2.q0
    public final t2.r0 a(final t2.s0 s0Var, List list, long j) {
        int iJ;
        int i10;
        t2.f1 f1VarY;
        boolean zIsEmpty = list.isEmpty();
        qi.t tVar = qi.t.f13521a;
        if (zIsEmpty) {
            return s0Var.B(s3.a.j(j), s3.a.i(j), tVar, new ta.n(15));
        }
        long j4 = this.f1441b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final t2.p0 p0Var = (t2.p0) list.get(0);
            Object objC0 = p0Var.c0();
            o oVar = objC0 instanceof o ? (o) objC0 : null;
            if (oVar != null ? oVar.I : false) {
                iJ = s3.a.j(j);
                i10 = s3.a.i(j);
                int iJ2 = s3.a.j(j);
                int i11 = s3.a.i(j);
                if (!((i11 >= 0) & (iJ2 >= 0))) {
                    s3.i.a("width and height must be >= 0");
                }
                f1VarY = p0Var.Y(s3.b.h(iJ2, iJ2, i11, i11));
            } else {
                f1VarY = p0Var.Y(j4);
                iJ = Math.max(s3.a.j(j), f1VarY.f15550a);
                i10 = Math.max(s3.a.i(j), f1VarY.f15551b);
            }
            final int i12 = i10;
            final int i13 = iJ;
            final t2.f1 f1Var = f1VarY;
            return s0Var.B(i13, i12, tVar, new ej.c() { // from class: b0.s
                @Override // ej.c
                public final Object invoke(Object obj) {
                    r.b((t2.e1) obj, f1Var, p0Var, s0Var.getLayoutDirection(), i13, i12, this.f1440a);
                    return pi.o.f13011a;
                }
            });
        }
        t2.f1[] f1VarArr = new t2.f1[list.size()];
        fj.t tVar2 = new fj.t();
        tVar2.f6805a = s3.a.j(j);
        fj.t tVar3 = new fj.t();
        tVar3.f6805a = s3.a.i(j);
        int size = list.size();
        boolean z2 = false;
        for (int i14 = 0; i14 < size; i14++) {
            t2.p0 p0Var2 = (t2.p0) list.get(i14);
            Object objC02 = p0Var2.c0();
            o oVar2 = objC02 instanceof o ? (o) objC02 : null;
            if (oVar2 != null ? oVar2.I : false) {
                z2 = true;
            } else {
                t2.f1 f1VarY2 = p0Var2.Y(j4);
                f1VarArr[i14] = f1VarY2;
                tVar2.f6805a = Math.max(tVar2.f6805a, f1VarY2.f15550a);
                tVar3.f6805a = Math.max(tVar3.f6805a, f1VarY2.f15551b);
            }
        }
        if (z2) {
            int i15 = tVar2.f6805a;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = tVar3.f6805a;
            long jA = s3.b.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list.size();
            for (int i18 = 0; i18 < size2; i18++) {
                t2.p0 p0Var3 = (t2.p0) list.get(i18);
                Object objC03 = p0Var3.c0();
                o oVar3 = objC03 instanceof o ? (o) objC03 : null;
                if (oVar3 != null ? oVar3.I : false) {
                    f1VarArr[i18] = p0Var3.Y(jA);
                }
            }
        }
        return s0Var.B(tVar2.f6805a, tVar3.f6805a, tVar, new t(f1VarArr, list, s0Var, tVar2, tVar3, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return fj.l.b(this.f1440a, uVar.f1440a) && this.f1441b == uVar.f1441b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1441b) + (this.f1440a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f1440a + ", propagateMinConstraints=" + this.f1441b + ')';
    }
}
