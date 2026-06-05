package ri;

import fj.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i extends qi.g implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f14548b;

    /* renamed from: a, reason: collision with root package name */
    public final g f14549a;

    static {
        g gVar = g.G;
        f14548b = new i(g.G);
    }

    public i(g gVar) {
        l.f(gVar, "backing");
        this.f14549a = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f14549a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        l.f(collection, "elements");
        this.f14549a.c();
        return super.addAll(collection);
    }

    @Override // qi.g
    public final int b() {
        return this.f14549a.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14549a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14549a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14549a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f14549a;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f14549a;
        gVar.c();
        int iH = gVar.h(obj);
        if (iH < 0) {
            return false;
        }
        gVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        l.f(collection, "elements");
        this.f14549a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        l.f(collection, "elements");
        this.f14549a.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new g());
    }
}
