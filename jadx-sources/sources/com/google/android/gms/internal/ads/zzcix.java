package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcix implements zzdtf {
    private final Long zza;
    private final String zzb;
    private final zzcij zzc;
    private final zzciz zzd;

    public zzcix(zzcij zzcijVar, zzciz zzcizVar, Long l10, String str) {
        this.zzc = zzcijVar;
        this.zzd = zzcizVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdtp zza() {
        zzciz zzcizVar = this.zzd;
        return zzdtq.zza(this.zza.longValue(), zzcizVar.zze, zzcizVar.zzc(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdtt zzb() {
        zzciz zzcizVar = this.zzd;
        return zzdtu.zza(this.zza.longValue(), zzcizVar.zze, zzcizVar.zzc(), this.zzc, this.zzb);
    }
}
