package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzajm {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzaew zza(zzadu zzaduVar) {
        return zzc(zzaduVar, true, false);
    }

    public static zzaew zzb(zzadu zzaduVar, boolean z2) {
        return zzc(zzaduVar, false, z2);
    }

    private static zzaew zzc(zzadu zzaduVar, boolean z2, boolean z10) {
        zzaew zzaewVar;
        long j;
        zzen zzenVar;
        int i10;
        int i11;
        int[] iArr;
        long jZzd = zzaduVar.zzd();
        long j4 = -1;
        long j10 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j10 = jZzd;
        }
        zzen zzenVar2 = new zzen(64);
        int i12 = (int) j10;
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (i14 < i12) {
            zzenVar2.zzI(8);
            boolean z12 = true;
            if (!zzaduVar.zzm(zzenVar2.zzN(), i13, 8, true)) {
                break;
            }
            long jZzu = zzenVar2.zzu();
            int iZzg = zzenVar2.zzg();
            if (jZzu == 1) {
                j = j4;
                zzaduVar.zzh(zzenVar2.zzN(), 8, 8);
                i10 = 16;
                zzenVar2.zzK(16);
                jZzu = zzenVar2.zzt();
                zzenVar = zzenVar2;
            } else {
                j = j4;
                if (jZzu == 0) {
                    long jZzd2 = zzaduVar.zzd();
                    if (jZzd2 != j) {
                        jZzu = (jZzd2 - zzaduVar.zze()) + 8;
                    }
                }
                zzenVar = zzenVar2;
                i10 = 8;
            }
            long j11 = jZzu;
            zzaewVar = null;
            long j12 = i10;
            if (j11 < j12) {
                return new zzaii(iZzg, j11, i10);
            }
            i14 += i10;
            if (iZzg == 1836019574) {
                i12 += (int) j11;
                if (jZzd != -1 && i12 > jZzd) {
                    i12 = (int) jZzd;
                }
                zzenVar2 = zzenVar;
                j4 = j;
                i13 = 0;
            } else {
                if (iZzg == 1836019558 || iZzg == 1836475768) {
                    i13 = 1;
                    break;
                }
                z11 |= !(iZzg != 1835295092);
                long j13 = jZzd;
                if ((i14 + j11) - j12 >= i12) {
                    i13 = 0;
                    break;
                }
                int i15 = (int) (j11 - j12);
                i14 += i15;
                if (iZzg != 1718909296) {
                    i11 = 0;
                    if (i15 != 0) {
                        zzaduVar.zzg(i15);
                    }
                } else {
                    if (i15 < 8) {
                        return new zzaii(1718909296, i15, 8);
                    }
                    zzenVar.zzI(i15);
                    i11 = 0;
                    zzaduVar.zzh(zzenVar.zzN(), 0, i15);
                    int iZzg2 = zzenVar.zzg();
                    boolean zZzd = zzd(iZzg2, z10) | z11;
                    zzenVar.zzM(4);
                    int iZza = zzenVar.zza() / 4;
                    if (!zZzd && iZza > 0) {
                        iArr = new int[iZza];
                        int i16 = 0;
                        while (true) {
                            if (i16 >= iZza) {
                                z12 = zZzd;
                                break;
                            }
                            int iZzg3 = zzenVar.zzg();
                            iArr[i16] = iZzg3;
                            if (zzd(iZzg3, z10)) {
                                break;
                            }
                            i16++;
                        }
                    } else {
                        z12 = zZzd;
                        iArr = null;
                    }
                    if (!z12) {
                        return new zzajr(iZzg2, iArr);
                    }
                    z11 = z12;
                }
                i13 = i11;
                zzenVar2 = zzenVar;
                j4 = j;
                jZzd = j13;
            }
        }
        zzaewVar = null;
        return !z11 ? zzaji.zza : z2 != i13 ? i13 != 0 ? zzajc.zza : zzajc.zzb : zzaewVar;
    }

    private static boolean zzd(int i10, boolean z2) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z2) {
                return true;
            }
            i10 = 1751476579;
        }
        int[] iArr = zza;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
