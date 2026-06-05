package qi;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends fj.b implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f13509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(dVar);
        this.f13509d = dVar;
        int iB = dVar.b();
        if (i10 < 0 || i10 > iB) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, iB, "index: ", ", size: "));
        }
        this.f6788b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6788b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6788b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6788b - 1;
        this.f6788b = i10;
        return this.f13509d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6788b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
