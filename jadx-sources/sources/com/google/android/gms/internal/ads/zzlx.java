package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzlx extends zzuv {
    private final zzbk zzc;

    public zzlx(zzly zzlyVar, zzbl zzblVar) {
        super(zzblVar);
        this.zzc = new zzbk();
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzbl
    public final zzbj zzd(int i10, zzbj zzbjVar, boolean z2) {
        zzbl zzblVar = this.zzb;
        zzbj zzbjVarZzd = zzblVar.zzd(i10, zzbjVar, z2);
        if (zzblVar.zze(zzbjVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbjVarZzd.zzi(zzbjVar.zza, zzbjVar.zzb, zzbjVar.zzc, zzbjVar.zzd, 0L, zzb.zza, true);
            return zzbjVarZzd;
        }
        zzbjVarZzd.zzf = true;
        return zzbjVarZzd;
    }
}
