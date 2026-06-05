package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzyz {
    private final int[] zza;
    private final zzxk[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzxk zze;

    public zzyz(String[] strArr, int[] iArr, zzxk[] zzxkVarArr, int[] iArr2, int[][][] iArr3, zzxk zzxkVar) {
        this.zza = iArr;
        this.zzb = zzxkVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzxkVar;
    }

    public final int zza(int i10, int i11, boolean z2) {
        zzxk[] zzxkVarArr = this.zzb;
        int i12 = zzxkVarArr[i10].zzb(i11).zza;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.zzd[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int i16 = 0;
        int iMin = 16;
        boolean z10 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = zzxkVarArr[i10].zzb(i11).zzb(iArrCopyOf[i13]).zzo;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z10 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z10 ? Math.min(iMin, this.zzc[i10]) : iMin;
    }

    public final int zzb(int i10, int i11, int i12) {
        return this.zzd[i10][i11][i12];
    }

    public final int zzc(int i10) {
        return this.zza[i10];
    }

    public final zzxk zzd(int i10) {
        return this.zzb[i10];
    }

    public final zzxk zze() {
        return this.zze;
    }
}
