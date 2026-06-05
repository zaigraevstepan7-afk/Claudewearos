package xj;

import qj.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l extends v {

    /* renamed from: c, reason: collision with root package name */
    public static final l f20108c = new l();

    @Override // qj.v
    public final void e0(ti.h hVar, Runnable runnable) {
        e.f20096d.f20098c.e(runnable, true, false);
    }

    @Override // qj.v
    public final void f0(ti.h hVar, Runnable runnable) {
        e.f20096d.f20098c.e(runnable, true, true);
    }

    @Override // qj.v
    public final v h0(int i10) {
        vj.b.a(i10);
        return i10 >= k.f20105d ? this : super.h0(i10);
    }

    @Override // qj.v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
