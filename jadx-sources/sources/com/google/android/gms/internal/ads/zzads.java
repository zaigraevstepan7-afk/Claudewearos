package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzads {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        zzem zzemVarZzg = zzg(bArr);
        zzemVarZzg.zzn(42);
        return zzemVarZzg.zzd(true != zzemVarZzg.zzp() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzem zzemVarZzg = zzg(bArr);
        zzemVarZzg.zzn(32);
        return zzf(zzemVarZzg, zzj, true) + 1;
    }

    public static zzz zzc(byte[] bArr, String str, String str2, int i10, String str3, zzs zzsVar) {
        zzem zzemVarZzg = zzg(bArr);
        zzemVarZzg.zzn(60);
        int i11 = zzb[zzemVarZzg.zzd(6)];
        int i12 = zzc[zzemVarZzg.zzd(4)];
        int iZzd = zzemVarZzg.zzd(5);
        int i13 = iZzd >= 29 ? -1 : (zzd[iZzd] * zzbch.zzq.zzf) / 2;
        zzemVarZzg.zzn(10);
        int i14 = i11 + (zzemVarZzg.zzd(2) > 0 ? 1 : 0);
        zzx zzxVar = new zzx();
        zzxVar.zzS(str);
        zzxVar.zzG("video/mp2t");
        zzxVar.zzah("audio/vnd.dts");
        zzxVar.zzC(i13);
        zzxVar.zzD(i14);
        zzxVar.zzai(i12);
        zzxVar.zzL(null);
        zzxVar.zzW(str2);
        zzxVar.zzaf(i10);
        return zzxVar.zzan();
    }

    public static zzadq zzd(byte[] bArr) throws zzaz {
        int iZzd;
        int i10;
        long jZzu;
        int i11;
        zzem zzemVarZzg = zzg(bArr);
        zzemVarZzg.zzn(40);
        int iZzd2 = zzemVarZzg.zzd(2);
        boolean zZzp = zzemVarZzg.zzp();
        int i12 = true != zZzp ? 16 : 20;
        zzemVarZzg.zzn(true != zZzp ? 8 : 12);
        int iZzd3 = zzemVarZzg.zzd(i12) + 1;
        boolean zZzp2 = zzemVarZzg.zzp();
        int iZzd4 = -1;
        int i13 = 0;
        if (zZzp2) {
            iZzd = zzemVarZzg.zzd(2);
            int iZzd5 = zzemVarZzg.zzd(3) + 1;
            if (zzemVarZzg.zzp()) {
                zzemVarZzg.zzn(36);
            }
            int iZzd6 = zzemVarZzg.zzd(3) + 1;
            int iZzd7 = zzemVarZzg.zzd(3) + 1;
            if (iZzd6 != 1 || iZzd7 != 1) {
                throw zzaz.zzc("Multiple audio presentations or assets not supported");
            }
            int i14 = iZzd2 + 1;
            int iZzd8 = zzemVarZzg.zzd(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                if (((iZzd8 >> i15) & 1) == 1) {
                    zzemVarZzg.zzn(8);
                }
            }
            int i16 = iZzd5 * 512;
            if (zzemVarZzg.zzp()) {
                zzemVarZzg.zzn(2);
                int iZzd9 = (zzemVarZzg.zzd(2) + 1) << 2;
                int iZzd10 = zzemVarZzg.zzd(2) + 1;
                while (i13 < iZzd10) {
                    zzemVarZzg.zzn(iZzd9);
                    i13++;
                }
            }
            i13 = i16;
        } else {
            iZzd = -1;
        }
        zzemVarZzg.zzn(i12);
        zzemVarZzg.zzn(12);
        if (zZzp2) {
            if (zzemVarZzg.zzp()) {
                zzemVarZzg.zzn(4);
            }
            if (zzemVarZzg.zzp()) {
                zzemVarZzg.zzn(24);
            }
            if (zzemVarZzg.zzp()) {
                zzemVarZzg.zzo(zzemVarZzg.zzd(10) + 1);
            }
            zzemVarZzg.zzn(5);
            i10 = zze[zzemVarZzg.zzd(4)];
            iZzd4 = zzemVarZzg.zzd(8) + 1;
        } else {
            i10 = -2147483647;
        }
        int i17 = i10;
        if (zZzp2) {
            if (iZzd == 0) {
                i11 = 32000;
            } else if (iZzd == 1) {
                i11 = 44100;
            } else {
                if (iZzd != 2) {
                    throw zzaz.zza("Unsupported reference clock code in DTS HD header: " + iZzd, null);
                }
                i11 = 48000;
            }
            jZzu = zzex.zzu(i13, 1000000L, i11, RoundingMode.DOWN);
        } else {
            jZzu = -9223372036854775807L;
        }
        return new zzadq("audio/vnd.dts.hd;profile=lbr", iZzd4, i17, iZzd3, jZzu, 0, null);
    }

    public static zzadq zze(byte[] bArr, AtomicInteger atomicInteger) throws zzaz {
        long jZzu;
        int iZzd;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        zzem zzemVarZzg = zzg(bArr);
        int iZzd2 = zzemVarZzg.zzd(32);
        int iZzf = zzf(zzemVarZzg, zzf, true);
        int i12 = iZzf + 1;
        char c6 = iZzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c6 == 0) {
            jZzu = -9223372036854775807L;
            iZzd = -2147483647;
        } else {
            if (!zzemVarZzg.zzp()) {
                throw zzaz.zzc("Only supports full channel mask-based audio presentation");
            }
            int i13 = iZzf - 1;
            if (((bArr[iZzf] & 255) | ((char) (bArr[i13] << 8))) != zzex.zze(bArr, 0, i13, 65535)) {
                throw zzaz.zza("CRC check failed", null);
            }
            int iZzd3 = zzemVarZzg.zzd(2);
            if (iZzd3 == 0) {
                i10 = 512;
            } else if (iZzd3 == 1) {
                i10 = 480;
            } else {
                if (iZzd3 != 2) {
                    throw zzaz.zza("Unsupported base duration index in DTS UHD header: " + iZzd3, null);
                }
                i10 = 384;
            }
            int iZzd4 = zzemVarZzg.zzd(3) + 1;
            int iZzd5 = zzemVarZzg.zzd(2);
            if (iZzd5 == 0) {
                i11 = 32000;
            } else if (iZzd5 == 1) {
                i11 = 44100;
            } else {
                if (iZzd5 != 2) {
                    throw zzaz.zza("Unsupported clock rate index in DTS UHD header: " + iZzd5, null);
                }
                i11 = 48000;
            }
            if (zzemVarZzg.zzp()) {
                zzemVarZzg.zzn(36);
            }
            iZzd = (1 << zzemVarZzg.zzd(2)) * i11;
            jZzu = zzex.zzu(i10 * iZzd4, 1000000L, i11, RoundingMode.DOWN);
        }
        int i14 = iZzd;
        long j = jZzu;
        int iZzf2 = 0;
        for (char c10 = 0; c10 < c6; c10 = 1) {
            iZzf2 += zzf(zzemVarZzg, zzg, true);
        }
        for (int i15 = 0; i15 <= 0; i15++) {
            if (c6 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzf(zzemVarZzg, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzf2 += atomicInteger2.get() != 0 ? zzf(zzemVarZzg, zzi, true) : 0;
        }
        return new zzadq("audio/vnd.dts.uhd;profile=p2", 2, i14, i12 + iZzf2, j, 0, null);
    }

    private static int zzf(zzem zzemVar, int[] iArr, boolean z2) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && zzemVar.zzp(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return zzemVar.zzd(iArr[i10]) + i12;
    }

    private static zzem zzg(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == Byte.MAX_VALUE || b10 == 100 || b10 == 64 || b10 == 113) {
            return new zzem(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        int length = bArrCopyOf.length;
        zzem zzemVar = new zzem(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzem zzemVar2 = new zzem(bArrCopyOf, length);
            while (zzemVar2.zza() >= 16) {
                zzemVar2.zzn(2);
                zzemVar.zzg(zzemVar2.zzd(14), 14);
            }
        }
        zzemVar.zzk(bArrCopyOf, bArrCopyOf.length);
        return zzemVar;
    }
}
