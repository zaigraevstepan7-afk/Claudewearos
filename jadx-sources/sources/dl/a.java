package dl;

import fj.l;
import java.util.concurrent.ConcurrentHashMap;
import lj.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f5214a = new ConcurrentHashMap();

    public static final String a(b bVar) {
        l.f(bVar, "<this>");
        ConcurrentHashMap concurrentHashMap = f5214a;
        String str = (String) concurrentHashMap.get(bVar);
        if (str != null) {
            return str;
        }
        String name = cg.b.D(bVar).getName();
        concurrentHashMap.put(bVar, name);
        return name;
    }
}
