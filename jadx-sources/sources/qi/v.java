package qi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class v extends a.a {
    public static Object f0(HashMap map, Object obj) {
        fj.l.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int g0(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map h0(pi.h hVar) {
        fj.l.f(hVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(hVar.f13000a, hVar.f13001b);
        fj.l.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map i0(pi.h... hVarArr) {
        if (hVarArr.length <= 0) {
            return t.f13521a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(hVarArr.length));
        k0(linkedHashMap, hVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap j0(Map map, Map map2) {
        fj.l.f(map, "<this>");
        fj.l.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void k0(HashMap map, pi.h[] hVarArr) {
        for (pi.h hVar : hVarArr) {
            map.put(hVar.f13000a, hVar.f13001b);
        }
    }

    public static Map l0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return t.f13521a;
        }
        if (size == 1) {
            return h0((pi.h) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(arrayList.size()));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            pi.h hVar = (pi.h) obj;
            linkedHashMap.put(hVar.f13000a, hVar.f13001b);
        }
        return linkedHashMap;
    }

    public static Map m0(Map map) {
        fj.l.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? n0(map) : o0(map) : t.f13521a;
    }

    public static LinkedHashMap n0(Map map) {
        fj.l.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map o0(Map map) {
        fj.l.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        fj.l.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
