package og;

import java.util.Iterator;
import java.util.Map;
import zg.p;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12514a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f12515b;

    public /* synthetic */ e(Iterator it, int i10) {
        this.f12514a = i10;
        this.f12515b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12514a) {
        }
        return this.f12515b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12514a) {
            case 0:
                return ((Map.Entry) this.f12515b.next()).getKey();
            default:
                Map.Entry entry = (Map.Entry) this.f12515b.next();
                return new p((zg.c) entry.getKey(), (r) entry.getValue());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12514a) {
            case 0:
                this.f12515b.remove();
                break;
            default:
                this.f12515b.remove();
                break;
        }
    }
}
