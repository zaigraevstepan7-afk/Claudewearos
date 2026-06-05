package gc;

import android.os.RemoteException;
import fc.h;
import fc.k;
import fc.w;
import fc.x;
import nc.m0;
import nc.n3;
import nc.s2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends k {
    public h[] getAdSizes() {
        return this.f6708a.f12214g;
    }

    public e getAppEventListener() {
        return this.f6708a.f12215h;
    }

    public w getVideoController() {
        return this.f6708a.f12210c;
    }

    public x getVideoOptions() {
        return this.f6708a.j;
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f6708a.d(hVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f6708a.e(eVar);
    }

    public void setManualImpressionsEnabled(boolean z2) {
        s2 s2Var = this.f6708a;
        s2Var.f12219m = z2;
        try {
            m0 m0Var = s2Var.f12216i;
            if (m0Var != null) {
                m0Var.zzN(z2);
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    public void setVideoOptions(x xVar) {
        s2 s2Var = this.f6708a;
        s2Var.j = xVar;
        try {
            m0 m0Var = s2Var.f12216i;
            if (m0Var != null) {
                m0Var.zzU(xVar == null ? null : new n3(xVar));
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }
}
