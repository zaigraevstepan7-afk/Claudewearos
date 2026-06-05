package ri;

import fj.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends qi.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14546a;

    /* renamed from: b, reason: collision with root package name */
    public final g f14547b;

    public /* synthetic */ h(g gVar, int i10) {
        this.f14546a = i10;
        this.f14547b = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f14546a) {
            case 0:
                l.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f14546a) {
            case 0:
                l.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                l.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // qi.g
    public final int b() {
        switch (this.f14546a) {
        }
        return this.f14547b.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f14546a) {
            case 0:
                this.f14547b.clear();
                break;
            default:
                this.f14547b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f14546a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f14547b.f((Map.Entry) obj);
            default:
                return this.f14547b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f14546a) {
            case 0:
                l.f(collection, "elements");
                return this.f14547b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f14546a) {
        }
        return this.f14547b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f14546a) {
            case 0:
                g gVar = this.f14547b;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f14547b;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f14546a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    g gVar = this.f14547b;
                    gVar.getClass();
                    gVar.c();
                    int iH = gVar.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = gVar.f14540b;
                        l.c(objArr);
                        if (l.b(objArr[iH], entry.getValue())) {
                            gVar.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                g gVar2 = this.f14547b;
                gVar2.c();
                int iH2 = gVar2.h(obj);
                if (iH2 >= 0) {
                    gVar2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f14546a) {
            case 0:
                l.f(collection, "elements");
                this.f14547b.c();
                break;
            default:
                l.f(collection, "elements");
                this.f14547b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f14546a) {
            case 0:
                l.f(collection, "elements");
                this.f14547b.c();
                break;
            default:
                l.f(collection, "elements");
                this.f14547b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
