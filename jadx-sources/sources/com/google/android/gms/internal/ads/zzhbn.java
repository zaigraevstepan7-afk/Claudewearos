package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhbn extends zzhbl {
    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzgyv zzgyvVar = (zzgyv) obj;
        zzhbm zzhbmVar = zzgyvVar.zzt;
        if (zzhbmVar != zzhbm.zzc()) {
            return zzhbmVar;
        }
        zzhbm zzhbmVarZzf = zzhbm.zzf();
        zzgyvVar.zzt = zzhbmVarZzf;
        return zzhbmVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* synthetic */ Object zzb() {
        return zzhbm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* synthetic */ Object zzc(Object obj) {
        zzhbm zzhbmVar = (zzhbm) obj;
        zzhbmVar.zzh();
        return zzhbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, int i11) {
        ((zzhbm) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i10, long j) {
        ((zzhbm) obj).zzj((i10 << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, Object obj2) {
        ((zzhbm) obj).zzj((i10 << 3) | 3, (zzhbm) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i10, zzgxn zzgxnVar) {
        ((zzhbm) obj).zzj((i10 << 3) | 2, zzgxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, long j) {
        ((zzhbm) obj).zzj(i10 << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final void zzi(Object obj) {
        ((zzgyv) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzgyv) obj).zzt = (zzhbm) obj2;
    }
}
