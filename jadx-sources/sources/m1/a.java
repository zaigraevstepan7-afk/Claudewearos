package m1;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class a implements Map.Entry, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11220a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11221b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11222c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f11220a = i10;
        this.f11221b = obj;
        this.f11222c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f11220a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && fj.l.b(entry.getKey(), this.f11221b) && fj.l.b(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f11220a) {
        }
        return this.f11221b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f11220a) {
        }
        return this.f11222c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f11220a) {
            case 0:
                Object obj = this.f11221b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f11220a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f11220a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f11221b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
