package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzxr extends zzxt {
    public zzxr(zzbm zzbmVar, int[] iArr, int i10, zzzl zzzlVar, long j, long j4, long j10, int i11, int i12, float f10, float f11, List list, zzdj zzdjVar) {
        super(zzbmVar, iArr, 0);
        zzfyf.zzl(list);
    }

    public static /* bridge */ /* synthetic */ zzfyf zzd(zzyv[] zzyvVarArr) {
        int i10;
        int i11;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                break;
            }
            zzyv zzyvVar = zzyvVarArr[i13];
            if (zzyvVar == null || zzyvVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                zzfycVar.zzf(new zzxp(0L, 0L));
                arrayList.add(zzfycVar);
            }
            i13++;
        }
        long[][] jArr2 = new long[2][];
        for (int i15 = 0; i15 < 2; i15++) {
            zzyv zzyvVar2 = zzyvVarArr[i15];
            if (zzyvVar2 == null) {
                jArr2[i15] = new long[0];
            } else {
                int[] iArr = zzyvVar2.zzb;
                jArr2[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j = zzyvVar2.zza.zzb(iArr[i16]).zzj;
                    long[] jArr3 = jArr2[i15];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i16] = j;
                }
                Arrays.sort(jArr2[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr5 = jArr2[i17];
            jArr4[i17] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzfyq zzfyqVarZza = zzfzl.zzc(zzfzq.zzc()).zzb(2).zza();
        int i18 = 0;
        while (i18 < 2) {
            int length = jArr2[i18].length;
            if (length <= i10) {
                i11 = i12;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr6 = jArr2[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = i12;
                    long[][] jArr7 = jArr2;
                    long j4 = jArr6[i19];
                    if (j4 != -1) {
                        dLog = Math.log(j4);
                    }
                    dArr[i19] = dLog;
                    i19++;
                    i12 = i20;
                    jArr2 = jArr7;
                }
                i11 = i12;
                jArr = jArr2;
                int i21 = length - 1;
                double d10 = dArr[i21] - dArr[i11];
                int i22 = i11;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22++;
                    zzfyqVarZza.zzq(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i18));
                    i10 = i10;
                }
            }
            i18++;
            i12 = i11;
            jArr2 = jArr;
            i10 = i10;
        }
        int i23 = i12;
        long[][] jArr8 = jArr2;
        zzfyf zzfyfVarZzl = zzfyf.zzl(zzfyqVarZza.zzr());
        for (int i24 = i23; i24 < zzfyfVarZzl.size(); i24++) {
            int iIntValue = ((Integer) zzfyfVarZzl.get(i24)).intValue();
            int i25 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i25;
            jArr4[iIntValue] = jArr8[iIntValue][i25];
            zzi(arrayList, jArr4);
        }
        for (int i26 = i23; i26 < 2; i26++) {
            if (arrayList.get(i26) != null) {
                long j10 = jArr4[i26];
                jArr4[i26] = j10 + j10;
            }
        }
        zzi(arrayList, jArr4);
        zzfyc zzfycVar2 = new zzfyc();
        while (i23 < arrayList.size()) {
            zzfyc zzfycVar3 = (zzfyc) arrayList.get(i23);
            zzfycVar2.zzf(zzfycVar3 == null ? zzfyf.zzn() : zzfycVar3.zzi());
            i23++;
        }
        return zzfycVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfyc zzfycVar = (zzfyc) list.get(i11);
            if (zzfycVar != null) {
                zzfycVar.zzf(new zzxp(j, jArr[i11]));
            }
        }
    }
}
