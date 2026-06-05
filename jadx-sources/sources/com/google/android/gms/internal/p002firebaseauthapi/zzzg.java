package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import ig.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzzg implements zzadm<zzaha> {
    private final /* synthetic */ zzadm zza;
    private final /* synthetic */ zzzd zzb;

    public zzzg(zzzd zzzdVar, zzadm zzadmVar) {
        this.zza = zzadmVar;
        this.zzb = zzzdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzaha zzahaVar) {
        zzaha zzahaVar2 = zzahaVar;
        if (TextUtils.isEmpty(zzahaVar2.zze())) {
            this.zzb.zzb.zza(new zzafm(zzahaVar2.zzd(), zzahaVar2.zzb(), Long.valueOf(zzahaVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzahaVar2.zzf()), null, this.zzb.zza, this.zza);
        } else {
            this.zzb.zza.zza(new Status(17025, null, null, null), new r(null, null, zzahaVar2.zzc(), zzahaVar2.zze(), true));
        }
    }
}
