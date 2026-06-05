package q0;

import t2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements r0.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f13160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13161b;

    public f(g gVar, long j) {
        this.f13161b = gVar;
        this.f13160a = j;
    }

    @Override // r0.e
    public final n0.c i0() {
        return h.b(this.f13161b);
    }

    @Override // r0.e
    public final long q0(w wVar) {
        w wVar2 = (w) this.f13161b.K.getValue();
        if (wVar2 != null) {
            return wVar.i0(wVar2, this.f13160a);
        }
        a0.a.d("Tried to open context menu before the anchor was placed.");
        throw new b3.e();
    }

    @Override // r0.e
    public final b2.c x0(w wVar) {
        return uk.c.g(q0(wVar), 0L);
    }
}
