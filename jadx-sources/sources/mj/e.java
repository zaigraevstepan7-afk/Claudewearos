package mj;

import fj.l;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import q.e0;
import q.f0;
import q.i0;
import q.j0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class e implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11820a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11821b;

    /* renamed from: c, reason: collision with root package name */
    public int f11822c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11823d;

    public e(Object obj, Map map) {
        this.f11820a = 1;
        this.f11821b = obj;
        this.f11823d = map;
    }

    public void a() {
        Object objInvoke;
        d dVar = (d) this.f11823d;
        if (this.f11822c == -2) {
            objInvoke = ((ej.a) dVar.f11818b).a();
        } else {
            ej.c cVar = (ej.c) dVar.f11819c;
            Object obj = this.f11821b;
            l.c(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.f11821b = objInvoke;
        this.f11822c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11820a) {
            case 0:
                if (this.f11822c < 0) {
                    a();
                }
                if (this.f11822c == 1) {
                }
                break;
            case 1:
                if (this.f11822c < ((Map) this.f11823d).size()) {
                }
                break;
        }
        return ((g) this.f11821b).hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f11820a) {
            case 0:
                if (this.f11822c < 0) {
                    a();
                }
                if (this.f11822c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f11821b;
                l.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f11822c = -1;
                return obj;
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f11821b;
                this.f11822c++;
                Object obj3 = ((Map) this.f11823d).get(obj2);
                if (obj3 != null) {
                    this.f11821b = ((n1.a) obj3).f11855b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            case 2:
                return ((g) this.f11821b).next();
            default:
                return ((g) this.f11821b).next();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f11820a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i10 = this.f11822c;
                if (i10 != -1) {
                    ((f0) this.f11823d).f13068b.h(i10);
                    this.f11822c = -1;
                    return;
                }
                return;
            default:
                int i11 = this.f11822c;
                if (i11 != -1) {
                    ((j0) this.f11823d).f13095b.m(i11);
                    this.f11822c = -1;
                    return;
                }
                return;
        }
    }

    public e(d dVar) {
        this.f11820a = 0;
        this.f11823d = dVar;
        this.f11822c = -2;
    }

    public e(j0 j0Var) {
        this.f11820a = 3;
        this.f11823d = j0Var;
        this.f11822c = -1;
        this.f11821b = mk.b.y(new i0(j0Var, this, null));
    }

    public e(f0 f0Var) {
        this.f11820a = 2;
        this.f11823d = f0Var;
        this.f11822c = -1;
        this.f11821b = mk.b.y(new e0(f0Var, this, null));
    }
}
