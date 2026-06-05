package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcin implements zzewt {
    private final zzcij zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcin(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final /* bridge */ /* synthetic */ zzewt zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final /* bridge */ /* synthetic */ zzewt zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final zzewu zzc() {
        zzhgg.zzc(this.zzb, Context.class);
        zzhgg.zzc(this.zzc, String.class);
        return new zzcio(this.zza, this.zzb, this.zzc);
    }
}
