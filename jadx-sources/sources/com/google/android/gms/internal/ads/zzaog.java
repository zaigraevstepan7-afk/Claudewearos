package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaog implements zzany {
    final /* synthetic */ zzaoh zza;
    private final zzem zzb = new zzem(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaog(zzaoh zzaohVar, int i10) {
        this.zza = zzaohVar;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzen zzenVar) {
        zzaoh zzaohVar;
        int i10;
        zzem zzemVar;
        int i11;
        int i12;
        if (zzenVar.zzm() != 2) {
            return;
        }
        zzaoh zzaohVar2 = this.zza;
        zzeu zzeuVar = (zzeu) zzaohVar2.zzb.get(0);
        if ((zzenVar.zzm() & 128) != 0) {
            zzenVar.zzM(1);
            int iZzq = zzenVar.zzq();
            int i13 = 3;
            zzenVar.zzM(3);
            zzem zzemVar2 = this.zzb;
            zzenVar.zzG(zzemVar2, 2);
            zzemVar2.zzn(3);
            int i14 = 13;
            zzaohVar2.zzr = zzemVar2.zzd(13);
            zzenVar.zzG(zzemVar2, 2);
            int i15 = 4;
            zzemVar2.zzn(4);
            int i16 = 12;
            zzenVar.zzM(zzemVar2.zzd(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZza = zzenVar.zza();
            while (iZza > 0) {
                int i17 = 5;
                zzenVar.zzG(zzemVar2, 5);
                int iZzd = zzemVar2.zzd(8);
                zzemVar2.zzn(i13);
                int iZzd2 = zzemVar2.zzd(i14);
                zzemVar2.zzn(i15);
                int iZzd3 = zzemVar2.zzd(i16);
                int iZzc = zzenVar.zzc();
                int i18 = iZzc + iZzd3;
                String str = null;
                ArrayList arrayList = null;
                int i19 = -1;
                int iZzm = 0;
                while (zzenVar.zzc() < i18) {
                    int iZzm2 = zzenVar.zzm();
                    int iZzc2 = zzenVar.zzc() + zzenVar.zzm();
                    if (iZzc2 > i18) {
                        break;
                    }
                    if (iZzm2 == i17) {
                        long jZzu = zzenVar.zzu();
                        if (jZzu != 1094921523) {
                            if (jZzu != 1161904947) {
                                if (jZzu != 1094921524) {
                                    if (jZzu == 1212503619) {
                                        i12 = 36;
                                        zzaohVar = zzaohVar2;
                                        i19 = i12;
                                        i10 = iZzc2;
                                        zzemVar = zzemVar2;
                                        i11 = iZza;
                                    }
                                    zzaohVar = zzaohVar2;
                                    i10 = iZzc2;
                                    zzemVar = zzemVar2;
                                    i11 = iZza;
                                }
                                zzaohVar = zzaohVar2;
                                i10 = iZzc2;
                                zzemVar = zzemVar2;
                                i11 = iZza;
                                i19 = 172;
                            }
                            zzaohVar = zzaohVar2;
                            zzemVar = zzemVar2;
                            i11 = iZza;
                            i19 = 135;
                            i10 = iZzc2;
                        }
                        zzaohVar = zzaohVar2;
                        i10 = iZzc2;
                        zzemVar = zzemVar2;
                        i11 = iZza;
                        i19 = 129;
                    } else {
                        if (iZzm2 != 106) {
                            if (iZzm2 == 122) {
                                zzaohVar = zzaohVar2;
                                zzemVar = zzemVar2;
                                i11 = iZza;
                                i19 = 135;
                                i10 = iZzc2;
                            } else {
                                if (iZzm2 == 127) {
                                    int iZzm3 = zzenVar.zzm();
                                    if (iZzm3 != 21) {
                                        if (iZzm3 == 14) {
                                            i12 = 136;
                                        } else {
                                            if (iZzm3 == 33) {
                                                i12 = 139;
                                            }
                                            zzaohVar = zzaohVar2;
                                            i10 = iZzc2;
                                            zzemVar = zzemVar2;
                                            i11 = iZza;
                                        }
                                    }
                                    zzaohVar = zzaohVar2;
                                    i10 = iZzc2;
                                    zzemVar = zzemVar2;
                                    i11 = iZza;
                                    i19 = 172;
                                } else if (iZzm2 == 123) {
                                    i12 = 138;
                                } else if (iZzm2 == 10) {
                                    String strTrim = zzenVar.zzB(3, StandardCharsets.UTF_8).trim();
                                    iZzm = zzenVar.zzm();
                                    zzaohVar = zzaohVar2;
                                    str = strTrim;
                                    i10 = iZzc2;
                                    zzemVar = zzemVar2;
                                    i11 = iZza;
                                } else if (iZzm2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzenVar.zzc() < iZzc2) {
                                        int i20 = iZzc2;
                                        String strTrim2 = zzenVar.zzB(3, StandardCharsets.UTF_8).trim();
                                        int iZzm4 = zzenVar.zzm();
                                        int i21 = iZza;
                                        byte[] bArr = new byte[4];
                                        zzenVar.zzH(bArr, 0, 4);
                                        arrayList2.add(new zzaoi(strTrim2, iZzm4, bArr));
                                        iZza = i21;
                                        iZzc2 = i20;
                                        zzemVar2 = zzemVar2;
                                        zzaohVar2 = zzaohVar2;
                                    }
                                    zzaohVar = zzaohVar2;
                                    i10 = iZzc2;
                                    zzemVar = zzemVar2;
                                    i11 = iZza;
                                    arrayList = arrayList2;
                                    i19 = 89;
                                } else {
                                    zzaohVar = zzaohVar2;
                                    i10 = iZzc2;
                                    zzemVar = zzemVar2;
                                    i11 = iZza;
                                    if (iZzm2 == 111) {
                                        i19 = 257;
                                    }
                                }
                                zzaohVar = zzaohVar2;
                                i19 = i12;
                                i10 = iZzc2;
                                zzemVar = zzemVar2;
                                i11 = iZza;
                            }
                        }
                        zzaohVar = zzaohVar2;
                        i10 = iZzc2;
                        zzemVar = zzemVar2;
                        i11 = iZza;
                        i19 = 129;
                    }
                    zzenVar.zzM(i10 - zzenVar.zzc());
                    iZza = i11;
                    zzemVar2 = zzemVar;
                    zzaohVar2 = zzaohVar;
                    i17 = 5;
                }
                zzaoh zzaohVar3 = zzaohVar2;
                zzem zzemVar3 = zzemVar2;
                int i22 = iZza;
                zzenVar.zzL(i18);
                zzaoj zzaojVar = new zzaoj(i19, str, iZzm, arrayList, Arrays.copyOfRange(zzenVar.zzN(), iZzc, i18));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzaojVar.zza;
                }
                iZza = i22 - (iZzd3 + 5);
                if (!zzaohVar3.zzh.get(iZzd2)) {
                    zzaom zzaomVarZzb = zzaohVar3.zze.zzb(iZzd, zzaojVar);
                    sparseIntArray.put(iZzd2, iZzd2);
                    sparseArray.put(iZzd2, zzaomVarZzb);
                }
                i15 = 4;
                zzemVar2 = zzemVar3;
                zzaohVar2 = zzaohVar3;
                i13 = 3;
                i14 = 13;
                i16 = 12;
            }
            zzaoh zzaohVar4 = zzaohVar2;
            int size = sparseIntArray.size();
            for (int i23 = 0; i23 < size; i23++) {
                int iKeyAt = sparseIntArray.keyAt(i23);
                int iValueAt = sparseIntArray.valueAt(i23);
                zzaohVar4.zzh.put(iKeyAt, true);
                zzaohVar4.zzi.put(iValueAt, true);
                zzaom zzaomVar = (zzaom) sparseArray.valueAt(i23);
                if (zzaomVar != null) {
                    zzaomVar.zzb(zzeuVar, zzaohVar4.zzl, new zzaol(iZzq, iKeyAt, 8192));
                    zzaohVar4.zzg.put(iValueAt, zzaomVar);
                }
            }
            zzaohVar4.zzg.remove(this.zze);
            zzaohVar4.zzm = 0;
            if (zzaohVar4.zzm == 0) {
                zzaohVar4.zzl.zzG();
                zzaohVar4.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzeu zzeuVar, zzadw zzadwVar, zzaol zzaolVar) {
    }
}
