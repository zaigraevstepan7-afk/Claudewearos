package ec;

import android.util.SparseArray;
import java.util.HashMap;
import rb.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f5918a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f5919b;

    static {
        HashMap map = new HashMap();
        f5919b = map;
        map.put(d.f14317a, 0);
        map.put(d.f14318b, 1);
        map.put(d.f14319c, 2);
        for (d dVar : map.keySet()) {
            f5918a.append(((Integer) f5919b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f5919b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f5918a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(m6.a.d(i10, "Unknown Priority for value "));
    }
}
