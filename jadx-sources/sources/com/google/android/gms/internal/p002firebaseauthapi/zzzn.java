package com.google.android.gms.internal.p002firebaseauthapi;

import t.m1;
import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzzn implements zzadm<zzagi> {
    private final /* synthetic */ zzagj zza;
    private final /* synthetic */ zzacf zzb;

    public zzzn(zzyl zzylVar, zzagj zzagjVar, zzacf zzacfVar) {
        this.zza = zzagjVar;
        this.zzb = zzacfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zzb.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagi zzagiVar) {
        zzagi zzagiVar2 = zzagiVar;
        zzagj zzagjVar = this.zza;
        if (zzagjVar instanceof zzagn) {
            this.zzb.zzb(zzagiVar2.zza());
        } else {
            if (zzagjVar instanceof zzagp) {
                this.zzb.zza(zzagiVar2);
                return;
            }
            throw new IllegalArgumentException(m1.j("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
        }
    }
}
