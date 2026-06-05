package wk;

import fj.f;
import fj.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import mk.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19418a = b.s();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f19419b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f19420c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f19421d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f19422e = new ArrayList();

    public final void a(uk.b bVar) {
        String value;
        sk.a aVar = bVar.f17136a;
        f fVar = aVar.f15082b;
        zk.a aVar2 = aVar.f15083c;
        zk.a aVar3 = aVar.f15081a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dl.a.a(fVar));
        sb2.append(':');
        if (aVar2 == null || (value = aVar2.getValue()) == null) {
            value = "";
        }
        sb2.append(value);
        sb2.append(':');
        sb2.append(aVar3);
        String string = sb2.toString();
        l.f(string, "mapping");
        this.f19420c.put(string, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return l.b(this.f19418a, ((a) obj).f19418a);
    }

    public final int hashCode() {
        return this.f19418a.hashCode();
    }
}
