package fc;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbul;
import nc.m0;
import nc.s2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6724b;

    public /* synthetic */ z(k kVar, int i10) {
        this.f6723a = i10;
        this.f6724b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6723a) {
            case 0:
                k kVar = this.f6724b;
                try {
                    s2 s2Var = kVar.f6708a;
                    s2Var.getClass();
                    try {
                        m0 m0Var = s2Var.f12216i;
                        if (m0Var != null) {
                            m0Var.zzB();
                            break;
                        }
                    } catch (RemoteException e10) {
                        rc.k.i("#007 Could not call remote method.", e10);
                        return;
                    }
                } catch (IllegalStateException e11) {
                    zzbul.zza(kVar.getContext()).zzh(e11, "BaseAdView.resume");
                    return;
                }
                break;
            case 1:
                k kVar2 = this.f6724b;
                try {
                    s2 s2Var2 = kVar2.f6708a;
                    s2Var2.getClass();
                    try {
                        m0 m0Var2 = s2Var2.f12216i;
                        if (m0Var2 != null) {
                            m0Var2.zzx();
                        }
                    } catch (RemoteException e12) {
                        rc.k.i("#007 Could not call remote method.", e12);
                    }
                    break;
                } catch (IllegalStateException e13) {
                    zzbul.zza(kVar2.getContext()).zzh(e13, "BaseAdView.destroy");
                    return;
                }
            default:
                k kVar3 = this.f6724b;
                try {
                    s2 s2Var3 = kVar3.f6708a;
                    s2Var3.getClass();
                    try {
                        m0 m0Var3 = s2Var3.f12216i;
                        if (m0Var3 != null) {
                            m0Var3.zzz();
                            break;
                        }
                    } catch (RemoteException e14) {
                        rc.k.i("#007 Could not call remote method.", e14);
                        return;
                    }
                } catch (IllegalStateException e15) {
                    zzbul.zza(kVar3.getContext()).zzh(e15, "BaseAdView.pause");
                }
                break;
        }
    }
}
