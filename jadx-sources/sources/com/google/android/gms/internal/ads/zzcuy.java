package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcuy {
    private Context zza;
    private zzfco zzb;
    private Bundle zzc;
    private zzfcg zzd;
    private zzcur zze;
    private zzedj zzf;
    private int zzg = 0;

    public final zzcuy zze(zzedj zzedjVar) {
        this.zzf = zzedjVar;
        return this;
    }

    public final zzcuy zzf(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcuy zzg(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcuy zzh(zzcur zzcurVar) {
        this.zze = zzcurVar;
        return this;
    }

    public final zzcuy zzi(int i10) {
        this.zzg = i10;
        return this;
    }

    public final zzcuy zzj(zzfcg zzfcgVar) {
        this.zzd = zzfcgVar;
        return this;
    }

    public final zzcuy zzk(zzfco zzfcoVar) {
        this.zzb = zzfcoVar;
        return this;
    }

    public final zzcva zzl() {
        return new zzcva(this, null);
    }
}
