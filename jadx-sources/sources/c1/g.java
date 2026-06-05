package c1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements t2.q0 {
    public static final void b(ArrayList arrayList, fj.t tVar, t2.s0 s0Var, ArrayList arrayList2, ArrayList arrayList3, fj.t tVar2, ArrayList arrayList4, fj.t tVar3, fj.t tVar4) {
        float f10 = j.f2256d;
        if (!arrayList.isEmpty()) {
            tVar.f6805a = s0Var.I0(f10) + tVar.f6805a;
        }
        arrayList.add(0, qi.l.R0(arrayList2));
        arrayList3.add(Integer.valueOf(tVar2.f6805a));
        arrayList4.add(Integer.valueOf(tVar.f6805a));
        tVar.f6805a += tVar2.f6805a;
        tVar3.f6805a = Math.max(tVar3.f6805a, tVar4.f6805a);
        arrayList2.clear();
        tVar4.f6805a = 0;
        tVar2.f6805a = 0;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        fj.t tVar = new fj.t();
        fj.t tVar2 = new fj.t();
        ArrayList arrayList6 = new ArrayList();
        fj.t tVar3 = new fj.t();
        fj.t tVar4 = new fj.t();
        float f10 = j.f2255c;
        float f11 = j.f2253a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            t2.f1 f1VarY = ((t2.p0) list.get(i10)).Y(j);
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = arrayList3;
                fj.t tVar5 = tVar2;
                if (s0Var.I0(f10) + tVar3.f6805a + f1VarY.f15550a <= s3.a.h(j)) {
                    arrayList3 = arrayList7;
                    tVar2 = tVar5;
                } else {
                    arrayList3 = arrayList7;
                    tVar2 = tVar5;
                    b(arrayList3, tVar2, s0Var, arrayList6, arrayList4, tVar4, arrayList5, tVar, tVar3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                arrayList2 = arrayList3;
                tVar3.f6805a = s0Var.I0(f10) + tVar3.f6805a;
            }
            arrayList6.add(f1VarY);
            tVar3.f6805a += f1VarY.f15550a;
            tVar4.f6805a = Math.max(tVar4.f6805a, f1VarY.f15551b);
            i10++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList8 = arrayList3;
        if (arrayList6.isEmpty()) {
            arrayList = arrayList8;
        } else {
            float f12 = j.f2253a;
            arrayList = arrayList8;
            b(arrayList, tVar2, s0Var, arrayList6, arrayList4, tVar4, arrayList5, tVar, tVar3);
        }
        int iMax = Math.max(tVar.f6805a, s3.a.j(j));
        int iMax2 = Math.max(tVar2.f6805a, s3.a.i(j));
        float f13 = j.f2253a;
        return s0Var.B(iMax, iMax2, qi.t.f13521a, new b0.p1(arrayList, s0Var, iMax, arrayList5));
    }
}
