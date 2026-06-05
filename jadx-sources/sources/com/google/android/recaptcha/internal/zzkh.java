package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.ads.zzbch;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.a;
import sun.misc.Unsafe;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private zzkh(int[] iArr, Object[] objArr, int i10, int i11, zzke zzkeVar, int i12, boolean z2, int[] iArr2, int i13, int i14, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzkeVar instanceof zzit;
        boolean z10 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzkr zzkrVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzkr zzkrVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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
            zzkr zzkrVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzkr zzkrVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzkq zzkqVar) {
        long j = i10 & 1048575;
        if (zzM(i10)) {
            zzlv.zzs(obj, j, zzkqVar.zzs());
        } else if (this.zzi) {
            zzlv.zzs(obj, j, zzkqVar.zzr());
        } else {
            zzlv.zzs(obj, j, zzkqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzlv.zzq(obj, j, (1 << (iZzr >>> 20)) | zzlv.zzc(obj, j));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzlv.zzq(obj, zzr(i11) & 1048575, i10);
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
            return (zzlv.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i10);
        long j4 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzlv.zza(obj, j4)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzlv.zzb(obj, j4)) != 0;
            case 2:
                return zzlv.zzd(obj, j4) != 0;
            case 3:
                return zzlv.zzd(obj, j4) != 0;
            case 4:
                return zzlv.zzc(obj, j4) != 0;
            case 5:
                return zzlv.zzd(obj, j4) != 0;
            case 6:
                return zzlv.zzc(obj, j4) != 0;
            case 7:
                return zzlv.zzw(obj, j4);
            case 8:
                Object objZzf = zzlv.zzf(obj, j4);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzgw) {
                    return !zzgw.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzlv.zzf(obj, j4) != null;
            case 10:
                return !zzgw.zzb.equals(zzlv.zzf(obj, j4));
            case 11:
                return zzlv.zzc(obj, j4) != 0;
            case 12:
                return zzlv.zzc(obj, j4) != 0;
            case 13:
                return zzlv.zzc(obj, j4) != 0;
            case 14:
                return zzlv.zzd(obj, j4) != 0;
            case 15:
                return zzlv.zzc(obj, j4) != 0;
            case 16:
                return zzlv.zzd(obj, j4) != 0;
            case 17:
                return zzlv.zzf(obj, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzlv.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzlv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzmd zzmdVar) {
        if (obj instanceof String) {
            zzmdVar.zzG(i10, (String) obj);
        } else {
            zzmdVar.zzd(i10, (zzgw) obj);
        }
    }

    public static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar != zzlm.zzc()) {
            return zzlmVar;
        }
        zzlm zzlmVarZzf = zzlm.zzf();
        zzitVar.zzc = zzlmVarZzf;
        return zzlmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzkh zzm(java.lang.Class r33, com.google.android.recaptcha.internal.zzkb r34, com.google.android.recaptcha.internal.zzkk r35, com.google.android.recaptcha.internal.zzjs r36, com.google.android.recaptcha.internal.zzll r37, com.google.android.recaptcha.internal.zzif r38, com.google.android.recaptcha.internal.zzjz r39) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzkb, com.google.android.recaptcha.internal.zzkk, com.google.android.recaptcha.internal.zzjs, com.google.android.recaptcha.internal.zzll, com.google.android.recaptcha.internal.zzif, com.google.android.recaptcha.internal.zzjz):com.google.android.recaptcha.internal.zzkh");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzlv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzlv.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzlv.zzf(obj, j)).intValue();
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzlv.zzf(obj, j)).longValue();
    }

    private final zzix zzw(int i10) {
        int i11 = i10 / 3;
        return (zzix) this.zzd[i11 + i11 + 1];
    }

    private final zzkr zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzkr zzkrVar = (zzkr) objArr[i12];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzkrVarZzb = zzkn.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzkrVarZzb;
        return zzkrVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzll zzllVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzf = zzlv.zzf(obj, zzu(i10) & 1048575);
        if (objZzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zza(Object obj) {
        int i10;
        int iZzh;
        int size;
        int iZzl;
        int iZzy;
        int iZzy2;
        int iZzd;
        boolean z2;
        int iZzb;
        int iZzx;
        int iZzy3;
        int iZzy4;
        int size2;
        int iZzk;
        int iZzy5;
        int size3;
        int iZzi;
        int iZzy6;
        int i11;
        int iZze;
        int iZzy7;
        int iZzy8;
        int iZzz;
        zzkh<T> zzkhVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iY = 0;
        while (i14 < zzkhVar.zzc.length) {
            int iZzu = zzkhVar.zzu(i14);
            int iZzt = zzt(iZzu);
            int[] iArr = zzkhVar.zzc;
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            if (iZzt <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iZzu & i12;
            if (iZzt >= zzik.zzJ.zza()) {
                zzik.zzW.zza();
            }
            long j = i19;
            switch (iZzt) {
                case 0:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, 8, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 1:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, 4, iY);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i14 += 3;
                    i12 = 1048575;
                case 2:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, zzhh.zzz(unsafe.getLong(obj2, j)), iY);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 3:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, zzhh.zzz(unsafe.getLong(obj2, j)), iY);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 4:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, zzhh.zzu(unsafe.getInt(obj2, j)), iY);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 5:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, 8, iY);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i14 += 3;
                    i12 = 1048575;
                case 6:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, 4, iY);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i14 += 3;
                    i12 = 1048575;
                case 7:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, 1, iY);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i14 += 3;
                    i12 = 1048575;
                case 8:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzgw) {
                            int i21 = zzhh.zzb;
                            int iZzd2 = ((zzgw) object).zzd();
                            iY = a.y(i20, zzhh.zzy(iZzd2) + iZzd2, iY);
                        } else {
                            iY = a.y(i20, zzhh.zzx((String) object), iY);
                        }
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 9:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iZzh = zzkt.zzh(i16, unsafe.getObject(obj2, j), zzkhVar.zzx(i14));
                        iY += iZzh;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 10:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        zzgw zzgwVar = (zzgw) unsafe.getObject(obj2, j);
                        int i22 = zzhh.zzb;
                        int iZzd3 = zzgwVar.zzd();
                        iY = a.y(i16 << 3, zzhh.zzy(iZzd3) + iZzd3, iY);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 11:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, zzhh.zzy(unsafe.getInt(obj2, j)), iY);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 12:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, zzhh.zzu(unsafe.getInt(obj2, j)), iY);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 13:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, 4, iY);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i14 += 3;
                    i12 = 1048575;
                case 14:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY = a.y(i16 << 3, 8, iY);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i14 += 3;
                    i12 = 1048575;
                case 15:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        int i23 = unsafe.getInt(obj2, j);
                        iY = a.y((i23 >> 31) ^ (i23 + i23), zzhh.zzy(i16 << 3), iY);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 16:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j4 = unsafe.getLong(obj2, j);
                        iY += zzhh.zzz((j4 >> 63) ^ (j4 + j4)) + zzhh.zzy(i16 << 3);
                    }
                    zzkhVar = this;
                    i14 += 3;
                    i12 = 1048575;
                case 17:
                    if (zzkhVar.zzO(obj2, i14, i13, i15, i10)) {
                        iY += zzhh.zzt(i16, (zzke) unsafe.getObject(obj2, j), zzkhVar.zzx(i14));
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 18:
                    iZzh = zzkt.zzd(i16, (List) unsafe.getObject(obj2, j), false);
                    iY += iZzh;
                    i14 += 3;
                    i12 = 1048575;
                case 19:
                    iZzh = zzkt.zzb(i16, (List) unsafe.getObject(obj2, j), false);
                    iY += iZzh;
                    i14 += 3;
                    i12 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i24 = zzkt.zza;
                    iZzy2 = list.size() == 0 ? 0 : (zzhh.zzy(i16 << 3) * list.size()) + zzkt.zzg(list);
                    iY += iZzy2;
                    i14 += 3;
                    i12 = 1048575;
                case zzbch.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i25 = zzkt.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzkt.zzl(list2);
                        iZzy = zzhh.zzy(i16 << 3);
                        iZzy2 = (iZzy * size) + iZzl;
                        iY += iZzy2;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    iY += iZzy2;
                    i14 += 3;
                    i12 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzkt.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzkt.zzf(list3);
                        iZzy = zzhh.zzy(i16 << 3);
                        iZzy2 = (iZzy * size) + iZzl;
                        iY += iZzy2;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    iY += iZzy2;
                    i14 += 3;
                    i12 = 1048575;
                case 23:
                    iZzd = zzkt.zzd(i16, (List) unsafe.getObject(obj2, j), false);
                    iY += iZzd;
                    i14 += 3;
                    i12 = 1048575;
                case 24:
                    z2 = false;
                    iZzb = zzkt.zzb(i16, (List) unsafe.getObject(obj2, j), false);
                    iY += iZzb;
                    i14 += 3;
                    i12 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzkt.zza;
                    int size4 = list4.size();
                    iZzd = size4 == 0 ? 0 : size4 * (zzhh.zzy(i16 << 3) + 1);
                    iY += iZzd;
                    i14 += 3;
                    i12 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzkt.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzx = 0;
                    } else {
                        boolean z10 = list5 instanceof zzjm;
                        int iZzy9 = zzhh.zzy(i16 << 3) * size5;
                        if (z10) {
                            zzjm zzjmVar = (zzjm) list5;
                            iZzx = iZzy9;
                            for (int i29 = 0; i29 < size5; i29++) {
                                Object objZzf = zzjmVar.zzf(i29);
                                if (objZzf instanceof zzgw) {
                                    int iZzd4 = ((zzgw) objZzf).zzd();
                                    iZzx = a.y(iZzd4, iZzd4, iZzx);
                                } else {
                                    iZzx = zzhh.zzx((String) objZzf) + iZzx;
                                }
                            }
                        } else {
                            iZzx = iZzy9;
                            for (int i30 = 0; i30 < size5; i30++) {
                                Object obj3 = list5.get(i30);
                                if (obj3 instanceof zzgw) {
                                    int iZzd5 = ((zzgw) obj3).zzd();
                                    iZzx = a.y(iZzd5, iZzd5, iZzx);
                                } else {
                                    iZzx = zzhh.zzx((String) obj3) + iZzx;
                                }
                            }
                        }
                    }
                    iY += iZzx;
                    i14 += 3;
                    i12 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzkr zzkrVarZzx = zzkhVar.zzx(i14);
                    int i31 = zzkt.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzy3 = 0;
                    } else {
                        iZzy3 = zzhh.zzy(i16 << 3) * size6;
                        for (int i32 = 0; i32 < size6; i32++) {
                            Object obj4 = list6.get(i32);
                            if (obj4 instanceof zzjk) {
                                int iZza = ((zzjk) obj4).zza();
                                iZzy3 = a.y(iZza, iZza, iZzy3);
                            } else {
                                iZzy3 = zzhh.zzw((zzke) obj4, zzkrVarZzx) + iZzy3;
                            }
                        }
                    }
                    iY += iZzy3;
                    i14 += 3;
                    i12 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i33 = zzkt.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzy4 = 0;
                    } else {
                        iZzy4 = zzhh.zzy(i16 << 3) * size7;
                        for (int i34 = 0; i34 < list7.size(); i34++) {
                            int iZzd6 = ((zzgw) list7.get(i34)).zzd();
                            iZzy4 = a.y(iZzd6, iZzd6, iZzy4);
                        }
                    }
                    iY += iZzy4;
                    i14 += 3;
                    i12 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i35 = zzkt.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iZzk = zzkt.zzk(list8);
                        iZzy5 = zzhh.zzy(i16 << 3);
                        iZzd = iZzk + (iZzy5 * size2);
                        iY += iZzd;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    iY += iZzd;
                    i14 += 3;
                    i12 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i36 = zzkt.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iZzk = zzkt.zza(list9);
                        iZzy5 = zzhh.zzy(i16 << 3);
                        iZzd = iZzk + (iZzy5 * size2);
                        iY += iZzd;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    iY += iZzd;
                    i14 += 3;
                    i12 = 1048575;
                case 31:
                    iZzd = zzkt.zzb(i16, (List) unsafe.getObject(obj2, j), false);
                    iY += iZzd;
                    i14 += 3;
                    i12 = 1048575;
                case 32:
                    z2 = false;
                    iZzb = zzkt.zzd(i16, (List) unsafe.getObject(obj2, j), false);
                    iY += iZzb;
                    i14 += 3;
                    i12 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i37 = zzkt.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        iZzi = zzkt.zzi(list10);
                        iZzy6 = zzhh.zzy(i16 << 3);
                        i11 = (iZzy6 * size3) + iZzi;
                        iY += i11;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    i11 = 0;
                    iY += i11;
                    i14 += 3;
                    i12 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i38 = zzkt.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        iZzi = zzkt.zzj(list11);
                        iZzy6 = zzhh.zzy(i16 << 3);
                        i11 = (iZzy6 * size3) + iZzi;
                        iY += i11;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    i11 = 0;
                    iY += i11;
                    i14 += 3;
                    i12 = 1048575;
                case 35:
                    iZze = zzkt.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 36:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 37:
                    iZze = zzkt.zzg((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 38:
                    iZze = zzkt.zzl((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 39:
                    iZze = zzkt.zzf((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 40:
                    iZze = zzkt.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 41:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i39 = zzkt.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 43:
                    iZze = zzkt.zzk((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 44:
                    iZze = zzkt.zza((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 45:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 46:
                    iZze = zzkt.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 47:
                    iZze = zzkt.zzi((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 48:
                    iZze = zzkt.zzj((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i16 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzkr zzkrVarZzx2 = zzkhVar.zzx(i14);
                    int i40 = zzkt.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i11 = 0;
                    } else {
                        int iZzt2 = 0;
                        for (int i41 = 0; i41 < size8; i41++) {
                            iZzt2 += zzhh.zzt(i16, (zzke) list13.get(i41), zzkrVarZzx2);
                        }
                        i11 = iZzt2;
                    }
                    iY += i11;
                    i14 += 3;
                    i12 = 1048575;
                case 50:
                    zzjy zzjyVar = (zzjy) unsafe.getObject(obj2, j);
                    if (!zzjyVar.isEmpty()) {
                        Iterator it = zzjyVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 51:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, 8, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 52:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, 4, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 53:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, zzhh.zzz(zzv(obj2, j)), iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 54:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, zzhh.zzz(zzv(obj2, j)), iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 55:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, zzhh.zzu(zzp(obj2, j)), iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 56:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, 8, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 57:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, 4, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 58:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, 1, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 59:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        int i42 = i16 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzgw) {
                            int i43 = zzhh.zzb;
                            int iZzd7 = ((zzgw) object2).zzd();
                            iY = a.y(i42, zzhh.zzy(iZzd7) + iZzd7, iY);
                        } else {
                            iY = a.y(i42, zzhh.zzx((String) object2), iY);
                        }
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 60:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iZzd = zzkt.zzh(i16, unsafe.getObject(obj2, j), zzkhVar.zzx(i14));
                        iY += iZzd;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 61:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        zzgw zzgwVar2 = (zzgw) unsafe.getObject(obj2, j);
                        int i44 = zzhh.zzb;
                        int iZzd8 = zzgwVar2.zzd();
                        iY = a.y(i16 << 3, zzhh.zzy(iZzd8) + iZzd8, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 62:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, zzhh.zzy(zzp(obj2, j)), iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 63:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, zzhh.zzu(zzp(obj2, j)), iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 64:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, 4, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 65:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY = a.y(i16 << 3, 8, iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 66:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        int iZzp = zzp(obj2, j);
                        iY = a.y((iZzp >> 31) ^ (iZzp + iZzp), zzhh.zzy(i16 << 3), iY);
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 67:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        long jZzv = zzv(obj2, j);
                        iZze = zzhh.zzy(i16 << 3);
                        iZzz = zzhh.zzz((jZzv >> 63) ^ (jZzv + jZzv));
                        iY += iZzz + iZze;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 68:
                    if (zzkhVar.zzR(obj2, i16, i14)) {
                        iY += zzhh.zzt(i16, (zzke) unsafe.getObject(obj2, j), zzkhVar.zzx(i14));
                    }
                    i14 += 3;
                    i12 = 1048575;
                default:
                    i14 += 3;
                    i12 = 1048575;
            }
        }
        int iZza2 = 0;
        zzll zzllVar = zzkhVar.zzn;
        int iZza3 = iY + zzllVar.zza(zzllVar.zzd(obj2));
        if (!zzkhVar.zzh) {
            return iZza3;
        }
        zzij zzijVarZzb = zzkhVar.zzo.zzb(obj2);
        for (int i45 = 0; i45 < zzijVarZzb.zza.zzb(); i45++) {
            Map.Entry entryZzg = zzijVarZzb.zza.zzg(i45);
            iZza2 += zzij.zza((zzii) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzijVarZzb.zza.zzc()) {
            iZza2 += zzij.zza((zzii) entry2.getKey(), entry2.getValue());
        }
        return iZza3 + iZza2;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzu = zzu(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i16 = iArr[i14];
            long j = i15;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzlv.zza(obj, j));
                    byte[] bArr = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzlv.zzb(obj, j));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr2 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr3 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j);
                    i13 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr4 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j);
                    i13 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzjc.zza(zzlv.zzw(obj, j));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object objZzf = zzlv.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j);
                    i13 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j);
                    i13 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j);
                    i13 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr5 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iZzc = zzlv.zzc(obj, j);
                    i13 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j);
                    byte[] bArr6 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object objZzf2 = zzlv.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i13 = i12 + iHashCode;
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
                    i11 = i13 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzjc.zza(zzS(obj, j));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) zzlv.zzf(obj, j)).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i13 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:531:0x0d3e, code lost:
    
        if (r9 == 1048575) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0d40, code lost:
    
        r25.putInt(r14, r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0d46, code lost:
    
        r8 = r0.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0d4b, code lost:
    
        if (r8 >= r0.zzl) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d4d, code lost:
    
        r0.zzy(r14, r0.zzj[r8], null, r0.zzn, r30);
        r8 = r8 + 1;
        r0 = r29;
        r14 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0d61, code lost:
    
        if (r10 != 0) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d63, code lost:
    
        if (r6 != r7) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0d6a, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0d6b, code lost:
    
        if (r6 > r7) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0d6d, code lost:
    
        if (r15 != r10) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0d6f, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0d74, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:583:0x097e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0c00 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x098d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0c0a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.recaptcha.internal.zzgj r35) throws com.google.android.recaptcha.internal.zzje {
        /*
            Method dump skipped, instructions count: 3630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.recaptcha.internal.zzkr
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
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzit
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzE(r2)
            r0.zza = r1
            r0.zzC()
        L1b:
            int[] r0 = r7.zzc
        L1d:
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
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.recaptcha.internal.zzkh.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.recaptcha.internal.zzjy r6 = (com.google.android.recaptcha.internal.zzjy) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.recaptcha.internal.zzjs r2 = r7.zzm
            r2.zzb(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.recaptcha.internal.zzkr r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzkh.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.recaptcha.internal.zzkr r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzkh.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.recaptcha.internal.zzll r0 = r7.zzn
            r0.zzm(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.recaptcha.internal.zzif r0 = r7.zzo
            r0.zzf(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            int i11 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j = i11;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzlv.zzo(obj, j, zzlv.zza(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzlv.zzp(obj, j, zzlv.zzb(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzlv.zzm(obj, j, zzlv.zzw(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j, zzlv.zzc(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j, zzlv.zzd(obj2, j));
                        zzH(obj, i10);
                        break;
                    } else {
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i13 = zzkt.zza;
                    zzlv.zzs(obj, j, zzjz.zzb(zzlv.zzf(obj, j), zzlv.zzf(obj2, j)));
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
                    if (zzR(obj2, i12, i10)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i12, i10);
                        break;
                    } else {
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
                    if (zzR(obj2, i12, i10)) {
                        zzlv.zzs(obj, j, zzlv.zzf(obj2, j));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x07e4 A[Catch: all -> 0x07ea, TRY_LEAVE, TryCatch #7 {all -> 0x07ea, blocks: (B:193:0x07df, B:195:0x07e4), top: B:235:0x07df }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0827 A[LOOP:2: B:217:0x0823->B:219:0x0827, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzkq r19, com.google.android.recaptcha.internal.zzie r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzkq, com.google.android.recaptcha.internal.zzie):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgj zzgjVar) throws zzje {
        zzc(obj, bArr, i10, i11, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r21, com.google.android.recaptcha.internal.zzmd r22) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzmd):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzH;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzlv.zza(obj, j)) != Double.doubleToLongBits(zzlv.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzlv.zzb(obj, j)) != Float.floatToIntBits(zzlv.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzlv.zzw(obj, j) != zzlv.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzlv.zzc(obj, j) != zzlv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzlv.zzd(obj, j) != zzlv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
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
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
                    break;
                case 50:
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j));
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
                    if (zzlv.zzc(obj, jZzr) != zzlv.zzc(obj2, jZzr) || !zzkt.zzH(zzlv.zzf(obj, j), zzlv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzl(java.lang.Object):boolean");
    }
}
