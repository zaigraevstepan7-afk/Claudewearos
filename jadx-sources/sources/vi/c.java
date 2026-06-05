package vi;

import fj.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qj.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c extends a {
    private final ti.h _context;
    private transient ti.c intercepted;

    public c(ti.c cVar, ti.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // ti.c
    public ti.h getContext() {
        ti.h hVar = this._context;
        l.c(hVar);
        return hVar;
    }

    public final ti.c intercepted() {
        ti.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        ti.e eVar = (ti.e) getContext().C(ti.d.f16335a);
        ti.c gVar = eVar != null ? new vj.g((v) eVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // vi.a
    public void releaseIntercepted() {
        ti.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            ti.f fVarC = getContext().C(ti.d.f16335a);
            l.c(fVarC);
            vj.g gVar = (vj.g) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vj.g.A;
            while (atomicReferenceFieldUpdater.get(gVar) == vj.b.f18085c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            qj.l lVar = obj instanceof qj.l ? (qj.l) obj : null;
            if (lVar != null) {
                lVar.l();
            }
        }
        this.intercepted = b.f18078a;
    }

    public c(ti.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
