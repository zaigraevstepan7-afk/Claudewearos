package fj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class b implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6787a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f6788b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6789c;

    public b(Object[] objArr) {
        l.f(objArr, "array");
        this.f6789c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6787a) {
            case 0:
                if (this.f6788b < ((Object[]) this.f6789c).length) {
                }
                break;
            default:
                if (this.f6788b < ((qi.d) this.f6789c).b()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6787a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f6789c;
                    int i10 = this.f6788b;
                    this.f6788b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f6788b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                qi.d dVar = (qi.d) this.f6789c;
                int i11 = this.f6788b;
                this.f6788b = i11 + 1;
                return dVar.get(i11);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6787a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(qi.d dVar) {
        this.f6789c = dVar;
    }
}
