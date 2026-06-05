package t1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f15423a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f15424b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15425c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15426d;

    /* renamed from: e, reason: collision with root package name */
    public int f15427e;

    public d0(w wVar, Iterator it) {
        this.f15423a = wVar;
        this.f15424b = it;
        this.f15427e = r.g(wVar);
        this.f15425c = this.f15426d;
        this.f15426d = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15426d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (r.g(this.f15423a) != this.f15427e) {
            throw new ConcurrentModificationException();
        }
        this.f15425c = this.f15426d;
        Iterator it = this.f15424b;
        this.f15426d = it.hasNext() ? it.next() : null;
        Object obj = this.f15425c;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        w wVar = this.f15423a;
        if (r.g(wVar) != this.f15427e) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.f15425c;
        if (obj == null) {
            throw new IllegalStateException();
        }
        wVar.remove(obj);
        this.f15425c = null;
        this.f15427e = r.g(wVar);
    }
}
