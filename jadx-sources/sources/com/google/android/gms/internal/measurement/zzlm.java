package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.zzbch;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import m6.a;
import sun.misc.Unsafe;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i10, int i11, zzlj zzljVar, boolean z2, boolean z10, int[] iArr2, int i12, int i13, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z2;
        boolean z11 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i10) {
        int i11 = i10 / 3;
        return (zzkg) this.zzd[i11 + i11 + 1];
    }

    private final zzlu zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlu zzluVar = (zzlu) this.zzd[i12];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzluVarZzb = zzlr.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzluVarZzb;
        return zzluVarZzb;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(sbM.toString());
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        if (zzO(obj2, i10)) {
            Object objZzf = zzmv.zzf(obj, jZzB);
            Object objZzf2 = zzmv.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, jZzB, zzkk.zzg(objZzf, objZzf2));
                zzJ(obj, i10);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i10);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int iZzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j = iZzB & 1048575;
        if (zzR(obj2, i11, i10)) {
            Object objZzf = zzR(obj, i11, i10) ? zzmv.zzf(obj, j) : null;
            Object objZzf2 = zzmv.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(objZzf, objZzf2));
                zzK(obj, i11, i10);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, j, objZzf2);
                zzK(obj, i11, i10);
            }
        }
    }

    private final void zzJ(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzmv.zzq(obj, zzy(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) {
        int i10;
        boolean z2;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j = iZzB & i11;
            switch (iZzA) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i15, zzmv.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i15, zzmv.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i15, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i15, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i15, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i15, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i15, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i15, zzmv.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzT(i15, unsafe.getObject(obj, j), zzndVar);
                        break;
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j), zzE(i13));
                        break;
                    }
                case 10:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i15, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i15, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i15, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i15, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i15, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i15, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j), zzE(i13));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, zzE(i13));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 29:
                    z2 = false;
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 30:
                    z2 = false;
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 31:
                    z2 = false;
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 32:
                    z2 = false;
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 33:
                    z2 = false;
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 34:
                    z2 = false;
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j), zzndVar, zzE(i13));
                    break;
                case 50:
                    zzM(zzndVar, i15, unsafe.getObject(obj, j), i13);
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzf(i15, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzo(i15, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzt(i15, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzJ(i15, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzr(i15, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzm(i15, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzk(i15, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzb(i15, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        zzT(i15, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j), zzE(i13));
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzH(i15, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzi(i15, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzw(i15, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzy(i15, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzA(i15, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzC(i15, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j), zzE(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        return zzO(obj, i10) == zzO(obj2, i10);
    }

    private final boolean zzO(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i10);
        long j4 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j4)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j4)) != 0;
            case 2:
                return zzmv.zzd(obj, j4) != 0;
            case 3:
                return zzmv.zzd(obj, j4) != 0;
            case 4:
                return zzmv.zzc(obj, j4) != 0;
            case 5:
                return zzmv.zzd(obj, j4) != 0;
            case 6:
                return zzmv.zzc(obj, j4) != 0;
            case 7:
                return zzmv.zzw(obj, j4);
            case 8:
                Object objZzf = zzmv.zzf(obj, j4);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjb) {
                    return !zzjb.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j4) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j4));
            case 11:
                return zzmv.zzc(obj, j4) != 0;
            case 12:
                return zzmv.zzc(obj, j4) != 0;
            case 13:
                return zzmv.zzc(obj, j4) != 0;
            case 14:
                return zzmv.zzd(obj, j4) != 0;
            case 15:
                return zzmv.zzc(obj, j4) != 0;
            case 16:
                return zzmv.zzd(obj, j4) != 0;
            case 17:
                return zzmv.zzf(obj, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzO(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzQ(Object obj, int i10, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzmv.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zznd zzndVar) {
        if (obj instanceof String) {
            zzndVar.zzF(i10, (String) obj);
        } else {
            zzndVar.zzd(i10, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zzmmVarZze = zzmm.zze();
        zzkcVar.zzc = zzmmVarZze;
        return zzmmVarZze;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.zzlm zzm(com.google.android.gms.internal.measurement.zzlt r33, com.google.android.gms.internal.measurement.zzlo r34, com.google.android.gms.internal.measurement.zzkx r35, com.google.android.gms.internal.measurement.zzml r36, com.google.android.gms.internal.measurement.zzjp r37, com.google.android.gms.internal.measurement.zzle r38) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzm(com.google.android.gms.internal.measurement.zzlt, com.google.android.gms.internal.measurement.zzlo, com.google.android.gms.internal.measurement.zzkx, com.google.android.gms.internal.measurement.zzml, com.google.android.gms.internal.measurement.zzjp, com.google.android.gms.internal.measurement.zzle):com.google.android.gms.internal.measurement.zzlm");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i10;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        int iZzu2;
        boolean z2;
        int iZzd;
        int iZzA3;
        int iZzB2;
        int iZzA4;
        int iZzv2;
        int iZzu3;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int iV = 0;
        int i14 = 0;
        while (i13 < this.zzc.length) {
            int iZzB3 = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA5 = zzA(iZzB3);
            if (iZzA5 <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
            } else {
                i10 = 0;
            }
            long j = iZzB3 & i11;
            switch (iZzA5) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(i15 << 3, 8, iV);
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(i15 << 3, 4, iV);
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        iZzA = zzjj.zzA(i15 << 3);
                        iZzB = zzjj.zzB(j4);
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        long j10 = unsafe.getLong(obj, j);
                        iZzA = zzjj.zzA(i15 << 3);
                        iZzB = zzjj.zzB(j10);
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(obj, j);
                        iZzA2 = zzjj.zzA(i15 << 3);
                        iZzv = zzjj.zzv(i18);
                        iZzu = iZzv + iZzA2;
                        iV += iZzu;
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(i15 << 3, 8, iV);
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(i15 << 3, 4, iV);
                        break;
                    }
                case 7:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(i15 << 3, 1, iV);
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzjb)) {
                            iZzA2 = zzjj.zzA(i15 << 3);
                            iZzv = zzjj.zzy((String) object);
                            iZzu = iZzv + iZzA2;
                            iV += iZzu;
                            break;
                        } else {
                            int iZzA6 = zzjj.zzA(i15 << 3);
                            int iZzd2 = ((zzjb) object).zzd();
                            iV = a.u(iZzd2, iZzd2, iZzA6, iV);
                            break;
                        }
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iZzo = zzlw.zzo(i15, unsafe.getObject(obj, j), zzE(i13));
                        iV += iZzo;
                        break;
                    }
                case 10:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        int iZzA7 = zzjj.zzA(i15 << 3);
                        int iZzd3 = zzjbVar.zzd();
                        iV = a.u(iZzd3, iZzd3, iZzA7, iV);
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(unsafe.getInt(obj, j), zzjj.zzA(i15 << 3), iV);
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        int i19 = unsafe.getInt(obj, j);
                        iZzA2 = zzjj.zzA(i15 << 3);
                        iZzv = zzjj.zzv(i19);
                        iZzu = iZzv + iZzA2;
                        iV += iZzu;
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(i15 << 3, 4, iV);
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iV = a.v(i15 << 3, 8, iV);
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        int i20 = unsafe.getInt(obj, j);
                        iV = a.v((i20 >> 31) ^ (i20 + i20), zzjj.zzA(i15 << 3), iV);
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j);
                        iZzA = zzjj.zzA(i15 << 3);
                        iZzB = zzjj.zzB((j11 >> 63) ^ (j11 + j11));
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iZzu = zzjj.zzu(i15, (zzlj) unsafe.getObject(obj, j), zzE(i13));
                        iV += iZzu;
                        break;
                    }
                case 18:
                    iZzo = zzlw.zzh(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    iZzo = zzlw.zzx(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzo;
                    break;
                case 26:
                    iZzu2 = zzlw.zzu(i15, (List) unsafe.getObject(obj, j));
                    iV += iZzu2;
                    break;
                case 27:
                    iZzu2 = zzlw.zzp(i15, (List) unsafe.getObject(obj, j), zzE(i13));
                    iV += iZzu2;
                    break;
                case 28:
                    iZzu2 = zzlw.zzc(i15, (List) unsafe.getObject(obj, j));
                    iV += iZzu2;
                    break;
                case 29:
                    iZzu2 = zzlw.zzv(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzu2;
                    break;
                case 30:
                    z2 = false;
                    iZzd = zzlw.zzd(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzd;
                    break;
                case 31:
                    z2 = false;
                    iZzd = zzlw.zzf(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzd;
                    break;
                case 32:
                    z2 = false;
                    iZzd = zzlw.zzh(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzd;
                    break;
                case 33:
                    z2 = false;
                    iZzd = zzlw.zzq(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzd;
                    break;
                case 34:
                    z2 = false;
                    iZzd = zzlw.zzs(i15, (List) unsafe.getObject(obj, j), false);
                    iV += iZzd;
                    break;
                case 35:
                    int iZzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iV = a.u(iZzi, zzjj.zzz(i15), iZzi, iV);
                    }
                    break;
                case 36:
                    int iZzg = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg > 0) {
                        iV = a.u(iZzg, zzjj.zzz(i15), iZzg, iV);
                    }
                    break;
                case 37:
                    int iZzn = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzn > 0) {
                        iV = a.u(iZzn, zzjj.zzz(i15), iZzn, iV);
                    }
                    break;
                case 38:
                    int iZzy = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iV = a.u(iZzy, zzjj.zzz(i15), iZzy, iV);
                    }
                    break;
                case 39:
                    int iZzl = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzl > 0) {
                        iV = a.u(iZzl, zzjj.zzz(i15), iZzl, iV);
                    }
                    break;
                case 40:
                    int iZzi2 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi2 > 0) {
                        iV = a.u(iZzi2, zzjj.zzz(i15), iZzi2, iV);
                    }
                    break;
                case 41:
                    int iZzg2 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg2 > 0) {
                        iV = a.u(iZzg2, zzjj.zzz(i15), iZzg2, iV);
                    }
                    break;
                case 42:
                    int iZzb = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzb > 0) {
                        iV = a.u(iZzb, zzjj.zzz(i15), iZzb, iV);
                    }
                    break;
                case 43:
                    int iZzw = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzw > 0) {
                        iV = a.u(iZzw, zzjj.zzz(i15), iZzw, iV);
                    }
                    break;
                case 44:
                    int iZze = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iV = a.u(iZze, zzjj.zzz(i15), iZze, iV);
                    }
                    break;
                case 45:
                    int iZzg3 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg3 > 0) {
                        iV = a.u(iZzg3, zzjj.zzz(i15), iZzg3, iV);
                    }
                    break;
                case 46:
                    int iZzi3 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi3 > 0) {
                        iV = a.u(iZzi3, zzjj.zzz(i15), iZzi3, iV);
                    }
                    break;
                case 47:
                    int iZzr = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzr > 0) {
                        iV = a.u(iZzr, zzjj.zzz(i15), iZzr, iV);
                    }
                    break;
                case 48:
                    int iZzt = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzt > 0) {
                        iV = a.u(iZzt, zzjj.zzz(i15), iZzt, iV);
                    }
                    break;
                case 49:
                    iZzu2 = zzlw.zzj(i15, (List) unsafe.getObject(obj, j), zzE(i13));
                    iV += iZzu2;
                    break;
                case 50:
                    zzle.zza(i15, unsafe.getObject(obj, j), zzF(i13));
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(i15 << 3, 8, iV);
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(i15 << 3, 4, iV);
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i13)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i15 << 3);
                        iZzB2 = zzjj.zzB(jZzC);
                        iZzu3 = iZzB2 + iZzA3;
                        iV += iZzu3;
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i15 << 3);
                        iZzB2 = zzjj.zzB(jZzC2);
                        iZzu3 = iZzB2 + iZzA3;
                        iV += iZzu3;
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i15 << 3);
                        iZzv2 = zzjj.zzv(iZzr2);
                        iZzu3 = iZzv2 + iZzA4;
                        iV += iZzu3;
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(i15 << 3, 8, iV);
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(i15 << 3, 4, iV);
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(i15 << 3, 1, iV);
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            int iZzA8 = zzjj.zzA(i15 << 3);
                            int iZzd4 = ((zzjb) object2).zzd();
                            iV = a.u(iZzd4, iZzd4, iZzA8, iV);
                        } else {
                            iZzA4 = zzjj.zzA(i15 << 3);
                            iZzv2 = zzjj.zzy((String) object2);
                            iZzu3 = iZzv2 + iZzA4;
                            iV += iZzu3;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        iZzu2 = zzlw.zzo(i15, unsafe.getObject(obj, j), zzE(i13));
                        iV += iZzu2;
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        int iZzA9 = zzjj.zzA(i15 << 3);
                        int iZzd5 = zzjbVar2.zzd();
                        iV = a.u(iZzd5, iZzd5, iZzA9, iV);
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(zzr(obj, j), zzjj.zzA(i15 << 3), iV);
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i15 << 3);
                        iZzv2 = zzjj.zzv(iZzr3);
                        iZzu3 = iZzv2 + iZzA4;
                        iV += iZzu3;
                    }
                    break;
                case 64:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(i15 << 3, 4, iV);
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        iV = a.v(i15 << 3, 8, iV);
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        int iZzr4 = zzr(obj, j);
                        iV = a.v((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjj.zzA(i15 << 3), iV);
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i15 << 3);
                        iZzB2 = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu3 = iZzB2 + iZzA3;
                        iV += iZzu3;
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        iZzu3 = zzjj.zzu(i15, (zzlj) unsafe.getObject(obj, j), zzE(i13));
                        iV += iZzu3;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int iZza = iV + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        Unsafe unsafe = zzb;
        int iV = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB2 = zzB(i10);
            int iZzA3 = zzA(iZzB2);
            int i11 = this.zzc[i10];
            long j = iZzB2 & 1048575;
            if (iZzA3 >= zzju.zzJ.zza() && iZzA3 <= zzju.zzW.zza()) {
                int i12 = this.zzc[i10 + 2];
            }
            switch (iZzA3) {
                case 0:
                    if (zzO(obj, i10)) {
                        iV = a.v(i11 << 3, 8, iV);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i10)) {
                        iV = a.v(i11 << 3, 4, iV);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i10)) {
                        long jZzd = zzmv.zzd(obj, j);
                        iZzA = zzjj.zzA(i11 << 3);
                        iZzB = zzjj.zzB(jZzd);
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i10)) {
                        long jZzd2 = zzmv.zzd(obj, j);
                        iZzA = zzjj.zzA(i11 << 3);
                        iZzB = zzjj.zzB(jZzd2);
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i10)) {
                        int iZzc = zzmv.zzc(obj, j);
                        iZzA2 = zzjj.zzA(i11 << 3);
                        iZzv = zzjj.zzv(iZzc);
                        iZzu = iZzv + iZzA2;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i10)) {
                        iV = a.v(i11 << 3, 8, iV);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i10)) {
                        iV = a.v(i11 << 3, 4, iV);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i10)) {
                        iV = a.v(i11 << 3, 1, iV);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i10)) {
                        Object objZzf = zzmv.zzf(obj, j);
                        if (objZzf instanceof zzjb) {
                            int iZzA4 = zzjj.zzA(i11 << 3);
                            int iZzd = ((zzjb) objZzf).zzd();
                            iV = a.u(iZzd, iZzd, iZzA4, iV);
                            break;
                        } else {
                            iZzA2 = zzjj.zzA(i11 << 3);
                            iZzv = zzjj.zzy((String) objZzf);
                            iZzu = iZzv + iZzA2;
                            iV += iZzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i10)) {
                        iZzo = zzlw.zzo(i11, zzmv.zzf(obj, j), zzE(i10));
                        iV += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i10)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j);
                        int iZzA5 = zzjj.zzA(i11 << 3);
                        int iZzd2 = zzjbVar.zzd();
                        iV = a.u(iZzd2, iZzd2, iZzA5, iV);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i10)) {
                        iV = a.v(zzmv.zzc(obj, j), zzjj.zzA(i11 << 3), iV);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i10)) {
                        int iZzc2 = zzmv.zzc(obj, j);
                        iZzA2 = zzjj.zzA(i11 << 3);
                        iZzv = zzjj.zzv(iZzc2);
                        iZzu = iZzv + iZzA2;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i10)) {
                        iV = a.v(i11 << 3, 4, iV);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i10)) {
                        iV = a.v(i11 << 3, 8, iV);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i10)) {
                        int iZzc3 = zzmv.zzc(obj, j);
                        iV = a.v((iZzc3 >> 31) ^ (iZzc3 + iZzc3), zzjj.zzA(i11 << 3), iV);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i10)) {
                        long jZzd3 = zzmv.zzd(obj, j);
                        iZzA = zzjj.zzA(i11 << 3);
                        iZzB = zzjj.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i10)) {
                        iZzu = zzjj.zzu(i11, (zzlj) zzmv.zzf(obj, j), zzE(i10));
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iZzo = zzlw.zzh(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    iZzo = zzlw.zzx(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i11, (List) zzmv.zzf(obj, j));
                    iV += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i11, (List) zzmv.zzf(obj, j), zzE(i10));
                    iV += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i11, (List) zzmv.zzf(obj, j));
                    iV += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i11, (List) zzmv.zzf(obj, j), false);
                    iV += iZzo;
                    break;
                case 35:
                    int iZzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iV = a.u(iZzi, zzjj.zzz(i11), iZzi, iV);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iZzg = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg > 0) {
                        iV = a.u(iZzg, zzjj.zzz(i11), iZzg, iV);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iZzn = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzn > 0) {
                        iV = a.u(iZzn, zzjj.zzz(i11), iZzn, iV);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iZzy = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iV = a.u(iZzy, zzjj.zzz(i11), iZzy, iV);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int iZzl = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzl > 0) {
                        iV = a.u(iZzl, zzjj.zzz(i11), iZzl, iV);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iZzi2 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi2 > 0) {
                        iV = a.u(iZzi2, zzjj.zzz(i11), iZzi2, iV);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iZzg2 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg2 > 0) {
                        iV = a.u(iZzg2, zzjj.zzz(i11), iZzg2, iV);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int iZzb = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzb > 0) {
                        iV = a.u(iZzb, zzjj.zzz(i11), iZzb, iV);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iZzw = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzw > 0) {
                        iV = a.u(iZzw, zzjj.zzz(i11), iZzw, iV);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iZze = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iV = a.u(iZze, zzjj.zzz(i11), iZze, iV);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iZzg3 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg3 > 0) {
                        iV = a.u(iZzg3, zzjj.zzz(i11), iZzg3, iV);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iZzi3 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi3 > 0) {
                        iV = a.u(iZzi3, zzjj.zzz(i11), iZzi3, iV);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iZzr = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzr > 0) {
                        iV = a.u(iZzr, zzjj.zzz(i11), iZzr, iV);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iZzt = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzt > 0) {
                        iV = a.u(iZzt, zzjj.zzz(i11), iZzt, iV);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iZzo = zzlw.zzj(i11, (List) zzmv.zzf(obj, j), zzE(i10));
                    iV += iZzo;
                    break;
                case 50:
                    zzle.zza(i11, zzmv.zzf(obj, j), zzF(i10));
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(i11 << 3, 8, iV);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(i11 << 3, 4, iV);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i11, i10)) {
                        long jZzC = zzC(obj, j);
                        iZzA = zzjj.zzA(i11 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i11, i10)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA = zzjj.zzA(i11 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i11, i10)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA2 = zzjj.zzA(i11 << 3);
                        iZzv = zzjj.zzv(iZzr2);
                        iZzu = iZzv + iZzA2;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(i11 << 3, 8, iV);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(i11 << 3, 4, iV);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(i11 << 3, 1, iV);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i11, i10)) {
                        Object objZzf2 = zzmv.zzf(obj, j);
                        if (objZzf2 instanceof zzjb) {
                            int iZzA6 = zzjj.zzA(i11 << 3);
                            int iZzd3 = ((zzjb) objZzf2).zzd();
                            iV = a.u(iZzd3, iZzd3, iZzA6, iV);
                            break;
                        } else {
                            iZzA2 = zzjj.zzA(i11 << 3);
                            iZzv = zzjj.zzy((String) objZzf2);
                            iZzu = iZzv + iZzA2;
                            iV += iZzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i11, i10)) {
                        iZzo = zzlw.zzo(i11, zzmv.zzf(obj, j), zzE(i10));
                        iV += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i11, i10)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j);
                        int iZzA7 = zzjj.zzA(i11 << 3);
                        int iZzd4 = zzjbVar2.zzd();
                        iV = a.u(iZzd4, iZzd4, iZzA7, iV);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(zzr(obj, j), zzjj.zzA(i11 << 3), iV);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i11, i10)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA2 = zzjj.zzA(i11 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        iZzu = iZzv + iZzA2;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(i11 << 3, 4, iV);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i11, i10)) {
                        iV = a.v(i11 << 3, 8, iV);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i11, i10)) {
                        int iZzr4 = zzr(obj, j);
                        iV = a.v((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjj.zzA(i11 << 3), iV);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i11, i10)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA = zzjj.zzA(i11 << 3);
                        iZzB = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu = iZzB + iZzA;
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i11, i10)) {
                        iZzu = zzjj.zzu(i11, (zzlj) zzmv.zzf(obj, j), zzE(i10));
                        iV += iZzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return iV + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j, zzio zzioVar) {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i12);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzldVarZzb = zzld.zza().zzb();
            zzle.zzb(zzldVarZzb, object);
            unsafe.putObject(obj, j, zzldVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, int i17, zzio zzioVar) throws zzkm {
        Object object;
        Unsafe unsafe = zzb;
        long j4 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i10))));
                unsafe.putInt(obj, j4, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i10))));
                unsafe.putInt(obj, j4, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j4, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j4, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i10)));
                unsafe.putInt(obj, j4, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i10)));
                unsafe.putInt(obj, j4, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j4, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzip.zzj(bArr, i10, zzioVar);
                int i18 = zzioVar.zza;
                if (i18 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i15 & 536870912) != 0 && !zzna.zzf(bArr, iZzj2, iZzj2 + i18)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i18, zzkk.zzb));
                    iZzj2 += i18;
                }
                unsafe.putInt(obj, j4, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iZzd = zzip.zzd(zzE(i17), bArr, i10, i11, zzioVar);
                object = unsafe.getInt(obj, j4) == i13 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j4, i13);
                return iZzd;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzip.zza(bArr, i10, zzioVar);
                unsafe.putObject(obj, j, zzioVar.zzc);
                unsafe.putInt(obj, j4, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzip.zzj(bArr, i10, zzioVar);
                int i19 = zzioVar.zza;
                zzkg zzkgVarZzD = zzD(i17);
                if (zzkgVarZzD != null && !zzkgVarZzD.zza(i19)) {
                    zzd(obj).zzh(i12, Long.valueOf(i19));
                    return iZzj3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i19));
                unsafe.putInt(obj, j4, i13);
                return iZzj3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj4 = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j4, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j4, i13);
                return iZzm3;
            case 68:
                if (i14 == 3) {
                    int iZzc = zzip.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzioVar);
                    object = unsafe.getInt(obj, j4) == i13 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j4, i13);
                    return iZzc;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws zzkm {
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        zzlm<T> zzlmVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i22 = i11;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i23 = -1;
        int iZzm = i10;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (iZzm < i22) {
            int iZzk = iZzm + 1;
            int i28 = bArr2[iZzm];
            if (i28 < 0) {
                iZzk = zzip.zzk(i28, bArr2, iZzk, zzioVar2);
                i28 = zzioVar2.zza;
            }
            int i29 = iZzk;
            int i30 = i28 >>> 3;
            int i31 = i28 & 7;
            int iZzx = i30 > i24 ? zzlmVar.zzx(i30, i25 / 3) : zzlmVar.zzw(i30);
            if (iZzx == i23) {
                unsafe = unsafe2;
                i12 = i28;
                i13 = i23;
                i14 = i30;
                i15 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i32 = iArr[iZzx + 1];
                int iZzA = zzA(i32);
                int i33 = i28;
                int i34 = iZzx;
                long j = i32 & 1048575;
                if (iZzA <= 17) {
                    int i35 = iArr[i34 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i27) {
                        int i38 = 1048575;
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj3, i27, i26);
                            i38 = 1048575;
                        }
                        if (i37 != i38) {
                            i26 = unsafe2.getInt(obj3, i37);
                        }
                        i27 = i37;
                    }
                    switch (iZzA) {
                        case 0:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                zzmv.zzo(obj3, j, Double.longBitsToDouble(zzip.zzn(bArr2, i29)));
                                iZzm = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 1:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                zzmv.zzp(obj3, j, Float.intBitsToFloat(zzip.zzb(bArr2, i29)));
                                iZzm = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iZzm2 = zzip.zzm(bArr2, i29, zzioVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j, zzioVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i26 |= i36;
                                iZzm = iZzm2;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                i22 = i11;
                                break;
                            }
                        case 4:
                        case 11:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iZzj = zzip.zzj(bArr2, i29, zzioVar2);
                                unsafe2.putInt(obj3, j, zzioVar2.zza);
                                i26 |= i36;
                                i22 = i11;
                                iZzm = iZzj;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j, zzip.zzn(bArr2, i29));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                iZzm = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j, zzip.zzb(bArr2, i29));
                                iZzm = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 7:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzm(bArr2, i29, zzioVar2);
                                zzmv.zzm(obj3, j, zzioVar2.zzb != 0);
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 8:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = (536870912 & i32) == 0 ? zzip.zzg(bArr2, i29, zzioVar2) : zzip.zzh(bArr2, i29, zzioVar2);
                                unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 9:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzd(zzlmVar.zzE(i21), bArr2, i29, i22, zzioVar2);
                                Object object = unsafe2.getObject(obj3, j);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 10:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zza(bArr2, i29, zzioVar2);
                                unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 12:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzj(bArr2, i29, zzioVar2);
                                unsafe2.putInt(obj3, j, zzioVar2.zza);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 15:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzj(bArr2, i29, zzioVar2);
                                unsafe2.putInt(obj3, j, zzjf.zzb(zzioVar2.zza));
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 16:
                            if (i31 != 0) {
                                i21 = i34;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iZzm3 = zzip.zzm(bArr2, i29, zzioVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i21 = i34;
                                unsafe5.putLong(obj6, j, zzjf.zzc(zzioVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i26 |= i36;
                                iZzm = iZzm3;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        default:
                            i21 = i34;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i14 = i30;
                            i15 = i21;
                            i13 = -1;
                            i12 = i33;
                            break;
                    }
                } else {
                    i15 = i34;
                    if (iZzA != 27) {
                        i16 = i29;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzA <= 49) {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i19 = i27;
                            int iZzv = zzlmVar.zzv(obj, bArr, i16, i11, i33, i30, i31, i15, i32, iZzA, j, zzioVar);
                            i18 = i33;
                            i20 = i30;
                            if (iZzv != i16) {
                                zzlmVar = this;
                                obj3 = obj;
                                zzioVar2 = zzioVar;
                                iZzm = iZzv;
                                i25 = i15;
                                i24 = i20;
                                i27 = i19;
                                i23 = i13;
                                i26 = i17;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i22 = i11;
                            } else {
                                obj2 = obj;
                                i29 = iZzv;
                                i14 = i20;
                                i12 = i18;
                            }
                        } else {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i18 = i33;
                            i19 = i27;
                            i20 = i30;
                            if (iZzA != 50) {
                                i14 = i20;
                                int iZzt = zzt(obj, bArr, i16, i11, i18, i14, i31, i32, iZzA, j, i15, zzioVar);
                                obj2 = obj;
                                i12 = i18;
                                i15 = i15;
                                if (iZzt != i16) {
                                    zzlmVar = this;
                                    zzioVar2 = zzioVar;
                                    i24 = i14;
                                    iZzm = iZzt;
                                    i25 = i15;
                                    obj3 = obj2;
                                    i27 = i19;
                                    i23 = i13;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i22 = i11;
                                } else {
                                    i29 = iZzt;
                                }
                            } else if (i31 == 2) {
                                int iZzs = zzs(obj, bArr, i16, i11, i15, j, zzioVar);
                                i15 = i15;
                                if (iZzs != i16) {
                                    zzlmVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzioVar2 = zzioVar;
                                    iZzm = iZzs;
                                    i25 = i15;
                                    i24 = i20;
                                    i27 = i19;
                                    i23 = -1;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    i22 = i11;
                                } else {
                                    obj2 = obj;
                                    i29 = iZzs;
                                    i14 = i20;
                                    i12 = i18;
                                }
                            } else {
                                i15 = i15;
                                obj2 = obj;
                                i29 = i16;
                                i14 = i20;
                                i12 = i18;
                            }
                        }
                    } else if (i31 == 2) {
                        zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj3, j);
                        if (!zzkjVarZzd.zzc()) {
                            int size = zzkjVarZzd.size();
                            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j, zzkjVarZzd);
                        }
                        int iZze = zzip.zze(zzlmVar.zzE(i15), i33, bArr2, i29, i11, zzkjVarZzd, zzioVar2);
                        bArr2 = bArr;
                        zzioVar2 = zzioVar;
                        iZzm = iZze;
                        i25 = i15;
                        unsafe2 = unsafe2;
                        i24 = i30;
                        i23 = -1;
                        obj3 = obj;
                        i22 = i11;
                    } else {
                        i16 = i29;
                        i19 = i27;
                        i17 = i26;
                        unsafe = unsafe2;
                        i20 = i30;
                        i13 = -1;
                        i18 = i33;
                        obj2 = obj;
                        i29 = i16;
                        i14 = i20;
                        i12 = i18;
                    }
                    i27 = i19;
                    i26 = i17;
                }
            }
            int iZzi = zzip.zzi(i12, bArr, i29, i11, zzd(obj2), zzioVar);
            bArr2 = bArr;
            zzioVar2 = zzioVar;
            i24 = i14;
            i25 = i15;
            obj3 = obj2;
            i23 = i13;
            unsafe2 = unsafe;
            i22 = i11;
            iZzm = iZzi;
            zzlmVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i39 = i22;
        int i40 = i27;
        int i41 = i26;
        if (i40 != 1048575) {
            unsafe7.putInt(obj7, i40, i41);
        }
        if (iZzm == i39) {
            return iZzm;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j, int i16, long j4, zzio zzioVar) throws zzkm {
        int iZzl;
        Unsafe unsafe = zzb;
        zzkj zzkjVarZzd = (zzkj) unsafe.getObject(obj, j4);
        if (!zzkjVarZzd.zzc()) {
            int size = zzkjVarZzd.size();
            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j4, zzkjVarZzd);
        }
        zzkj zzkjVar = zzkjVarZzd;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar;
                    int iZzj = zzip.zzj(bArr, i10, zzioVar);
                    int i17 = zzioVar.zza + iZzj;
                    while (iZzj < i17) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i17) {
                        return iZzj;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i10)));
                    int i18 = i10 + 8;
                    while (i18 < i11) {
                        int iZzj2 = zzip.zzj(bArr, i18, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i18;
                        }
                        zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj2)));
                        i18 = iZzj2 + 8;
                    }
                    return i18;
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar;
                    int iZzj3 = zzip.zzj(bArr, i10, zzioVar);
                    int i19 = zzioVar.zza + iZzj3;
                    while (iZzj3 < i19) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i19) {
                        return iZzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i10)));
                    int i20 = i10 + 4;
                    while (i20 < i11) {
                        int iZzj4 = zzip.zzj(bArr, i20, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i20;
                        }
                        zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj4)));
                        i20 = iZzj4 + 4;
                    }
                    return i20;
                }
                return i10;
            case 20:
            case zzbch.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzky zzkyVar = (zzky) zzkjVar;
                    int iZzj5 = zzip.zzj(bArr, i10, zzioVar);
                    int i21 = zzioVar.zza + iZzj5;
                    while (iZzj5 < i21) {
                        iZzj5 = zzip.zzm(bArr, iZzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (iZzj5 == i21) {
                        return iZzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar;
                    int iZzm = zzip.zzm(bArr, i10, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (iZzm < i11) {
                        int iZzj6 = zzip.zzj(bArr, iZzm, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzip.zzm(bArr, iZzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return iZzm;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzip.zzf(bArr, i10, zzkjVar, zzioVar);
                }
                if (i14 == 0) {
                    return zzip.zzl(i12, bArr, i10, i11, zzkjVar, zzioVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar;
                    int iZzj7 = zzip.zzj(bArr, i10, zzioVar);
                    int i22 = zzioVar.zza + iZzj7;
                    while (iZzj7 < i22) {
                        zzkyVar3.zzg(zzip.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i22) {
                        return iZzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar;
                    zzkyVar4.zzg(zzip.zzn(bArr, i10));
                    int i23 = i10 + 8;
                    while (i23 < i11) {
                        int iZzj8 = zzip.zzj(bArr, i23, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i23;
                        }
                        zzkyVar4.zzg(zzip.zzn(bArr, iZzj8));
                        i23 = iZzj8 + 8;
                    }
                    return i23;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVar;
                    int iZzj9 = zzip.zzj(bArr, i10, zzioVar);
                    int i24 = zzioVar.zza + iZzj9;
                    while (iZzj9 < i24) {
                        zzkdVar.zzh(zzip.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i24) {
                        return iZzj9;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar;
                    zzkdVar2.zzh(zzip.zzb(bArr, i10));
                    int i25 = i10 + 4;
                    while (i25 < i11) {
                        int iZzj10 = zzip.zzj(bArr, i25, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i25;
                        }
                        zzkdVar2.zzh(zzip.zzb(bArr, iZzj10));
                        i25 = iZzj10 + 4;
                    }
                    return i25;
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    zziq zziqVar = (zziq) zzkjVar;
                    int iZzj11 = zzip.zzj(bArr, i10, zzioVar);
                    int i26 = zzioVar.zza + iZzj11;
                    while (iZzj11 < i26) {
                        iZzj11 = zzip.zzm(bArr, iZzj11, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (iZzj11 == i26) {
                        return iZzj11;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar;
                    int iZzm2 = zzip.zzm(bArr, i10, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (iZzm2 < i11) {
                        int iZzj12 = zzip.zzj(bArr, iZzm2, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzip.zzm(bArr, iZzj12, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj13 = zzip.zzj(bArr, i10, zzioVar);
                        int i27 = zzioVar.zza;
                        if (i27 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i27 == 0) {
                            zzkjVar.add("");
                        } else {
                            zzkjVar.add(new String(bArr, iZzj13, i27, zzkk.zzb));
                            iZzj13 += i27;
                        }
                        while (iZzj13 < i11) {
                            int iZzj14 = zzip.zzj(bArr, iZzj13, zzioVar);
                            if (i12 != zzioVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzip.zzj(bArr, iZzj14, zzioVar);
                            int i28 = zzioVar.zza;
                            if (i28 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i28 == 0) {
                                zzkjVar.add("");
                            } else {
                                zzkjVar.add(new String(bArr, iZzj13, i28, zzkk.zzb));
                                iZzj13 += i28;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzip.zzj(bArr, i10, zzioVar);
                    int i29 = zzioVar.zza;
                    if (i29 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i29 == 0) {
                        zzkjVar.add("");
                    } else {
                        int i30 = iZzj15 + i29;
                        if (!zzna.zzf(bArr, iZzj15, i30)) {
                            throw zzkm.zzc();
                        }
                        zzkjVar.add(new String(bArr, iZzj15, i29, zzkk.zzb));
                        iZzj15 = i30;
                    }
                    while (iZzj15 < i11) {
                        int iZzj16 = zzip.zzj(bArr, iZzj15, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzip.zzj(bArr, iZzj16, zzioVar);
                        int i31 = zzioVar.zza;
                        if (i31 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i31 == 0) {
                            zzkjVar.add("");
                        } else {
                            int i32 = iZzj15 + i31;
                            if (!zzna.zzf(bArr, iZzj15, i32)) {
                                throw zzkm.zzc();
                            }
                            zzkjVar.add(new String(bArr, iZzj15, i31, zzkk.zzb));
                            iZzj15 = i32;
                        }
                    }
                    return iZzj15;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return zzip.zze(zzE(i15), i12, bArr, i10, i11, zzkjVar, zzioVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int iZzj17 = zzip.zzj(bArr, i10, zzioVar);
                    int i33 = zzioVar.zza;
                    if (i33 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i33 > bArr.length - iZzj17) {
                        throw zzkm.zzf();
                    }
                    if (i33 == 0) {
                        zzkjVar.add(zzjb.zzb);
                    } else {
                        zzkjVar.add(zzjb.zzl(bArr, iZzj17, i33));
                        iZzj17 += i33;
                    }
                    while (iZzj17 < i11) {
                        int iZzj18 = zzip.zzj(bArr, iZzj17, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzip.zzj(bArr, iZzj18, zzioVar);
                        int i34 = zzioVar.zza;
                        if (i34 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i34 > bArr.length - iZzj17) {
                            throw zzkm.zzf();
                        }
                        if (i34 == 0) {
                            zzkjVar.add(zzjb.zzb);
                        } else {
                            zzkjVar.add(zzjb.zzl(bArr, iZzj17, i34));
                            iZzj17 += i34;
                        }
                    }
                    return iZzj17;
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iZzl = zzip.zzl(i12, bArr, i10, i11, zzkjVar, zzioVar);
                    }
                    return i10;
                }
                iZzl = zzip.zzf(bArr, i10, zzkjVar, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object objZzC = zzlw.zzC(i13, zzkjVar, zzD(i15), zzmmVar, this.zzn);
                if (objZzC == null) {
                    return iZzl;
                }
                zzkcVar.zzc = (zzmm) objZzC;
                return iZzl;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar;
                    int iZzj19 = zzip.zzj(bArr, i10, zzioVar);
                    int i35 = zzioVar.zza + iZzj19;
                    while (iZzj19 < i35) {
                        iZzj19 = zzip.zzj(bArr, iZzj19, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (iZzj19 == i35) {
                        return iZzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar;
                    int iZzj20 = zzip.zzj(bArr, i10, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (iZzj20 < i11) {
                        int iZzj21 = zzip.zzj(bArr, iZzj20, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzip.zzj(bArr, iZzj21, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return iZzj20;
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar;
                    int iZzj22 = zzip.zzj(bArr, i10, zzioVar);
                    int i36 = zzioVar.zza + iZzj22;
                    while (iZzj22 < i36) {
                        iZzj22 = zzip.zzm(bArr, iZzj22, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (iZzj22 == i36) {
                        return iZzj22;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar;
                    int iZzm3 = zzip.zzm(bArr, i10, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (iZzm3 < i11) {
                        int iZzj23 = zzip.zzj(bArr, iZzm3, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzip.zzm(bArr, iZzj23, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return iZzm3;
                }
                return i10;
            default:
                if (i14 == 3) {
                    zzlu zzluVarZzE = zzE(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iZzc = zzip.zzc(zzluVarZzE, bArr, i10, i11, i37, zzioVar);
                    zzlu zzluVar = zzluVarZzE;
                    zzio zzioVar2 = zzioVar;
                    zzkjVar.add(zzioVar2.zzc);
                    while (iZzc < i11) {
                        int iZzj24 = zzip.zzj(bArr, iZzc, zzioVar2);
                        if (i12 != zzioVar2.zza) {
                            return iZzc;
                        }
                        zzlu zzluVar2 = zzluVar;
                        zzio zzioVar3 = zzioVar2;
                        iZzc = zzip.zzc(zzluVar2, bArr, iZzj24, i11, i37, zzioVar3);
                        zzkjVar.add(zzioVar3.zzc);
                        zzluVar = zzluVar2;
                        zzioVar2 = zzioVar3;
                    }
                    return iZzc;
                }
                return i10;
        }
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i10;
        int iZzc;
        int i11;
        int iZzc2;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzB = zzB(i13);
            int i14 = this.zzc[i13];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i10 = i12 * 53;
                    iZzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i12 = iZzc + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iZzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i12 = iZzc + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i12 = iZzc + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i12 = iZzc + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i12 = i11 + iZzc2;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i12 = iZzc + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i12 = i11 + iZzc2;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iZzc = zzkk.zza(zzmv.zzw(obj, j));
                    i12 = iZzc + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 9:
                    Object objZzf = zzmv.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i12 = i11 + iZzc2;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i12 = i11 + iZzc2;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i12 = i11 + iZzc2;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i12 = iZzc + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i12 = i11 + iZzc2;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i12 = iZzc + i10;
                    break;
                case 17:
                    Object objZzf2 = zzmv.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
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
                    i10 = i12 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i12 = iZzc + i10;
                    break;
                case 51:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j);
                        i12 = i11 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j);
                        i12 = i11 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkk.zza(zzS(obj, j));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j);
                        i12 = i11 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j);
                        i12 = i11 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j);
                        i12 = i11 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc2 = zzr(obj, j);
                        i12 = i11 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i12 = iZzc + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzn.zzc(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x04a4, code lost:
    
        if (r11 == r15) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a6, code lost:
    
        r20.putInt(r9, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04ac, code lost:
    
        r0 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04b0, code lost:
    
        if (r0 >= r8.zzl) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04b2, code lost:
    
        r1 = r8.zzj[r0];
        r2 = r8.zzc[r1];
        r2 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r8.zzB(r1) & r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04c4, code lost:
    
        if (r2 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04cb, code lost:
    
        if (r8.zzD(r1) != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04cd, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04d0, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.zzld) r2;
        r0 = (com.google.android.gms.internal.measurement.zzlc) r8.zzF(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d9, code lost:
    
        if (r7 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04db, code lost:
    
        if (r3 != r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04e2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04e3, code lost:
    
        if (r3 > r4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04e5, code lost:
    
        if (r6 != r7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04e7, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04ec, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.measurement.zzio r33) throws com.google.android.gms.internal.measurement.zzkm {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long jZzB = zzB(this.zzj[i11]) & 1048575;
            Object objZzf = zzmv.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzld) objZzf).zzc();
                zzmv.zzs(obj, jZzB, objZzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            long j = 1048575 & iZzB;
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i10)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i10)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i10)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i10);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws zzkm {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zzioVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i10)) {
                        zzndVar.zzf(i11, zzmv.zza(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i10)) {
                        zzndVar.zzo(i11, zzmv.zzb(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i10)) {
                        zzndVar.zzt(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i10)) {
                        zzndVar.zzJ(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i10)) {
                        zzndVar.zzr(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i10)) {
                        zzndVar.zzm(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i10)) {
                        zzndVar.zzk(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i10)) {
                        zzndVar.zzb(i11, zzmv.zzw(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i10)) {
                        zzndVar.zzH(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i10)) {
                        zzndVar.zzi(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i10)) {
                        zzndVar.zzw(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i10)) {
                        zzndVar.zzy(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i10)) {
                        zzndVar.zzA(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i10)) {
                        zzndVar.zzC(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 28:
                    zzlw.zzI(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 50:
                    zzM(zzndVar, i11, zzmv.zzf(obj, iZzB & 1048575), i10);
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzf(i11, zzn(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzo(i11, zzo(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzt(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzJ(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzr(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzm(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzk(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzb(i11, zzS(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i11, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzH(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzi(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzw(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzy(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzA(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzC(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i10) || Double.doubleToLongBits(zzmv.zza(obj, j)) != Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i10) || Float.floatToIntBits(zzmv.zzb(obj, j)) != Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i10) || zzmv.zzw(obj, j) != zzmv.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
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
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    long jZzy = zzy(i10) & 1048575;
                    if (zzmv.zzc(obj, jZzy) != zzmv.zzc(obj2, jZzy) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzk(java.lang.Object):boolean");
    }
}
