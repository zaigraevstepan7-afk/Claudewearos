package m1;

import i2.f0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends a implements gj.c {

    /* renamed from: d, reason: collision with root package name */
    public final f0 f11223d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11224e;

    public b(f0 f0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f11223d = f0Var;
        this.f11224e = obj2;
    }

    @Override // m1.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f11224e;
    }

    @Override // m1.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f11224e;
        this.f11224e = obj;
        f fVar = (f) this.f11223d.f8240b;
        e eVar = fVar.f11237d;
        Object obj3 = this.f11221b;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z2 = fVar.f11230c;
        if (!z2) {
            eVar.put(obj3, obj);
        } else {
            if (!z2) {
                throw new NoSuchElementException();
            }
            n nVar = fVar.f11228a[fVar.f11229b];
            Object obj4 = nVar.f11253a[nVar.f11255c];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f11233c, obj4, 0);
        }
        fVar.f11240z = eVar.f11235e;
        return obj2;
    }
}
