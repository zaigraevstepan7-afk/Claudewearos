package s;

import java.util.ArrayList;
import java.util.List;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f14673a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14674b;

    public t(c0 c0Var) {
        this.f14673a = c0Var;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            f1 f1VarY = ((t2.p0) list.get(i10)).Y(j);
            iMax = Math.max(iMax, f1VarY.f15550a);
            iMax2 = Math.max(iMax2, f1VarY.f15551b);
            arrayList.add(f1VarY);
        }
        boolean zT0 = s0Var.t0();
        c0 c0Var = this.f14673a;
        if (zT0) {
            this.f14674b = true;
            c0Var.f14572a.setValue(new s3.l((4294967295L & iMax2) | (iMax << 32)));
        } else if (!this.f14674b) {
            c0Var.f14572a.setValue(new s3.l((4294967295L & iMax2) | (iMax << 32)));
        }
        return s0Var.B(iMax, iMax2, qi.t.f13521a, new s(arrayList, 0));
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iV0 = ((t2.p0) list.get(0)).v0(i10);
        int iB = yd.f.B(list);
        int i11 = 1;
        if (1 <= iB) {
            while (true) {
                int iV02 = ((t2.p0) list.get(i11)).v0(i10);
                if (iV02 > iV0) {
                    iV0 = iV02;
                }
                if (i11 == iB) {
                    break;
                }
                i11++;
            }
        }
        return iV0;
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = ((t2.p0) list.get(0)).O(i10);
        int iB = yd.f.B(list);
        int i11 = 1;
        if (1 <= iB) {
            while (true) {
                int iO2 = ((t2.p0) list.get(i11)).O(i10);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i11 == iB) {
                    break;
                }
                i11++;
            }
        }
        return iO;
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iV = ((t2.p0) list.get(0)).V(i10);
        int iB = yd.f.B(list);
        int i11 = 1;
        if (1 <= iB) {
            while (true) {
                int iV2 = ((t2.p0) list.get(i11)).V(i10);
                if (iV2 > iV) {
                    iV = iV2;
                }
                if (i11 == iB) {
                    break;
                }
                i11++;
            }
        }
        return iV;
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL = ((t2.p0) list.get(0)).l(i10);
        int iB = yd.f.B(list);
        int i11 = 1;
        if (1 <= iB) {
            while (true) {
                int iL2 = ((t2.p0) list.get(i11)).l(i10);
                if (iL2 > iL) {
                    iL = iL2;
                }
                if (i11 == iB) {
                    break;
                }
                i11++;
            }
        }
        return iL;
    }
}
