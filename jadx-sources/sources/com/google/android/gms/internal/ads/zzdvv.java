package com.google.android.gms.internal.ads;

import fc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdvv extends fc.c {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdvy zzb;

    public zzdvv(zzdvy zzdvyVar, String str) {
        this.zza = str;
        this.zzb = zzdvyVar;
    }

    @Override // fc.c
    public final void onAdFailedToLoad(m mVar) {
        this.zzb.zzm(zzdvy.zzl(mVar), this.zza);
    }
}
