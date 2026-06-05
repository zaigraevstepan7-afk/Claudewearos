package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzzj implements zzadm<zzafc> {
    private final /* synthetic */ zzadm zza;
    private final /* synthetic */ zzafm zzb;
    private final /* synthetic */ zzzk zzc;

    public zzzj(zzzk zzzkVar, zzadm zzadmVar, zzafm zzafmVar) {
        this.zza = zzadmVar;
        this.zzb = zzafmVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zzc.zzb.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafc zzafcVar) {
        List<zzaff> listZza = zzafcVar.zza();
        if (listZza != null && !listZza.isEmpty()) {
            zzaff zzaffVar = listZza.get(0);
            zzagf zzagfVar = new zzagf();
            zzagfVar.zzd(this.zzb.zzc()).zza(this.zzc.zza);
            zzzk zzzkVar = this.zzc;
            zzyl.zza(zzzkVar.zzc, zzzkVar.zzb, this.zzb, zzaffVar, zzagfVar, this.zza);
            return;
        }
        this.zza.zza("No users.");
    }
}
