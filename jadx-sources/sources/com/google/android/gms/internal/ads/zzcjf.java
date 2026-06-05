package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcjf implements zzfbm {
    private final zzcij zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjf(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final /* synthetic */ zzfbm zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final /* bridge */ /* synthetic */ zzfbm zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final zzfbn zzc() {
        zzhgg.zzc(this.zzb, Context.class);
        return new zzcjg(this.zza, this.zzb, this.zzc);
    }
}
