package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzefk implements zzedk {
    private final Context zza;
    private final zzdfy zzb;

    public zzefk(Context context, zzdfy zzdfyVar) {
        this.zza = context;
        this.zzb = zzdfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) {
        zzefe zzefeVar = new zzefe(zzfbtVar, (zzbrn) zzedhVar.zzb, fc.b.INTERSTITIAL);
        zzdev zzdevVarZzd = this.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(zzefeVar, null));
        zzefeVar.zzc(zzdevVarZzd.zzc());
        ((zzeev) zzedhVar.zzc).zzc(zzdevVarZzd.zzj());
        return zzdevVarZzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzbrnVar.zzl(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcfVar.zza.zza.zzd, new xd.b(this.zza), new zzefi(this, zzedhVar, null), (zzbpu) zzedhVar.zzc);
        } catch (RemoteException e10) {
            l0.l("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfcv(e10);
        }
    }
}
