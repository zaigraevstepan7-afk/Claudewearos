package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzzl implements zzadm<zzahc> {
    private final /* synthetic */ zzzm zza;

    public zzzl(zzzm zzzmVar) {
        this.zza = zzzmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zza.zza.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzahc zzahcVar) {
        zzahc zzahcVar2 = zzahcVar;
        if (!TextUtils.isEmpty(zzahcVar2.zza()) && !TextUtils.isEmpty(zzahcVar2.zzb())) {
            zzafm zzafmVar = new zzafm(zzahcVar2.zzb(), zzahcVar2.zza(), Long.valueOf(zzafo.zza(zzahcVar2.zza())), "Bearer");
            zzzm zzzmVar = this.zza;
            zzzmVar.zzb.zza(zzafmVar, null, null, Boolean.FALSE, null, zzzmVar.zza, this);
            return;
        }
        this.zza.zza.zza(a.T("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
