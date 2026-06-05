package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgxc {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzgxb zzgxbVar) throws zzgzk {
        int iZzh = zzh(bArr, i10, zzgxbVar);
        int i11 = zzgxbVar.zza;
        if (i11 < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzh) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzgxbVar.zzc = zzgxn.zzb;
            return iZzh;
        }
        zzgxbVar.zzc = zzgxn.zzv(bArr, iZzh, i11);
        return iZzh + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzhaz zzhazVar, byte[] bArr, int i10, int i11, int i12, zzgxb zzgxbVar) throws zzgzk {
        Object objZze = zzhazVar.zze();
        int iZzl = zzl(objZze, zzhazVar, bArr, i10, i11, i12, zzgxbVar);
        zzhazVar.zzf(objZze);
        zzgxbVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzhaz zzhazVar, byte[] bArr, int i10, int i11, zzgxb zzgxbVar) throws zzgzk {
        Object objZze = zzhazVar.zze();
        int iZzm = zzm(objZze, zzhazVar, bArr, i10, i11, zzgxbVar);
        zzhazVar.zzf(objZze);
        zzgxbVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzhaz zzhazVar, int i10, byte[] bArr, int i11, int i12, zzgzh zzgzhVar, zzgxb zzgxbVar) throws zzgzk {
        int iZzd = zzd(zzhazVar, bArr, i11, i12, zzgxbVar);
        zzgzhVar.add(zzgxbVar.zzc);
        while (iZzd < i12) {
            int iZzh = zzh(bArr, iZzd, zzgxbVar);
            if (i10 != zzgxbVar.zza) {
                break;
            }
            iZzd = zzd(zzhazVar, bArr, iZzh, i12, zzgxbVar);
            zzgzhVar.add(zzgxbVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzgzh zzgzhVar, zzgxb zzgxbVar) throws zzgzk {
        zzgyw zzgywVar = (zzgyw) zzgzhVar;
        int iZzh = zzh(bArr, i10, zzgxbVar);
        int i11 = zzgxbVar.zza + iZzh;
        while (iZzh < i11) {
            iZzh = zzh(bArr, iZzh, zzgxbVar);
            zzgywVar.zzi(zzgxbVar.zza);
        }
        if (iZzh == i11) {
            return iZzh;
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzhbm zzhbmVar, zzgxb zzgxbVar) throws zzgzk {
        if ((i10 >>> 3) == 0) {
            throw new zzgzk("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzk = zzk(bArr, i11, zzgxbVar);
            zzhbmVar.zzj(i10, Long.valueOf(zzgxbVar.zzb));
            return iZzk;
        }
        if (i13 == 1) {
            zzhbmVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzh = zzh(bArr, i11, zzgxbVar);
            int i14 = zzgxbVar.zza;
            if (i14 < 0) {
                throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZzh) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzhbmVar.zzj(i10, zzgxn.zzb);
            } else {
                zzhbmVar.zzj(i10, zzgxn.zzv(bArr, iZzh, i14));
            }
            return iZzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzgzk("Protocol message contained an invalid tag (zero).");
            }
            zzhbmVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzhbm zzhbmVarZzf = zzhbm.zzf();
        int i16 = zzgxbVar.zze + 1;
        zzgxbVar.zze = i16;
        zzo(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzh2 = zzh(bArr, i11, zzgxbVar);
            int i18 = zzgxbVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZzh2;
                break;
            }
            i11 = zzg(i18, bArr, iZzh2, i12, zzhbmVarZzf, zzgxbVar);
            i17 = i18;
        }
        zzgxbVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzgzk("Failed to parse the message.");
        }
        zzhbmVar.zzj(i10, zzhbmVarZzf);
        return i11;
    }

    public static int zzh(byte[] bArr, int i10, zzgxb zzgxbVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzgxbVar);
        }
        zzgxbVar.zza = b10;
        return i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, zzgxb zzgxbVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzgxbVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzgxbVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzgxbVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzgxbVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzgxbVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzgzh zzgzhVar, zzgxb zzgxbVar) {
        zzgyw zzgywVar = (zzgyw) zzgzhVar;
        int iZzh = zzh(bArr, i11, zzgxbVar);
        zzgywVar.zzi(zzgxbVar.zza);
        while (iZzh < i12) {
            int iZzh2 = zzh(bArr, iZzh, zzgxbVar);
            if (i10 != zzgxbVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgxbVar);
            zzgywVar.zzi(zzgxbVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i10, zzgxb zzgxbVar) {
        long j = bArr[i10];
        int i11 = i10 + 1;
        if (j >= 0) {
            zzgxbVar.zzb = j;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j4 = (j & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j4 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzgxbVar.zzb = j4;
        return i12;
    }

    public static int zzl(Object obj, zzhaz zzhazVar, byte[] bArr, int i10, int i11, int i12, zzgxb zzgxbVar) throws zzgzk {
        int i13 = zzgxbVar.zze + 1;
        zzgxbVar.zze = i13;
        zzo(i13);
        int iZzc = ((zzhaj) zzhazVar).zzc(obj, bArr, i10, i11, i12, zzgxbVar);
        zzgxbVar.zze--;
        zzgxbVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzhaz zzhazVar, byte[] bArr, int i10, int i11, zzgxb zzgxbVar) throws zzgzk {
        int iZzi = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzi = zzi(i12, bArr, iZzi, zzgxbVar);
            i12 = zzgxbVar.zza;
        }
        int i13 = iZzi;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzgxbVar.zze + 1;
        zzgxbVar.zze = i14;
        zzo(i14);
        int i15 = i13 + i12;
        zzhazVar.zzi(obj, bArr, i13, i15, zzgxbVar);
        zzgxbVar.zze--;
        zzgxbVar.zzc = obj;
        return i15;
    }

    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    private static void zzo(int i10) throws zzgzk {
        if (i10 >= zzb) {
            throw new zzgzk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
