package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.w;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeku implements nc.a, zzddw {
    private w zza;

    @Override // nc.a
    public final synchronized void onAdClicked() {
        w wVar = this.zza;
        if (wVar != null) {
            try {
                wVar.zzb();
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.h("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    public final synchronized void zza(w wVar) {
        this.zza = wVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzdf() {
        w wVar = this.zza;
        if (wVar != null) {
            try {
                wVar.zzb();
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.h("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzu() {
    }
}
