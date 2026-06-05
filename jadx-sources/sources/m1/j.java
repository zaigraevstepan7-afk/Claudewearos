package m1;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends qi.h implements k1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11245a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11246b;

    public /* synthetic */ j(c cVar, int i10) {
        this.f11245a = i10;
        this.f11246b = cVar;
    }

    @Override // qi.a
    public final int b() {
        switch (this.f11245a) {
            case 0:
                c cVar = this.f11246b;
                cVar.getClass();
                return cVar.f11227b;
            default:
                c cVar2 = this.f11246b;
                cVar2.getClass();
                return cVar2.f11227b;
        }
    }

    @Override // qi.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f11245a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                c cVar = this.f11246b;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f11246b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f11245a) {
            case 0:
                m mVar = this.f11246b.f11226a;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(0);
                }
                return new k(mVar, nVarArr);
            default:
                m mVar2 = this.f11246b.f11226a;
                n[] nVarArr2 = new n[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    nVarArr2[i11] = new o(1);
                }
                return new k(mVar2, nVarArr2);
        }
    }
}
