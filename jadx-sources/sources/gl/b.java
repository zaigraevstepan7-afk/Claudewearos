package gl;

import ac.d;
import ak.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f7553a;

    /* renamed from: b, reason: collision with root package name */
    public final v f7554b;

    public b(String str, v vVar) {
        this.f7553a = str;
        this.f7554b = vVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        al.a aVar = (al.a) this.f7554b.f732c;
        aVar.getClass();
        ConcurrentHashMap concurrentHashMap = aVar.f767c;
        cl.a aVar2 = (cl.a) concurrentHashMap.get(this.f7553a);
        if (aVar2 != null) {
            d dVar = (d) aVar.f765a.f733d;
            dVar.getClass();
            uk.b[] bVarArr = (uk.b[]) ((ConcurrentHashMap) dVar.f374c).values().toArray(new uk.b[0]);
            ArrayList arrayList = new ArrayList();
            for (uk.b bVar : bVarArr) {
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw gk.b.k(it);
            }
            concurrentHashMap.remove(aVar2.f3390b);
        }
    }
}
