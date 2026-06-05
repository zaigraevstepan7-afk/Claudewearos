package i1;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f8103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8104b;

    /* renamed from: c, reason: collision with root package name */
    public int f8105c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8106d;

    public d(h hVar, int i10, int i11) {
        this.f8103a = hVar;
        this.f8104b = i11;
        this.f8105c = i10;
        this.f8106d = hVar.A;
        if (hVar.f8132z) {
            j.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8105c < this.f8104b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        h hVar = this.f8103a;
        int i10 = hVar.A;
        int i11 = this.f8106d;
        if (i10 != i11) {
            j.f();
        }
        int i12 = this.f8105c;
        this.f8105c = hVar.f8126a[(i12 * 5) + 3] + i12;
        return new i(hVar, i12, i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
