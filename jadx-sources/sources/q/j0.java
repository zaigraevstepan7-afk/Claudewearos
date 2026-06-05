package q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 implements gj.e, Set, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f13094a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f13095b;

    public j0(h0 h0Var) {
        this.f13094a = h0Var;
        this.f13095b = h0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f13095b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        fj.l.f(collection, "elements");
        h0 h0Var = this.f13095b;
        int i10 = h0Var.f13084d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h0Var.j(it.next());
        }
        return i10 != h0Var.f13084d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f13095b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13094a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        fj.l.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f13094a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        return fj.l.b(this.f13094a, ((j0) obj).f13094a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f13094a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f13094a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new mj.e(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13095b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        fj.l.f(collection, "elements");
        h0 h0Var = this.f13095b;
        h0Var.getClass();
        int i10 = h0Var.f13084d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h0Var.i(it.next());
        }
        return i10 != h0Var.f13084d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z2;
        fj.l.f(collection, "elements");
        h0 h0Var = this.f13095b;
        h0Var.getClass();
        Object[] objArr = h0Var.f13082b;
        int i10 = h0Var.f13084d;
        long[] jArr = h0Var.f13081a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!qi.l.w0(collection, objArr[i14])) {
                                h0Var.m(i14);
                            }
                        }
                        j >>= 8;
                    }
                    z2 = false;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    z2 = false;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        } else {
            z2 = false;
        }
        if (i10 != h0Var.f13084d) {
            return true;
        }
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f13094a.f13084d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return fj.k.a(this);
    }

    public final String toString() {
        return this.f13094a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        fj.l.f(objArr, "array");
        return fj.k.b(this, objArr);
    }
}
