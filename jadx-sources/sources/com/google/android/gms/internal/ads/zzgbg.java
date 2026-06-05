package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgbg implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgbg(int[] iArr, int i10, int i11) {
        this.zza = iArr;
        this.zzb = i11;
    }

    public static zzgbg zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgbg(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgbg)) {
            return false;
        }
        zzgbg zzgbgVar = (zzgbg) obj;
        int i10 = this.zzb;
        if (i10 != zzgbgVar.zzb) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (zza(i11) != zzgbgVar.zza(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + this.zza[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zzb;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.zza;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final int zza(int i10) {
        zzfve.zza(i10, this.zzb, "index");
        return this.zza[i10];
    }
}
