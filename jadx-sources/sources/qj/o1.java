package qj;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o1 extends ti.a implements e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f13607b = new o1(w.f13632b);

    @Override // qj.e1
    public final o0 O(boolean z2, boolean z10, k0.h1 h1Var) {
        return p1.f13611a;
    }

    @Override // qj.e1
    public final o P(l1 l1Var) {
        return p1.f13611a;
    }

    @Override // qj.e1
    public final o0 T(ej.c cVar) {
        return p1.f13611a;
    }

    @Override // qj.e1
    public final Object W(vi.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // qj.e1
    public final boolean b() {
        return true;
    }

    @Override // qj.e1
    public final boolean isCancelled() {
        return false;
    }

    @Override // qj.e1
    public final mj.f n() {
        return mj.b.f11812a;
    }

    @Override // qj.e1
    public final boolean start() {
        return false;
    }

    @Override // qj.e1
    public final CancellationException t() {
        throw new IllegalStateException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // qj.e1
    public final void e(CancellationException cancellationException) {
    }
}
