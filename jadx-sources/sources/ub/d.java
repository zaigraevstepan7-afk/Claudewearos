package ub;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements eh.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16945a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final eh.c f16946b = new eh.c("logSource", m1.o(m1.n(hh.e.class, new hh.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final eh.c f16947c = new eh.c("logEventDropped", m1.o(m1.n(hh.e.class, new hh.a(2))));

    @Override // eh.a
    public final void a(Object obj, Object obj2) {
        xb.e eVar = (xb.e) obj;
        eh.e eVar2 = (eh.e) obj2;
        eVar2.a(f16946b, eVar.f19883a);
        eVar2.a(f16947c, eVar.f19884b);
    }
}
