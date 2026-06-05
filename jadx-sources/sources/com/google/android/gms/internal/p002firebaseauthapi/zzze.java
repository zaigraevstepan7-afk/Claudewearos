package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzze implements zzadm<zzagg> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzadn zzb;
    private final /* synthetic */ zzyl zzc;

    public zzze(zzyl zzylVar, zzacf zzacfVar, zzadn zzadnVar) {
        this.zza = zzacfVar;
        this.zzb = zzadnVar;
        this.zzc = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagg zzaggVar) {
        zzagg zzaggVar2 = zzaggVar;
        this.zzc.zza(new zzafm(zzaggVar2.zzc(), zzaggVar2.zzb(), Long.valueOf(zzaggVar2.zza()), "Bearer"), null, "password", Boolean.FALSE, null, this.zza, this);
    }
}
