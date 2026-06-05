package q8;

import java.util.LinkedHashMap;
import java.util.Map;
import qi.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13303a = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public long f13304b;

    /* renamed from: c, reason: collision with root package name */
    public long f13305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q2.b f13306d;

    public e(q2.b bVar, long j) {
        this.f13306d = bVar;
        this.f13304b = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public final void a(Object obj, Object obj2, d dVar) {
        d dVar2 = (d) obj2;
        ((k4.d) this.f13306d.f13183b).i((a) obj, dVar2.f13300a, dVar2.f13301b, dVar2.f13302c);
    }

    public final long b() {
        if (this.f13305c == -1) {
            long jC = 0;
            for (Map.Entry entry : this.f13303a.entrySet()) {
                jC += c(entry.getKey(), entry.getValue());
            }
            this.f13305c = jC;
        }
        return this.f13305c;
    }

    public final long c(Object obj, Object obj2) throws Exception {
        try {
            long j = ((d) obj2).f13302c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e10) {
            this.f13305c = -1L;
            throw e10;
        }
    }

    public final void d(long j) {
        while (b() > j) {
            LinkedHashMap linkedHashMap = this.f13303a;
            if (linkedHashMap.isEmpty()) {
                if (b() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) l.y0(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f13305c = b() - c(key, value);
            a(key, value, null);
        }
    }
}
