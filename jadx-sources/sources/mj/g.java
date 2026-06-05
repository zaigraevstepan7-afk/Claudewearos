package mj;

import fj.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements Iterator, ti.c, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public int f11824a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11825b;

    /* renamed from: c, reason: collision with root package name */
    public ti.c f11826c;

    public final RuntimeException a() {
        int i10 = this.f11824a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f11824a);
    }

    public final void b(Object obj, ti.c cVar) {
        this.f11825b = obj;
        this.f11824a = 3;
        this.f11826c = cVar;
        ui.a aVar = ui.a.f17085a;
        l.f(cVar, "frame");
    }

    @Override // ti.c
    public final ti.h getContext() {
        return ti.i.f16336a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f11824a;
            if (i10 != 0) {
                break;
            }
            this.f11824a = 5;
            ti.c cVar = this.f11826c;
            l.c(cVar);
            this.f11826c = null;
            cVar.resumeWith(o.f13011a);
        }
        if (i10 == 1) {
            l.c(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f11824a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f11824a = 1;
            l.c(null);
            throw null;
        }
        if (i10 != 3) {
            throw a();
        }
        this.f11824a = 0;
        Object obj = this.f11825b;
        this.f11825b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ti.c
    public final void resumeWith(Object obj) {
        uk.c.R(obj);
        this.f11824a = 4;
    }
}
