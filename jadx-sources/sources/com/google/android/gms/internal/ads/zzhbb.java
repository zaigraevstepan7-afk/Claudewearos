package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhbb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhbl zzb;

    static {
        int i10 = zzhaq.zza;
        zzb = new zzhbn();
    }

    public static void zzA(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzu(i10, list, z2);
    }

    public static void zzB(int i10, List list, zzhca zzhcaVar, zzhaz zzhazVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzgyb) zzhcaVar).zzv(i10, list.get(i11), zzhazVar);
        }
    }

    public static void zzC(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzy(i10, list, z2);
    }

    public static void zzD(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzA(i10, list, z2);
    }

    public static void zzE(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzC(i10, list, z2);
    }

    public static void zzF(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzE(i10, list, z2);
    }

    public static void zzG(int i10, List list, zzhca zzhcaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzH(i10, list);
    }

    public static void zzH(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzJ(i10, list, z2);
    }

    public static void zzI(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzL(i10, list, z2);
    }

    public static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzE = 0;
            while (i10 < size) {
                iZzE += zzgya.zzE(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzE;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzE2 = 0;
        while (i10 < size) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i10));
            i10++;
        }
        return iZzE2;
    }

    public static int zzb(int i10, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgya.zzD(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgya.zzD(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzE = 0;
            while (i10 < size) {
                iZzE += zzgya.zzE(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzE;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzE2 = 0;
        while (i10 < size) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i10));
            i10++;
        }
        return iZzE2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzv)) {
            int iZzE = 0;
            while (i10 < size) {
                iZzE += zzgya.zzE(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzE;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        int iZzE2 = 0;
        while (i10 < size) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i10));
            i10++;
        }
        return iZzE2;
    }

    public static int zzh(int i10, Object obj, zzhaz zzhazVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzgzr)) {
            return zzgya.zzA((zzhag) obj, zzhazVar) + zzgya.zzD(i11);
        }
        int iZzD = zzgya.zzD(i11);
        int iZza = ((zzgzr) obj).zza();
        return m6.a.b(iZza, iZza, iZzD);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzD = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzD += zzgya.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzD;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzD2 = 0;
        while (i10 < size) {
            int iZzd = zzgywVar.zzd(i10);
            iZzD2 += zzgya.zzD((iZzd >> 31) ^ (iZzd + iZzd));
            i10++;
        }
        return iZzD2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzv)) {
            int iZzE = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzE += zzgya.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzE;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        int iZzE2 = 0;
        while (i10 < size) {
            long jZza = zzgzvVar.zza(i10);
            iZzE2 += zzgya.zzE((jZza >> 63) ^ (jZza + jZza));
            i10++;
        }
        return iZzE2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzgya.zzD(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzD;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzgya.zzD(zzgywVar.zzd(i10));
            i10++;
        }
        return iZzD2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzv)) {
            int iZzE = 0;
            while (i10 < size) {
                iZzE += zzgya.zzE(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzE;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        int iZzE2 = 0;
        while (i10 < size) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i10));
            i10++;
        }
        return iZzE2;
    }

    public static zzhbl zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, List list, zzgzb zzgzbVar, Object obj2, zzhbl zzhblVar) {
        if (zzgzbVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzgzbVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i10, iIntValue, obj2, zzhblVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (zzgzbVar.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzo(obj, i10, iIntValue2, obj2, zzhblVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzhbl zzhblVar) {
        if (obj2 == null) {
            obj2 = zzhblVar.zza(obj);
        }
        zzhblVar.zzh(obj2, i10, i11);
        return obj2;
    }

    public static void zzp(zzgyg zzgygVar, Object obj, Object obj2) {
        if (((zzgyr) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzhbl zzhblVar, Object obj, Object obj2) {
        zzgyv zzgyvVar = (zzgyv) obj;
        zzhbm zzhbmVarZze = zzgyvVar.zzt;
        zzhbm zzhbmVar = ((zzgyv) obj2).zzt;
        if (!zzhbm.zzc().equals(zzhbmVar)) {
            if (zzhbm.zzc().equals(zzhbmVarZze)) {
                zzhbmVarZze = zzhbm.zze(zzhbmVarZze, zzhbmVar);
            } else {
                zzhbmVarZze.zzd(zzhbmVar);
            }
        }
        zzgyvVar.zzt = zzhbmVarZze;
    }

    public static void zzr(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzc(i10, list, z2);
    }

    public static void zzs(int i10, List list, zzhca zzhcaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zze(i10, list);
    }

    public static void zzt(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzg(i10, list, z2);
    }

    public static void zzu(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzj(i10, list, z2);
    }

    public static void zzv(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzl(i10, list, z2);
    }

    public static void zzw(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzn(i10, list, z2);
    }

    public static void zzx(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzp(i10, list, z2);
    }

    public static void zzy(int i10, List list, zzhca zzhcaVar, zzhaz zzhazVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzgyb) zzhcaVar).zzq(i10, list.get(i11), zzhazVar);
        }
    }

    public static void zzz(int i10, List list, zzhca zzhcaVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzs(i10, list, z2);
    }
}
