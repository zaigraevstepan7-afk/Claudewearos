package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzciw implements zzdte {
    private final zzcij zza;
    private final zzciz zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzciw(zzcij zzcijVar, zzciz zzcizVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
        this.zzb = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final /* bridge */ /* synthetic */ zzdte zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final /* bridge */ /* synthetic */ zzdte zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final zzdtf zzc() {
        zzhgg.zzc(this.zzc, Long.class);
        zzhgg.zzc(this.zzd, String.class);
        return new zzcix(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
