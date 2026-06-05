package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzahg extends zzahd {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzahg(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahg.class == obj.getClass()) {
            zzahg zzahgVar = (zzahg) obj;
            if (this.zza == zzahgVar.zza && this.zzb == zzahgVar.zzb && this.zzc == zzahgVar.zzc && Arrays.equals(this.zzd, zzahgVar.zzd) && Arrays.equals(this.zze, zzahgVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza + 527;
        int[] iArr = this.zzd;
        int iHashCode = Arrays.hashCode(iArr) + (((((i10 * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode * 31);
    }
}
