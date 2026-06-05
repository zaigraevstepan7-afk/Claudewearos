package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import rg.a;
import t7.f;
import t7.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // t7.h
    public final f a(ArrayList arrayList) throws Throwable {
        a aVar = new a(1);
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            map.putAll(Collections.unmodifiableMap(((f) obj).f16115a));
        }
        aVar.a(map);
        f fVar = new f(aVar.f14380a);
        f.c(fVar);
        return fVar;
    }
}
