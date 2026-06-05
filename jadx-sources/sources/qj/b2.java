package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b2 extends v {

    /* renamed from: c, reason: collision with root package name */
    public static final b2 f13557c = new b2();

    @Override // qj.v
    public final void e0(ti.h hVar, Runnable runnable) {
        f2 f2Var = (f2) hVar.C(f2.f13574c);
        if (f2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f2Var.f13575b = true;
    }

    @Override // qj.v
    public final v h0(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // qj.v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
