package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcnv {
    private final zzdsc zza;
    private final zzfcf zzb;

    public zzcnv(zzdsc zzdscVar, zzfcf zzfcfVar) {
        this.zza = zzdscVar;
        this.zzb = zzfcfVar;
    }

    public final void zza(long j, int i10) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzd(this.zzb.zzb.zzb);
        zzdsbVarZza.zzb("action", "ad_closed");
        zzdsbVarZza.zzb("show_time", String.valueOf(j));
        zzdsbVarZza.zzb("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        zzdsbVarZza.zzb("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zzdsbVarZza.zzj();
    }
}
