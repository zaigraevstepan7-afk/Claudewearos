package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcis implements zzeyh {
    private final zzcij zza;
    private Context zzb;
    private String zzc;
    private s3 zzd;

    public /* synthetic */ zzcis(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyh
    public final /* bridge */ /* synthetic */ zzeyh zza(s3 s3Var) {
        s3Var.getClass();
        this.zzd = s3Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyh
    public final /* bridge */ /* synthetic */ zzeyh zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyh
    public final /* bridge */ /* synthetic */ zzeyh zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyh
    public final zzeyi zzd() {
        zzhgg.zzc(this.zzb, Context.class);
        zzhgg.zzc(this.zzc, String.class);
        zzhgg.zzc(this.zzd, s3.class);
        return new zzcit(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
