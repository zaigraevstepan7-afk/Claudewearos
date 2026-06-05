package m1;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f11253a = m.f11248e.f11252d;

    /* renamed from: b, reason: collision with root package name */
    public int f11254b;

    /* renamed from: c, reason: collision with root package name */
    public int f11255c;

    public final void a(Object[] objArr, int i10, int i11) {
        this.f11253a = objArr;
        this.f11254b = i10;
        this.f11255c = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11255c < this.f11254b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
