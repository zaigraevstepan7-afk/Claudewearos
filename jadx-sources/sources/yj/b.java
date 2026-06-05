package yj;

import ab.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pi.o;
import qj.e2;
import qj.i0;
import qj.l;
import vj.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements qj.k, e2 {

    /* renamed from: a, reason: collision with root package name */
    public final l f20316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20317b;

    public b(c cVar, l lVar) {
        this.f20317b = cVar;
        this.f20316a = lVar;
    }

    @Override // qj.e2
    public final void a(r rVar, int i10) {
        this.f20316a.a(rVar, i10);
    }

    @Override // qj.k
    public final d7.c f(Object obj, ej.f fVar) {
        c cVar = this.f20317b;
        a0 a0Var = new a0(cVar, this);
        d7.c cVarE = this.f20316a.E((o) obj, a0Var);
        if (cVarE != null) {
            c.A.set(cVar, null);
        }
        return cVarE;
    }

    @Override // ti.c
    public final ti.h getContext() {
        return this.f20316a.f13597e;
    }

    @Override // qj.k
    public final void r(Object obj, ej.f fVar) throws i0 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.A;
        c cVar = this.f20317b;
        atomicReferenceFieldUpdater.set(cVar, null);
        q0.i iVar = new q0.i(18, cVar, this);
        l lVar = this.f20316a;
        lVar.B(o.f13011a, lVar.f13589c, new a0(iVar, 3));
    }

    @Override // ti.c
    public final void resumeWith(Object obj) {
        this.f20316a.resumeWith(obj);
    }

    @Override // qj.k
    public final boolean x(Throwable th2) {
        return this.f20316a.x(th2);
    }

    @Override // qj.k
    public final void z(Object obj) throws i0 {
        this.f20316a.z(obj);
    }
}
