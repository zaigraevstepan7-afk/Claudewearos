package s;

import java.util.List;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f14641a;

    public l(r rVar) {
        this.f14641a = rVar;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        f1 f1Var;
        int i10;
        f1 f1Var2;
        int i11;
        int i12;
        int size = list.size();
        f1[] f1VarArr = new f1[size];
        int size2 = list.size();
        long j4 = 0;
        int i13 = 0;
        while (true) {
            f1Var = null;
            i10 = 1;
            if (i13 >= size2) {
                break;
            }
            t2.p0 p0Var = (t2.p0) list.get(i13);
            Object objC0 = p0Var.c0();
            n nVar = objC0 instanceof n ? (n) objC0 : null;
            if (nVar != null && ((Boolean) nVar.f14646b.getValue()).booleanValue()) {
                f1VarArr[i13] = p0Var.Y(j);
                j4 = (r7.f15551b & 4294967295L) | (r7.f15550a << 32);
            }
            i13++;
        }
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            t2.p0 p0Var2 = (t2.p0) list.get(i14);
            if (f1VarArr[i14] == null) {
                f1VarArr[i14] = p0Var2.Y(j);
            }
        }
        if (s0Var.t0()) {
            i11 = (int) (j4 >> 32);
        } else {
            if (size == 0) {
                f1Var2 = null;
            } else {
                f1Var2 = f1VarArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = f1Var2 != null ? f1Var2.f15550a : 0;
                    if (1 <= i15) {
                        int i17 = 1;
                        while (true) {
                            f1 f1Var3 = f1VarArr[i17];
                            int i18 = f1Var3 != null ? f1Var3.f15550a : 0;
                            if (i16 < i18) {
                                f1Var2 = f1Var3;
                                i16 = i18;
                            }
                            if (i17 == i15) {
                                break;
                            }
                            i17++;
                        }
                    }
                }
            }
            i11 = f1Var2 != null ? f1Var2.f15550a : 0;
        }
        if (s0Var.t0()) {
            i12 = (int) (j4 & 4294967295L);
        } else {
            if (size != 0) {
                f1Var = f1VarArr[0];
                int i19 = size - 1;
                if (i19 != 0) {
                    int i20 = f1Var != null ? f1Var.f15551b : 0;
                    if (1 <= i19) {
                        while (true) {
                            f1 f1Var4 = f1VarArr[i10];
                            int i21 = f1Var4 != null ? f1Var4.f15551b : 0;
                            if (i20 < i21) {
                                f1Var = f1Var4;
                                i20 = i21;
                            }
                            if (i10 == i19) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            i12 = f1Var != null ? f1Var.f15551b : 0;
        }
        if (!s0Var.t0()) {
            this.f14641a.f14667b.setValue(new s3.l((i11 << 32) | (i12 & 4294967295L)));
        }
        return s0Var.B(i11, i12, qi.t.f13521a, new k(f1VarArr, this, i11, i12));
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
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t2.p0) list.get(0)).O(i10));
            int iB = yd.f.B(list);
            int i11 = 1;
            if (1 <= iB) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t2.p0) list.get(i11)).O(i10));
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
    public final int h(t2.r rVar, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((t2.p0) list.get(0)).V(i10));
            int iB = yd.f.B(list);
            int i11 = 1;
            if (1 <= iB) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t2.p0) list.get(i11)).V(i10));
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
