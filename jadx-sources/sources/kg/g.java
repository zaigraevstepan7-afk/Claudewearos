package kg;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements c {
    public static final f A = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9618a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9619b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9620c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f9621d;

    /* renamed from: e, reason: collision with root package name */
    public final l f9622e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f9623f;

    /* renamed from: z, reason: collision with root package name */
    public final ef.f f9624z;

    public g(ArrayList arrayList, ArrayList arrayList2, ef.f fVar) {
        lg.l lVar = lg.l.f10970a;
        this.f9618a = new HashMap();
        this.f9619b = new HashMap();
        this.f9620c = new HashMap();
        this.f9621d = new HashSet();
        this.f9623f = new AtomicReference();
        l lVar2 = new l();
        this.f9622e = lVar2;
        this.f9624z = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.c(lVar2, l.class, ih.b.class, ih.a.class));
        int i10 = 0;
        arrayList3.add(b.c(this, g.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((oh.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f9624z.j(componentRegistrar));
                        it.remove();
                    }
                } catch (m e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).f9609b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f9621d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f9621d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f9618a.isEmpty()) {
                x8.a.u(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f9618a.keySet());
                arrayList6.addAll(arrayList3);
                x8.a.u(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                b bVar2 = (b) obj4;
                this.f9618a.put(bVar2, new n(new cg.d(1, this, bVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f9623f.get();
        if (bool != null) {
            c(this.f9618a, bool.booleanValue());
        }
    }

    public final void c(HashMap map, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            oh.b bVar2 = (oh.b) entry.getValue();
            int i10 = bVar.f9611d;
            if (i10 == 1 || (i10 == 2 && z2)) {
                bVar2.get();
            }
        }
        l lVar = this.f9622e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f9634b;
                if (arrayDeque != null) {
                    lVar.f9634b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw gk.b.k(it);
            }
        }
    }

    @Override // kg.c
    public final p d(r rVar) {
        oh.b bVarE = e(rVar);
        return bVarE == null ? new p(p.f9641c, p.f9642d) : bVarE instanceof p ? (p) bVarE : new p(null, bVarE);
    }

    @Override // kg.c
    public final synchronized oh.b e(r rVar) {
        yd.f.n(rVar, "Null interface requested.");
        return (oh.b) this.f9619b.get(rVar);
    }

    @Override // kg.c
    public final synchronized oh.b h(r rVar) {
        o oVar = (o) this.f9620c.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return A;
    }

    public final void j() {
        HashMap map = this.f9619b;
        HashMap map2 = this.f9620c;
        for (b bVar : this.f9618a.keySet()) {
            for (j jVar : bVar.f9610c) {
                boolean z2 = jVar.f9631b == 2;
                r rVar = jVar.f9630a;
                if (z2 && !map2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    o oVar = new o();
                    oVar.f9640b = null;
                    oVar.f9639a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f9639a.addAll(set);
                    map2.put(rVar, oVar);
                } else if (map.containsKey(rVar)) {
                    continue;
                } else {
                    int i10 = jVar.f9631b;
                    if (i10 == 1) {
                        throw new k("Unsatisfied dependency for component " + bVar + ": " + rVar);
                    }
                    if (i10 != 2) {
                        map.put(rVar, new p(p.f9641c, p.f9642d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar.f9612e == 0) {
                oh.b bVar2 = (oh.b) this.f9618a.get(bVar);
                for (r rVar : bVar.f9609b) {
                    HashMap map = this.f9619b;
                    if (map.containsKey(rVar)) {
                        arrayList2.add(new ac.e(12, (p) ((oh.b) map.get(rVar)), bVar2));
                    } else {
                        map.put(rVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        HashMap map = this.f9620c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f9618a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f9612e != 0) {
                oh.b bVar2 = (oh.b) entry.getValue();
                for (r rVar : bVar.f9609b) {
                    if (!map2.containsKey(rVar)) {
                        map2.put(rVar, new HashSet());
                    }
                    ((Set) map2.get(rVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                o oVar = (o) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ac.e(13, oVar, (oh.b) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f9640b = null;
                oVar2.f9639a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f9639a.addAll(set);
                map.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
