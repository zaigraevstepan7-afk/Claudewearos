package sk;

import ej.e;
import fj.f;
import fj.l;
import java.util.List;
import qi.s;
import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zk.a f15081a;

    /* renamed from: b, reason: collision with root package name */
    public final f f15082b;

    /* renamed from: c, reason: collision with root package name */
    public final zk.a f15083c;

    /* renamed from: d, reason: collision with root package name */
    public final e f15084d;

    /* renamed from: e, reason: collision with root package name */
    public final b f15085e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15086f;

    public a(zk.a aVar, f fVar, zk.b bVar, e eVar, b bVar2) {
        l.f(aVar, "scopeQualifier");
        this.f15081a = aVar;
        this.f15082b = fVar;
        this.f15083c = bVar;
        this.f15084d = eVar;
        this.f15085e = bVar2;
        this.f15086f = s.f13520a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l.d(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return this.f15082b.equals(aVar.f15082b) && l.b(this.f15083c, aVar.f15083c) && l.b(this.f15081a, aVar.f15081a);
    }

    public final int hashCode() {
        zk.a aVar = this.f15083c;
        return this.f15081a.hashCode() + ((this.f15082b.hashCode() + ((aVar != null ? aVar.hashCode() : 0) * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.f15085e);
        sb2.append(": '");
        sb2.append(dl.a.a(this.f15082b));
        sb2.append('\'');
        zk.a aVar = this.f15083c;
        if (aVar != null) {
            sb2.append(",qualifier:");
            sb2.append(aVar);
        }
        zk.b bVar = al.a.f764e;
        zk.a aVar2 = this.f15081a;
        if (!l.b(aVar2, bVar)) {
            sb2.append(",scope:");
            sb2.append(aVar2);
        }
        if (!this.f15086f.isEmpty()) {
            sb2.append(",binds:");
            qi.l.D0((List) this.f15086f, sb2, ",", new p0(6), 60);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
