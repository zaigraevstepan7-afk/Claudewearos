package com.google.android.gms.internal.p002firebaseauthapi;

import ig.b0;
import wd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaae implements zzadm<zzafm> {
    private final /* synthetic */ b0 zza;
    private final /* synthetic */ zzacf zzb;
    private final /* synthetic */ zzyl zzc;

    public zzaae(zzyl zzylVar, b0 b0Var, zzacf zzacfVar) {
        this.zza = b0Var;
        this.zzb = zzacfVar;
        this.zzc = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadn
    public final void zza(String str) {
        this.zzb.zza(a.T(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzafm zzafmVar) {
        zzafm zzafmVar2 = zzafmVar;
        zzagf zzagfVar = new zzagf();
        zzagfVar.zzd(zzafmVar2.zzc());
        b0 b0Var = this.zza;
        if (b0Var.f8521c || b0Var.f8519a != null) {
            zzagfVar.zzb(b0Var.f8519a);
        }
        b0 b0Var2 = this.zza;
        if (b0Var2.f8522d || b0Var2.f8523e != null) {
            zzagfVar.zzg(b0Var2.f8520b);
        }
        zzyl.zza(this.zzc, this.zzb, zzafmVar2, zzagfVar, this);
    }
}
