package i2;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8239a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f8240b;

    public f0(m1.e eVar) {
        m1.n[] nVarArr = new m1.n[8];
        for (int i10 = 0; i10 < 8; i10++) {
            nVarArr[i10] = new m1.p(this);
        }
        this.f8240b = new m1.f(eVar, nVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8239a) {
            case 0:
                return this.f8240b.hasNext();
            default:
                return ((m1.f) this.f8240b).f11230c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8239a) {
            case 0:
                return (i0) this.f8240b.next();
            default:
                return (Map.Entry) ((m1.f) this.f8240b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8239a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((m1.f) this.f8240b).remove();
                return;
        }
    }

    public f0(g0 g0Var) {
        this.f8240b = g0Var.C.iterator();
    }
}
