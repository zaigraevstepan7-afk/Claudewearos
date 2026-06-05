package m1;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends qi.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f11247a;

    public l(c cVar) {
        this.f11247a = cVar;
    }

    @Override // qi.a
    public final int b() {
        c cVar = this.f11247a;
        cVar.getClass();
        return cVar.f11227b;
    }

    @Override // qi.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11247a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m mVar = this.f11247a.f11226a;
        n[] nVarArr = new n[8];
        for (int i10 = 0; i10 < 8; i10++) {
            nVarArr[i10] = new o(2);
        }
        return new k(mVar, nVarArr);
    }
}
