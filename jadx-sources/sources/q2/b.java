package q2;

import h8.j;
import java.util.LinkedHashMap;
import java.util.Map;
import q8.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f13182a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13183b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13184c;

    public b(long j, k4.d dVar) {
        this.f13182a = j;
        this.f13183b = dVar;
        this.f13184c = new e(this, j);
    }

    public void a(long j, long j4) {
        ((d) this.f13183b).a(j, Float.intBitsToFloat((int) (j4 >> 32)));
        ((d) this.f13184c).a(j, Float.intBitsToFloat((int) (j4 & 4294967295L)));
    }

    public void b(q8.a aVar, j jVar, Map map, long j) {
        e eVar = (e) this.f13184c;
        long j4 = eVar.f13304b;
        LinkedHashMap linkedHashMap = eVar.f13303a;
        if (j > j4) {
            Object objRemove = linkedHashMap.remove(aVar);
            if (objRemove != null) {
                eVar.f13305c = eVar.b() - eVar.c(aVar, objRemove);
                eVar.a(aVar, objRemove, null);
            }
            ((k4.d) this.f13183b).i(aVar, jVar, map, j);
            return;
        }
        q8.d dVar = new q8.d(jVar, map, j);
        Object objPut = linkedHashMap.put(aVar, dVar);
        eVar.f13305c = eVar.c(aVar, dVar) + eVar.b();
        if (objPut != null) {
            eVar.f13305c = eVar.b() - eVar.c(aVar, objPut);
            eVar.a(aVar, objPut, dVar);
        }
        eVar.d(eVar.f13304b);
    }

    public b() {
        c cVar = c.f13185a;
        this.f13183b = new d();
        this.f13184c = new d();
    }
}
