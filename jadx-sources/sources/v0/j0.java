package v0;

import java.util.ArrayList;
import java.util.List;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f17407a = new j0();

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
        return s0Var.B(iMax, iMax2, qi.t.f13521a, new g0.x(arrayList, 2));
    }
}
