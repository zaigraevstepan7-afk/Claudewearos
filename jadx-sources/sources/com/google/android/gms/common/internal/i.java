package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f3640a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f3641b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3642c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3643d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3644e;

    /* renamed from: f, reason: collision with root package name */
    public final ie.a f3645f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f3646g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public i(Set set, q.e eVar, String str, String str2, ie.a aVar) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f3640a = setUnmodifiableSet;
        q.e eVar2 = eVar == null ? Collections.EMPTY_MAP : eVar;
        this.f3642c = eVar2;
        this.f3643d = str;
        this.f3644e = str2;
        this.f3645f = aVar == null ? ie.a.f8506a : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = eVar2.values().iterator();
        if (it.hasNext()) {
            throw gk.b.k(it);
        }
        this.f3641b = Collections.unmodifiableSet(hashSet);
    }
}
