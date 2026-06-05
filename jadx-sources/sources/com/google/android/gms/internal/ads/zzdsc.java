package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdsc {
    private final zzdsh zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdsc(zzdsh zzdshVar, Executor executor) {
        this.zza = zzdshVar;
        this.zzc = zzdshVar.zza();
        this.zzb = executor;
    }

    public final zzdsb zza() {
        zzdsb zzdsbVar = new zzdsb(this);
        zzdsb.zza(zzdsbVar);
        return zzdsbVar;
    }

    public final void zze() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlQ)).booleanValue()) {
            zzdsb zzdsbVarZza = zza();
            zzdsbVarZza.zzb("action", "pecr");
            zzdsbVarZza.zzj();
        }
    }
}
