package g1;

import fj.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import q.b0;
import q.l0;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements List, gj.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7016b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f7015a = i10;
        this.f7016b = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f7015a) {
            case 0:
                ((e) this.f7016b).b(obj);
                break;
            default:
                ((b0) this.f7016b).a(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f7015a) {
            case 0:
                return ((e) this.f7016b).e(i10, collection);
            default:
                l.f(collection, "elements");
                b0 b0Var = (b0) this.f7016b;
                if (i10 < 0 || i10 > b0Var.f13034b) {
                    StringBuilder sbP = gk.b.p(i10, "Index ", " must be in 0..");
                    sbP.append(b0Var.f13034b);
                    r.a.d(sbP.toString());
                    throw null;
                }
                int i11 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + b0Var.f13034b;
                Object[] objArr = b0Var.f13033a;
                if (objArr.length < size) {
                    b0Var.m(size, objArr);
                }
                Object[] objArr2 = b0Var.f13033a;
                if (i10 != b0Var.f13034b) {
                    k.i0(objArr2, collection.size() + i10, objArr2, i10, b0Var.f13034b);
                }
                for (Object obj : collection) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        yd.f.i0();
                        throw null;
                    }
                    objArr2[i11 + i10] = obj;
                    i11 = i12;
                }
                b0Var.f13034b = collection.size() + b0Var.f13034b;
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f7015a) {
            case 0:
                ((e) this.f7016b).h();
                break;
            default:
                ((b0) this.f7016b).d();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f7015a) {
            case 0:
                return ((e) this.f7016b).i(obj);
            default:
                return ((b0) this.f7016b).g(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f7015a) {
            case 0:
                e eVar = (e) this.f7016b;
                eVar.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!eVar.i(it.next())) {
                        break;
                    }
                }
                break;
            default:
                l.f(collection, "elements");
                b0 b0Var = (b0) this.f7016b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (b0Var.g(it2.next()) < 0) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f7015a) {
            case 0:
                f.a(i10, this);
                return ((e) this.f7016b).f7024a[i10];
            default:
                l0.a(i10, this);
                return ((b0) this.f7016b).f(i10);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f7015a) {
            case 0:
                return ((e) this.f7016b).j(obj);
            default:
                return ((b0) this.f7016b).g(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f7015a) {
            case 0:
                return ((e) this.f7016b).f7026c == 0;
            default:
                return ((b0) this.f7016b).h();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7015a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        switch (this.f7015a) {
            case 0:
                e eVar = (e) this.f7016b;
                Object[] objArr = eVar.f7024a;
                for (int i11 = eVar.f7026c - 1; i11 >= 0; i11--) {
                    if (l.b(obj, objArr[i11])) {
                        return i11;
                    }
                }
                return -1;
            default:
                b0 b0Var = (b0) this.f7016b;
                if (obj == null) {
                    Object[] objArr2 = b0Var.f13033a;
                    i10 = b0Var.f13034b - 1;
                    while (-1 < i10) {
                        if (objArr2[i10] != null) {
                            i10--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = b0Var.f13033a;
                i10 = b0Var.f13034b - 1;
                while (-1 < i10) {
                    if (!obj.equals(objArr3[i10])) {
                        i10--;
                    }
                }
                return -1;
                return i10;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f7015a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f7015a) {
            case 0:
                return ((e) this.f7016b).k(obj);
            default:
                return ((b0) this.f7016b).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f7015a) {
            case 0:
                e eVar = (e) this.f7016b;
                eVar.getClass();
                if (!collection.isEmpty()) {
                    int i10 = eVar.f7026c;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eVar.k(it.next());
                    }
                    if (i10 != eVar.f7026c) {
                    }
                }
                break;
            default:
                l.f(collection, "elements");
                b0 b0Var = (b0) this.f7016b;
                b0Var.getClass();
                int i11 = b0Var.f13034b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    b0Var.j(it2.next());
                }
                if (i11 != b0Var.f13034b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f7015a) {
            case 0:
                e eVar = (e) this.f7016b;
                int i10 = eVar.f7026c;
                for (int i11 = i10 - 1; -1 < i11; i11--) {
                    if (!collection.contains(eVar.f7024a[i11])) {
                        eVar.l(i11);
                    }
                }
                if (i10 != eVar.f7026c) {
                }
                break;
            default:
                l.f(collection, "elements");
                b0 b0Var = (b0) this.f7016b;
                b0Var.getClass();
                int i12 = b0Var.f13034b;
                Object[] objArr = b0Var.f13033a;
                for (int i13 = i12 - 1; -1 < i13; i13--) {
                    if (!collection.contains(objArr[i13])) {
                        b0Var.k(i13);
                    }
                }
                if (i12 != b0Var.f13034b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.f7015a) {
            case 0:
                f.a(i10, this);
                Object[] objArr = ((e) this.f7016b).f7024a;
                Object obj2 = objArr[i10];
                objArr[i10] = obj;
                return obj2;
            default:
                l0.a(i10, this);
                return ((b0) this.f7016b).n(i10, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f7015a) {
            case 0:
                return ((e) this.f7016b).f7026c;
            default:
                return ((b0) this.f7016b).f13034b;
        }
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        switch (this.f7015a) {
            case 0:
                f.b(i10, i11, this);
                return new c(this, i10, i11, 0);
            default:
                l0.b(i10, i11, this);
                return new c(this, i10, i11, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f7015a) {
        }
        return fj.k.a(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        switch (this.f7015a) {
            case 0:
                ((e) this.f7016b).a(i10, obj);
                return;
            default:
                b0 b0Var = (b0) this.f7016b;
                if (i10 >= 0 && i10 <= (i11 = b0Var.f13034b)) {
                    int i12 = i11 + 1;
                    Object[] objArr = b0Var.f13033a;
                    if (objArr.length < i12) {
                        b0Var.m(i12, objArr);
                    }
                    Object[] objArr2 = b0Var.f13033a;
                    int i13 = b0Var.f13034b;
                    if (i10 != i13) {
                        k.i0(objArr2, i10 + 1, objArr2, i10, i13);
                    }
                    objArr2[i10] = obj;
                    b0Var.f13034b++;
                    return;
                }
                StringBuilder sbP = gk.b.p(i10, "Index ", " must be in 0..");
                sbP.append(b0Var.f13034b);
                r.a.d(sbP.toString());
                throw null;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f7015a) {
            case 0:
                return new d(i10, 0, this);
            default:
                return new d(i10, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.f7015a) {
            case 0:
                f.a(i10, this);
                return ((e) this.f7016b).l(i10);
            default:
                l0.a(i10, this);
                return ((b0) this.f7016b).k(i10);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f7015a) {
            case 0:
                break;
            default:
                l.f(objArr, "array");
                break;
        }
        return fj.k.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f7015a) {
            case 0:
                e eVar = (e) this.f7016b;
                return eVar.e(eVar.f7026c, collection);
            default:
                l.f(collection, "elements");
                b0 b0Var = (b0) this.f7016b;
                int i10 = b0Var.f13034b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    b0Var.a(it.next());
                }
                return i10 != b0Var.f13034b;
        }
    }
}
