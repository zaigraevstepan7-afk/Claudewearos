package q;

import androidx.datastore.preferences.protobuf.c1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends p0 implements Map {

    /* renamed from: d, reason: collision with root package name */
    public c1 f13055d;

    /* renamed from: e, reason: collision with root package name */
    public b f13056e;

    /* renamed from: f, reason: collision with root package name */
    public d f13057f;

    @Override // java.util.Map
    public final Set entrySet() {
        c1 c1Var = this.f13055d;
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(1, this);
        this.f13055d = c1Var2;
        return c1Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i10 = this.f13117c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f13117c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f13056e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f13056e = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f13117c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f13057f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f13057f = dVar2;
        return dVar2;
    }
}
