package t1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w implements Parcelable, a0, Set, RandomAccess, gj.e {
    public static final Parcelable.Creator<w> CREATOR = new p(8);

    /* renamed from: a, reason: collision with root package name */
    public e0 f15513a;

    public w() {
        n1.b bVar = n1.b.f11856d;
        e0 e0Var = new e0(m.j().g(), bVar);
        if (m.f15470b.get() != null) {
            e0Var.f15420b = new e0(1, bVar);
        }
        this.f15513a = e0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        k1.e eVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f15485c) {
                e0 e0Var = this.f15513a;
                fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                e0 e0Var2 = (e0) m.h(e0Var);
                i10 = e0Var2.f15431d;
                eVar = e0Var2.f15430c;
            }
            fj.l.c(eVar);
            n1.b bVarE = ((n1.b) eVar).e(obj);
            if (bVarE.equals(eVar)) {
                return false;
            }
            e0 e0Var3 = this.f15513a;
            fj.l.d(e0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zC = r.c((e0) m.w(e0Var3, this, gVarJ), i10, bVarE);
            }
            m.n(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        k1.e eVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f15485c) {
                e0 e0Var = this.f15513a;
                fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                e0 e0Var2 = (e0) m.h(e0Var);
                i10 = e0Var2.f15431d;
                eVar = e0Var2.f15430c;
            }
            fj.l.c(eVar);
            n1.c cVar = new n1.c((n1.b) eVar);
            cVar.addAll(collection);
            n1.b bVarE = cVar.e();
            if (bVarE.equals(eVar)) {
                return false;
            }
            e0 e0Var3 = this.f15513a;
            fj.l.d(e0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zC = r.c((e0) m.w(e0Var3, this, gVarJ), i10, bVarE);
            }
            m.n(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // t1.a0
    public final c0 b() {
        return this.f15513a;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        g gVarJ;
        e0 e0Var = this.f15513a;
        fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        synchronized (m.f15471c) {
            gVarJ = m.j();
            e0 e0Var2 = (e0) m.w(e0Var, this, gVarJ);
            synchronized (r.f15485c) {
                e0Var2.f15430c = n1.b.f11856d;
                e0Var2.f15431d++;
            }
        }
        m.n(gVarJ, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return r.i(this).f15430c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return r.i(this).f15430c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // t1.a0
    public final void e(c0 c0Var) {
        c0Var.f15420b = this.f15513a;
        this.f15513a = (e0) c0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return r.i(this).f15430c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d0(this, r.i(this).f15430c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        k1.e eVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f15485c) {
                e0 e0Var = this.f15513a;
                fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                e0 e0Var2 = (e0) m.h(e0Var);
                i10 = e0Var2.f15431d;
                eVar = e0Var2.f15430c;
            }
            fj.l.c(eVar);
            n1.b bVarI = ((n1.b) eVar).i(obj);
            if (bVarI.equals(eVar)) {
                return false;
            }
            e0 e0Var3 = this.f15513a;
            fj.l.d(e0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zC = r.c((e0) m.w(e0Var3, this, gVarJ), i10, bVarI);
            }
            m.n(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        k1.e eVar;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f15485c) {
                e0 e0Var = this.f15513a;
                fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                e0 e0Var2 = (e0) m.h(e0Var);
                i10 = e0Var2.f15431d;
                eVar = e0Var2.f15430c;
            }
            fj.l.c(eVar);
            n1.c cVar = new n1.c((n1.b) eVar);
            cVar.removeAll(collection);
            n1.b bVarE = cVar.e();
            if (bVarE.equals(eVar)) {
                return false;
            }
            e0 e0Var3 = this.f15513a;
            fj.l.d(e0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zC = r.c((e0) m.w(e0Var3, this, gVarJ), i10, bVarE);
            }
            m.n(gVarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        k1.e eVar;
        boolean zRetainAll;
        g gVarJ;
        boolean zC;
        do {
            synchronized (r.f15485c) {
                e0 e0Var = this.f15513a;
                fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                e0 e0Var2 = (e0) m.h(e0Var);
                i10 = e0Var2.f15431d;
                eVar = e0Var2.f15430c;
            }
            if (eVar == null) {
                throw new IllegalStateException("No set to mutate");
            }
            n1.c cVar = new n1.c((n1.b) eVar);
            zRetainAll = cVar.retainAll(qi.l.V0(collection));
            n1.b bVarE = cVar.e();
            if (bVarE.equals(eVar)) {
                break;
            }
            e0 e0Var3 = this.f15513a;
            fj.l.d(e0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zC = r.c((e0) m.w(e0Var3, this, gVarJ), i10, bVarE);
            }
            m.n(gVarJ, this);
        } while (!zC);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return r.i(this).f15430c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return fj.k.a(this);
    }

    public final String toString() {
        e0 e0Var = this.f15513a;
        fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((e0) m.h(e0Var)).f15430c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k1.e eVar = r.i(this).f15430c;
        parcel.writeInt(size());
        Iterator it = eVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fj.k.b(this, objArr);
    }
}
