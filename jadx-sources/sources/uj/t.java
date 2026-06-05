package uj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t implements ti.c, vi.d {

    /* renamed from: a, reason: collision with root package name */
    public final ti.c f17134a;

    /* renamed from: b, reason: collision with root package name */
    public final ti.h f17135b;

    public t(ti.c cVar, ti.h hVar) {
        this.f17134a = cVar;
        this.f17135b = hVar;
    }

    @Override // vi.d
    public final vi.d getCallerFrame() {
        ti.c cVar = this.f17134a;
        if (cVar instanceof vi.d) {
            return (vi.d) cVar;
        }
        return null;
    }

    @Override // ti.c
    public final ti.h getContext() {
        return this.f17135b;
    }

    @Override // ti.c
    public final void resumeWith(Object obj) {
        this.f17134a.resumeWith(obj);
    }
}
