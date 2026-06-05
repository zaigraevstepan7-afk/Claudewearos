package sj;

import java.util.concurrent.CancellationException;
import qj.b0;
import qj.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o extends qj.a implements p, g {

    /* renamed from: d, reason: collision with root package name */
    public final c f15079d;

    public o(ti.h hVar, c cVar) {
        super(hVar, true);
        this.f15079d = cVar;
    }

    @Override // sj.q
    public final Object a() {
        return this.f15079d.a();
    }

    @Override // sj.q
    public final Object c(ti.c cVar) {
        return this.f15079d.c(cVar);
    }

    @Override // sj.r
    public final Object d(Object obj, ti.c cVar) {
        return this.f15079d.d(obj, cVar);
    }

    @Override // qj.l1, qj.e1
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new f1(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // sj.r
    public final Object h(Object obj) {
        return this.f15079d.h(obj);
    }

    @Override // qj.a
    public final void h0(boolean z2, Throwable th2) {
        if (this.f15079d.j(false, th2) || z2) {
            return;
        }
        b0.q(th2, this.f13537c);
    }

    @Override // qj.a
    public final void i0(Object obj) {
        this.f15079d.j(false, null);
    }

    @Override // sj.q
    public final b iterator() {
        c cVar = this.f15079d;
        cVar.getClass();
        return new b(cVar);
    }

    @Override // qj.l1
    public final void o(CancellationException cancellationException) {
        this.f15079d.j(true, cancellationException);
        m(cancellationException);
    }
}
