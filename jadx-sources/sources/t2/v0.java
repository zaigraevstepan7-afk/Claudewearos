package t2;

import c1.o2;
import c1.p2;
import c1.q2;
import c1.r2;
import c1.s2;
import c1.t2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f15661a;

    public v0(t2 t2Var) {
        this.f15661a = t2Var;
    }

    @Override // t2.q0
    public final r0 a(s0 s0Var, List list, long j) {
        List list2;
        List list3;
        int i10;
        f1 f1VarY;
        List list4;
        int i11;
        f1 f1VarY2;
        int i12;
        int i13;
        final f1 f1Var;
        int i14;
        int i15;
        final f1 f1Var2;
        int i16;
        int i17;
        ArrayList arrayListK = v2.n.k(s0Var);
        this.f15661a.getClass();
        List list5 = (List) arrayListK.get(0);
        List list6 = (List) arrayListK.get(1);
        List list7 = (List) arrayListK.get(2);
        List list8 = (List) arrayListK.get(3);
        List list9 = (List) arrayListK.get(4);
        long jA = s3.a.a(j, 0, 0, 0, 0, 10);
        float f10 = o2.f2512c;
        float f11 = o2.f2513d;
        int iI0 = s0Var.I0(f10 + f11);
        p0 p0Var = (p0) qi.l.A0(list8);
        int iO = p0Var != null ? p0Var.O(s3.a.g(j)) : 0;
        p0 p0Var2 = (p0) qi.l.A0(list9);
        int iJ = d1.i.j(s3.a.h(jA), iO + (p0Var2 != null ? p0Var2.O(s3.a.g(j)) : 0) + iI0);
        p0 p0Var3 = (p0) qi.l.A0(list7);
        boolean z2 = (p0Var3 != null ? p0Var3.v0(iJ) : 0) > s0Var.E0(hj.a.x(30));
        float f12 = 2;
        long jI = s3.b.i(-iI0, jA, -s0Var.I0(((((qi.l.A0(list6) != null) && (qi.l.A0(list7) != null)) || z2) ? o2.f2511b : o2.f2510a) * f12));
        p0 p0Var4 = (p0) qi.l.A0(list8);
        f1 f1VarY3 = p0Var4 != null ? p0Var4.Y(jI) : null;
        int i18 = f1VarY3 != null ? f1VarY3.f15550a : 0;
        p0 p0Var5 = (p0) qi.l.A0(list9);
        if (p0Var5 != null) {
            list2 = list5;
            list3 = list7;
            i10 = i18;
            f1VarY = p0Var5.Y(s3.b.j(-i18, jI, 0, 2));
        } else {
            list2 = list5;
            list3 = list7;
            i10 = i18;
            f1VarY = null;
        }
        int i19 = i10 + (f1VarY != null ? f1VarY.f15550a : 0);
        p0 p0Var6 = (p0) qi.l.A0(list2);
        if (p0Var6 != null) {
            list4 = list6;
            i11 = 0;
            f1VarY2 = p0Var6.Y(s3.b.j(-i19, jI, 0, 2));
        } else {
            list4 = list6;
            i11 = 0;
            f1VarY2 = null;
        }
        int i20 = f1VarY2 != null ? f1VarY2.f15551b : i11;
        p0 p0Var7 = (p0) qi.l.A0(list3);
        f1 f1VarY4 = p0Var7 != null ? p0Var7.Y(s3.b.i(-i19, jI, -i20)) : null;
        int i21 = i20 + (f1VarY4 != null ? f1VarY4.f15551b : 0);
        boolean z10 = (f1VarY4 == null || f1VarY4.x0(d.f15528a) == f1VarY4.x0(d.f15529b)) ? false : true;
        p0 p0Var8 = (p0) qi.l.A0(list4);
        f1 f1VarY5 = p0Var8 != null ? p0Var8.Y(s3.b.i(-i19, jI, -i21)) : null;
        boolean z11 = f1VarY5 != null;
        boolean z12 = f1VarY4 != null;
        if ((z11 && z12) || z10) {
            i12 = 3;
            i13 = 3;
        } else if (z11 || z12) {
            i12 = 3;
            i13 = 2;
        } else {
            i12 = 3;
            i13 = 1;
        }
        float f13 = i13 == i12 ? o2.f2511b : o2.f2510a;
        float f14 = f12 * f13;
        float f15 = f13;
        final int iH = s3.a.d(j) ? s3.a.h(j) : iI0 + (f1VarY3 != null ? f1VarY3.f15550a : 0) + Math.max(f1VarY2 != null ? f1VarY2.f15550a : 0, Math.max(f1VarY5 != null ? f1VarY5.f15550a : 0, f1VarY4 != null ? f1VarY4.f15550a : 0)) + (f1VarY != null ? f1VarY.f15550a : 0);
        int i22 = f1VarY3 != null ? f1VarY3.f15551b : 0;
        int i23 = f1VarY != null ? f1VarY.f15551b : 0;
        int i24 = f1VarY2 != null ? f1VarY2.f15551b : 0;
        if (f1VarY5 != null) {
            f1Var = f1VarY2;
            i14 = i22;
            i15 = f1VarY5.f15551b;
        } else {
            f1Var = f1VarY2;
            i14 = i22;
            i15 = 0;
        }
        if (f1VarY4 != null) {
            f1Var2 = f1VarY5;
            i16 = i23;
            i17 = f1VarY4.f15551b;
        } else {
            f1Var2 = f1VarY5;
            i16 = i23;
            i17 = 0;
        }
        final f1 f1Var3 = f1VarY4;
        final int iD = o2.d(s0Var, i14, i16, i24, i15, i17, i13, s0Var.I0(f14), j);
        final boolean z13 = i13 == 3;
        final int iI02 = s0Var.I0(f10);
        final int iI03 = s0Var.I0(f11);
        final int iI04 = s0Var.I0(f15);
        final f1 f1Var4 = f1VarY;
        final f1 f1Var5 = f1VarY3;
        return s0Var.B(iH, iD, qi.t.f13521a, new ej.c() { // from class: c1.l2
            @Override // ej.c
            public final Object invoke(Object obj) {
                int iA;
                t2.e1 e1Var = (t2.e1) obj;
                t2.f1 f1Var6 = f1Var5;
                int i25 = iI02;
                boolean z14 = z13;
                int iA2 = iI04;
                int i26 = iD;
                if (f1Var6 != null) {
                    t2.e1.D(e1Var, f1Var6, i25, z14 ? iA2 : m6.a.a(1, 0.0f, (i26 - f1Var6.f15551b) / 2.0f));
                }
                int i27 = i25 + (f1Var6 != null ? f1Var6.f15550a : 0);
                t2.f1 f1Var7 = f1Var;
                t2.f1 f1Var8 = f1Var2;
                t2.f1 f1Var9 = f1Var3;
                if (z14) {
                    iA = iA2;
                } else {
                    iA = m6.a.a(1, 0.0f, (i26 - (((f1Var7 != null ? f1Var7.f15551b : 0) + (f1Var8 != null ? f1Var8.f15551b : 0)) + (f1Var9 != null ? f1Var9.f15551b : 0))) / 2.0f);
                }
                if (f1Var8 != null) {
                    t2.e1.D(e1Var, f1Var8, i27, iA);
                }
                int i28 = iA + (f1Var8 != null ? f1Var8.f15551b : 0);
                if (f1Var7 != null) {
                    t2.e1.D(e1Var, f1Var7, i27, i28);
                }
                int i29 = i28 + (f1Var7 != null ? f1Var7.f15551b : 0);
                if (f1Var9 != null) {
                    t2.e1.D(e1Var, f1Var9, i27, i29);
                }
                t2.f1 f1Var10 = f1Var4;
                if (f1Var10 != null) {
                    int i30 = (iH - iI03) - f1Var10.f15550a;
                    if (!z14) {
                        iA2 = m6.a.a(1, 0.0f, (i26 - f1Var10.f15551b) / 2.0f);
                    }
                    t2.e1.D(e1Var, f1Var10, i30, iA2);
                }
                return pi.o.f13011a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && fj.l.b(this.f15661a, ((v0) obj).f15661a);
    }

    @Override // t2.q0
    public final int f(r rVar, List list, int i10) {
        ArrayList arrayListK = v2.n.k(rVar);
        this.f15661a.getClass();
        return t2.a(rVar, arrayListK, i10, r2.A);
    }

    @Override // t2.q0
    public final int g(r rVar, List list, int i10) {
        ArrayList arrayListK = v2.n.k(rVar);
        this.f15661a.getClass();
        return t2.b(rVar, arrayListK, i10, s2.A);
    }

    @Override // t2.q0
    public final int h(r rVar, List list, int i10) {
        ArrayList arrayListK = v2.n.k(rVar);
        this.f15661a.getClass();
        return t2.b(rVar, arrayListK, i10, q2.A);
    }

    public final int hashCode() {
        return this.f15661a.hashCode();
    }

    @Override // t2.q0
    public final int i(r rVar, List list, int i10) {
        ArrayList arrayListK = v2.n.k(rVar);
        this.f15661a.getClass();
        return t2.a(rVar, arrayListK, i10, p2.A);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f15661a + ')';
    }
}
