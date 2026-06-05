package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzalk {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalk(String str, int i10, Integer num, Integer num2, float f10, boolean z2, boolean z10, boolean z11, boolean z12, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z2;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = i11;
    }

    public static zzalk zzb(String str, zzali zzaliVar) throws NumberFormatException {
        zzalk zzalkVar;
        int i10;
        zzdd.zzd(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i11 = zzaliVar.zzk;
        if (length != i11) {
            String str2 = zzex.zza;
            Locale locale = Locale.US;
            StringBuilder sbQ = gk.b.q("Skipping malformed 'Style:' line (expected ", i11, " values, found ", length, "): '");
            sbQ.append(str);
            sbQ.append("'");
            zzea.zzf("SsaStyle", sbQ.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[zzaliVar.zza].trim();
            int i12 = zzaliVar.zzb;
            int iZzd = i12 != -1 ? zzd(strArrSplit[i12].trim()) : -1;
            int i13 = zzaliVar.zzc;
            Integer numZzc = i13 != -1 ? zzc(strArrSplit[i13].trim()) : null;
            int i14 = zzaliVar.zzd;
            Integer numZzc2 = i14 != -1 ? zzc(strArrSplit[i14].trim()) : null;
            int i15 = zzaliVar.zze;
            float f10 = -3.4028235E38f;
            if (i15 != -1) {
                String strTrim2 = strArrSplit[i15].trim();
                try {
                    try {
                        f10 = Float.parseFloat(strTrim2);
                        zzalkVar = null;
                    } catch (NumberFormatException e10) {
                        zzalkVar = null;
                        zzea.zzg("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e10);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    zzea.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                    return zzalkVar;
                }
            } else {
                zzalkVar = null;
            }
            int i16 = zzaliVar.zzf;
            boolean z2 = i16 != -1 && zze(strArrSplit[i16].trim());
            int i17 = zzaliVar.zzg;
            boolean z10 = i17 != -1 && zze(strArrSplit[i17].trim());
            int i18 = zzaliVar.zzh;
            boolean z11 = i18 != -1 && zze(strArrSplit[i18].trim());
            int i19 = zzaliVar.zzi;
            boolean z12 = i19 != -1 && zze(strArrSplit[i19].trim());
            int i20 = zzaliVar.zzj;
            if (i20 != -1) {
                String strTrim3 = strArrSplit[i20].trim();
                try {
                    int i21 = Integer.parseInt(strTrim3.trim());
                    if (i21 == 1 || i21 == 3) {
                        i10 = i21;
                    }
                } catch (NumberFormatException unused) {
                }
                zzea.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                i10 = -1;
            } else {
                i10 = -1;
            }
            return new zzalk(strTrim, iZzd, numZzc, numZzc2, f10, z2, z10, z11, z12, i10);
        } catch (RuntimeException e12) {
            e = e12;
            zzalkVar = null;
        }
    }

    public static Integer zzc(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzdd.zzd(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgbi.zzb(((j >> 24) & 255) ^ 255), zzgbi.zzb(j & 255), zzgbi.zzb((j >> 8) & 255), zzgbi.zzb((j >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            zzea.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) throws NumberFormatException {
        int i10;
        try {
            i10 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i10;
            default:
                m6.a.r(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            zzea.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }
}
