package t1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements Set, gj.e {

    /* renamed from: a, reason: collision with root package name */
    public final t f15479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15480b;

    public n(t tVar, int i10) {
        this.f15480b = i10;
        this.f15479a = tVar;
    }

    private final boolean b(Collection collection) {
        k1.d dVar;
        int i10;
        g gVarJ;
        boolean zA;
        Set setV0 = qi.l.V0(collection);
        t tVar = this.f15479a;
        boolean z2 = false;
        do {
            synchronized (r.f15484b) {
                s sVar = tVar.f15488a;
                fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) m.h(sVar);
                dVar = sVar2.f15486c;
                i10 = sVar2.f15487d;
            }
            fj.l.c(dVar);
            k1.c cVarBuilder = dVar.builder();
            Iterator it = tVar.f15489b.iterator();
            while (((z) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((z) it).next();
                if (!setV0.contains(entry.getKey())) {
                    cVarBuilder.remove(entry.getKey());
                    z2 = true;
                }
            }
            k1.d dVarBuild = cVarBuilder.build();
            if (fj.l.b(dVarBuild, dVar)) {
                break;
            }
            s sVar3 = tVar.f15488a;
            fj.l.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zA = t.a(tVar, (s) m.w(sVar3, tVar, gVarJ), i10, dVarBuild);
            }
            m.n(gVarJ, tVar);
        } while (!zA);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f15480b) {
            case 0:
                r.o();
                throw null;
            case 1:
                r.o();
                throw null;
            default:
                r.o();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f15480b) {
            case 0:
                r.o();
                throw null;
            case 1:
                r.o();
                throw null;
            default:
                r.o();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f15479a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f15480b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof gj.a) && !(obj instanceof gj.c))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return fj.l.b(this.f15479a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f15479a.containsKey(obj);
            default:
                return this.f15479a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f15480b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f15479a.containsKey(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f15479a.containsValue(it3.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f15479a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15480b) {
            case 0:
                t tVar = this.f15479a;
                return new z(tVar, ((k1.b) tVar.c().f15486c.entrySet()).iterator(), 0);
            case 1:
                t tVar2 = this.f15479a;
                return new z(tVar2, ((k1.b) tVar2.c().f15486c.entrySet()).iterator(), 1);
            default:
                t tVar3 = this.f15479a;
                return new z(tVar3, ((k1.b) tVar3.c().f15486c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        switch (this.f15480b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return (!(obj instanceof gj.a) || (obj instanceof gj.c)) && this.f15479a.remove(((Map.Entry) obj).getKey()) != null;
                }
                return false;
            case 1:
                return this.f15479a.remove(obj) != null;
            default:
                t tVar = this.f15479a;
                Iterator it = tVar.f15489b.iterator();
                while (true) {
                    if (((z) it).hasNext()) {
                        next = ((z) it).next();
                        if (fj.l.b(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null) {
                    return false;
                }
                tVar.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        k1.d dVar;
        int i10;
        g gVarJ;
        boolean zA;
        switch (this.f15480b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f15479a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it2.hasNext()) {
                        if (this.f15479a.remove(it2.next()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                    break;
                }
                break;
            default:
                Set setV0 = qi.l.V0(collection);
                t tVar = this.f15479a;
                boolean z11 = false;
                do {
                    synchronized (r.f15484b) {
                        s sVar = tVar.f15488a;
                        fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        s sVar2 = (s) m.h(sVar);
                        dVar = sVar2.f15486c;
                        i10 = sVar2.f15487d;
                    }
                    fj.l.c(dVar);
                    k1.c cVarBuilder = dVar.builder();
                    Iterator it3 = tVar.f15489b.iterator();
                    while (((z) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((z) it3).next();
                        if (setV0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z11 = true;
                        }
                    }
                    k1.d dVarBuild = cVarBuilder.build();
                    if (!fj.l.b(dVarBuild, dVar)) {
                        s sVar3 = tVar.f15488a;
                        fj.l.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (m.f15471c) {
                            gVarJ = m.j();
                            zA = t.a(tVar, (s) m.w(sVar3, tVar, gVarJ), i10, dVarBuild);
                        }
                        m.n(gVarJ, tVar);
                    }
                    return z11;
                } while (!zA);
                return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        k1.d dVar;
        int i10;
        g gVarJ;
        boolean zA;
        k1.d dVar2;
        int i11;
        g gVarJ2;
        boolean zA2;
        switch (this.f15480b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iG0 = qi.v.g0(qi.m.s0(collection2));
                if (iG0 < 16) {
                    iG0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                t tVar = this.f15479a;
                boolean z2 = false;
                do {
                    synchronized (r.f15484b) {
                        s sVar = tVar.f15488a;
                        fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        s sVar2 = (s) m.h(sVar);
                        dVar = sVar2.f15486c;
                        i10 = sVar2.f15487d;
                    }
                    fj.l.c(dVar);
                    k1.c cVarBuilder = dVar.builder();
                    Iterator it = tVar.f15489b.iterator();
                    while (((z) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((z) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !fj.l.b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            cVarBuilder.remove(entry2.getKey());
                            z2 = true;
                        }
                    }
                    k1.d dVarBuild = cVarBuilder.build();
                    if (!fj.l.b(dVarBuild, dVar)) {
                        s sVar3 = tVar.f15488a;
                        fj.l.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (m.f15471c) {
                            gVarJ = m.j();
                            zA = t.a(tVar, (s) m.w(sVar3, tVar, gVarJ), i10, dVarBuild);
                        }
                        m.n(gVarJ, tVar);
                    }
                    return z2;
                } while (!zA);
                return z2;
            case 1:
                return b(collection);
            default:
                Set setV0 = qi.l.V0(collection);
                t tVar2 = this.f15479a;
                boolean z10 = false;
                do {
                    synchronized (r.f15484b) {
                        s sVar4 = tVar2.f15488a;
                        fj.l.d(sVar4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        s sVar5 = (s) m.h(sVar4);
                        dVar2 = sVar5.f15486c;
                        i11 = sVar5.f15487d;
                    }
                    fj.l.c(dVar2);
                    k1.c cVarBuilder2 = dVar2.builder();
                    Iterator it2 = tVar2.f15489b.iterator();
                    while (((z) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((z) it2).next();
                        if (!setV0.contains(entry3.getValue())) {
                            cVarBuilder2.remove(entry3.getKey());
                            z10 = true;
                        }
                    }
                    k1.d dVarBuild2 = cVarBuilder2.build();
                    if (!fj.l.b(dVarBuild2, dVar2)) {
                        s sVar6 = tVar2.f15488a;
                        fj.l.d(sVar6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (m.f15471c) {
                            gVarJ2 = m.j();
                            zA2 = t.a(tVar2, (s) m.w(sVar6, tVar2, gVarJ2), i11, dVarBuild2);
                        }
                        m.n(gVarJ2, tVar2);
                    }
                    return z10;
                } while (!zA2);
                return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f15479a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return fj.k.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fj.k.b(this, objArr);
    }
}
