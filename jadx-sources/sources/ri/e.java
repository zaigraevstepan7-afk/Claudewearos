package ri;

import fj.l;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements Map.Entry, gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final g f14532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14534c;

    public e(g gVar, int i10) {
        l.f(gVar, "map");
        this.f14532a = gVar;
        this.f14533b = i10;
        this.f14534c = gVar.A;
    }

    public final void a() {
        if (this.f14532a.A != this.f14534c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.b(entry.getKey(), getKey()) && l.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f14532a.f14539a[this.f14533b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f14532a.f14540b;
        l.c(objArr);
        return objArr[this.f14533b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        g gVar = this.f14532a;
        gVar.c();
        Object[] objArr = gVar.f14540b;
        if (objArr == null) {
            int length = gVar.f14539a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f14540b = objArr;
        }
        int i10 = this.f14533b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
