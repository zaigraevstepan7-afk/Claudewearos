package mj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f11813a;

    /* renamed from: b, reason: collision with root package name */
    public int f11814b = -1;

    /* renamed from: c, reason: collision with root package name */
    public Object f11815c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f11816d;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    public c(d dVar) {
        this.f11816d = dVar;
        this.f11813a = ((i) dVar.f11818b).f11828b.iterator();
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f11813a;
            if (!it.hasNext()) {
                this.f11814b = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) ((mi.g) this.f11816d.f11819c).invoke(next)).booleanValue());
        this.f11815c = next;
        this.f11814b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11814b == -1) {
            a();
        }
        return this.f11814b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11814b == -1) {
            a();
        }
        if (this.f11814b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f11815c;
        this.f11815c = null;
        this.f11814b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
