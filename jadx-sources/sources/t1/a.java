package t1;

import f1.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends b {
    @Override // t1.b
    public final b C(ej.c cVar, ej.c cVar2) {
        return (b) ((g) m.e(new ab.n(new d1.b0(6, cVar, cVar2), 11)));
    }

    @Override // t1.b, t1.g
    public final void c() {
        synchronized (m.f15471c) {
            o();
        }
    }

    @Override // t1.b, t1.g
    public final void k() {
        r.o();
        throw null;
    }

    @Override // t1.b, t1.g
    public final void l() {
        r.o();
        throw null;
    }

    @Override // t1.b, t1.g
    public final void m() {
        m.a();
    }

    @Override // t1.b, t1.g
    public final g u(ej.c cVar) {
        return (e) ((g) m.e(new ab.n(new t0(cVar, 1), 11)));
    }

    @Override // t1.b
    public final r w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
