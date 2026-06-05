package nc;

import android.os.RemoteException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r2 extends fc.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12198a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public fc.c f12199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2 f12200c;

    public r2(s2 s2Var) {
        this.f12200c = s2Var;
    }

    @Override // fc.c, nc.a
    public final void onAdClicked() {
        synchronized (this.f12198a) {
            try {
                fc.c cVar = this.f12199b;
                if (cVar != null) {
                    cVar.onAdClicked();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fc.c
    public final void onAdClosed() {
        synchronized (this.f12198a) {
            try {
                fc.c cVar = this.f12199b;
                if (cVar != null) {
                    cVar.onAdClosed();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fc.c
    public final void onAdFailedToLoad(fc.m mVar) {
        s2 s2Var = this.f12200c;
        fc.w wVar = s2Var.f12210c;
        m0 m0Var = s2Var.f12216i;
        l2 l2VarZzl = null;
        if (m0Var != null) {
            try {
                l2VarZzl = m0Var.zzl();
            } catch (RemoteException e10) {
                rc.k.i("#007 Could not call remote method.", e10);
            }
        }
        wVar.a(l2VarZzl);
        synchronized (this.f12198a) {
            try {
                fc.c cVar = this.f12199b;
                if (cVar != null) {
                    cVar.onAdFailedToLoad(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fc.c
    public final void onAdImpression() {
        synchronized (this.f12198a) {
            try {
                fc.c cVar = this.f12199b;
                if (cVar != null) {
                    cVar.onAdImpression();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fc.c
    public final void onAdLoaded() {
        s2 s2Var = this.f12200c;
        fc.w wVar = s2Var.f12210c;
        m0 m0Var = s2Var.f12216i;
        l2 l2VarZzl = null;
        if (m0Var != null) {
            try {
                l2VarZzl = m0Var.zzl();
            } catch (RemoteException e10) {
                rc.k.i("#007 Could not call remote method.", e10);
            }
        }
        wVar.a(l2VarZzl);
        synchronized (this.f12198a) {
            try {
                fc.c cVar = this.f12199b;
                if (cVar != null) {
                    cVar.onAdLoaded();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fc.c
    public final void onAdOpened() {
        synchronized (this.f12198a) {
            try {
                fc.c cVar = this.f12199b;
                if (cVar != null) {
                    cVar.onAdOpened();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
