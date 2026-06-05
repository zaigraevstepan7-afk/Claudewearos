package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzedx implements zzedk {
    private final Context zza;
    private final zzcob zzb;

    public zzedx(Context context, zzcob zzcobVar) {
        this.zza = context;
        this.zzb = zzcobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        zzefe zzefeVar = new zzefe(zzfbtVar, (zzbrn) zzedhVar.zzb, fc.b.APP_OPEN_AD);
        zzcny zzcnyVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(zzefeVar, null), new zzcnz(zzfbtVar.zzaa));
        zzefeVar.zzc(zzcnyVarZza.zzc());
        ((zzeev) zzedhVar.zzc).zzc(zzcnyVarZza.zzj());
        return zzcnyVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzbrnVar.zzi(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcfVar.zza.zza.zzd, new xd.b(this.zza), new zzedv(zzedhVar, null), (zzbpu) zzedhVar.zzc);
        } catch (RemoteException e10) {
            l0.l("Remote exception loading an app open RTB ad", e10);
            throw new zzfcv(e10);
        }
    }
}
