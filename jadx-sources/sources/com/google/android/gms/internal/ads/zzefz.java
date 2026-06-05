package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzefz implements zzedk {
    private final Context zza;
    private final zzdgu zzb;
    private zzbqd zzc;
    private final rc.a zzd;

    public zzefz(Context context, zzdgu zzdguVar, rc.a aVar) {
        this.zza = context;
        this.zzb = zzdguVar;
        this.zzd = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzegx {
        ArrayList arrayList = zzfcfVar.zza.zza.zzg;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzegx(2, "Unified must be used for RTB.");
        }
        zzdim zzdimVarZzt = zzdim.zzt(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdimVarZzt.zzc()))) {
            throw new zzegx(1, "No corresponding native ad listener");
        }
        zzdio zzdioVarZze = this.zzb.zze(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdiy(zzdimVarZzt), new zzdkr(null, null, this.zzc));
        ((zzeev) zzedhVar.zzc).zzc(zzdioVarZze.zzj());
        return zzdioVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzefy zzefyVar = null;
            if (this.zzd.f14323c < ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzbR)).intValue()) {
                zzbrnVar.zzm(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcfVar.zza.zza.zzd, new xd.b(this.zza), new zzefx(this, zzedhVar, zzefyVar), (zzbpu) zzedhVar.zzc);
                return;
            }
            String str = zzfbtVar.zzU;
            String string = zzfbtVar.zzv.toString();
            zzfco zzfcoVar = zzfcfVar.zza.zza;
            zzbrnVar.zzn(str, string, zzfcoVar.zzd, new xd.b(this.zza), new zzefx(this, zzedhVar, zzefyVar), (zzbpu) zzedhVar.zzc, zzfcoVar.zzi);
        } catch (RemoteException e10) {
            throw new zzfcv(e10);
        }
    }
}
