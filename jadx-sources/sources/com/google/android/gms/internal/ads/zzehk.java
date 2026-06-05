package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzehk implements zzedk {
    private final Context zza;
    private final zzdol zzb;

    public zzehk(Context context, zzdol zzdolVar) {
        this.zza = context;
        this.zzb = zzdolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        zzefe zzefeVar = new zzefe(zzfbtVar, (zzbrn) zzedhVar.zzb, fc.b.REWARDED);
        zzdoh zzdohVarZzd = this.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdoi(zzefeVar));
        zzefeVar.zzc(zzdohVarZzd.zzc());
        ((zzeev) zzedhVar.zzc).zzc(zzdohVarZzd.zzo());
        return zzdohVarZzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            if (zzfcoVar.zzo.zza == 3) {
                zzbrnVar.zzo(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcoVar.zzd, new xd.b(this.zza), new zzehi(this, zzedhVar, null), (zzbpu) zzedhVar.zzc);
            } else {
                zzbrnVar.zzp(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcoVar.zzd, new xd.b(this.zza), new zzehi(this, zzedhVar, null), (zzbpu) zzedhVar.zzc);
            }
        } catch (RemoteException e10) {
            l0.l("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
