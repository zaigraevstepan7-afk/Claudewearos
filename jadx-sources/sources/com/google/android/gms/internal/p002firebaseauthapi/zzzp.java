package com.google.android.gms.internal.p002firebaseauthapi;

import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzzp implements zzadm<zzaet> {
    private final /* synthetic */ zzzq zza;

    public zzzp(zzzq zzzqVar) {
        this.zza = zzzqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zza.zza.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaet zzaetVar) {
        zzaet zzaetVar2 = zzaetVar;
        zzafm zzafmVar = new zzafm(zzaetVar2.zzb(), zzaetVar2.zza(), Long.valueOf(zzafo.zza(zzaetVar2.zza())), "Bearer");
        zzzq zzzqVar = this.zza;
        zzzqVar.zzb.zza(zzafmVar, null, null, Boolean.FALSE, null, zzzqVar.zza, this);
    }
}
