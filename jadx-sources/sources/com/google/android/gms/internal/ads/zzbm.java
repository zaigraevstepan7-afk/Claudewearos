package com.google.android.gms.internal.ads;

import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbm {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzz[] zzd;
    private int zze;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbm(String str, zzz... zzzVarArr) {
        int length = zzzVarArr.length;
        int i10 = 1;
        zzdd.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzzVarArr;
        this.zza = length;
        int iZzb = zzay.zzb(zzzVarArr[0].zzo);
        this.zzc = iZzb == -1 ? zzay.zzb(zzzVarArr[0].zzn) : iZzb;
        String strZzc = zzc(zzzVarArr[0].zzd);
        int i11 = zzzVarArr[0].zzf | 16384;
        while (true) {
            zzz[] zzzVarArr2 = this.zzd;
            if (i10 >= zzzVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzzVarArr2[i10].zzd))) {
                zzz[] zzzVarArr3 = this.zzd;
                zzd("languages", zzzVarArr3[0].zzd, zzzVarArr3[i10].zzd, i10);
                return;
            } else {
                zzz[] zzzVarArr4 = this.zzd;
                if (i11 != (zzzVarArr4[i10].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzzVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i10].zzf), i10);
                    return;
                }
                i10++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i10) {
        StringBuilder sbM = m1.m("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM.append(str3);
        sbM.append("' (track ");
        sbM.append(i10);
        sbM.append(")");
        zzea.zzd("TrackGroup", "", new IllegalStateException(sbM.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.zzb.equals(zzbmVar.zzb) && Arrays.equals(this.zzd, zzbmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzb.hashCode() + 527;
        int iHashCode2 = Arrays.hashCode(this.zzd) + (iHashCode * 31);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return this.zzb + ": " + Arrays.toString(this.zzd);
    }

    public final int zza(zzz zzzVar) {
        int i10 = 0;
        while (true) {
            zzz[] zzzVarArr = this.zzd;
            if (i10 >= zzzVarArr.length) {
                return -1;
            }
            if (zzzVar == zzzVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final zzz zzb(int i10) {
        return this.zzd[i10];
    }
}
