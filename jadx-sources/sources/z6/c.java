package z6;

import fj.l;
import java.util.List;
import nj.f;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f20447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20449c;

    /* renamed from: d, reason: collision with root package name */
    public final List f20450d;

    /* renamed from: e, reason: collision with root package name */
    public final List f20451e;

    public c(String str, String str2, String str3, List list, List list2) {
        l.f(str, "referenceTable");
        l.f(str2, "onDelete");
        l.f(str3, "onUpdate");
        l.f(list, "columnNames");
        l.f(list2, "referenceColumnNames");
        this.f20447a = str;
        this.f20448b = str2;
        this.f20449c = str3;
        this.f20450d = list;
        this.f20451e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (l.b(this.f20447a, cVar.f20447a) && l.b(this.f20448b, cVar.f20448b) && l.b(this.f20449c, cVar.f20449c) && l.b(this.f20450d, cVar.f20450d)) {
            return l.b(this.f20451e, cVar.f20451e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20451e.hashCode() + gk.b.h(m1.c(m1.c(this.f20447a.hashCode() * 31, 31, this.f20448b), 31, this.f20449c), 31, this.f20450d);
    }

    public final String toString() {
        return f.s0(f.u0("\n            |ForeignKey {\n            |   referenceTable = '" + this.f20447a + "',\n            |   onDelete = '" + this.f20448b + "',\n            |   onUpdate = '" + this.f20449c + "',\n            |   columnNames = {" + u3.a.j(qi.l.K0(this.f20450d)) + "\n            |   referenceColumnNames = {" + u3.a.i(qi.l.K0(this.f20451e)) + "\n            |}\n        "));
    }
}
