package x3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends u2.b {
    @Override // u2.b
    public final boolean b(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f19825b != cVar) {
                    return false;
                }
                gVar.f19825b = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u2.b
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f19824a != obj) {
                    return false;
                }
                gVar.f19824a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u2.b
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f19826c != fVar) {
                    return false;
                }
                gVar.f19826c = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u2.b
    public final void n(f fVar, f fVar2) {
        fVar.f19819b = fVar2;
    }

    @Override // u2.b
    public final void o(f fVar, Thread thread) {
        fVar.f19818a = thread;
    }
}
