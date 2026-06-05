package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.ads.zzbch;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzakt<T> implements zzalh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamm.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzakp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzala zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzakx zzo;
    private final zzaju zzp;
    private final zzamg<?, ?> zzq;
    private final zzais<?> zzr;
    private final zzaki zzs;

    private zzakt(int[] iArr, Object[] objArr, int i10, int i11, zzakp zzakpVar, zzala zzalaVar, boolean z2, int[] iArr2, int i12, int i13, zzakx zzakxVar, zzaju zzajuVar, zzamg<?, ?> zzamgVar, zzais<?> zzaisVar, zzaki zzakiVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzakpVar instanceof zzaje;
        this.zzj = zzalaVar;
        this.zzh = zzaisVar != null && zzaisVar.zza(zzakpVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i12;
        this.zzn = i13;
        this.zzo = zzakxVar;
        this.zzp = zzajuVar;
        this.zzq = zzamgVar;
        this.zzr = zzaisVar;
        this.zzg = zzakpVar;
        this.zzs = zzakiVar;
    }

    private static <T> double zza(T t10, long j) {
        return ((Double) zzamm.zze(t10, j)).doubleValue();
    }

    private static <T> float zzb(T t10, long j) {
        return ((Float) zzamm.zze(t10, j)).floatValue();
    }

    private static <T> int zzc(T t10, long j) {
        return ((Integer) zzamm.zze(t10, j)).intValue();
    }

    private static <T> long zzd(T t10, long j) {
        return ((Long) zzamm.zze(t10, j)).longValue();
    }

    private final zzalh zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzalh zzalhVar = (zzalh) this.zzd[i11];
        if (zzalhVar != null) {
            return zzalhVar;
        }
        zzalh<T> zzalhVarZza = zzald.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzalhVarZza;
        return zzalhVarZza;
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i10, int i11, zzamt zzamtVar, Class<?> cls, zzahn zzahnVar) {
        switch (zzaks.zza[zzamtVar.ordinal()]) {
            case 1:
                int iZzd = zzahk.zzd(bArr, i10, zzahnVar);
                zzahnVar.zzc = Boolean.valueOf(zzahnVar.zzb != 0);
                return iZzd;
            case 2:
                return zzahk.zza(bArr, i10, zzahnVar);
            case 3:
                zzahnVar.zzc = Double.valueOf(zzahk.zza(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                zzahnVar.zzc = Integer.valueOf(zzahk.zzc(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                zzahnVar.zzc = Long.valueOf(zzahk.zzd(bArr, i10));
                return i10 + 8;
            case 8:
                zzahnVar.zzc = Float.valueOf(zzahk.zzb(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzahk.zzc(bArr, i10, zzahnVar);
                zzahnVar.zzc = Integer.valueOf(zzahnVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzahk.zzd(bArr, i10, zzahnVar);
                zzahnVar.zzc = Long.valueOf(zzahnVar.zzb);
                return iZzd2;
            case 14:
                return zzahk.zza(zzald.zza().zza((Class) cls), bArr, i10, i11, zzahnVar);
            case 15:
                int iZzc2 = zzahk.zzc(bArr, i10, zzahnVar);
                zzahnVar.zzc = Integer.valueOf(zzaic.zza(zzahnVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzahk.zzd(bArr, i10, zzahnVar);
                zzahnVar.zzc = Long.valueOf(zzaic.zza(zzahnVar.zzb));
                return iZzd3;
            case 17:
                return zzahk.zzb(bArr, i10, zzahnVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzaji zzd(int i10) {
        return (zzaji) this.zzd[((i10 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaje) {
            return ((zzaje) obj).zzu();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    public final int zzb(T t10) {
        int i10;
        int iZza;
        int i11;
        int iZzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzc2 = zzc(i13);
            int i14 = this.zzc[i13];
            long j = 1048575 & iZzc2;
            int iHashCode = 37;
            switch ((iZzc2 & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    iZza = zzajh.zza(Double.doubleToLongBits(zzamm.zza(t10, j)));
                    i12 = iZza + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iZza = Float.floatToIntBits(zzamm.zzb(t10, j));
                    i12 = iZza + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iZza = zzajh.zza(zzamm.zzd(t10, j));
                    i12 = iZza + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iZza = zzajh.zza(zzamm.zzd(t10, j));
                    i12 = iZza + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iZzc = zzamm.zzc(t10, j);
                    i12 = i11 + iZzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iZza = zzajh.zza(zzamm.zzd(t10, j));
                    i12 = iZza + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iZzc = zzamm.zzc(t10, j);
                    i12 = i11 + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iZza = zzajh.zza(zzamm.zzh(t10, j));
                    i12 = iZza + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iZza = ((String) zzamm.zze(t10, j)).hashCode();
                    i12 = iZza + i10;
                    break;
                case 9:
                    Object objZze = zzamm.zze(t10, j);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iZza = zzamm.zze(t10, j).hashCode();
                    i12 = iZza + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iZzc = zzamm.zzc(t10, j);
                    i12 = i11 + iZzc;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iZzc = zzamm.zzc(t10, j);
                    i12 = i11 + iZzc;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iZzc = zzamm.zzc(t10, j);
                    i12 = i11 + iZzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iZza = zzajh.zza(zzamm.zzd(t10, j));
                    i12 = iZza + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iZzc = zzamm.zzc(t10, j);
                    i12 = i11 + iZzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iZza = zzajh.zza(zzamm.zzd(t10, j));
                    i12 = iZza + i10;
                    break;
                case 17:
                    Object objZze2 = zzamm.zze(t10, j);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
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
                    iZza = zzamm.zze(t10, j).hashCode();
                    i12 = iZza + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iZza = zzamm.zze(t10, j).hashCode();
                    i12 = iZza + i10;
                    break;
                case 51:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzajh.zza(Double.doubleToLongBits(zza(t10, j)));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = Float.floatToIntBits(zzb(t10, j));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzajh.zza(zzd(t10, j));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzajh.zza(zzd(t10, j));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t10, j);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzajh.zza(zzd(t10, j));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t10, j);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzajh.zza(zze(t10, j));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = ((String) zzamm.zze(t10, j)).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzamm.zze(t10, j).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzamm.zze(t10, j).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t10, j);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t10, j);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t10, j);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzajh.zza(zzd(t10, j));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t10, j);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzajh.zza(zzd(t10, j));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzakt<T>) t10, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzamm.zze(t10, j).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzq.zzd(t10).hashCode() + (i12 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzr.zza(t10).hashCode() : iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(T r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L8
            goto L92
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaje
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzaje r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzaje) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzb(r2)
            r0.zza = r1
            r0.zzt()
        L1b:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1e:
            if (r1 >= r0) goto L84
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6e
            r5 = 60
            if (r2 == r5) goto L56
            r5 = 68
            if (r2 == r5) goto L56
            switch(r2) {
                case 17: goto L6e;
                case 18: goto L50;
                case 19: goto L50;
                case 20: goto L50;
                case 21: goto L50;
                case 22: goto L50;
                case 23: goto L50;
                case 24: goto L50;
                case 25: goto L50;
                case 26: goto L50;
                case 27: goto L50;
                case 28: goto L50;
                case 29: goto L50;
                case 30: goto L50;
                case 31: goto L50;
                case 32: goto L50;
                case 33: goto L50;
                case 34: goto L50;
                case 35: goto L50;
                case 36: goto L50;
                case 37: goto L50;
                case 38: goto L50;
                case 39: goto L50;
                case 40: goto L50;
                case 41: goto L50;
                case 42: goto L50;
                case 43: goto L50;
                case 44: goto L50;
                case 45: goto L50;
                case 46: goto L50;
                case 47: goto L50;
                case 48: goto L50;
                case 49: goto L50;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L81
        L3e:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.p002firebaseauthapi.zzakt.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzaki r6 = r7.zzs
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L81
        L50:
            com.google.android.gms.internal.firebase-auth-api.zzaju r2 = r7.zzp
            r2.zzb(r8, r3)
            goto L81
        L56:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzalh r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzakt.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzc(r3)
            goto L81
        L6e:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzalh r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzakt.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzc(r3)
        L81:
            int r1 = r1 + 3
            goto L1e
        L84:
            com.google.android.gms.internal.firebase-auth-api.zzamg<?, ?> r0 = r7.zzq
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L92
            com.google.android.gms.internal.firebase-auth-api.zzais<?> r0 = r7.zzr
            r0.zzc(r8)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakt.zzc(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzalh] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzalh] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(T r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakt.zzd(java.lang.Object):boolean");
    }

    private static zzamf zze(Object obj) {
        zzaje zzajeVar = (zzaje) obj;
        zzamf zzamfVar = zzajeVar.zzb;
        if (zzamfVar != zzamf.zzc()) {
            return zzamfVar;
        }
        zzamf zzamfVarZzd = zzamf.zzd();
        zzajeVar.zzb = zzamfVarZzd;
        return zzamfVarZzd;
    }

    private static <T> boolean zze(T t10, long j) {
        return ((Boolean) zzamm.zze(t10, j)).booleanValue();
    }

    private final boolean zzc(T t10, T t11, int i10) {
        return zzc((zzakt<T>) t10, i10) == zzc((zzakt<T>) t11, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    public final int zza(T t10) {
        int i10;
        int iZza;
        int iZza2;
        int iZzb;
        int iZza3;
        int iZzd;
        int iZzi;
        int iZzj;
        zzakt<T> zzaktVar = this;
        T t11 = t10;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < zzaktVar.zzc.length) {
            int iZzc = zzaktVar.zzc(i12);
            int i16 = (267386880 & iZzc) >>> 20;
            int[] iArr = zzaktVar.zzc;
            int i17 = iArr[i12];
            int i18 = iArr[i12 + 2];
            int i19 = i18 & i11;
            if (i16 <= 17) {
                if (i19 != i15) {
                    i13 = i19 == i11 ? 0 : unsafe.getInt(t11, i19);
                    i15 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            long j = iZzc & i11;
            if (i16 >= zzaiy.zza.zza()) {
                zzaiy.zzb.zza();
            }
            int i20 = i14;
            switch (i16) {
                case 0:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza = zzaim.zza(i17, 0.0d);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 1:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza2 = zzaim.zza(i17, 0.0f);
                        i14 = iZza2 + i20;
                        zzaktVar = this;
                        t11 = t10;
                        break;
                    }
                    zzaktVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 2:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zzb(i17, unsafe.getLong(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 3:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zze(i17, unsafe.getLong(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 4:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zzd(i17, unsafe.getInt(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 5:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza2 = zzaim.zza(i17, 0L);
                        i14 = iZza2 + i20;
                        zzaktVar = this;
                        t11 = t10;
                        break;
                    }
                    zzaktVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 6:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza2 = zzaim.zzc(i17, 0);
                        i14 = iZza2 + i20;
                        zzaktVar = this;
                        t11 = t10;
                        break;
                    }
                    zzaktVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 7:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza2 = zzaim.zza(i17, true);
                        i14 = iZza2 + i20;
                        zzaktVar = this;
                        t11 = t10;
                        break;
                    }
                    zzaktVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 8:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(t11, j);
                        if (object instanceof zzaho) {
                            iZzb = zzaim.zza(i17, (zzaho) object);
                        } else {
                            iZzb = zzaim.zza(i17, (String) object);
                        }
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 9:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza3 = zzalj.zza(i17, unsafe.getObject(t11, j), zzaktVar.zze(i12));
                        i14 = i20 + iZza3;
                        break;
                    }
                    i14 = i20;
                    break;
                case 10:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zza(i17, (zzaho) unsafe.getObject(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 11:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zzg(i17, unsafe.getInt(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 12:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zzb(i17, unsafe.getInt(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 13:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza2 = zzaim.zze(i17, 0);
                        i14 = iZza2 + i20;
                        zzaktVar = this;
                        t11 = t10;
                        break;
                    }
                    zzaktVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 14:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza2 = zzaim.zzc(i17, 0L);
                        i14 = iZza2 + i20;
                        zzaktVar = this;
                        t11 = t10;
                        break;
                    }
                    zzaktVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 15:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zzf(i17, unsafe.getInt(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 16:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZzb = zzaim.zzd(i17, unsafe.getLong(t11, j));
                        i14 = iZzb + i20;
                        zzaktVar = this;
                        break;
                    }
                    zzaktVar = this;
                    i14 = i20;
                    break;
                case 17:
                    if (zzaktVar.zza((zzakt<T>) t11, i12, i15, i13, i10)) {
                        iZza = zzaim.zza(i17, (zzakp) unsafe.getObject(t11, j), zzaktVar.zze(i12));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 18:
                    iZza3 = zzalj.zzd(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 19:
                    iZza3 = zzalj.zzc(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 20:
                    iZza3 = zzalj.zzf(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    iZza3 = zzalj.zzj(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 22:
                    iZza3 = zzalj.zze(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 23:
                    iZza3 = zzalj.zzd(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 24:
                    iZza3 = zzalj.zzc(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 25:
                    iZza3 = zzalj.zza(i17, (List<?>) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 26:
                    iZza3 = zzalj.zzb(i17, (List) unsafe.getObject(t11, j));
                    i14 = i20 + iZza3;
                    break;
                case 27:
                    iZza3 = zzalj.zzb(i17, (List<?>) unsafe.getObject(t11, j), zzaktVar.zze(i12));
                    i14 = i20 + iZza3;
                    break;
                case 28:
                    iZza3 = zzalj.zza(i17, (List<zzaho>) unsafe.getObject(t11, j));
                    i14 = i20 + iZza3;
                    break;
                case 29:
                    iZza3 = zzalj.zzi(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 30:
                    iZza3 = zzalj.zzb(i17, (List<Integer>) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 31:
                    iZza3 = zzalj.zzc(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 32:
                    iZza3 = zzalj.zzd(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 33:
                    iZza3 = zzalj.zzg(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 34:
                    iZza3 = zzalj.zzh(i17, (List) unsafe.getObject(t11, j), false);
                    i14 = i20 + iZza3;
                    break;
                case 35:
                    iZzd = zzalj.zzd((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 36:
                    iZzd = zzalj.zzc((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 37:
                    iZzd = zzalj.zzf((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 38:
                    iZzd = zzalj.zzj((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 39:
                    iZzd = zzalj.zze((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 40:
                    iZzd = zzalj.zzd((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 41:
                    iZzd = zzalj.zzc((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 42:
                    iZzd = zzalj.zza((List<?>) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 43:
                    iZzd = zzalj.zzi((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 44:
                    iZzd = zzalj.zzb((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 45:
                    iZzd = zzalj.zzc((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 46:
                    iZzd = zzalj.zzd((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 47:
                    iZzd = zzalj.zzg((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 48:
                    iZzd = zzalj.zzh((List) unsafe.getObject(t11, j));
                    if (iZzd > 0) {
                        iZzi = zzaim.zzi(i17);
                        iZzj = zzaim.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 49:
                    iZza3 = zzalj.zza(i17, (List<zzakp>) unsafe.getObject(t11, j), zzaktVar.zze(i12));
                    i14 = i20 + iZza3;
                    break;
                case 50:
                    iZza3 = zzaktVar.zzs.zza(i17, unsafe.getObject(t11, j), zzaktVar.zzf(i12));
                    i14 = i20 + iZza3;
                    break;
                case 51:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zza(i17, 0.0d);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 52:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zza(i17, 0.0f);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 53:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzb(i17, zzd(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 54:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zze(i17, zzd(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 55:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzd(i17, zzc(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 56:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zza(i17, 0L);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 57:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzc(i17, 0);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 58:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zza(i17, true);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 59:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        Object object2 = unsafe.getObject(t11, j);
                        if (object2 instanceof zzaho) {
                            iZza = zzaim.zza(i17, (zzaho) object2);
                        } else {
                            iZza = zzaim.zza(i17, (String) object2);
                        }
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 60:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza3 = zzalj.zza(i17, unsafe.getObject(t11, j), zzaktVar.zze(i12));
                        i14 = i20 + iZza3;
                        break;
                    }
                    i14 = i20;
                    break;
                case 61:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zza(i17, (zzaho) unsafe.getObject(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 62:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzg(i17, zzc(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 63:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzb(i17, zzc(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 64:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zze(i17, 0);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 65:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzc(i17, 0L);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 66:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzf(i17, zzc(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 67:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zzd(i17, zzd(t11, j));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 68:
                    if (zzaktVar.zzc((zzakt<T>) t11, i17, i12)) {
                        iZza = zzaim.zza(i17, (zzakp) unsafe.getObject(t11, j), zzaktVar.zze(i12));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                default:
                    i14 = i20;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        zzamg<?, ?> zzamgVar = zzaktVar.zzq;
        int iZza4 = i14 + zzamgVar.zza((zzamg<?, ?>) zzamgVar.zzd(t11));
        if (!zzaktVar.zzh) {
            return iZza4;
        }
        zzaix<T> zzaixVarZza = zzaktVar.zzr.zza(t11);
        int iZza5 = 0;
        for (int i21 = 0; i21 < zzaixVarZza.zza.zza(); i21++) {
            Map.Entry entryZzb = zzaixVarZza.zza.zzb(i21);
            iZza5 += zzaix.zza((zzaiz<?>) entryZzb.getKey(), entryZzb.getValue());
        }
        for (Map.Entry entry : zzaixVarZza.zza.zzb()) {
            iZza5 += zzaix.zza((zzaiz<?>) entry.getKey(), entry.getValue());
        }
        return iZza4 + iZza5;
    }

    private final boolean zzc(T t10, int i10) {
        int iZzb = zzb(i10);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zzamm.zzc(t10, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i10);
        long j4 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamm.zza(t10, j4)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamm.zzb(t10, j4)) != 0;
            case 2:
                return zzamm.zzd(t10, j4) != 0;
            case 3:
                return zzamm.zzd(t10, j4) != 0;
            case 4:
                return zzamm.zzc(t10, j4) != 0;
            case 5:
                return zzamm.zzd(t10, j4) != 0;
            case 6:
                return zzamm.zzc(t10, j4) != 0;
            case 7:
                return zzamm.zzh(t10, j4);
            case 8:
                Object objZze = zzamm.zze(t10, j4);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzaho) {
                    return !zzaho.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamm.zze(t10, j4) != null;
            case 10:
                return !zzaho.zza.equals(zzamm.zze(t10, j4));
            case 11:
                return zzamm.zzc(t10, j4) != 0;
            case 12:
                return zzamm.zzc(t10, j4) != 0;
            case 13:
                return zzamm.zzc(t10, j4) != 0;
            case 14:
                return zzamm.zzd(t10, j4) != 0;
            case 15:
                return zzamm.zzc(t10, j4) != 0;
            case 16:
                return zzamm.zzd(t10, j4) != 0;
            case 17:
                return zzamm.zze(t10, j4) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t10, int i10, int i11) {
        return zzamm.zzc(t10, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t10, T t11, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzakt<T>) t11, i11, i10)) {
            long jZzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object != null) {
                zzalh zzalhVarZze = zze(i10);
                if (!zzc((zzakt<T>) t10, i11, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, jZzc, object);
                    } else {
                        Object objZza = zzalhVarZze.zza();
                        zzalhVarZze.zza(objZza, object);
                        unsafe.putObject(t10, jZzc, objZza);
                    }
                    zzb((zzakt<T>) t10, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzalhVarZze.zza();
                    zzalhVarZze.zza(objZza2, object2);
                    unsafe.putObject(t10, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzalhVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
        }
    }

    private final void zzb(T t10, int i10) {
        int iZzb = zzb(i10);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zzamm.zza((Object) t10, j, (1 << (iZzb >>> 20)) | zzamm.zzc(t10, j));
    }

    private final void zzb(T t10, int i10, int i11) {
        zzamm.zza((Object) t10, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakt.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzahn r35) {
        /*
            Method dump skipped, instructions count: 3560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakt.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzahn):int");
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
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

    /* JADX WARN: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzakt<T> zza(java.lang.Class<T> r31, com.google.android.gms.internal.p002firebaseauthapi.zzakn r32, com.google.android.gms.internal.p002firebaseauthapi.zzakx r33, com.google.android.gms.internal.p002firebaseauthapi.zzaju r34, com.google.android.gms.internal.p002firebaseauthapi.zzamg<?, ?> r35, com.google.android.gms.internal.p002firebaseauthapi.zzais<?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzaki r37) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakt.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzakn, com.google.android.gms.internal.firebase-auth-api.zzakx, com.google.android.gms.internal.firebase-auth-api.zzaju, com.google.android.gms.internal.firebase-auth-api.zzamg, com.google.android.gms.internal.firebase-auth-api.zzais, com.google.android.gms.internal.firebase-auth-api.zzaki):com.google.android.gms.internal.firebase-auth-api.zzakt");
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzamg<UT, UB> zzamgVar, Object obj2) {
        zzaji zzajiVarZzd;
        int i11 = this.zzc[i10];
        Object objZze = zzamm.zze(obj, zzc(i10) & 1048575);
        return (objZze == null || (zzajiVarZzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzs.zze(objZze), zzajiVarZzd, (zzaji) ub2, (zzamg<UT, zzaji>) zzamgVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzaji zzajiVar, UB ub2, zzamg<UT, UB> zzamgVar, Object obj) {
        zzakg<?, ?> zzakgVarZza = this.zzs.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzajiVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzamgVar.zzc(obj);
                }
                zzahx zzahxVarZzc = zzaho.zzc(zzakh.zza(zzakgVarZza, next.getKey(), next.getValue()));
                try {
                    zzakh.zza(zzahxVarZzc.zzb(), zzakgVarZza, next.getKey(), next.getValue());
                    zzamgVar.zza((zzamg<UT, UB>) ub2, i11, zzahxVarZzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10) {
        zzalh zzalhVarZze = zze(i10);
        long jZzc = zzc(i10) & 1048575;
        if (!zzc((zzakt<T>) t10, i10)) {
            return zzalhVarZze.zza();
        }
        Object object = zzb.getObject(t10, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalhVarZze.zza();
        if (object != null) {
            zzalhVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10, int i11) {
        zzalh zzalhVarZze = zze(i11);
        if (!zzc((zzakt<T>) t10, i10, i11)) {
            return zzalhVarZze.zza();
        }
        Object object = zzb.getObject(t10, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalhVarZze.zza();
        if (object != null) {
            zzalhVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    public final void zza(T t10, T t11) {
        zzf(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzc = zzc(i10);
            long j = 1048575 & iZzc;
            int i11 = this.zzc[i10];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza(t10, j, zzamm.zza(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzb(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzd(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzd(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzc(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzd(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzc(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zzc(t10, j, zzamm.zzh(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza(t10, j, zzamm.zze(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t10, t11, i10);
                    break;
                case 10:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza(t10, j, zzamm.zze(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzc(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzc(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzc(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzd(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzc(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzakt<T>) t11, i10)) {
                        zzamm.zza((Object) t10, j, zzamm.zzd(t11, j));
                        zzb((zzakt<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t10, t11, i10);
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
                    this.zzp.zza(t10, t11, j);
                    break;
                case 50:
                    zzalj.zza(this.zzs, t10, t11, j);
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
                    if (zzc((zzakt<T>) t11, i11, i10)) {
                        zzamm.zza(t10, j, zzamm.zze(t11, j));
                        zzb((zzakt<T>) t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzakt<T>) t11, i11, i10)) {
                        zzamm.zza(t10, j, zzamm.zze(t11, j));
                        zzb((zzakt<T>) t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t10, t11, i10);
                    break;
            }
        }
        zzalj.zza(this.zzq, t10, t11);
        if (this.zzh) {
            zzalj.zza(this.zzr, t10, t11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0784 A[Catch: all -> 0x0062, TryCatch #3 {all -> 0x0062, blocks: (B:23:0x0058, B:185:0x077f, B:187:0x0784, B:188:0x0789, B:82:0x013a, B:83:0x014c, B:84:0x0164, B:85:0x017c, B:86:0x0194, B:87:0x01ac, B:89:0x01bc, B:92:0x01c3, B:93:0x01c9, B:94:0x01d7, B:95:0x01ef, B:96:0x0203, B:97:0x021b, B:98:0x0229, B:99:0x0241, B:100:0x0259, B:101:0x0271, B:102:0x0289, B:103:0x02a1, B:104:0x02b9, B:105:0x02d1, B:106:0x02e9, B:108:0x02ff, B:112:0x0320, B:109:0x0309, B:111:0x0311, B:113:0x0331, B:114:0x0349, B:115:0x035d, B:116:0x0371, B:117:0x0385, B:118:0x0399, B:127:0x03cc, B:128:0x03da, B:129:0x03ee, B:130:0x0402, B:131:0x0416, B:132:0x042a, B:133:0x043e, B:134:0x0452, B:135:0x0466, B:136:0x047a, B:137:0x048e, B:138:0x04a2, B:139:0x04b6, B:140:0x04ca, B:145:0x04f1, B:146:0x04ff, B:147:0x0513, B:148:0x052b, B:150:0x0537, B:151:0x0545, B:152:0x0553, B:153:0x0567, B:154:0x057b, B:155:0x058f, B:156:0x05a3, B:157:0x05b7, B:158:0x05cb, B:159:0x05df, B:160:0x05f3, B:161:0x060b, B:162:0x0620, B:163:0x0635, B:164:0x064a, B:165:0x065f, B:167:0x066f, B:170:0x0676, B:171:0x067c, B:172:0x0687, B:173:0x069c, B:174:0x06b1, B:175:0x06c9, B:176:0x06d7, B:177:0x06ec, B:178:0x0701, B:179:0x0716, B:180:0x072b, B:181:0x0740, B:182:0x0755, B:183:0x076a), top: B:216:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07bc A[LOOP:1: B:202:0x07b8->B:204:0x07bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x078f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzale r19, com.google.android.gms.internal.p002firebaseauthapi.zzaiq r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakt.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzale, com.google.android.gms.internal.firebase-auth-api.zzaiq):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    public final void zza(T t10, byte[] bArr, int i10, int i11, zzahn zzahnVar) {
        zza((zzakt<T>) t10, bArr, i10, i11, 0, zzahnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t10, T t11, int i10) {
        if (zzc((zzakt<T>) t11, i10)) {
            long jZzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object != null) {
                zzalh zzalhVarZze = zze(i10);
                if (!zzc((zzakt<T>) t10, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, jZzc, object);
                    } else {
                        Object objZza = zzalhVarZze.zza();
                        zzalhVarZze.zza(objZza, object);
                        unsafe.putObject(t10, jZzc, objZza);
                    }
                    zzb((zzakt<T>) t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzalhVarZze.zza();
                    zzalhVarZze.zza(objZza2, object2);
                    unsafe.putObject(t10, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzalhVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
        }
    }

    private final void zza(Object obj, int i10, zzale zzaleVar) {
        if (zzg(i10)) {
            zzamm.zza(obj, i10 & 1048575, zzaleVar.zzr());
        } else if (this.zzi) {
            zzamm.zza(obj, i10 & 1048575, zzaleVar.zzq());
        } else {
            zzamm.zza(obj, i10 & 1048575, zzaleVar.zzp());
        }
    }

    private final void zza(T t10, int i10, Object obj) {
        zzb.putObject(t10, zzc(i10) & 1048575, obj);
        zzb((zzakt<T>) t10, i10);
    }

    private final void zza(T t10, int i10, int i11, Object obj) {
        zzb.putObject(t10, zzc(i11) & 1048575, obj);
        zzb((zzakt<T>) t10, i10, i11);
    }

    private final <K, V> void zza(zzanc zzancVar, int i10, Object obj, int i11) {
        if (obj != null) {
            zzancVar.zza(i10, this.zzs.zza(zzf(i11)), this.zzs.zzd(obj));
        }
    }

    private static void zza(int i10, Object obj, zzanc zzancVar) {
        if (obj instanceof String) {
            zzancVar.zza(i10, (String) obj);
        } else {
            zzancVar.zza(i10, (zzaho) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r21, com.google.android.gms.internal.p002firebaseauthapi.zzanc r22) {
        /*
            Method dump skipped, instructions count: 2968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakt.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanc):void");
    }

    private static <UT, UB> void zza(zzamg<UT, UB> zzamgVar, T t10, zzanc zzancVar) {
        zzamgVar.zzb((zzamg<UT, UB>) zzamgVar.zzd(t10), zzancVar);
    }

    private final boolean zza(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzc((zzakt<T>) t10, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzalh zzalhVar) {
        return zzalhVar.zzd(zzamm.zze(obj, i10 & 1048575));
    }
}
