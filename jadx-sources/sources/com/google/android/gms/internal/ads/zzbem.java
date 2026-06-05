package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzbem {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbem(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbem zza(String str, double d10) {
        return new zzbem(str, Double.valueOf(d10), 3);
    }

    public static zzbem zzb(String str, long j) {
        return new zzbem(str, Long.valueOf(j), 2);
    }

    public static zzbem zzc(String str, String str2) {
        return new zzbem("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbem zzd(String str, boolean z2) {
        return new zzbem(str, Boolean.valueOf(z2), 1);
    }

    public final Object zze() {
        zzbfr zzbfrVarZza = zzbft.zza();
        if (zzbfrVarZza != null) {
            int i10 = this.zzc - 1;
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? zzbfrVarZza.zzd(this.zza, (String) this.zzb) : zzbfrVarZza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zzbfrVarZza.zzc(this.zza, ((Long) this.zzb).longValue()) : zzbfrVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbft.zzb() != null) {
            zzbft.zzb().zza();
        }
        return this.zzb;
    }
}
