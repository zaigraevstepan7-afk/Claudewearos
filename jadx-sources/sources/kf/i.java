package kf;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements ListIterator, Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f9576a;

    /* renamed from: b, reason: collision with root package name */
    public int f9577b;

    /* renamed from: c, reason: collision with root package name */
    public final k f9578c;

    public i(k kVar, int i10) {
        int size = kVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(u6.v.A(i10, size, "index"));
        }
        this.f9576a = size;
        this.f9577b = i10;
        this.f9578c = kVar;
    }

    public final Object a(int i10) {
        return this.f9578c.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9577b < this.f9576a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9577b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9577b;
        this.f9577b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9577b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9577b - 1;
        this.f9577b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9577b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
