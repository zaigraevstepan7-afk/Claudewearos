package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcva {
    private final Context zza;
    private final zzfco zzb;
    private final Bundle zzc;
    private final zzfcg zzd;
    private final zzcur zze;
    private final zzedj zzf;
    private final int zzg;

    public /* synthetic */ zzcva(zzcuy zzcuyVar, zzcuz zzcuzVar) {
        this.zza = zzcuyVar.zza;
        this.zzb = zzcuyVar.zzb;
        this.zzc = zzcuyVar.zzc;
        this.zzd = zzcuyVar.zzd;
        this.zze = zzcuyVar.zze;
        this.zzf = zzcuyVar.zzf;
        this.zzg = zzcuyVar.zzg;
    }

    public final int zza() {
        return this.zzg;
    }

    public final Context zzb(Context context) {
        return this.zza;
    }

    public final Bundle zzc() {
        return this.zzc;
    }

    public final zzcur zzd() {
        return this.zze;
    }

    public final zzcuy zze() {
        zzcuy zzcuyVar = new zzcuy();
        zzcuyVar.zzf(this.zza);
        zzcuyVar.zzk(this.zzb);
        zzcuyVar.zzg(this.zzc);
        zzcuyVar.zzh(this.zze);
        zzcuyVar.zze(this.zzf);
        return zzcuyVar;
    }

    public final zzedj zzf(String str) {
        zzedj zzedjVar = this.zzf;
        return zzedjVar != null ? zzedjVar : new zzedj(str);
    }

    public final zzfcg zzg() {
        return this.zzd;
    }

    public final zzfco zzh() {
        return this.zzb;
    }
}
