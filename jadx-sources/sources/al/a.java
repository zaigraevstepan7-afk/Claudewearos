package al;

import ak.v;
import fj.l;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import zk.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final b f764e = new b("_root_");

    /* renamed from: a, reason: collision with root package name */
    public final v f765a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f766b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f767c;

    /* renamed from: d, reason: collision with root package name */
    public final cl.a f768d;

    public a(v vVar) {
        this.f765a = vVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        l.e(setNewSetFromMap, "newSetFromMap(...)");
        this.f766b = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f767c = concurrentHashMap;
        b bVar = f764e;
        cl.a aVar = new cl.a(bVar, "_root_", null, vVar, 8);
        this.f768d = aVar;
        setNewSetFromMap.add(bVar);
        concurrentHashMap.put("_root_", aVar);
    }
}
