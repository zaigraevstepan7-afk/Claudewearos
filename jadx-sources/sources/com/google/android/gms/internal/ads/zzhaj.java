package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhaj<T> implements zzhaz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhbs.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhag zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhbl zzm;
    private final zzgyg zzn;

    private zzhaj(int[] iArr, Object[] objArr, int i10, int i11, zzhag zzhagVar, boolean z2, int[] iArr2, int i12, int i13, zzham zzhamVar, zzgzt zzgztVar, zzhbl zzhblVar, zzgyg zzgygVar, zzhab zzhabVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzhagVar instanceof zzgyv;
        boolean z10 = false;
        if (zzgygVar != null && (zzhagVar instanceof zzgyr)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzhblVar;
        this.zzn = zzgygVar;
        this.zzg = zzhagVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzhaz zzhazVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzhazVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhazVarZzx.zze();
        if (object != null) {
            zzhazVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzhaz zzhazVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzhazVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhazVarZzx.zze();
        if (object != null) {
            zzhazVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbM = m1.m("Field ", str, " for ", name, " not found. Known fields are ");
            sbM.append(string);
            throw new RuntimeException(sbM.toString(), e10);
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzhaz zzhazVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzhazVarZzx.zze();
                    zzhazVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzhazVarZzx.zze();
                zzhazVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzhazVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzhaz zzhazVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzhazVarZzx.zze();
                    zzhazVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzhazVarZzx.zze();
                zzhazVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzhazVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzhat zzhatVar) {
        long j = i10 & 1048575;
        if (zzM(i10)) {
            zzhbs.zzv(obj, j, zzhatVar.zzs());
        } else if (this.zzi) {
            zzhbs.zzv(obj, j, zzhatVar.zzr());
        } else {
            zzhbs.zzv(obj, j, zzhatVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzhbs.zzt(obj, j, (1 << (iZzr >>> 20)) | zzhbs.zzd(obj, j));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzhbs.zzt(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzhbs.zzd(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i10);
        long j4 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhbs.zzb(obj, j4)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhbs.zzc(obj, j4)) != 0;
            case 2:
                return zzhbs.zzf(obj, j4) != 0;
            case 3:
                return zzhbs.zzf(obj, j4) != 0;
            case 4:
                return zzhbs.zzd(obj, j4) != 0;
            case 5:
                return zzhbs.zzf(obj, j4) != 0;
            case 6:
                return zzhbs.zzd(obj, j4) != 0;
            case 7:
                return zzhbs.zzz(obj, j4);
            case 8:
                Object objZzh = zzhbs.zzh(obj, j4);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgxn) {
                    return !zzgxn.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhbs.zzh(obj, j4) != null;
            case 10:
                return !zzgxn.zzb.equals(zzhbs.zzh(obj, j4));
            case 11:
                return zzhbs.zzd(obj, j4) != 0;
            case 12:
                return zzhbs.zzd(obj, j4) != 0;
            case 13:
                return zzhbs.zzd(obj, j4) != 0;
            case 14:
                return zzhbs.zzf(obj, j4) != 0;
            case 15:
                return zzhbs.zzd(obj, j4) != 0;
            case 16:
                return zzhbs.zzf(obj, j4) != 0;
            case 17:
                return zzhbs.zzh(obj, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzhaz zzhazVar) {
        return zzhazVar.zzl(zzhbs.zzh(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgyv) {
            return ((zzgyv) obj).zzcd();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzhbs.zzd(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhbs.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzhca zzhcaVar) {
        if (obj instanceof String) {
            zzhcaVar.zzG(i10, (String) obj);
        } else {
            zzhcaVar.zzd(i10, (zzgxn) obj);
        }
    }

    public static zzhbm zzd(Object obj) {
        zzgyv zzgyvVar = (zzgyv) obj;
        zzhbm zzhbmVar = zzgyvVar.zzt;
        if (zzhbmVar != zzhbm.zzc()) {
            return zzhbmVar;
        }
        zzhbm zzhbmVarZzf = zzhbm.zzf();
        zzgyvVar.zzt = zzhbmVarZzf;
        return zzhbmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzhaj zzm(java.lang.Class r34, com.google.android.gms.internal.ads.zzhad r35, com.google.android.gms.internal.ads.zzham r36, com.google.android.gms.internal.ads.zzgzt r37, com.google.android.gms.internal.ads.zzhbl r38, com.google.android.gms.internal.ads.zzgyg r39, com.google.android.gms.internal.ads.zzhab r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhad, com.google.android.gms.internal.ads.zzham, com.google.android.gms.internal.ads.zzgzt, com.google.android.gms.internal.ads.zzhbl, com.google.android.gms.internal.ads.zzgyg, com.google.android.gms.internal.ads.zzhab):com.google.android.gms.internal.ads.zzhaj");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhbs.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhbs.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhbs.zzh(obj, j)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhbs.zzh(obj, j)).longValue();
    }

    private final zzgzb zzw(int i10) {
        int i11 = i10 / 3;
        return (zzgzb) this.zzd[i11 + i11 + 1];
    }

    private final zzhaz zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzhaz zzhazVar = (zzhaz) objArr[i12];
        if (zzhazVar != null) {
            return zzhazVar;
        }
        zzhaz zzhazVarZzb = zzhaq.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzhazVarZzb;
        return zzhazVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzhbl zzhblVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzh = zzhbs.zzh(obj, zzu(i10) & 1048575);
        if (objZzh == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04de  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzd;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i13 >= iArr.length) {
                int iHashCode = ((zzgyv) obj).zzt.hashCode() + (i14 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzgyr) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzu = zzu(i13);
            int i15 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i16 = iArr[i13];
            long j = i15;
            int iHashCode2 = 37;
            switch (iZzt) {
                case 0:
                    i10 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhbs.zzb(obj, j));
                    byte[] bArr = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 1:
                    i11 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhbs.zzc(obj, j));
                    i14 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j);
                    byte[] bArr2 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 3:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j);
                    byte[] bArr3 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 4:
                    i10 = i14 * 53;
                    iZzd = zzhbs.zzd(obj, j);
                    i14 = i10 + iZzd;
                    break;
                case 5:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j);
                    byte[] bArr4 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 6:
                    i10 = i14 * 53;
                    iZzd = zzhbs.zzd(obj, j);
                    i14 = i10 + iZzd;
                    break;
                case 7:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzgzi.zza(zzhbs.zzz(obj, j));
                    i14 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i14 * 53;
                    iFloatToIntBits = ((String) zzhbs.zzh(obj, j)).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object objZzh = zzhbs.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode2 = objZzh.hashCode();
                    }
                    i14 = i12 + iHashCode2;
                    break;
                case 10:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzhbs.zzh(obj, j).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i14 * 53;
                    iZzd = zzhbs.zzd(obj, j);
                    i14 = i10 + iZzd;
                    break;
                case 12:
                    i10 = i14 * 53;
                    iZzd = zzhbs.zzd(obj, j);
                    i14 = i10 + iZzd;
                    break;
                case 13:
                    i10 = i14 * 53;
                    iZzd = zzhbs.zzd(obj, j);
                    i14 = i10 + iZzd;
                    break;
                case 14:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j);
                    byte[] bArr5 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 15:
                    i10 = i14 * 53;
                    iZzd = zzhbs.zzd(obj, j);
                    i14 = i10 + iZzd;
                    break;
                case 16:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j);
                    byte[] bArr6 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzd;
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object objZzh2 = zzhbs.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode2 = objZzh2.hashCode();
                    }
                    i14 = i12 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbch.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzhbs.zzh(obj, j).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzhbs.zzh(obj, j).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 52:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 53:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 54:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 55:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzp(obj, j);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 56:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 57:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzp(obj, j);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 58:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzgzi.zza(zzS(obj, j));
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 59:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((String) zzhbs.zzh(obj, j)).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 60:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzhbs.zzh(obj, j).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 61:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzhbs.zzh(obj, j).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 62:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzp(obj, j);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 63:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzp(obj, j);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 64:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzp(obj, j);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 65:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 66:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzd = zzp(obj, j);
                        i14 = i10 + iZzd;
                        break;
                    }
                case 67:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzd;
                        break;
                    }
                case 68:
                    if (!zzR(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzhbs.zzh(obj, j).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.zzgxb r37) {
        /*
            Method dump skipped, instructions count: 3706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxb):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Object zze() {
        return ((zzgyv) this.zzg).zzbj();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgyv
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzgyv r0 = (com.google.android.gms.internal.ads.zzgyv) r0
            r0.zzbT()
            r0.zzbS()
            r0.zzbV()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L80
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzhaj.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.ads.zzhaa r6 = (com.google.android.gms.internal.ads.zzhaa) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L80
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbs.zzh(r8, r3)
            com.google.android.gms.internal.ads.zzgzh r2 = (com.google.android.gms.internal.ads.zzgzh) r2
            r2.zzb()
            goto L80
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhaz r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhaj.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhaz r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhaj.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L80:
            int r1 = r1 + 3
            goto L1b
        L83:
            com.google.android.gms.internal.ads.zzhbl r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzgyg r0 = r7.zzn
            r0.zza(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzhbb.zzq(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzhbb.zzp(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzu = zzu(i10);
            int i11 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j = i11;
            switch (iZzt) {
                case 0:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzr(obj, j, zzhbs.zzb(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzs(obj, j, zzhbs.zzc(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j, zzhbs.zzf(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j, zzhbs.zzf(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j, zzhbs.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j, zzhbs.zzf(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j, zzhbs.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzp(obj, j, zzhbs.zzz(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j, zzhbs.zzh(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j, zzhbs.zzh(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j, zzhbs.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j, zzhbs.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j, zzhbs.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j, zzhbs.zzf(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j, zzhbs.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j, zzhbs.zzf(obj2, j));
                        zzH(obj, i10);
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case zzbch.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzgzh zzgzhVarZzf = (zzgzh) zzhbs.zzh(obj, j);
                    zzgzh zzgzhVar = (zzgzh) zzhbs.zzh(obj2, j);
                    int size = zzgzhVarZzf.size();
                    int size2 = zzgzhVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgzhVarZzf.zzc()) {
                            zzgzhVarZzf = zzgzhVarZzf.zzf(size2 + size);
                        }
                        zzgzhVarZzf.addAll(zzgzhVar);
                    }
                    if (size > 0) {
                        zzgzhVar = zzgzhVarZzf;
                    }
                    zzhbs.zzv(obj, j, zzgzhVar);
                    break;
                case 50:
                    int i13 = zzhbb.zza;
                    zzhbs.zzv(obj, j, zzhab.zzb(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j, zzhbs.zzh(obj2, j));
                        zzI(obj, i12, i10);
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j, zzhbs.zzh(obj2, j));
                        zzI(obj, i12, i10);
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0610 A[LOOP:3: B:202:0x060c->B:204:0x0610, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r12, com.google.android.gms.internal.ads.zzhat r13, com.google.android.gms.internal.ads.zzgyf r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhat, com.google.android.gms.internal.ads.zzgyf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgxb zzgxbVar) {
        zzc(obj, bArr, i10, i11, 0, zzgxbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r22, com.google.android.gms.internal.ads.zzhca r23) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhca):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzJ;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzhbs.zzb(obj, j)) != Double.doubleToLongBits(zzhbs.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzhbs.zzc(obj, j)) != Float.floatToIntBits(zzhbs.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzf(obj, j) != zzhbs.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzf(obj, j) != zzhbs.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzd(obj, j) != zzhbs.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzf(obj, j) != zzhbs.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzd(obj, j) != zzhbs.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzz(obj, j) != zzhbs.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzhbb.zzJ(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzhbb.zzJ(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzhbb.zzJ(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzd(obj, j) != zzhbs.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzd(obj, j) != zzhbs.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzd(obj, j) != zzhbs.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzf(obj, j) != zzhbs.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzd(obj, j) != zzhbs.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzhbs.zzf(obj, j) != zzhbs.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzhbb.zzJ(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbch.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzJ = zzhbb.zzJ(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j));
                    break;
                case 50:
                    zZzJ = zzhbb.zzJ(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzr = zzr(i10) & 1048575;
                    if (zzhbs.zzd(obj, jZzr) != zzhbs.zzd(obj2, jZzr) || !zzhbb.zzJ(zzhbs.zzh(obj, j), zzhbs.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzJ) {
                return false;
            }
        }
        if (!((zzgyv) obj).zzt.equals(((zzgyv) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgyr) obj).zza.equals(((zzgyr) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzl(java.lang.Object):boolean");
    }
}
