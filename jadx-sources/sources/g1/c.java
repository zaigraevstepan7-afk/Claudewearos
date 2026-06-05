package g1;

import fj.k;
import fj.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import q.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements List, gj.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7017a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7019c;

    /* renamed from: d, reason: collision with root package name */
    public int f7020d;

    public /* synthetic */ c(List list, int i10, int i11, int i12) {
        this.f7017a = i12;
        this.f7018b = list;
        this.f7019c = i10;
        this.f7020d = i11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d;
                this.f7020d = i10 + 1;
                this.f7018b.add(i10, obj);
                break;
            default:
                int i11 = this.f7020d;
                this.f7020d = i11 + 1;
                this.f7018b.add(i11, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f7017a) {
            case 0:
                this.f7018b.addAll(i10 + this.f7019c, collection);
                int size = collection.size();
                this.f7020d += size;
                if (size > 0) {
                }
                break;
            default:
                l.f(collection, "elements");
                this.f7018b.addAll(i10 + this.f7019c, collection);
                this.f7020d = collection.size() + this.f7020d;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d - 1;
                int i11 = this.f7019c;
                if (i11 <= i10) {
                    while (true) {
                        this.f7018b.remove(i10);
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                this.f7020d = i11;
                break;
            default:
                int i12 = this.f7020d - 1;
                int i13 = this.f7019c;
                if (i13 <= i12) {
                    while (true) {
                        this.f7018b.remove(i12);
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                }
                this.f7020d = i13;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d;
                for (int i11 = this.f7019c; i11 < i10; i11++) {
                    if (l.b(this.f7018b.get(i11), obj)) {
                        break;
                    }
                }
                break;
            default:
                int i12 = this.f7020d;
                for (int i13 = this.f7019c; i13 < i12; i13++) {
                    if (l.b(this.f7018b.get(i13), obj)) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f7017a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                l.f(collection, "elements");
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f7017a) {
            case 0:
                f.a(i10, this);
                return this.f7018b.get(i10 + this.f7019c);
            default:
                l0.a(i10, this);
                return this.f7018b.get(i10 + this.f7019c);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d;
                int i11 = this.f7019c;
                for (int i12 = i11; i12 < i10; i12++) {
                    if (l.b(this.f7018b.get(i12), obj)) {
                        return i12 - i11;
                    }
                }
                return -1;
            default:
                int i13 = this.f7020d;
                int i14 = this.f7019c;
                for (int i15 = i14; i15 < i13; i15++) {
                    if (l.b(this.f7018b.get(i15), obj)) {
                        return i15 - i14;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f7017a) {
            case 0:
                if (this.f7020d == this.f7019c) {
                }
                break;
            default:
                if (this.f7020d == this.f7019c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7017a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d - 1;
                int i11 = this.f7019c;
                if (i11 <= i10) {
                    while (!l.b(this.f7018b.get(i10), obj)) {
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                    return i10 - i11;
                }
                return -1;
            default:
                int i12 = this.f7020d - 1;
                int i13 = this.f7019c;
                if (i13 <= i12) {
                    while (!l.b(this.f7018b.get(i12), obj)) {
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                    return i12 - i13;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f7017a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d;
                for (int i11 = this.f7019c; i11 < i10; i11++) {
                    ?? r2 = this.f7018b;
                    if (l.b(r2.get(i11), obj)) {
                        r2.remove(i11);
                        this.f7020d--;
                        break;
                    }
                }
                break;
            default:
                int i12 = this.f7020d;
                for (int i13 = this.f7019c; i13 < i12; i13++) {
                    ?? r22 = this.f7018b;
                    if (l.b(r22.get(i13), obj)) {
                        r22.remove(i13);
                        this.f7020d--;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i10 != this.f7020d) {
                }
                break;
            default:
                l.f(collection, "elements");
                int i11 = this.f7020d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i11 != this.f7020d) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f7017a) {
            case 0:
                int i10 = this.f7020d;
                int i11 = i10 - 1;
                int i12 = this.f7019c;
                if (i12 <= i11) {
                    while (true) {
                        ?? r32 = this.f7018b;
                        if (!collection.contains(r32.get(i11))) {
                            r32.remove(i11);
                            this.f7020d--;
                        }
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                if (i10 != this.f7020d) {
                }
                break;
            default:
                l.f(collection, "elements");
                int i13 = this.f7020d;
                int i14 = i13 - 1;
                int i15 = this.f7019c;
                if (i15 <= i14) {
                    while (true) {
                        ?? r33 = this.f7018b;
                        if (!collection.contains(r33.get(i14))) {
                            r33.remove(i14);
                            this.f7020d--;
                        }
                        if (i14 != i15) {
                            i14--;
                        }
                    }
                }
                if (i13 != this.f7020d) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.f7017a) {
            case 0:
                f.a(i10, this);
                return this.f7018b.set(i10 + this.f7019c, obj);
            default:
                l0.a(i10, this);
                return this.f7018b.set(i10 + this.f7019c, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i10;
        int i11;
        switch (this.f7017a) {
            case 0:
                i10 = this.f7020d;
                i11 = this.f7019c;
                break;
            default:
                i10 = this.f7020d;
                i11 = this.f7019c;
                break;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        switch (this.f7017a) {
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
        switch (this.f7017a) {
        }
        return k.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i10, Object obj) {
        switch (this.f7017a) {
            case 0:
                this.f7018b.add(i10 + this.f7019c, obj);
                this.f7020d++;
                break;
            default:
                this.f7018b.add(i10 + this.f7019c, obj);
                this.f7020d++;
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f7017a) {
            case 0:
                return new d(i10, 0, this);
            default:
                return new d(i10, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f7017a) {
            case 0:
                break;
            default:
                l.f(objArr, "array");
                break;
        }
        return k.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f7017a) {
            case 0:
                this.f7018b.addAll(this.f7020d, collection);
                int size = collection.size();
                this.f7020d += size;
                if (size > 0) {
                }
                break;
            default:
                l.f(collection, "elements");
                this.f7018b.addAll(this.f7020d, collection);
                this.f7020d = collection.size() + this.f7020d;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.f7017a) {
            case 0:
                f.a(i10, this);
                this.f7020d--;
                return this.f7018b.remove(i10 + this.f7019c);
            default:
                l0.a(i10, this);
                this.f7020d--;
                return this.f7018b.remove(i10 + this.f7019c);
        }
    }
}
