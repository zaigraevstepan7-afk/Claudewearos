package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1062a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1063b;

    public b(HashMap map) {
        this.f1063b = map;
        for (Map.Entry entry : map.entrySet()) {
            n nVar = (n) entry.getValue();
            List arrayList = (List) this.f1062a.get(nVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1062a.put(nVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, t tVar, n nVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f1075b;
                try {
                    int i10 = cVar.f1074a;
                    if (i10 == 0) {
                        method.invoke(obj, null);
                    } else if (i10 == 1) {
                        method.invoke(obj, tVar);
                    } else if (i10 == 2) {
                        method.invoke(obj, tVar, nVar);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
