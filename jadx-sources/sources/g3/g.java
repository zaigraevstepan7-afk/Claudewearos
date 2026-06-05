package g3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7099a = new f("");

    public static final List a(f fVar, int i10, int i11, fb.e eVar) {
        List list;
        if (i10 == i11 || (list = fVar.f7080a) == null) {
            return null;
        }
        if (i10 != 0 || i11 < fVar.f7081b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) list.get(i12);
                if ((eVar != null ? ((Boolean) eVar.invoke(dVar.f7045a)).booleanValue() : true) && b(i10, i11, dVar.f7046b, dVar.f7047c)) {
                    arrayList.add(new d((a) dVar.f7045a, cg.b.p(dVar.f7046b, i10, i11) - i10, cg.b.p(dVar.f7047c, i10, i11) - i10, dVar.f7048d));
                }
            }
            return arrayList;
        }
        if (eVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = list.get(i13);
            if (((Boolean) eVar.invoke(((d) obj).f7045a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
