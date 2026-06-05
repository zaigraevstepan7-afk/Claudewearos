package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzza extends zzzd {
    public abstract Pair zzd(zzyz zzyzVar, int[][][] iArr, int[] iArr2, zzvh zzvhVar, zzbl zzblVar);

    @Override // com.google.android.gms.internal.ads.zzzd
    public final zzze zzo(zzmd[] zzmdVarArr, zzxk zzxkVar, zzvh zzvhVar, zzbl zzblVar) {
        List[] listArr;
        boolean z2;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbm[][] zzbmVarArr = new zzbm[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzxkVar.zzb;
            zzbmVarArr[i10] = new zzbm[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzmdVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzxkVar.zzb) {
            zzbm zzbmVarZzb = zzxkVar.zzb(i14);
            int i15 = zzbmVarZzb.zzc;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z10 = true;
            while (i17 < i12) {
                zzmd zzmdVar = zzmdVarArr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 < zzbmVarZzb.zza; i19++) {
                    iMax = Math.max(iMax, zzmdVar.zzY(zzbmVarZzb.zzb(i19)) & 7);
                }
                boolean z11 = iArr2[i17] == 0;
                if (iMax > i18) {
                    z10 = z11;
                    i16 = i17;
                    i18 = iMax;
                } else if (iMax == i18 && i15 == 5 && !z10 && z11) {
                    i16 = i17;
                    i18 = iMax;
                    z10 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[zzbmVarZzb.zza];
            } else {
                zzmd zzmdVar2 = zzmdVarArr[i16];
                int i20 = zzbmVarZzb.zza;
                int[] iArr5 = new int[i20];
                for (int i21 = 0; i21 < i20; i21++) {
                    iArr5[i21] = zzmdVar2.zzY(zzbmVarZzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzbmVarArr[i16][i22] = zzbmVarZzb;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzxk[] zzxkVarArr = new zzxk[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zzxkVarArr[i23] = new zzxk((zzbm[]) zzex.zzQ(zzbmVarArr[i23], i24));
            iArr3[i23] = (int[][]) zzex.zzQ(iArr3[i23], i24);
            strArr[i23] = zzmdVarArr[i23].zzU();
            iArr6[i23] = zzmdVarArr[i23].zzb();
            i23++;
            i12 = 2;
        }
        int i25 = i12;
        zzyz zzyzVar = new zzyz(strArr, iArr6, zzxkVarArr, iArr4, iArr3, new zzxk((zzbm[]) zzex.zzQ(zzbmVarArr[i25], iArr2[i25])));
        Pair pairZzd = zzd(zzyzVar, iArr3, iArr4, zzvhVar, zzblVar);
        zzzb[] zzzbVarArr = (zzzb[]) pairZzd.second;
        List[] listArr2 = new List[zzzbVarArr.length];
        for (int i26 = 0; i26 < zzzbVarArr.length; i26++) {
            zzzb zzzbVar = zzzbVarArr[i26];
            listArr2[i26] = zzzbVar != null ? zzfyf.zzo(zzzbVar) : zzfyf.zzn();
        }
        zzfyc zzfycVar = new zzfyc();
        for (int i27 = 0; i27 < 2; i27++) {
            zzxk zzxkVarZzd = zzyzVar.zzd(i27);
            List list = listArr2[i27];
            int i28 = 0;
            while (i28 < zzxkVarZzd.zzb) {
                zzbm zzbmVarZzb2 = zzxkVarZzd.zzb(i28);
                boolean z12 = zzyzVar.zza(i27, i28, false) != 0;
                int i29 = zzbmVarZzb2.zza;
                int[] iArr7 = new int[i29];
                boolean[] zArr = new boolean[i29];
                int i30 = 0;
                while (i30 < i29) {
                    iArr7[i30] = zzyzVar.zzb(i27, i28, i30) & 7;
                    int i31 = 0;
                    while (true) {
                        if (i31 >= list.size()) {
                            listArr = listArr2;
                            z2 = false;
                            break;
                        }
                        zzzb zzzbVar2 = (zzzb) list.get(i31);
                        listArr = listArr2;
                        if (zzzbVar2.zzc().equals(zzbmVarZzb2) && zzzbVar2.zzg(i30) != -1) {
                            z2 = true;
                            break;
                        }
                        i31++;
                        listArr2 = listArr;
                    }
                    zArr[i30] = z2;
                    i30++;
                    listArr2 = listArr;
                }
                zzfycVar.zzf(new zzbs(zzbmVarZzb2, z12, iArr7, zArr));
                i28++;
                listArr2 = listArr2;
            }
        }
        zzxk zzxkVarZze = zzyzVar.zze();
        for (int i32 = 0; i32 < zzxkVarZze.zzb; i32++) {
            zzbm zzbmVarZzb3 = zzxkVarZze.zzb(i32);
            int i33 = zzbmVarZzb3.zza;
            int[] iArr8 = new int[i33];
            Arrays.fill(iArr8, 0);
            zzfycVar.zzf(new zzbs(zzbmVarZzb3, false, iArr8, new boolean[i33]));
        }
        return new zzze((zzme[]) pairZzd.first, (zzyw[]) pairZzd.second, new zzbt(zzfycVar.zzi()), zzyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzp(Object obj) {
    }
}
