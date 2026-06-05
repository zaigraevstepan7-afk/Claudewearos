package c1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 implements t2.q0 {
    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (fj.l.b(t2.z.i((t2.p0) obj), "leadingIcon")) {
                break;
            }
            i10++;
        }
        t2.p0 p0Var = (t2.p0) obj;
        final t2.f1 f1VarY = p0Var != null ? p0Var.Y(s3.a.a(j, 0, 0, 0, 0, 10)) : null;
        int i11 = f1VarY != null ? f1VarY.f15550a : 0;
        final int i12 = f1VarY != null ? f1VarY.f15551b : 0;
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i13);
            if (fj.l.b(t2.z.i((t2.p0) obj2), "trailingIcon")) {
                break;
            }
            i13++;
        }
        t2.p0 p0Var2 = (t2.p0) obj2;
        final t2.f1 f1VarY2 = p0Var2 != null ? p0Var2.Y(s3.a.a(j, 0, 0, 0, 0, 10)) : null;
        int i14 = f1VarY2 != null ? f1VarY2.f15550a : 0;
        final int i15 = f1VarY2 != null ? f1VarY2.f15551b : 0;
        int size3 = list.size();
        int i16 = 0;
        while (i16 < size3) {
            t2.p0 p0Var3 = (t2.p0) list.get(i16);
            if (fj.l.b(t2.z.i(p0Var3), "label")) {
                final t2.f1 f1VarY3 = p0Var3.Y(s3.b.j(-(i11 + i14), j, 0, 2));
                int i17 = f1VarY3.f15550a + i11 + i14;
                final int iMax = Math.max(i12, Math.max(f1VarY3.f15551b, i15));
                final int i18 = i11;
                return s0Var.B(i17, iMax, qi.t.f13521a, new ej.c() { // from class: c1.u0
                    @Override // ej.c
                    public final Object invoke(Object obj3) {
                        t2.e1 e1Var = (t2.e1) obj3;
                        t2.f1 f1Var = f1VarY;
                        int i19 = iMax;
                        if (f1Var != null) {
                            t2.e1.D(e1Var, f1Var, 0, m6.a.a(1, 0.0f, (i19 - i12) / 2.0f));
                        }
                        t2.f1 f1Var2 = f1VarY3;
                        int i20 = i18;
                        t2.e1.D(e1Var, f1Var2, i20, 0);
                        t2.f1 f1Var3 = f1VarY2;
                        if (f1Var3 != null) {
                            t2.e1.D(e1Var, f1Var3, i20 + f1Var2.f15550a, m6.a.a(1, 0.0f, (i19 - i15) / 2.0f));
                        }
                        return pi.o.f13011a;
                    }
                });
            }
            i16++;
            f1VarY = f1VarY;
            i11 = i11;
            i12 = i12;
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t2.p0) list.get(0)).v0(i10));
            int iB = yd.f.B(list);
            int i11 = 1;
            if (1 <= iB) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t2.p0) list.get(i11)).v0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iB) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        int size = list.size();
        int iO = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iO += ((t2.p0) list.get(i11)).O(i10);
        }
        return iO;
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        int size = list.size();
        int iV = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iV += ((t2.p0) list.get(i11)).V(i10);
        }
        return iV;
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t2.p0) list.get(0)).l(i10));
            int iB = yd.f.B(list);
            int i11 = 1;
            if (1 <= iB) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t2.p0) list.get(i11)).l(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iB) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
