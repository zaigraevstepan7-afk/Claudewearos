package kg;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements ih.b, ih.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9633a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f9634b;

    /* renamed from: c, reason: collision with root package name */
    public final lg.l f9635c;

    public l() {
        lg.l lVar = lg.l.f10970a;
        this.f9633a = new HashMap();
        this.f9634b = new ArrayDeque();
        this.f9635c = lVar;
    }

    public final void a(vf.j jVar) {
        lg.l lVar = this.f9635c;
        synchronized (this) {
            try {
                lVar.getClass();
                if (!this.f9633a.containsKey(cg.b.class)) {
                    this.f9633a.put(cg.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f9633a.get(cg.b.class)).put(jVar, lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
