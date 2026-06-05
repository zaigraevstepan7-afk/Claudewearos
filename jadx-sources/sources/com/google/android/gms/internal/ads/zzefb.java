package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import mc.j;
import mc.n;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzefb implements zzdgg {
    private final Context zza;
    private final rc.a zzb;
    private final mf.a zzc;
    private final zzfbt zzd;
    private final zzcfe zze;
    private final zzfco zzf;
    private final zzbkg zzg;
    private final boolean zzh;
    private final zzecd zzi;
    private final zzdsc zzj;

    public zzefb(Context context, rc.a aVar, mf.a aVar2, zzfbt zzfbtVar, zzcfe zzcfeVar, zzfco zzfcoVar, boolean z2, zzbkg zzbkgVar, zzecd zzecdVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = aVar2;
        this.zzd = zzfbtVar;
        this.zze = zzcfeVar;
        this.zzf = zzfcoVar;
        this.zzg = zzbkgVar;
        this.zzh = z2;
        this.zzi = zzecdVar;
        this.zzj = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z2, Context context, zzcwe zzcweVar) throws NumberFormatException {
        zzdev zzdevVar = (zzdev) zzgdb.zzq(this.zzc);
        zzcfe zzcfeVar = this.zze;
        zzcfeVar.zzaq(true);
        boolean z10 = this.zzh;
        boolean zZze = z10 ? this.zzg.zze(false) : false;
        r0 r0Var = n.D.f11577c;
        boolean zH = r0.h(this.zza);
        boolean z11 = z10 && this.zzg.zzd();
        float fZza = z10 ? this.zzg.zza() : 0.0f;
        zzfbt zzfbtVar = this.zzd;
        j jVar = new j(zZze, zH, z11, fZza, z2, zzfbtVar.zzO, false);
        if (zzcweVar != null) {
            zzcweVar.zzf();
        }
        zzdfv zzdfvVarZzh = zzdevVar.zzh();
        int i10 = zzfbtVar.zzQ;
        rc.a aVar = this.zzb;
        String str = zzfbtVar.zzB;
        zzfby zzfbyVar = zzfbtVar.zzs;
        y9.a.m(context, new AdOverlayInfoParcel(zzdfvVarZzh, zzcfeVar, i10, aVar, str, jVar, zzfbyVar.zzb, zzfbyVar.zza, this.zzf.zzf, zzcweVar, zzfbtVar.zzb() ? this.zzi : null, zzcfeVar.zzr()), true, this.zzj);
    }
}
