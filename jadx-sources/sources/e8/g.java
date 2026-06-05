package e8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends wd.a {
    @Override // wd.a
    public final void L(h hVar, h hVar2) {
        hVar.f5822b = hVar2;
    }

    @Override // wd.a
    public final void M(h hVar, Thread thread) {
        hVar.f5821a = thread;
    }

    @Override // wd.a
    public final boolean m(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f5828b != dVar) {
                    return false;
                }
                iVar.f5828b = dVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wd.a
    public final boolean n(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f5827a != obj) {
                    return false;
                }
                iVar.f5827a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wd.a
    public final boolean o(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f5829c != hVar) {
                    return false;
                }
                iVar.f5829c = hVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
