package yk;

import fj.f;
import fj.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f20333a;

    /* renamed from: b, reason: collision with root package name */
    public int f20334b;

    public a(ArrayList arrayList, int i10) {
        this.f20333a = (i10 & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(f fVar) {
        Object next;
        List list = this.f20333a;
        if (list.isEmpty()) {
            return null;
        }
        int i10 = this.f20334b;
        List list2 = this.f20333a;
        Object obj = list2.get(i10);
        if (!fVar.d(obj)) {
            obj = null;
        }
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null && this.f20334b < yd.f.B(list2)) {
            this.f20334b++;
        }
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fVar.d(next)) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        return next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return l.b(this.f20333a, ((a) obj).f20333a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20333a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + qi.l.R0(this.f20333a);
    }
}
