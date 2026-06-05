package pg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12904b;

    public i(q qVar, n nVar) {
        this.f12904b = qVar;
        this.f12903a = nVar;
    }

    @Override // pg.k
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean zEquals = str.equals("ok");
        q qVar = this.f12904b;
        n nVar = this.f12903a;
        if (zEquals) {
            Map map2 = (Map) map.get("d");
            if (map2.containsKey("w")) {
                List list = (List) map2.get("w");
                p pVar = nVar.f12916b;
                if (list.contains("no_index")) {
                    String str2 = "\".indexOn\": \"" + pVar.f12924b.get("i") + '\"';
                    p1.l lVar = qVar.f12948y;
                    StringBuilder sbK = m6.a.k("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '", str2, "' at ");
                    sbK.append(hj.a.E(pVar.f12923a));
                    sbK.append(" to your security and Firebase Database rules for better performance");
                    lVar.J(sbK.toString());
                }
            }
        }
        HashMap map3 = qVar.f12939p;
        p pVar2 = nVar.f12916b;
        qh.c cVar = nVar.f12915a;
        if (((n) map3.get(pVar2)) == nVar) {
            if (str.equals("ok")) {
                cVar.b(null, null);
            } else {
                qVar.f(nVar.f12916b);
                cVar.b(str, (String) map.get("d"));
            }
        }
    }
}
