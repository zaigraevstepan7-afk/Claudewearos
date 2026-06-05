package t1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements a0, Map, gj.d {

    /* renamed from: a, reason: collision with root package name */
    public s f15488a;

    /* renamed from: b, reason: collision with root package name */
    public final n f15489b;

    /* renamed from: c, reason: collision with root package name */
    public final n f15490c;

    /* renamed from: d, reason: collision with root package name */
    public final n f15491d;

    public t() {
        m1.c cVar = m1.c.f11225c;
        g gVarJ = m.j();
        s sVar = new s(gVarJ.g(), cVar);
        if (!(gVarJ instanceof a)) {
            sVar.f15420b = new s(1, cVar);
        }
        this.f15488a = sVar;
        this.f15489b = new n(this, 0);
        this.f15490c = new n(this, 1);
        this.f15491d = new n(this, 2);
    }

    public static final boolean a(t tVar, s sVar, int i10, k1.d dVar) {
        boolean z2;
        synchronized (r.f15484b) {
            int i11 = sVar.f15487d;
            if (i11 == i10) {
                sVar.f15486c = dVar;
                z2 = true;
                sVar.f15487d = i11 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // t1.a0
    public final c0 b() {
        return this.f15488a;
    }

    public final s c() {
        s sVar = this.f15488a;
        fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (s) m.t(sVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        g gVarJ;
        s sVar = this.f15488a;
        fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        s sVar2 = (s) m.h(sVar);
        m1.c cVar = m1.c.f11225c;
        if (cVar != sVar2.f15486c) {
            s sVar3 = this.f15488a;
            fj.l.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                s sVar4 = (s) m.w(sVar3, this, gVarJ);
                synchronized (r.f15484b) {
                    sVar4.f15486c = cVar;
                    sVar4.f15487d++;
                }
            }
            m.n(gVarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().f15486c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().f15486c.containsValue(obj);
    }

    @Override // t1.a0
    public final void e(c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f15488a = (s) c0Var;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f15489b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().f15486c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().f15486c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f15490c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        k1.d dVar;
        int i10;
        Object objPut;
        g gVarJ;
        boolean zA;
        do {
            synchronized (r.f15484b) {
                s sVar = this.f15488a;
                fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) m.h(sVar);
                dVar = sVar2.f15486c;
                i10 = sVar2.f15487d;
            }
            fj.l.c(dVar);
            m1.e eVar = (m1.e) dVar.builder();
            objPut = eVar.put(obj, obj2);
            k1.d dVarBuild = eVar.build();
            if (fj.l.b(dVarBuild, dVar)) {
                break;
            }
            s sVar3 = this.f15488a;
            fj.l.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zA = a(this, (s) m.w(sVar3, this, gVarJ), i10, dVarBuild);
            }
            m.n(gVarJ, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k1.d dVar;
        int i10;
        g gVarJ;
        boolean zA;
        do {
            synchronized (r.f15484b) {
                s sVar = this.f15488a;
                fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) m.h(sVar);
                dVar = sVar2.f15486c;
                i10 = sVar2.f15487d;
            }
            fj.l.c(dVar);
            m1.e eVar = (m1.e) dVar.builder();
            eVar.putAll(map);
            k1.d dVarBuild = eVar.build();
            if (fj.l.b(dVarBuild, dVar)) {
                return;
            }
            s sVar3 = this.f15488a;
            fj.l.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zA = a(this, (s) m.w(sVar3, this, gVarJ), i10, dVarBuild);
            }
            m.n(gVarJ, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        k1.d dVar;
        int i10;
        Object objRemove;
        g gVarJ;
        boolean zA;
        do {
            synchronized (r.f15484b) {
                s sVar = this.f15488a;
                fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) m.h(sVar);
                dVar = sVar2.f15486c;
                i10 = sVar2.f15487d;
            }
            fj.l.c(dVar);
            k1.c cVarBuilder = dVar.builder();
            objRemove = cVarBuilder.remove(obj);
            k1.d dVarBuild = cVarBuilder.build();
            if (fj.l.b(dVarBuild, dVar)) {
                break;
            }
            s sVar3 = this.f15488a;
            fj.l.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zA = a(this, (s) m.w(sVar3, this, gVarJ), i10, dVarBuild);
            }
            m.n(gVarJ, this);
        } while (!zA);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return c().f15486c.size();
    }

    public final String toString() {
        s sVar = this.f15488a;
        fj.l.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((s) m.h(sVar)).f15486c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f15491d;
    }
}
