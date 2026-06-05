package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import nc.q3;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdtt implements zzdtd {
    private final long zza;
    private final zzdti zzb;
    private final zzfbk zzc;

    public zzdtt(long j, Context context, zzdti zzdtiVar, zzcgz zzcgzVar, String str) {
        this.zza = j;
        this.zzb = zzdtiVar;
        zzfbm zzfbmVarZzv = zzcgzVar.zzv();
        zzfbmVarZzv.zzb(context);
        zzfbmVarZzv.zza(str);
        this.zzc = zzfbmVarZzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzb(q3 q3Var) {
        try {
            this.zzc.zzg(q3Var, new zzdtr(this));
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzc() {
        try {
            zzfbk zzfbkVar = this.zzc;
            zzfbkVar.zzl(new zzdts(this));
            zzfbkVar.zzn(new xd.b(null));
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zza() {
    }
}
