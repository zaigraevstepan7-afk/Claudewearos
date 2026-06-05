package f6;

import fj.l;
import qj.b0;
import qj.z;
import ti.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, z {

    /* renamed from: a, reason: collision with root package name */
    public final h f6644a;

    public a(h hVar) {
        l.f(hVar, "coroutineContext");
        this.f6644a = hVar;
    }

    @Override // qj.z
    public final h Q() {
        return this.f6644a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b0.g(this.f6644a, null);
    }
}
