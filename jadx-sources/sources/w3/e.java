package w3;

import java.util.ArrayList;
import java.util.List;
import t2.f1;
import t2.p0;
import t2.q0;
import t2.r0;
import t2.s0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f18496b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f18497c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18498a;

    public /* synthetic */ e(int i10) {
        this.f18498a = i10;
    }

    @Override // t2.q0
    public final r0 a(s0 s0Var, List list, long j) {
        switch (this.f18498a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    f1 f1VarY = ((p0) list.get(i11)).Y(j);
                    iJ = Math.max(iJ, f1VarY.f15550a);
                    i10 = Math.max(i10, f1VarY.f15551b);
                    arrayList.add(f1VarY);
                }
                if (list.isEmpty()) {
                    iJ = s3.a.j(j);
                    i10 = s3.a.i(j);
                }
                return s0Var.B(iJ, i10, qi.t.f13521a, new s.s(arrayList, 2));
            default:
                int size2 = list.size();
                qi.t tVar = qi.t.f13521a;
                if (size2 == 0) {
                    return s0Var.B(0, 0, tVar, c.f18482f);
                }
                if (size2 == 1) {
                    f1 f1VarY2 = ((p0) list.get(0)).Y(j);
                    return s0Var.B(f1VarY2.f15550a, f1VarY2.f15551b, tVar, new s.w(f1VarY2, 5));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    f1 f1VarY3 = ((p0) list.get(i12)).Y(j);
                    iMax = Math.max(iMax, f1VarY3.f15550a);
                    iMax2 = Math.max(iMax2, f1VarY3.f15551b);
                    arrayList2.add(f1VarY3);
                }
                return s0Var.B(iMax, iMax2, tVar, new s.s(arrayList2, 3));
        }
    }
}
