package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zza {
    public final long zza;
    public final int zzb;

    @Deprecated
    public final Uri[] zzc;
    public final zzap[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final String[] zzg;
    public final long zzh;
    public final boolean zzi;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
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
    }

    public zza(long j) {
        this(0L, -1, -1, new int[0], new zzap[0], new long[0], 0L, false, new String[0], false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.zzb == zzaVar.zzb && Arrays.equals(this.zzd, zzaVar.zzd) && Arrays.equals(this.zze, zzaVar.zze) && Arrays.equals(this.zzf, zzaVar.zzf) && Arrays.equals(this.zzg, zzaVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.zzf) + ((Arrays.hashCode(this.zze) + ((Arrays.hashCode(this.zzd) + (((this.zzb * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.zzg)) * 31;
    }

    public final int zza(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final zza zzb(int i10) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new zza(0L, 0, -1, iArrCopyOf, (zzap[]) Arrays.copyOf(this.zzd, 0), jArrCopyOf, 0L, false, (String[]) Arrays.copyOf(this.zzg, 0), false);
    }

    private zza(long j, int i10, int i11, int[] iArr, zzap[] zzapVarArr, long[] jArr, long j4, boolean z2, String[] strArr, boolean z10) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzapVarArr.length;
        int i12 = 0;
        zzdd.zzd(length == length2);
        this.zza = 0L;
        this.zzb = i10;
        this.zze = iArr;
        this.zzd = zzapVarArr;
        this.zzf = jArr;
        this.zzh = 0L;
        this.zzi = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i12 >= uriArr.length) {
                this.zzg = strArr;
                return;
            }
            zzap zzapVar = zzapVarArr[i12];
            if (zzapVar == null) {
                uri = null;
            } else {
                zzak zzakVar = zzapVar.zzb;
                zzakVar.getClass();
                uri = zzakVar.zza;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }
}
