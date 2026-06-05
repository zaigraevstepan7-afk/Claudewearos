package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzbch;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzyi extends zzbr {
    public static final zzyi zzF = new zzyi(new zzyh());
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    private final SparseArray zzV;
    private final SparseBooleanArray zzW;

    static {
        String str = zzex.zza;
        Integer.toString(zzbch.zzq.zzf, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyi.class == obj.getClass()) {
            zzyi zzyiVar = (zzyi) obj;
            if (super.equals(zzyiVar) && this.zzG == zzyiVar.zzG && this.zzI == zzyiVar.zzI && this.zzK == zzyiVar.zzK && this.zzP == zzyiVar.zzP && this.zzQ == zzyiVar.zzQ && this.zzR == zzyiVar.zzR && this.zzT == zzyiVar.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzW;
                SparseBooleanArray sparseBooleanArray2 = zzyiVar.zzW;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.zzV;
                            SparseArray sparseArray2 = zzyiVar.zzV;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxk zzxkVar = (zzxk) entry.getKey();
                                                if (!map2.containsKey(zzxkVar) || !Objects.equals(entry.getValue(), map2.get(zzxkVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzyh zzc() {
        return new zzyh(this, null);
    }

    @Deprecated
    public final zzyj zzd(int i10, zzxk zzxkVar) {
        Map map = (Map) this.zzV.get(i10);
        if (map != null) {
            return (zzyj) map.get(zzxkVar);
        }
        return null;
    }

    public final boolean zze(int i10) {
        return this.zzW.get(i10);
    }

    @Deprecated
    public final boolean zzf(int i10, zzxk zzxkVar) {
        Map map = (Map) this.zzV.get(i10);
        return map != null && map.containsKey(zzxkVar);
    }

    private zzyi(zzyh zzyhVar) {
        super(zzyhVar);
        this.zzG = zzyhVar.zza;
        this.zzH = false;
        this.zzI = zzyhVar.zzb;
        this.zzJ = false;
        this.zzK = zzyhVar.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzyhVar.zzd;
        this.zzQ = zzyhVar.zze;
        this.zzR = zzyhVar.zzf;
        this.zzS = false;
        this.zzT = zzyhVar.zzg;
        this.zzU = false;
        this.zzV = zzyhVar.zzh;
        this.zzW = zzyhVar.zzi;
    }
}
