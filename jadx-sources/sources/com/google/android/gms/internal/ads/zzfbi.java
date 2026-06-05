package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.y1;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfbi implements ad.a {
    final /* synthetic */ y1 zza;
    final /* synthetic */ zzfbk zzb;

    public zzfbi(zzfbk zzfbkVar, y1 y1Var) {
        this.zza = y1Var;
        this.zzb = zzfbkVar;
    }

    @Override // ad.a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
