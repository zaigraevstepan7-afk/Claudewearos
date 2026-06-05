package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import nc.l2;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeep implements zzedk {
    private final Context zza;
    private final zzcps zzb;
    private View zzc;
    private zzbpx zzd;

    public zzeep(Context context, zzcps zzcpsVar) {
        this.zza = context;
        this.zzb = zzcpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final Object zza(zzfcf zzfcfVar, final zzfbt zzfbtVar, final zzedh zzedhVar) throws zzfcv {
        final View view;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            try {
                view = (View) xd.b.u(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfcv(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeem
                            @Override // com.google.android.gms.internal.ads.zzgci
                            public final mf.a zza(Object obj) {
                                return zzgdb.zzh(zzcqh.zza(this.zza.zza, view, zzfbtVar));
                            }
                        }, zzcad.zzf).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfcv(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfcv(e11);
            }
        } else {
            view = this.zzc;
        }
        zzcoo zzcooVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzcou(view, null, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzeel
            @Override // com.google.android.gms.internal.ads.zzcqt
            public final l2 zza() throws zzfcv {
                try {
                    return ((zzbrn) zzedhVar.zzb).zze();
                } catch (RemoteException e12) {
                    throw new zzfcv(e12);
                }
            }
        }, (zzfbu) zzfbtVar.zzu.get(0)));
        zzcooVarZza.zzh().zza(view);
        ((zzeev) zzedhVar.zzc).zzc(zzcooVarZza.zzj());
        return zzcooVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzeeo zzeeoVar = null;
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
                String str = zzfbtVar.zzU;
                String string = zzfbtVar.zzv.toString();
                zzfco zzfcoVar = zzfcfVar.zza.zza;
                zzbrnVar.zzk(str, string, zzfcoVar.zzd, new xd.b(this.zza), new zzeen(this, zzedhVar, zzeeoVar), (zzbpu) zzedhVar.zzc, zzfcoVar.zze);
                return;
            }
            String str2 = zzfbtVar.zzU;
            String string2 = zzfbtVar.zzv.toString();
            zzfco zzfcoVar2 = zzfcfVar.zza.zza;
            zzbrnVar.zzj(str2, string2, zzfcoVar2.zzd, new xd.b(this.zza), new zzeen(this, zzedhVar, zzeeoVar), (zzbpu) zzedhVar.zzc, zzfcoVar2.zze);
        } catch (RemoteException e10) {
            throw new zzfcv(e10);
        }
    }
}
