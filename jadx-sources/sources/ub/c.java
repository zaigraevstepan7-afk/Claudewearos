package ub;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements eh.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f16942a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final eh.c f16943b = new eh.c("eventsDroppedCount", m1.o(m1.n(hh.e.class, new hh.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final eh.c f16944c = new eh.c("reason", m1.o(m1.n(hh.e.class, new hh.a(3))));

    @Override // eh.a
    public final void a(Object obj, Object obj2) {
        xb.d dVar = (xb.d) obj;
        eh.e eVar = (eh.e) obj2;
        eVar.e(f16943b, dVar.f19880a);
        eVar.a(f16944c, dVar.f19881b);
    }
}
