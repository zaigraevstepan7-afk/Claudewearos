package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbf {
    public final Object zza;
    public final int zzb;
    public final zzap zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbf(Object obj, int i10, zzap zzapVar, Object obj2, int i11, long j, long j4, int i12, int i13) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = zzapVar;
        this.zzd = obj2;
        this.zze = i11;
        this.zzf = j;
        this.zzg = j4;
        this.zzh = i12;
        this.zzi = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbf.class == obj.getClass()) {
            zzbf zzbfVar = (zzbf) obj;
            if (this.zzb == zzbfVar.zzb && this.zze == zzbfVar.zze && this.zzf == zzbfVar.zzf && this.zzg == zzbfVar.zzg && this.zzh == zzbfVar.zzh && this.zzi == zzbfVar.zzi && Objects.equals(this.zzc, zzbfVar.zzc) && Objects.equals(this.zza, zzbfVar.zza) && Objects.equals(this.zzd, zzbfVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }
}
