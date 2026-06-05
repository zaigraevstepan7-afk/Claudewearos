package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbs {
    public final int zza;
    private final zzbm zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbs(zzbm zzbmVar, boolean z2, int[] iArr, boolean[] zArr) {
        int i10 = zzbmVar.zza;
        this.zza = i10;
        zzdd.zzd(i10 == iArr.length && i10 == zArr.length);
        this.zzb = zzbmVar;
        this.zzc = z2 && i10 > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbs.class == obj.getClass()) {
            zzbs zzbsVar = (zzbs) obj;
            if (this.zzc == zzbsVar.zzc && this.zzb.equals(zzbsVar.zzb) && Arrays.equals(this.zzd, zzbsVar.zzd) && Arrays.equals(this.zze, zzbsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        int[] iArr = this.zzd;
        int iHashCode2 = Arrays.hashCode(iArr) + ((iHashCode + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode2 * 31);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzz zzb(int i10) {
        return this.zzb.zzb(i10);
    }

    public final boolean zzc() {
        for (boolean z2 : this.zze) {
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zze[i10];
    }
}
