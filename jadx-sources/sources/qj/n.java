package qj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends h1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13604e;

    /* renamed from: f, reason: collision with root package name */
    public final l f13605f;

    public /* synthetic */ n(l lVar, int i10) {
        this.f13604e = i10;
        this.f13605f = lVar;
    }

    @Override // qj.h1
    public final boolean k() {
        switch (this.f13604e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // qj.h1
    public final void l(Throwable th2) {
        switch (this.f13604e) {
            case 0:
                l1 l1VarJ = j();
                l lVar = this.f13605f;
                Throwable thN = lVar.n(l1VarJ);
                if (lVar.v()) {
                    vj.g gVar = (vj.g) lVar.f13596d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vj.g.A;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        d7.c cVar = vj.b.f18085c;
                        if (fj.l.b(obj, cVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, thN)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != cVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                lVar.x(thN);
                if (!lVar.v()) {
                    lVar.l();
                    break;
                }
                break;
            default:
                this.f13605f.resumeWith(pi.o.f13011a);
                break;
        }
    }
}
