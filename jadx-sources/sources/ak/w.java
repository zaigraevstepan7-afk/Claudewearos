package ak;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final n f735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f736b;

    /* renamed from: c, reason: collision with root package name */
    public final l f737c;

    /* renamed from: d, reason: collision with root package name */
    public final x f738d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f739e;

    /* renamed from: f, reason: collision with root package name */
    public volatile c f740f;

    public w(v vVar) {
        this.f735a = (n) vVar.f730a;
        this.f736b = (String) vVar.f731b;
        yh.c cVar = (yh.c) vVar.f732c;
        cVar.getClass();
        this.f737c = new l(cVar);
        this.f738d = (x) vVar.f733d;
        Map map = (Map) vVar.f734e;
        byte[] bArr = bk.d.f1785a;
        this.f739e = map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final v a() {
        v vVar = new v();
        Object linkedHashMap = Collections.EMPTY_MAP;
        vVar.f734e = linkedHashMap;
        vVar.f730a = this.f735a;
        vVar.f731b = this.f736b;
        vVar.f733d = this.f738d;
        Map map = this.f739e;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        vVar.f734e = linkedHashMap;
        vVar.f732c = this.f737c.e();
        return vVar;
    }

    public final String toString() {
        return "Request{method=" + this.f736b + ", url=" + this.f735a + ", tags=" + this.f739e + '}';
    }
}
