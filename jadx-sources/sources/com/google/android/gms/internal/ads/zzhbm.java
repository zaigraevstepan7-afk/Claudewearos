package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhbm {
    private static final zzhbm zza = new zzhbm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhbm(int i10, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzhbm zzc() {
        return zza;
    }

    public static zzhbm zze(zzhbm zzhbmVar, zzhbm zzhbmVar2) {
        int i10 = zzhbmVar.zzb + zzhbmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhbmVar.zzc, i10);
        System.arraycopy(zzhbmVar2.zzc, 0, iArrCopyOf, zzhbmVar.zzb, zzhbmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhbmVar.zzd, i10);
        System.arraycopy(zzhbmVar2.zzd, 0, objArrCopyOf, zzhbmVar.zzb, zzhbmVar2.zzb);
        return new zzhbm(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzhbm zzf() {
        return new zzhbm();
    }

    private final void zzn(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhbm)) {
            return false;
        }
        zzhbm zzhbmVar = (zzhbm) obj;
        int i10 = this.zzb;
        if (i10 == zzhbmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhbmVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhbmVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzD;
        int iZzE;
        int iZzD2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzD3 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    iZzD2 = zzgya.zzD(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzgxn zzgxnVar = (zzgxn) this.zzd[i11];
                    int iZzD4 = zzgya.zzD(i15);
                    int iZzd = zzgxnVar.zzd();
                    iZzD3 = zzgya.zzD(iZzd) + iZzd + iZzD4 + iZzD3;
                } else if (i14 == 3) {
                    int iZzD5 = zzgya.zzD(i13 << 3);
                    iZzD = iZzD5 + iZzD5;
                    iZzE = ((zzhbm) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzgzj("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    iZzD2 = zzgya.zzD(i13 << 3) + 4;
                }
                iZzD3 = iZzD2 + iZzD3;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzD = zzgya.zzD(i16);
                iZzE = zzgya.zzE(jLongValue);
            }
            iZzD3 = iZzE + iZzD + iZzD3;
        }
        this.zze = iZzD3;
        return iZzD3;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzgxn zzgxnVar = (zzgxn) this.zzd[i11];
            int iZzD = zzgya.zzD(8);
            int iZzD2 = zzgya.zzD(i12) + zzgya.zzD(16);
            int iZzD3 = zzgya.zzD(24);
            int iZzd = zzgxnVar.zzd();
            iB += iZzD + iZzD + iZzD2 + m6.a.b(iZzd, iZzd, iZzD3);
        }
        this.zze = iB;
        return iB;
    }

    public final zzhbm zzd(zzhbm zzhbmVar) {
        if (zzhbmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzhbmVar.zzb;
        zzn(i10);
        System.arraycopy(zzhbmVar.zzc, 0, this.zzc, this.zzb, zzhbmVar.zzb);
        System.arraycopy(zzhbmVar.zzd, 0, this.zzd, this.zzb, zzhbmVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzhai.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzhca zzhcaVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhcaVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzhca zzhcaVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzhcaVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzhcaVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzhcaVar.zzd(i13, (zzgxn) obj);
                } else if (i12 == 3) {
                    zzhcaVar.zzF(i13);
                    ((zzhbm) obj).zzl(zzhcaVar);
                    zzhcaVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzgzj("Protocol message tag had invalid wire type."));
                    }
                    zzhcaVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean zzm(int i10, zzgxt zzgxtVar) throws zzgzj {
        int iZzl;
        zzg();
        int i11 = i10 & 7;
        if (i11 == 0) {
            zzj(i10, Long.valueOf(zzgxtVar.zzo()));
            return true;
        }
        if (i11 == 1) {
            zzj(i10, Long.valueOf(zzgxtVar.zzn()));
            return true;
        }
        if (i11 == 2) {
            zzj(i10, zzgxtVar.zzv());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                zzgxtVar.zzy(0);
                return false;
            }
            if (i11 != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            zzj(i10, Integer.valueOf(zzgxtVar.zzf()));
            return true;
        }
        zzhbm zzhbmVar = new zzhbm();
        do {
            iZzl = zzgxtVar.zzl();
            if (iZzl == 0) {
                break;
            }
        } while (zzhbmVar.zzm(iZzl, zzgxtVar));
        zzgxtVar.zzy(4 | ((i10 >>> 3) << 3));
        zzj(i10, zzhbmVar);
        return true;
    }

    private zzhbm() {
        this(0, new int[8], new Object[8], true);
    }
}
