package vj;

import qj.b0;
import qj.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class q extends qj.a implements vi.d {

    /* renamed from: d, reason: collision with root package name */
    public final ti.c f18119d;

    public q(ti.c cVar, ti.h hVar) {
        super(hVar, true);
        this.f18119d = cVar;
    }

    @Override // qj.l1
    public final boolean N() {
        return true;
    }

    @Override // vi.d
    public final vi.d getCallerFrame() {
        ti.c cVar = this.f18119d;
        if (cVar instanceof vi.d) {
            return (vi.d) cVar;
        }
        return null;
    }

    @Override // qj.l1
    public void i(Object obj) throws i0 {
        b.h(b0.y(obj), u3.a.g(this.f18119d));
    }

    @Override // qj.l1
    public void j(Object obj) {
        this.f18119d.resumeWith(b0.y(obj));
    }

    public void k0() {
    }
}
