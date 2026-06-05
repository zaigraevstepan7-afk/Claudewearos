package m1;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class e extends AbstractMap implements k1.c, Map, gj.d {

    /* renamed from: a, reason: collision with root package name */
    public c f11231a;

    /* renamed from: b, reason: collision with root package name */
    public o1.b f11232b = new o1.b();

    /* renamed from: c, reason: collision with root package name */
    public m f11233c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11234d;

    /* renamed from: e, reason: collision with root package name */
    public int f11235e;

    /* renamed from: f, reason: collision with root package name */
    public int f11236f;

    public e(c cVar) {
        this.f11231a = cVar;
        this.f11233c = cVar.f11226a;
        this.f11236f = cVar.f11227b;
    }

    @Override // k1.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c build() {
        m mVar = this.f11233c;
        c cVar = this.f11231a;
        if (mVar != cVar.f11226a) {
            this.f11232b = new o1.b();
            cVar = new c(this.f11233c, this.f11236f);
        }
        this.f11231a = cVar;
        return cVar;
    }

    public final void b(int i10) {
        this.f11236f = i10;
        this.f11235e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f11233c = m.f11248e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f11233c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f11233c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f11234d = null;
        this.f11233c = this.f11233c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f11234d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVarBuild = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarBuild = eVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super.putAll(map);
            return;
        }
        o1.a aVar = new o1.a();
        aVar.f12369a = 0;
        int i10 = this.f11236f;
        m mVar = this.f11233c;
        m mVar2 = cVarBuild.f11226a;
        fj.l.d(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f11233c = mVar.m(mVar2, 0, aVar, this);
        int i11 = (cVarBuild.f11227b + i10) - aVar.f12369a;
        if (i10 != i11) {
            b(i11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f11236f;
        m mVarO = this.f11233c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mVarO == null) {
            mVarO = m.f11248e;
        }
        this.f11233c = mVarO;
        return i10 != this.f11236f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11236f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f11234d = null;
        m mVarN = this.f11233c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mVarN == null) {
            mVarN = m.f11248e;
        }
        this.f11233c = mVarN;
        return this.f11234d;
    }
}
