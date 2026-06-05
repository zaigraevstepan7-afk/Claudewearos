package z6;

import fj.l;
import java.util.ArrayList;
import java.util.List;
import nj.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f20452a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20453b;

    /* renamed from: c, reason: collision with root package name */
    public final List f20454c;

    /* renamed from: d, reason: collision with root package name */
    public final List f20455d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z2, List list, List list2) {
        l.f(str, "name");
        l.f(list, "columns");
        this.f20452a = str;
        this.f20453b = z2;
        this.f20454c = list;
        this.f20455d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                list2.add("ASC");
            }
        }
        this.f20455d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f20452a;
        if (this.f20453b != dVar.f20453b || !l.b(this.f20454c, dVar.f20454c) || !l.b(this.f20455d, dVar.f20455d)) {
            return false;
        }
        String str2 = this.f20452a;
        return nj.l.A0(str2, "index_") ? nj.l.A0(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f20452a;
        return this.f20455d.hashCode() + gk.b.h((((nj.l.A0(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f20453b ? 1 : 0)) * 31, 31, this.f20454c);
    }

    public final String toString() {
        return f.s0(f.u0("\n            |Index {\n            |   name = '" + this.f20452a + "',\n            |   unique = '" + this.f20453b + "',\n            |   columns = {" + u3.a.j(this.f20454c) + "\n            |   orders = {" + u3.a.i(this.f20455d) + "\n            |}\n        "));
    }

    public d(String str, List list) {
        l.f(list, "columns");
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add("ASC");
        }
        this(str, false, list, arrayList);
    }
}
