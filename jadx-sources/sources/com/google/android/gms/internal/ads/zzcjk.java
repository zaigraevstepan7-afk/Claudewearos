package com.google.android.gms.internal.ads;

import xc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcjk implements xc.b {
    private final zzcij zza;
    private zzcva zzb;
    private n zzc;

    public /* synthetic */ zzcjk(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // xc.b
    public final /* bridge */ /* synthetic */ xc.b zza(zzcva zzcvaVar) {
        this.zzb = zzcvaVar;
        return this;
    }

    @Override // xc.b
    public final /* bridge */ /* synthetic */ xc.b zzb(n nVar) {
        this.zzc = nVar;
        return this;
    }

    @Override // xc.b
    public final xc.c zzc() {
        zzhgg.zzc(this.zzb, zzcva.class);
        zzhgg.zzc(this.zzc, n.class);
        return new zzcjl(this.zza, this.zzc, new zzcsb(), new zzcuc(), new zzdsr(), this.zzb, null, null);
    }
}
