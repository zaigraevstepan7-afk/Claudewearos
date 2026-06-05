package t2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface q0 {
    r0 a(s0 s0Var, List list, long j);

    default int f(r rVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j((p0) list.get(i11), s.f15632a, t.f15636b, 0));
        }
        return a(new v(rVar, rVar.getLayoutDirection()), arrayList, s3.b.b(0, i10, 0, 0, 13)).getHeight();
    }

    default int g(r rVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j((p0) list.get(i11), s.f15632a, t.f15635a, 0));
        }
        return a(new v(rVar, rVar.getLayoutDirection()), arrayList, s3.b.b(0, 0, 0, i10, 7)).getWidth();
    }

    default int h(r rVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j((p0) list.get(i11), s.f15633b, t.f15635a, 0));
        }
        return a(new v(rVar, rVar.getLayoutDirection()), arrayList, s3.b.b(0, 0, 0, i10, 7)).getWidth();
    }

    default int i(r rVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j((p0) list.get(i11), s.f15633b, t.f15636b, 0));
        }
        return a(new v(rVar, rVar.getLayoutDirection()), arrayList, s3.b.b(0, i10, 0, 0, 13)).getHeight();
    }
}
