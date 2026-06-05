package ub;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements eh.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16949a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final eh.c f16950b = new eh.c("currentCacheSizeBytes", m1.o(m1.n(hh.e.class, new hh.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final eh.c f16951c = new eh.c("maxCacheSizeBytes", m1.o(m1.n(hh.e.class, new hh.a(2))));

    @Override // eh.a
    public final void a(Object obj, Object obj2) {
        xb.f fVar = (xb.f) obj;
        eh.e eVar = (eh.e) obj2;
        eVar.e(f16950b, fVar.f19885a);
        eVar.e(f16951c, fVar.f19886b);
    }
}
