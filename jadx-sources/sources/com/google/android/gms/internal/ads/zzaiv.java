package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaiv {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzex.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i10) {
        return (i10 >> 24) & 255;
    }

    public static zzav zzb(zzfc zzfcVar) {
        zzfa zzfaVar;
        zzfd zzfdVarZzb = zzfcVar.zzb(1751411826);
        zzfd zzfdVarZzb2 = zzfcVar.zzb(1801812339);
        zzfd zzfdVarZzb3 = zzfcVar.zzb(1768715124);
        if (zzfdVarZzb != null && zzfdVarZzb2 != null && zzfdVarZzb3 != null && zzi(zzfdVarZzb.zza) == 1835299937) {
            zzen zzenVar = zzfdVarZzb2.zza;
            zzenVar.zzL(12);
            int iZzg = zzenVar.zzg();
            String[] strArr = new String[iZzg];
            for (int i10 = 0; i10 < iZzg; i10++) {
                int iZzg2 = zzenVar.zzg();
                zzenVar.zzM(4);
                strArr[i10] = zzenVar.zzB(iZzg2 - 8, StandardCharsets.UTF_8);
            }
            zzen zzenVar2 = zzfdVarZzb3.zza;
            zzenVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzenVar2.zza() > 8) {
                int iZzg3 = zzenVar2.zzg() + zzenVar2.zzc();
                int iZzg4 = zzenVar2.zzg() - 1;
                if (iZzg4 < 0 || iZzg4 >= iZzg) {
                    m6.a.n(iZzg4, "Skipped metadata with unknown key index: ", "BoxParsers");
                } else {
                    String str = strArr[iZzg4];
                    while (true) {
                        int iZzc = zzenVar2.zzc();
                        if (iZzc >= iZzg3) {
                            zzfaVar = null;
                            break;
                        }
                        int iZzg5 = zzenVar2.zzg();
                        if (zzenVar2.zzg() == 1684108385) {
                            int iZzg6 = zzenVar2.zzg();
                            int iZzg7 = zzenVar2.zzg();
                            int i11 = iZzg5 - 16;
                            byte[] bArr = new byte[i11];
                            zzenVar2.zzH(bArr, 0, i11);
                            zzfaVar = new zzfa(str, bArr, iZzg7, iZzg6);
                            break;
                        }
                        zzenVar2.zzL(iZzc + iZzg5);
                    }
                    if (zzfaVar != null) {
                        arrayList.add(zzfaVar);
                    }
                }
                zzenVar2.zzL(iZzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzav zzc(com.google.android.gms.internal.ads.zzfd r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzc(com.google.android.gms.internal.ads.zzfd):com.google.android.gms.internal.ads.zzav");
    }

    public static zzfh zzd(zzen zzenVar) {
        long jZzt;
        long jZzt2;
        zzenVar.zzL(8);
        if (zza(zzenVar.zzg()) == 0) {
            jZzt = zzenVar.zzu();
            jZzt2 = zzenVar.zzu();
        } else {
            jZzt = zzenVar.zzt();
            jZzt2 = zzenVar.zzt();
        }
        return new zzfh(jZzt, jZzt2, zzenVar.zzu());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzajq zze(com.google.android.gms.internal.ads.zzajn r45, com.google.android.gms.internal.ads.zzfc r46, com.google.android.gms.internal.ads.zzaeh r47) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zze(com.google.android.gms.internal.ads.zzajn, com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaeh):com.google.android.gms.internal.ads.zzajq");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
    
        r23 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0e00 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzfc r78, com.google.android.gms.internal.ads.zzaeh r79, long r80, com.google.android.gms.internal.ads.zzs r82, boolean r83, boolean r84, com.google.android.gms.internal.ads.zzfut r85) {
        /*
            Method dump skipped, instructions count: 3594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzf(com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaeh, long, com.google.android.gms.internal.ads.zzs, boolean, boolean, com.google.android.gms.internal.ads.zzfut):java.util.List");
    }

    public static void zzg(zzen zzenVar) {
        int iZzc = zzenVar.zzc();
        zzenVar.zzM(4);
        if (zzenVar.zzg() != 1751411826) {
            iZzc += 4;
        }
        zzenVar.zzL(iZzc);
    }

    private static int zzh(zzen zzenVar) {
        int iZzm = zzenVar.zzm();
        int i10 = iZzm & 127;
        while ((iZzm & 128) == 128) {
            iZzm = zzenVar.zzm();
            i10 = (i10 << 7) | (iZzm & 127);
        }
        return i10;
    }

    private static int zzi(zzen zzenVar) {
        zzenVar.zzL(16);
        return zzenVar.zzg();
    }

    private static Pair zzj(zzen zzenVar, int i10, int i11) throws zzaz {
        Integer num;
        zzajo zzajoVar;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z2;
        int iZzc = zzenVar.zzc();
        while (iZzc - i10 < i11) {
            zzenVar.zzL(iZzc);
            int iZzg = zzenVar.zzg();
            zzadx.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzenVar.zzg() == 1936289382) {
                int i14 = iZzc + 8;
                int i15 = 0;
                int i16 = -1;
                Integer numValueOf = null;
                String strZzB = null;
                while (i14 - iZzc < iZzg) {
                    zzenVar.zzL(i14);
                    int iZzg2 = zzenVar.zzg();
                    int iZzg3 = zzenVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzenVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzenVar.zzM(4);
                        strZzB = zzenVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (iZzg3 == 1935894633) {
                        i16 = i14;
                        i15 = iZzg2;
                    }
                    i14 += iZzg2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzB) || "cbc1".equals(strZzB) || "cens".equals(strZzB) || "cbcs".equals(strZzB)) {
                    zzadx.zzb(numValueOf != null, "frma atom is mandatory");
                    zzadx.zzb(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = numValueOf;
                            zzajoVar = null;
                            break;
                        }
                        zzenVar.zzL(i17);
                        int iZzg4 = zzenVar.zzg();
                        if (zzenVar.zzg() == 1952804451) {
                            int iZza = zza(zzenVar.zzg());
                            zzenVar.zzM(1);
                            if (iZza == 0) {
                                zzenVar.zzM(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iZzm = zzenVar.zzm();
                                i12 = iZzm & 15;
                                i13 = (iZzm & 240) >> 4;
                            }
                            if (zzenVar.zzm() == 1) {
                                num2 = numValueOf;
                                z2 = true;
                            } else {
                                num2 = numValueOf;
                                z2 = false;
                            }
                            int iZzm2 = zzenVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzenVar.zzH(bArr2, 0, 16);
                            if (z2 && iZzm2 == 0) {
                                int iZzm3 = zzenVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzenVar.zzH(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzajoVar = new zzajo(z2, strZzB, iZzm2, bArr2, i13, i12, bArr);
                        } else {
                            i17 += iZzg4;
                        }
                    }
                    zzadx.zzb(zzajoVar != null, "tenc atom is mandatory");
                    String str = zzex.zza;
                    pairCreate = Pair.create(num, zzajoVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzc += iZzg;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzk zzk(com.google.android.gms.internal.ads.zzen r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzk(com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzk");
    }

    private static zzav zzl(zzen zzenVar) {
        short sZzE = zzenVar.zzE();
        zzenVar.zzM(2);
        String strZzB = zzenVar.zzB(sZzE, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzB.lastIndexOf(43), strZzB.lastIndexOf(45));
        try {
            return new zzav(-9223372036854775807L, new zzfg(Float.parseFloat(strZzB.substring(0, iMax)), Float.parseFloat(strZzB.substring(iMax, strZzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaij zzm(zzen zzenVar, int i10) {
        zzenVar.zzL(i10 + 8);
        zzenVar.zzM(4);
        return new zzaij(zzenVar.zzu(), zzenVar.zzu());
    }

    private static zzail zzn(zzen zzenVar, int i10) {
        zzenVar.zzL(i10 + 12);
        zzenVar.zzM(1);
        zzh(zzenVar);
        zzenVar.zzM(2);
        int iZzm = zzenVar.zzm();
        if ((iZzm & 128) != 0) {
            zzenVar.zzM(2);
        }
        if ((iZzm & 64) != 0) {
            zzenVar.zzM(zzenVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzenVar.zzM(2);
        }
        zzenVar.zzM(1);
        zzh(zzenVar);
        String strZzd = zzay.zzd(zzenVar.zzm());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzail(strZzd, null, -1L, -1L);
        }
        zzenVar.zzM(4);
        long jZzu = zzenVar.zzu();
        long jZzu2 = zzenVar.zzu();
        zzenVar.zzM(1);
        int iZzh = zzh(zzenVar);
        long j = jZzu2;
        byte[] bArr = new byte[iZzh];
        zzenVar.zzH(bArr, 0, iZzh);
        if (j <= 0) {
            j = -1;
        }
        return new zzail(strZzd, bArr, j, jZzu > 0 ? jZzu : -1L);
    }

    private static String zzo(int i10) {
        char[] cArr = {(char) (((i10 >> 10) & 31) + 96), (char) (((i10 >> 5) & 31) + 96), (char) ((i10 & 31) + 96)};
        for (int i11 = 0; i11 < 3; i11++) {
            char c6 = cArr[i11];
            if (c6 < 'a' || c6 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static ByteBuffer zzp() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzq(com.google.android.gms.internal.ads.zzen r27, int r28, int r29, int r30, int r31, java.lang.String r32, boolean r33, com.google.android.gms.internal.ads.zzs r34, com.google.android.gms.internal.ads.zzaiq r35, int r36) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzq(com.google.android.gms.internal.ads.zzen, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzs, com.google.android.gms.internal.ads.zzaiq, int):void");
    }
}
