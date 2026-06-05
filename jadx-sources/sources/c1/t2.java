package c1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t2 {
    public static int a(t2.r rVar, ArrayList arrayList, int i10, ej.e eVar) {
        int iIntValue;
        int iIntValue2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iJ = d1.i.j(i10, rVar.I0(o2.f2512c + o2.f2513d));
        t2.p0 p0Var = (t2.p0) qi.l.A0(list4);
        if (p0Var != null) {
            iIntValue = ((Number) eVar.invoke(p0Var, Integer.valueOf(iJ))).intValue();
            iJ = d1.i.j(iJ, p0Var.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
        } else {
            iIntValue = 0;
        }
        t2.p0 p0Var2 = (t2.p0) qi.l.A0(list5);
        if (p0Var2 != null) {
            iIntValue2 = ((Number) eVar.invoke(p0Var2, Integer.valueOf(iJ))).intValue();
            iJ = d1.i.j(iJ, p0Var2.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (t2.p0) qi.l.A0(list2);
        int iIntValue3 = obj != null ? ((Number) eVar.invoke(obj, Integer.valueOf(iJ))).intValue() : 0;
        Object obj2 = (t2.p0) qi.l.A0(list);
        int iIntValue4 = obj2 != null ? ((Number) eVar.invoke(obj2, Integer.valueOf(iJ))).intValue() : 0;
        Object obj3 = (t2.p0) qi.l.A0(list3);
        int iIntValue5 = obj3 != null ? ((Number) eVar.invoke(obj3, Integer.valueOf(iJ))).intValue() : 0;
        boolean z2 = iIntValue5 > rVar.E0(hj.a.x(30));
        boolean z10 = iIntValue3 > 0;
        boolean z11 = iIntValue5 > 0;
        int i11 = ((z10 && z11) || z2) ? 3 : (z10 || z11) ? 2 : 1;
        return o2.d(rVar, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i11, rVar.I0((i11 == 3 ? o2.f2511b : o2.f2510a) * 2), s3.b.b(0, 0, 0, 0, 15));
    }

    public static int b(t2.r rVar, ArrayList arrayList, int i10, ej.e eVar) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        t2.p0 p0Var = (t2.p0) qi.l.A0(list4);
        int iIntValue = p0Var != null ? ((Number) eVar.invoke(p0Var, Integer.valueOf(i10))).intValue() : 0;
        t2.p0 p0Var2 = (t2.p0) qi.l.A0(list5);
        int iIntValue2 = p0Var2 != null ? ((Number) eVar.invoke(p0Var2, Integer.valueOf(i10))).intValue() : 0;
        t2.p0 p0Var3 = (t2.p0) qi.l.A0(list);
        int iIntValue3 = p0Var3 != null ? ((Number) eVar.invoke(p0Var3, Integer.valueOf(i10))).intValue() : 0;
        t2.p0 p0Var4 = (t2.p0) qi.l.A0(list2);
        int iIntValue4 = p0Var4 != null ? ((Number) eVar.invoke(p0Var4, Integer.valueOf(i10))).intValue() : 0;
        t2.p0 p0Var5 = (t2.p0) qi.l.A0(list3);
        int iIntValue5 = p0Var5 != null ? ((Number) eVar.invoke(p0Var5, Integer.valueOf(i10))).intValue() : 0;
        int iI0 = rVar.I0(o2.f2512c + o2.f2513d);
        long jB = s3.b.b(0, 0, 0, 0, 15);
        if (s3.a.d(jB)) {
            return s3.a.h(jB);
        }
        return iI0 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }
}
