package com.google.android.gms.internal.p002firebaseauthapi;

import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzys implements zzadm<zzaer> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzys(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zza.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaer zzaerVar) {
        zzaer zzaerVar2 = zzaerVar;
        if (zzaerVar2.zzf()) {
            this.zza.zza(new zzym(zzaerVar2.zzc(), zzaerVar2.zze(), null));
        } else {
            this.zzb.zza(new zzafm(zzaerVar2.zzd(), zzaerVar2.zzb(), Long.valueOf(zzaerVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzaerVar2.zzg()), null, this.zza, this);
        }
    }
}
