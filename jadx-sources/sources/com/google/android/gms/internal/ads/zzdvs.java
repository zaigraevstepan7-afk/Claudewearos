package com.google.android.gms.internal.ads;

import fc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdvs extends sc.b {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdvy zzc;

    public zzdvs(zzdvy zzdvyVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdvyVar;
    }

    @Override // fc.d
    public final void onAdFailedToLoad(m mVar) {
        this.zzc.zzm(zzdvy.zzl(mVar), this.zzb);
    }

    @Override // fc.d
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, (sc.a) obj, str);
    }
}
