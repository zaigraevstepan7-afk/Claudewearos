package og;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends c {

    /* renamed from: a, reason: collision with root package name */
    public final i f12528a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f12529b;

    public n(i iVar, Comparator comparator) {
        this.f12528a = iVar;
        this.f12529b = comparator;
    }

    @Override // og.c
    public final c A(Iterable iterable, Object obj) {
        i iVar = this.f12528a;
        Comparator comparator = this.f12529b;
        return new n(((k) iVar.b(obj, iterable, comparator)).c(2, null, null), comparator);
    }

    @Override // og.c
    public final c B(Object obj) {
        if (!b(obj)) {
            return this;
        }
        i iVar = this.f12528a;
        Comparator comparator = this.f12529b;
        return new n(iVar.d(obj, comparator).c(2, null, null), comparator);
    }

    public final i C(Object obj) {
        i iVarA = this.f12528a;
        while (!iVarA.isEmpty()) {
            int iCompare = this.f12529b.compare(obj, iVarA.getKey());
            if (iCompare < 0) {
                iVarA = iVarA.a();
            } else {
                if (iCompare == 0) {
                    return iVarA;
                }
                iVarA = iVarA.g();
            }
        }
        return null;
    }

    @Override // og.c
    public final boolean b(Object obj) {
        return C(obj) != null;
    }

    @Override // og.c
    public final Object e(zg.c cVar) {
        i iVarC = C(cVar);
        if (iVarC != null) {
            return iVarC.getValue();
        }
        return null;
    }

    @Override // og.c
    public final Comparator i() {
        return this.f12529b;
    }

    @Override // og.c
    public final boolean isEmpty() {
        return this.f12528a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f12528a, this.f12529b, false);
    }

    @Override // og.c
    public final int size() {
        return this.f12528a.size();
    }

    @Override // og.c
    public final Iterator u() {
        return new d(this.f12528a, this.f12529b, true);
    }

    @Override // og.c
    public final Object w() {
        return this.f12528a.i().getKey();
    }

    @Override // og.c
    public final Object x() {
        return this.f12528a.h().getKey();
    }

    @Override // og.c
    public final Object y(Object obj) {
        i iVarA = this.f12528a;
        i iVar = null;
        while (!iVarA.isEmpty()) {
            int iCompare = this.f12529b.compare(obj, iVarA.getKey());
            if (iCompare == 0) {
                if (iVarA.a().isEmpty()) {
                    if (iVar != null) {
                        return iVar.getKey();
                    }
                    return null;
                }
                i iVarA2 = iVarA.a();
                while (!iVarA2.g().isEmpty()) {
                    iVarA2 = iVarA2.g();
                }
                return iVarA2.getKey();
            }
            if (iCompare < 0) {
                iVarA = iVarA.a();
            } else {
                iVar = iVarA;
                iVarA = iVarA.g();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    @Override // og.c
    public final void z(x8.a aVar) {
        this.f12528a.e(aVar);
    }
}
