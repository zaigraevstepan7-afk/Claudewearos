package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcsv implements nc.a {
    private final zzcsz zza;
    private final zzfco zzb;

    public zzcsv(zzcsz zzcszVar, zzfco zzfcoVar) {
        this.zza = zzcszVar;
        this.zzb = zzfcoVar;
    }

    @Override // nc.a
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
