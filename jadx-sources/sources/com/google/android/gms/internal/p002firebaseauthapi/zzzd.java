package com.google.android.gms.internal.p002firebaseauthapi;

import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzzd implements zzadm<zzafm> {
    final /* synthetic */ zzacf zza;
    final /* synthetic */ zzyl zzb;
    private final /* synthetic */ zzahb zzc;

    public zzzd(zzyl zzylVar, zzahb zzahbVar, zzacf zzacfVar) {
        this.zzc = zzahbVar;
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zza.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        this.zzc.zza(zzafmVar.zzc());
        this.zzb.zza.zza(this.zzc, new zzzg(this, this));
    }
}
