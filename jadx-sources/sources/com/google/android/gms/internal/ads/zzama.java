package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzama {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzen zzc = new zzen();
    private final StringBuilder zzd = new StringBuilder();

    public static String zza(zzen zzenVar, StringBuilder sb2) {
        zzc(zzenVar);
        if (zzenVar.zza() == 0) {
            return null;
        }
        String strZzd = zzd(zzenVar, sb2);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzenVar.zzm();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(cZzm);
        return sb3.toString();
    }

    public static void zzc(zzen zzenVar) {
        while (true) {
            for (boolean z2 = true; zzenVar.zza() > 0 && z2; z2 = false) {
                char c6 = (char) zzenVar.zzN()[zzenVar.zzc()];
                if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
                    zzenVar.zzM(1);
                } else {
                    int iZzc = zzenVar.zzc();
                    int iZzd = zzenVar.zzd();
                    byte[] bArrZzN = zzenVar.zzN();
                    if (iZzc + 2 <= iZzd) {
                        int i10 = iZzc + 1;
                        if (bArrZzN[iZzc] == 47) {
                            int i11 = iZzc + 2;
                            if (bArrZzN[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iZzd) {
                                        break;
                                    }
                                    if (((char) bArrZzN[i11]) == '*' && ((char) bArrZzN[i12]) == '/') {
                                        iZzd = i11 + 2;
                                        i11 = iZzd;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzenVar.zzM(iZzd - zzenVar.zzc());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzen zzenVar, StringBuilder sb2) {
        boolean z2;
        char c6;
        sb2.setLength(0);
        int iZzc = zzenVar.zzc();
        int iZzd = zzenVar.zzd();
        loop0: while (true) {
            for (false; iZzc < iZzd && !z2; true) {
                c6 = (char) zzenVar.zzN()[iZzc];
                z2 = (c6 < 'A' || c6 > 'Z') && (c6 < 'a' || c6 > 'z') && !((c6 >= '0' && c6 <= '9') || c6 == '#' || c6 == '-' || c6 == '.' || c6 == '_');
            }
            sb2.append(c6);
            iZzc++;
        }
        zzenVar.zzM(iZzc - zzenVar.zzc());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f4, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzen r18) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzama.zzb(com.google.android.gms.internal.ads.zzen):java.util.List");
    }
}
