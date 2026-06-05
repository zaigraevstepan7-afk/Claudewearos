package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import mc.j;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzehv implements zzdgg {
    private final Context zza;
    private final zzdpc zzb;
    private final zzfco zzc;
    private final rc.a zzd;
    private final zzfbt zze;
    private final mf.a zzf;
    private final zzcfe zzg;
    private final zzbkg zzh;
    private final boolean zzi;
    private final zzecd zzj;
    private final zzdrw zzk;
    private final zzdsc zzl;

    public zzehv(Context context, zzdpc zzdpcVar, zzfco zzfcoVar, rc.a aVar, zzfbt zzfbtVar, mf.a aVar2, zzcfe zzcfeVar, zzbkg zzbkgVar, boolean z2, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzdpcVar;
        this.zzc = zzfcoVar;
        this.zzd = aVar;
        this.zze = zzfbtVar;
        this.zzf = aVar2;
        this.zzg = zzcfeVar;
        this.zzh = zzbkgVar;
        this.zzi = z2;
        this.zzj = zzecdVar;
        this.zzk = zzdrwVar;
        this.zzl = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z2, Context context, zzcwe zzcweVar) throws NumberFormatException {
        zzdoh zzdohVar = (zzdoh) zzgdb.zzq(this.zzf);
        try {
            zzfbt zzfbtVar = this.zze;
            final zzcfe zzcfeVarZza = this.zzg;
            if (zzcfeVarZza.zzaG()) {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaZ)).booleanValue()) {
                    zzcfeVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbkv.zzb(zzcfeVarZza, zzdohVar.zzg());
                    final zzdpg zzdpgVar = new zzdpg();
                    zzdpgVar.zza(this.zza, zzcfeVarZza.zzF());
                    zzdohVar.zzl().zzi(zzcfeVarZza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzeht
                        @Override // com.google.android.gms.internal.ads.zzcgu
                        public final void zza(boolean z10, int i10, String str, String str2) {
                            zzdpgVar.zzb();
                            zzcfe zzcfeVar = zzcfeVarZza;
                            zzcfeVar.zzab();
                            zzcfeVar.zzN().zzs();
                        }
                    });
                    zzcfeVarZza.zzN().zzK(new zzcgv() { // from class: com.google.android.gms.internal.ads.zzehu
                        @Override // com.google.android.gms.internal.ads.zzcgv
                        public final void zza() {
                            zzcfeVarZza.zzaa();
                        }
                    });
                    zzfby zzfbyVar = zzfbtVar.zzs;
                    zzcfeVarZza.zzae(zzfbyVar.zzb, zzfbyVar.zza, null);
                }
            }
            zzcfe zzcfeVar = zzcfeVarZza;
            zzcfeVar.zzaq(true);
            boolean z10 = this.zzi;
            boolean z11 = false;
            boolean zZze = z10 ? this.zzh.zze(false) : false;
            r0 r0Var = n.D.f11577c;
            boolean zH = r0.h(this.zza);
            if (z10 && this.zzh.zzd()) {
                z11 = true;
            }
            float fZza = z10 ? this.zzh.zza() : 0.0f;
            zzfbt zzfbtVar2 = this.zze;
            j jVar = new j(zZze, zH, z11, fZza, z2, zzfbtVar2.zzO, zzfbtVar2.zzP);
            if (zzcweVar != null) {
                zzcweVar.zzf();
            }
            zzdfv zzdfvVarZzh = zzdohVar.zzh();
            int i10 = zzfbtVar2.zzQ;
            rc.a aVar = this.zzd;
            String str = zzfbtVar2.zzB;
            zzfby zzfbyVar2 = zzfbtVar2.zzs;
            y9.a.m(context, new AdOverlayInfoParcel(zzdfvVarZzh, zzcfeVar, i10, aVar, str, jVar, zzfbyVar2.zzb, zzfbyVar2.zza, this.zzc.zzf, zzcweVar, zzfbtVar2.zzb() ? this.zzj : null, zzcfeVar.zzr()), true, this.zzl);
        } catch (zzcfq e10) {
            int i11 = l0.f13401b;
            k.e("", e10);
        }
    }
}
