package com.google.android.gms.internal.p002firebaseauthapi;

import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzzs implements zzadm<zzaev> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzzs(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zza.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaev zzaevVar) {
        zzaev zzaevVar2 = zzaevVar;
        this.zzb.zza(new zzafm(zzaevVar2.zzb(), zzaevVar2.zza(), Long.valueOf(zzafo.zza(zzaevVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
