package o;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12355a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12356b;

    /* renamed from: c, reason: collision with root package name */
    public c f12357c;

    /* renamed from: d, reason: collision with root package name */
    public c f12358d;

    public c(Object obj, Object obj2) {
        this.f12355a = obj;
        this.f12356b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12355a.equals(cVar.f12355a) && this.f12356b.equals(cVar.f12356b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12355a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12356b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12355a.hashCode() ^ this.f12356b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12355a + "=" + this.f12356b;
    }
}
