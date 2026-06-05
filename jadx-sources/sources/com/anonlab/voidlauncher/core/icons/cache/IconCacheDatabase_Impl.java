package com.anonlab.voidlauncher.core.icons.cache;

import e9.a;
import fj.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import qi.s;
import s1.g;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class IconCacheDatabase_Impl extends IconCacheDatabase {
    public IconCacheDatabase_Impl() {
        v.Q(new g(this, 22));
    }

    @Override // u6.u
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // u6.u
    public final u6.g e() {
        return new u6.g(this, new LinkedHashMap(), new LinkedHashMap(), "icon_cache");
    }

    @Override // u6.u
    public final r5.g f() {
        return new a(this);
    }

    @Override // u6.u
    public final Set k() {
        return new LinkedHashSet();
    }

    @Override // u6.u
    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(w.a(y9.a.class), s.f13520a);
        return linkedHashMap;
    }
}
