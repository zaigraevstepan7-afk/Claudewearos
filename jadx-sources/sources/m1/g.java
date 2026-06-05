package m1;

import i2.f0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends qi.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11241a;

    /* renamed from: b, reason: collision with root package name */
    public final e f11242b;

    public /* synthetic */ g(int i10, e eVar) {
        this.f11241a = i10;
        this.f11242b = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f11241a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // qi.g
    public final int b() {
        switch (this.f11241a) {
            case 0:
                e eVar = this.f11242b;
                eVar.getClass();
                return eVar.f11236f;
            default:
                e eVar2 = this.f11242b;
                eVar2.getClass();
                return eVar2.f11236f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f11241a) {
            case 0:
                this.f11242b.clear();
                break;
            default:
                this.f11242b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f11241a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = this.f11242b;
                Object obj2 = eVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f11242b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f11241a) {
            case 0:
                return new f0(this.f11242b);
            default:
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(1);
                }
                return new h(this.f11242b, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f11241a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f11242b.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.f11242b;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
