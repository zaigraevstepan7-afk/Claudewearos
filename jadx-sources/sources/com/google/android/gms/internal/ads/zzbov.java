package com.google.android.gms.internal.ads;

import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbov implements zzcam {
    final /* synthetic */ zzboa zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcai zzc;
    final /* synthetic */ zzboy zzd;

    public zzbov(zzboy zzboyVar, zzboa zzboaVar, Object obj, zzcai zzcaiVar) {
        this.zza = zzboaVar;
        this.zzb = obj;
        this.zzc = zzcaiVar;
        this.zzd = zzboyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        l0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcai zzcaiVar = this.zzc;
        zzboy.zzd(this.zzd, this.zza, (zzboh) obj, obj2, zzcaiVar);
    }
}
