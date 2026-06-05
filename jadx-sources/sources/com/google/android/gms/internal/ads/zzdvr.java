package com.google.android.gms.internal.ads;

import fc.i;
import fc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdvr extends fc.c {
    final /* synthetic */ String zza;
    final /* synthetic */ i zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdvy zzd;

    public zzdvr(zzdvy zzdvyVar, String str, i iVar, String str2) {
        this.zza = str;
        this.zzb = iVar;
        this.zzc = str2;
        this.zzd = zzdvyVar;
    }

    @Override // fc.c
    public final void onAdFailedToLoad(m mVar) {
        this.zzd.zzm(zzdvy.zzl(mVar), this.zzc);
    }

    @Override // fc.c
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
