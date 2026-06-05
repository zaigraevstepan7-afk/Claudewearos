package l1;

import java.util.ListIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public int f9849a;

    /* renamed from: b, reason: collision with root package name */
    public int f9850b;

    public a(int i10, int i11) {
        this.f9849a = i10;
        this.f9850b = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9849a < this.f9850b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9849a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9849a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9849a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
