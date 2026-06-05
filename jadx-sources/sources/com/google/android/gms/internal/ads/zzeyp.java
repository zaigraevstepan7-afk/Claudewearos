package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import nc.q3;
import nc.v3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeyp implements zzfew {
    public final zzezj zza;
    public final zzezl zzb;
    public final q3 zzc;
    public final String zzd;
    public final Executor zze;
    public final v3 zzf;
    public final zzfel zzg;

    public zzeyp(zzezj zzezjVar, zzezl zzezlVar, q3 q3Var, String str, Executor executor, v3 v3Var, zzfel zzfelVar) {
        this.zza = zzezjVar;
        this.zzb = zzezlVar;
        this.zzc = q3Var;
        this.zzd = str;
        this.zze = executor;
        this.zzf = v3Var;
        this.zzg = zzfelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfew
    public final zzfel zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfew
    public final Executor zzb() {
        return this.zze;
    }
}
