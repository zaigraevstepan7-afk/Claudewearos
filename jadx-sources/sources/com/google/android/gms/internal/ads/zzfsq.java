package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfsq extends zzftt {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzftt
    public final zzftt zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final zzftt zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final zzftu zzc() {
        return new zzfss(this.zza, this.zzb, null);
    }
}
