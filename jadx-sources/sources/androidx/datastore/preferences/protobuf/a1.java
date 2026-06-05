package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f892a;

    /* renamed from: b, reason: collision with root package name */
    public Object f893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f894c;

    public a1(z0 z0Var, Comparable comparable, Object obj) {
        this.f894c = z0Var;
        this.f892a = comparable;
        this.f893b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f892a.compareTo(((a1) obj).f892a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f892a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f893b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f892a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f893b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f892a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f893b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f894c.b();
        Object obj2 = this.f893b;
        this.f893b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f892a + "=" + this.f893b;
    }
}
