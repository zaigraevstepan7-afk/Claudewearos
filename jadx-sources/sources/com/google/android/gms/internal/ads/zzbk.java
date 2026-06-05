package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbk {
    public static final Object zza = new Object();
    private static final zzap zzp;

    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    public zzaj zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzap zzd = zzp;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("androidx.media3.common.Timeline");
        zzadVar.zzb(Uri.EMPTY);
        zzp = zzadVar.zzc();
        String str = zzex.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbk.class.equals(obj.getClass())) {
            zzbk zzbkVar = (zzbk) obj;
            if (Objects.equals(this.zzb, zzbkVar.zzb) && Objects.equals(this.zzd, zzbkVar.zzd) && Objects.equals(this.zzj, zzbkVar.zzj) && this.zze == zzbkVar.zze && this.zzf == zzbkVar.zzf && this.zzg == zzbkVar.zzg && this.zzh == zzbkVar.zzh && this.zzi == zzbkVar.zzi && this.zzk == zzbkVar.zzk && this.zzm == zzbkVar.zzm && this.zzn == zzbkVar.zzn && this.zzo == zzbkVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzaj zzajVar = this.zzj;
        int iHashCode2 = ((iHashCode * 961) + (zzajVar == null ? 0 : zzajVar.hashCode())) * 31;
        long j = this.zze;
        int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.zzf;
        int i11 = (i10 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.zzg;
        int i12 = ((((((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j11 = this.zzm;
        return ((((((i12 * 961) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbk zza(Object obj, zzap zzapVar, Object obj2, long j, long j4, long j10, boolean z2, boolean z10, zzaj zzajVar, long j11, long j12, int i10, int i11, long j13) {
        this.zzb = obj;
        if (zzapVar == null) {
            zzapVar = zzp;
        }
        this.zzd = zzapVar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z2;
        this.zzi = z10;
        this.zzj = zzajVar;
        this.zzl = 0L;
        this.zzm = j12;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
