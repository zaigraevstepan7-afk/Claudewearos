package t2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i1 extends v2.c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f15578b = new i1("Undefined intrinsics block and it is required");

    @Override // t2.q0
    public final r0 a(s0 s0Var, List list, long j) {
        int size = list.size();
        qi.t tVar = qi.t.f13521a;
        if (size == 0) {
            return s0Var.B(s3.a.j(j), s3.a.i(j), tVar, g1.f15561c);
        }
        if (size == 1) {
            f1 f1VarY = ((p0) list.get(0)).Y(j);
            return s0Var.B(s3.b.g(f1VarY.f15550a, j), s3.b.f(f1VarY.f15551b, j), tVar, new s.w(f1VarY, 3));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            f1 f1VarY2 = ((p0) list.get(i10)).Y(j);
            iMax = Math.max(f1VarY2.f15550a, iMax);
            iMax2 = Math.max(f1VarY2.f15551b, iMax2);
            arrayList.add(f1VarY2);
        }
        return s0Var.B(s3.b.g(iMax, j), s3.b.f(iMax2, j), tVar, new s.s(arrayList, 1));
    }
}
