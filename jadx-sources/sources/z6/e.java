package z6;

import fj.l;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import nj.f;
import qi.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f20456a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20457b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f20458c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f20459d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        l.f(abstractSet, "foreignKeys");
        this.f20456a = str;
        this.f20457b = map;
        this.f20458c = abstractSet;
        this.f20459d = abstractSet2;
    }

    public static final e a(g7.b bVar, String str) {
        return u2.b.p(new h7.a(bVar), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f20456a.equals(eVar.f20456a) || !this.f20457b.equals(eVar.f20457b) || !l.b(this.f20458c, eVar.f20458c)) {
            return false;
        }
        Set set2 = this.f20459d;
        if (set2 == null || (set = eVar.f20459d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f20458c.hashCode() + ((this.f20457b.hashCode() + (this.f20456a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        Collection collectionL0;
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f20456a);
        sb2.append("',\n            |    columns = {");
        sb2.append(u3.a.d(qi.l.L0(new ea.e(16), this.f20457b.values())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(u3.a.d(this.f20458c));
        sb2.append("\n            |    indices = {");
        Set set = this.f20459d;
        if (set != null) {
            collectionL0 = qi.l.L0(new ea.e(17), set);
        } else {
            collectionL0 = s.f13520a;
        }
        sb2.append(u3.a.d(collectionL0));
        sb2.append("\n            |}\n        ");
        return f.u0(sb2.toString());
    }
}
