package kj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9669b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9670c;

    /* renamed from: d, reason: collision with root package name */
    public int f9671d;

    public g(int i10, int i11, int i12) {
        this.f9668a = i12;
        this.f9669b = i11;
        boolean z2 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z2 = true;
        }
        this.f9670c = z2;
        this.f9671d = z2 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9670c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i10 = this.f9671d;
        if (i10 != this.f9669b) {
            this.f9671d = this.f9668a + i10;
            return i10;
        }
        if (!this.f9670c) {
            throw new NoSuchElementException();
        }
        this.f9670c = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
