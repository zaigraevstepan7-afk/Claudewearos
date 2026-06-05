package com.anonlab.voidlauncher.core.data.db.displayables.source;

import b6.j;
import e9.a;
import f9.c;
import f9.d;
import fj.f;
import fj.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pi.m;
import qi.s;
import u6.g;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class DisplayablesDatabase_Impl extends DisplayablesDatabase {

    /* renamed from: k, reason: collision with root package name */
    public final m f3412k = v.Q(new j(this, 25));

    /* renamed from: l, reason: collision with root package name */
    public final m f3413l = v.Q(new j(this, 26));

    /* renamed from: m, reason: collision with root package name */
    public final m f3414m = v.Q(new j(this, 27));

    @Override // u6.u
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // u6.u
    public final g e() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), "displayables", "dock_displayables", "grid_displayables");
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
        f fVarA = w.a(f9.a.class);
        s sVar = s.f13520a;
        linkedHashMap.put(fVarA, sVar);
        linkedHashMap.put(w.a(c.class), sVar);
        linkedHashMap.put(w.a(d.class), sVar);
        return linkedHashMap;
    }

    @Override // com.anonlab.voidlauncher.core.data.db.displayables.source.DisplayablesDatabase
    public final f9.a r() {
        return (f9.a) this.f3412k.getValue();
    }

    @Override // com.anonlab.voidlauncher.core.data.db.displayables.source.DisplayablesDatabase
    public final c s() {
        return (c) this.f3413l.getValue();
    }

    @Override // com.anonlab.voidlauncher.core.data.db.displayables.source.DisplayablesDatabase
    public final d t() {
        return (d) this.f3414m.getValue();
    }
}
