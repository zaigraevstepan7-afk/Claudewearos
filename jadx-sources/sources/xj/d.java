package xj;

import java.util.concurrent.Executor;
import qj.v;
import qj.x0;
import vj.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends x0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f20094c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final v f20095d;

    static {
        l lVar = l.f20108c;
        int i10 = t.f18123a;
        if (64 >= i10) {
            i10 = 64;
        }
        f20095d = lVar.h0(vj.b.l(i10, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // qj.v
    public final void e0(ti.h hVar, Runnable runnable) {
        f20095d.e0(hVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e0(ti.i.f16336a, runnable);
    }

    @Override // qj.v
    public final void f0(ti.h hVar, Runnable runnable) {
        f20095d.f0(hVar, runnable);
    }

    @Override // qj.v
    public final v h0(int i10) {
        return l.f20108c.h0(i10);
    }

    @Override // qj.v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
