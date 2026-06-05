package v2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q implements List, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final q.b0 f17743a = new q.b0(16);

    /* renamed from: b, reason: collision with root package name */
    public final q.x f17744b = new q.x(16);

    /* renamed from: c, reason: collision with root package name */
    public int f17745c = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r.a.d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = v2.n.a(r0, r1, r1)
            int r2 = r7.f17745c
            int r2 = r2 + 1
            int r3 = yd.f.B(r7)
            if (r2 > r3) goto L44
        L11:
            q.x r4 = r7.f17744b
            if (r2 < 0) goto L3a
            int r5 = r4.f13145b
            if (r2 >= r5) goto L3d
            long[] r4 = r4.f13144a
            r5 = r4[r2]
            int r4 = v2.n.g(r5, r0)
            if (r4 >= 0) goto L24
            r0 = r5
        L24:
            float r4 = v2.n.l(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = v2.n.q(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r0 = "Index must be between 0 and size"
            r.a.d(r0)
            r0 = 0
            throw r0
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.q.b():long");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f17745c = -1;
        this.f17743a.d();
        this.f17744b.f13145b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof v1.n) && indexOf((v1.n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((v1.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f17743a.l(i10, i11);
        q.x xVar = this.f17744b;
        if (i10 >= 0) {
            int i12 = xVar.f13145b;
            if (i10 <= i12 && i11 >= 0 && i11 <= i12) {
                if (i11 < i10) {
                    r.a.c("The end index must be < start index");
                    throw null;
                }
                if (i11 != i10) {
                    if (i11 < i12) {
                        long[] jArr = xVar.f13144a;
                        qi.k.h0(jArr, jArr, i10, i11, i12);
                    }
                    xVar.f13145b -= i11 - i10;
                    return;
                }
                return;
            }
        } else {
            xVar.getClass();
        }
        r.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object objF = this.f17743a.f(i10);
        fj.l.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (v1.n) objF;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof v1.n)) {
            return -1;
        }
        v1.n nVar = (v1.n) obj;
        int iB = yd.f.B(this);
        if (iB >= 0) {
            int i10 = 0;
            while (!fj.l.b(this.f17743a.f(i10), nVar)) {
                if (i10 != iB) {
                    i10++;
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f17743a.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ri.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof v1.n)) {
            return -1;
        }
        v1.n nVar = (v1.n) obj;
        for (int iB = yd.f.B(this); -1 < iB; iB--) {
            if (fj.l.b(this.f17743a.f(iB), nVar)) {
                return iB;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ri.a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f17743a.f13034b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return new p(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fj.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new ri.a(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fj.k.b(this, objArr);
    }
}
