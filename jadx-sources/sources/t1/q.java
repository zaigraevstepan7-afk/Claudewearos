package t1;

import android.os.Parcel;
import android.os.Parcelable;
import f1.o1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q implements Parcelable, a0, List, RandomAccess, gj.b {
    public static final Parcelable.Creator<q> CREATOR = new p(0);

    /* renamed from: a, reason: collision with root package name */
    public x f15482a;

    public q(l1.c cVar) {
        g gVarJ = m.j();
        x xVar = new x(gVarJ.g(), cVar);
        if (!(gVarJ instanceof a)) {
            xVar.f15420b = new x(1, cVar);
        }
        this.f15482a = xVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i10 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.c cVarI = cVar.i(obj);
            if (cVarI.equals(cVar)) {
                return false;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i10, cVarI, true);
            }
            m.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return r.l(this, new e0.s(i10, collection));
    }

    @Override // t1.a0
    public final c0 b() {
        return this.f15482a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g gVarJ;
        x xVar = this.f15482a;
        fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (m.f15471c) {
            gVarJ = m.j();
            x xVar2 = (x) m.w(xVar, this, gVarJ);
            synchronized (r.f15483a) {
                xVar2.f15514c = l1.i.f9872b;
                xVar2.f15515d++;
                xVar2.f15516e++;
            }
        }
        m.n(gVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return r.h(this).f15514c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return r.h(this).f15514c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // t1.a0
    public final void e(c0 c0Var) {
        c0Var.f15420b = this.f15482a;
        this.f15482a = (x) c0Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return r.h(this).f15514c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return r.h(this).f15514c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return r.h(this).f15514c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return r.h(this).f15514c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ri.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        Object obj = get(i10);
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i11 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.c cVarZ = cVar.z(i10);
            if (cVarZ.equals(cVar)) {
                break;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i11, cVarZ, true);
            }
            m.n(gVarJ, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i10 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.c cVarY = cVar.y(new l1.b(0, collection));
            if (fj.l.b(cVarY, cVar)) {
                return false;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i10, cVarY, true);
            }
            m.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return r.l(this, new l1.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        Object obj2 = get(i10);
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i11 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.c cVarA = cVar.A(i10, obj);
            if (cVarA.equals(cVar)) {
                break;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i11, cVarA, false);
            }
            m.n(gVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return r.h(this).f15514c.b();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            o1.a("fromIndex or toIndex are out of bounds");
        }
        return new f0(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fj.k.a(this);
    }

    public final String toString() {
        x xVar = this.f15482a;
        fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((x) m.h(xVar)).f15514c + ")@" + hashCode();
    }

    public final void w(int i10, int i11) {
        int i12;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i12 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.f fVarX = cVar.x();
            fVarX.subList(i10, i11).clear();
            l1.c cVarI = fVarX.i();
            if (fj.l.b(cVarI, cVar)) {
                return;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i12, cVarI, true);
            }
            m.n(gVarJ, this);
        } while (!zB);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l1.c cVar = r.h(this).f15514c;
        int iB = cVar.b();
        parcel.writeInt(iB);
        for (int i11 = 0; i11 < iB; i11++) {
            parcel.writeValue(cVar.get(i11));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i10 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.c cVarW = cVar.w(collection);
            if (fj.l.b(cVarW, cVar)) {
                return false;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i10, cVarW, true);
            }
            m.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new ri.a(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fj.k.b(this, objArr);
    }

    public q() {
        this(l1.i.f9872b);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i11 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            l1.c cVarE = cVar.e(i10, obj);
            if (cVarE.equals(cVar)) {
                return;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i11, cVarE, true);
            }
            m.n(gVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        l1.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (r.f15483a) {
                x xVar = this.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i10 = xVar2.f15515d;
                cVar = xVar2.f15514c;
            }
            fj.l.c(cVar);
            int iIndexOf = cVar.indexOf(obj);
            l1.c cVarZ = iIndexOf != -1 ? cVar.z(iIndexOf) : cVar;
            if (cVarZ.equals(cVar)) {
                return false;
            }
            x xVar3 = this.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = r.b((x) m.w(xVar3, this, gVarJ), i10, cVarZ, true);
            }
            m.n(gVarJ, this);
        } while (!zB);
        return true;
    }
}
