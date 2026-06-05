package ri;

import fj.l;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import q.b0;
import t1.r;
import v1.n;
import v2.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements ListIterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14517a;

    /* renamed from: b, reason: collision with root package name */
    public int f14518b;

    /* renamed from: c, reason: collision with root package name */
    public int f14519c;

    /* renamed from: d, reason: collision with root package name */
    public int f14520d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14521e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(q qVar, int i10, int i11) {
        this(qVar, (i11 & 1) != 0 ? 0 : i10, 0, qVar.f17743a.f13034b);
        this.f14517a = 3;
    }

    public void a() {
        if (((AbstractList) ((b) this.f14521e).f14526e).modCount != this.f14520d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f14517a) {
            case 0:
                a();
                b bVar = (b) this.f14521e;
                int i10 = this.f14518b;
                this.f14518b = i10 + 1;
                bVar.add(i10, obj);
                this.f14519c = -1;
                this.f14520d = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                c cVar = (c) this.f14521e;
                int i11 = this.f14518b;
                this.f14518b = i11 + 1;
                cVar.add(i11, obj);
                this.f14519c = -1;
                this.f14520d = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                t1.q qVar = (t1.q) this.f14521e;
                qVar.add(this.f14518b + 1, obj);
                this.f14519c = -1;
                this.f14518b++;
                this.f14520d = r.j(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f14521e)).modCount != this.f14520d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (r.j((t1.q) this.f14521e) != this.f14520d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14517a) {
            case 0:
                return this.f14518b < ((b) this.f14521e).f14524c;
            case 1:
                return this.f14518b < ((c) this.f14521e).f14529b;
            case 2:
                return this.f14518b < ((t1.q) this.f14521e).size() - 1;
            default:
                return this.f14518b < this.f14520d;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f14517a) {
            case 0:
                if (this.f14518b > 0) {
                }
                break;
            case 1:
                if (this.f14518b > 0) {
                }
                break;
            case 2:
                if (this.f14518b >= 0) {
                }
                break;
            default:
                if (this.f14518b > this.f14519c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f14517a) {
            case 0:
                a();
                int i10 = this.f14518b;
                b bVar = (b) this.f14521e;
                if (i10 >= bVar.f14524c) {
                    throw new NoSuchElementException();
                }
                this.f14518b = i10 + 1;
                this.f14519c = i10;
                return bVar.f14522a[bVar.f14523b + i10];
            case 1:
                b();
                int i11 = this.f14518b;
                c cVar = (c) this.f14521e;
                if (i11 >= cVar.f14529b) {
                    throw new NoSuchElementException();
                }
                this.f14518b = i11 + 1;
                this.f14519c = i11;
                return cVar.f14528a[i11];
            case 2:
                c();
                int i12 = this.f14518b + 1;
                this.f14519c = i12;
                t1.q qVar = (t1.q) this.f14521e;
                r.a(i12, qVar.size());
                Object obj = qVar.get(i12);
                this.f14518b = i12;
                return obj;
            default:
                b0 b0Var = ((q) this.f14521e).f17743a;
                int i13 = this.f14518b;
                this.f14518b = i13 + 1;
                Object objF = b0Var.f(i13);
                l.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (n) objF;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f14517a) {
            case 0:
                return this.f14518b;
            case 1:
                return this.f14518b;
            case 2:
                return this.f14518b + 1;
            default:
                return this.f14518b - this.f14519c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f14517a) {
            case 0:
                a();
                int i10 = this.f14518b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f14518b = i11;
                this.f14519c = i11;
                b bVar = (b) this.f14521e;
                return bVar.f14522a[bVar.f14523b + i11];
            case 1:
                b();
                int i12 = this.f14518b;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f14518b = i13;
                this.f14519c = i13;
                return ((c) this.f14521e).f14528a[i13];
            case 2:
                c();
                int i14 = this.f14518b;
                t1.q qVar = (t1.q) this.f14521e;
                r.a(i14, qVar.size());
                int i15 = this.f14518b;
                this.f14519c = i15;
                this.f14518b--;
                return qVar.get(i15);
            default:
                b0 b0Var = ((q) this.f14521e).f17743a;
                int i16 = this.f14518b - 1;
                this.f14518b = i16;
                Object objF = b0Var.f(i16);
                l.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (n) objF;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f14517a) {
            case 0:
                i10 = this.f14518b;
                break;
            case 1:
                i10 = this.f14518b;
                break;
            case 2:
                return this.f14518b;
            default:
                i10 = this.f14518b - this.f14519c;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f14517a) {
            case 0:
                b bVar = (b) this.f14521e;
                a();
                int i10 = this.f14519c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.e(i10);
                this.f14518b = this.f14519c;
                this.f14519c = -1;
                this.f14520d = ((AbstractList) bVar).modCount;
                return;
            case 1:
                c cVar = (c) this.f14521e;
                b();
                int i11 = this.f14519c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.e(i11);
                this.f14518b = this.f14519c;
                this.f14519c = -1;
                this.f14520d = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                t1.q qVar = (t1.q) this.f14521e;
                qVar.remove(this.f14519c);
                this.f14518b--;
                this.f14519c = -1;
                this.f14520d = r.j(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f14517a) {
            case 0:
                a();
                int i10 = this.f14519c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f14521e).set(i10, obj);
                return;
            case 1:
                b();
                int i11 = this.f14519c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f14521e).set(i11, obj);
                return;
            case 2:
                t1.q qVar = (t1.q) this.f14521e;
                c();
                int i12 = this.f14519c;
                if (i12 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                qVar.set(i12, obj);
                this.f14520d = r.j(qVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i10) {
        this.f14517a = 1;
        this.f14521e = cVar;
        this.f14518b = i10;
        this.f14519c = -1;
        this.f14520d = ((AbstractList) cVar).modCount;
    }

    public a(t1.q qVar, int i10) {
        this.f14517a = 2;
        this.f14521e = qVar;
        this.f14518b = i10 - 1;
        this.f14519c = -1;
        this.f14520d = r.j(qVar);
    }

    public a(q qVar, int i10, int i11, int i12) {
        this.f14517a = 3;
        this.f14521e = qVar;
        this.f14518b = i10;
        this.f14519c = i11;
        this.f14520d = i12;
    }

    public a(b bVar, int i10) {
        this.f14517a = 0;
        this.f14521e = bVar;
        this.f14518b = i10;
        this.f14519c = -1;
        this.f14520d = ((AbstractList) bVar).modCount;
    }
}
