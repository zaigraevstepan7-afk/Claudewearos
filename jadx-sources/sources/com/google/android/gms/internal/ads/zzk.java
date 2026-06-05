package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzk {
    public static final zzk zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzi zziVar = new zzi();
        zziVar.zzc(1);
        zziVar.zzb(2);
        zziVar.zzd(3);
        zza = zziVar.zzg();
        zzi zziVar2 = new zzi();
        zziVar2.zzc(1);
        zziVar2.zzb(1);
        zziVar2.zzd(2);
        zziVar2.zzg();
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzk(int i10, int i11, int i12, byte[] bArr, int i13, int i14, zzj zzjVar) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = bArr;
        this.zzf = i13;
        this.zzg = i14;
    }

    public static int zza(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean zzg(zzk zzkVar) {
        if (zzkVar == null) {
            return true;
        }
        int i10 = zzkVar.zzb;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = zzkVar.zzc;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = zzkVar.zzd;
        if ((i12 != -1 && i12 != 3) || zzkVar.zze != null) {
            return false;
        }
        int i13 = zzkVar.zzg;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = zzkVar.zzf;
        return i14 == -1 || i14 == 8;
    }

    private static String zzh(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? m6.a.d(i10, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzi(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? m6.a.d(i10, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzj(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? m6.a.d(i10, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzk.class == obj.getClass()) {
            zzk zzkVar = (zzk) obj;
            if (this.zzb == zzkVar.zzb && this.zzc == zzkVar.zzc && this.zzd == zzkVar.zzd && Arrays.equals(this.zze, zzkVar.zze) && this.zzf == zzkVar.zzf && this.zzg == zzkVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.zzf;
        int i11 = this.zzd;
        int i12 = this.zzc;
        String strZzi = zzi(this.zzb);
        String strZzh = zzh(i12);
        String strZzj = zzj(i11);
        String strM = i10 != -1 ? gk.b.m(i10, "bit Luma") : "NA";
        int i13 = this.zzg;
        String strM2 = i13 != -1 ? gk.b.m(i13, "bit Chroma") : "NA";
        boolean z2 = this.zze != null;
        StringBuilder sbM = m1.m("ColorInfo(", strZzi, ", ", strZzh, ", ");
        sbM.append(strZzj);
        sbM.append(", ");
        sbM.append(z2);
        sbM.append(", ");
        sbM.append(strM);
        sbM.append(", ");
        sbM.append(strM2);
        sbM.append(")");
        return sbM.toString();
    }

    public final zzi zzc() {
        return new zzi(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            String strZzi = zzi(this.zzb);
            String strZzh = zzh(this.zzc);
            String strZzj = zzj(this.zzd);
            String str3 = zzex.zza;
            Locale locale = Locale.US;
            str = strZzi + "/" + strZzh + "/" + strZzj;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + "/" + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return m1.w(str, "/", str2);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
