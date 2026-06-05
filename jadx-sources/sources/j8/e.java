package j8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qj.m0;
import qj.v;
import ti.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8748e = AtomicIntegerFieldUpdater.newUpdater(e.class, "d");

    /* renamed from: c, reason: collision with root package name */
    public final v f8749c;

    /* renamed from: d, reason: collision with root package name */
    public volatile /* synthetic */ int f8750d = 1;

    public e(v vVar) {
        this.f8749c = vVar;
    }

    @Override // qj.v
    public final void e0(h hVar, Runnable runnable) {
        i0().e0(hVar, runnable);
    }

    @Override // qj.v
    public final void f0(h hVar, Runnable runnable) {
        i0().f0(hVar, runnable);
    }

    @Override // qj.v
    public final boolean g0(h hVar) {
        return i0().g0(hVar);
    }

    @Override // qj.v
    public final v h0(int i10) {
        return i0().h0(i10);
    }

    public final v i0() {
        return f8748e.get(this) == 1 ? m0.f13602b : this.f8749c;
    }

    @Override // qj.v
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f8749c + ")";
    }
}
