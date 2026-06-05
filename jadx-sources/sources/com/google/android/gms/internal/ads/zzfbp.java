package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import nc.o0;
import nc.q0;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfbp implements ad.a {
    final /* synthetic */ q0 zza;
    final /* synthetic */ zzfbq zzb;

    public zzfbp(zzfbq zzfbqVar, q0 q0Var) {
        this.zza = q0Var;
        this.zzb = zzfbqVar;
    }

    @Override // ad.a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzd != null) {
            try {
                o0 o0Var = (o0) this.zza;
                o0Var.zzdb(1, o0Var.zza());
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
