package m1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, gj.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11243a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11244b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f11243a = i10;
        this.f11244b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f11243a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f11243a) {
            case 1:
                fj.l.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f11243a) {
            case 0:
                ((e) this.f11244b).clear();
                break;
            default:
                ((ri.g) this.f11244b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f11243a) {
            case 0:
                return ((e) this.f11244b).containsValue(obj);
            default:
                return ((ri.g) this.f11244b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f11243a) {
            case 1:
                return ((ri.g) this.f11244b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f11243a) {
            case 0:
                e eVar = (e) this.f11244b;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(2);
                }
                return new h(eVar, nVarArr);
            default:
                ri.g gVar = (ri.g) this.f11244b;
                gVar.getClass();
                return new ri.d(gVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f11243a) {
            case 1:
                ri.g gVar = (ri.g) this.f11244b;
                gVar.c();
                int i10 = gVar.i(obj);
                if (i10 < 0) {
                    return false;
                }
                gVar.l(i10);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f11243a) {
            case 1:
                fj.l.f(collection, "elements");
                ((ri.g) this.f11244b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f11243a) {
            case 1:
                fj.l.f(collection, "elements");
                ((ri.g) this.f11244b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f11243a) {
            case 0:
                e eVar = (e) this.f11244b;
                eVar.getClass();
                return eVar.f11236f;
            default:
                return ((ri.g) this.f11244b).B;
        }
    }
}
