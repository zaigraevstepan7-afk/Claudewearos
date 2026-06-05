package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgyb implements zzhca {
    private final zzgya zza;

    private zzgyb(zzgya zzgyaVar) {
        zzgzi.zzc(zzgyaVar, "output");
        this.zza = zzgyaVar;
        zzgyaVar.zze = this;
    }

    public static zzgyb zza(zzgya zzgyaVar) {
        zzgyb zzgybVar = zzgyaVar.zze;
        return zzgybVar != null ? zzgybVar : new zzgyb(zzgyaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzA(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzgyaVar.zzu(i12);
            while (i11 < list.size()) {
                zzgyaVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z2) {
            while (i11 < zzgzvVar.size()) {
                this.zza.zzj(i10, zzgzvVar.zza(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgzvVar.size(); i15++) {
            zzgzvVar.zza(i15);
            i14 += 8;
        }
        zzgyaVar2.zzu(i14);
        while (i11 < zzgzvVar.size()) {
            zzgyaVar2.zzk(zzgzvVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzB(int i10, int i11) {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzC(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z2) {
                while (i11 < list.size()) {
                    zzgya zzgyaVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzgyaVar.zzt(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar2 = this.zza;
            zzgyaVar2.zzs(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzD += zzgya.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzgyaVar2.zzu(iZzD);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzgyaVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z2) {
            while (i11 < zzgywVar.size()) {
                zzgya zzgyaVar3 = this.zza;
                int iZzd = zzgywVar.zzd(i11);
                zzgyaVar3.zzt(i10, (iZzd >> 31) ^ (iZzd + iZzd));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar4 = this.zza;
        zzgyaVar4.zzs(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzgywVar.size(); i13++) {
            int iZzd2 = zzgywVar.zzd(i13);
            iZzD2 += zzgya.zzD((iZzd2 >> 31) ^ (iZzd2 + iZzd2));
        }
        zzgyaVar4.zzu(iZzD2);
        while (i11 < zzgywVar.size()) {
            int iZzd3 = zzgywVar.zzd(i11);
            zzgyaVar4.zzu((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzD(int i10, long j) {
        this.zza.zzv(i10, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzE(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z2) {
                while (i11 < list.size()) {
                    zzgya zzgyaVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzgyaVar.zzv(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar2 = this.zza;
            zzgyaVar2.zzs(i10, 2);
            int iZzE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzE += zzgya.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzgyaVar2.zzu(iZzE);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzgyaVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z2) {
            while (i11 < zzgzvVar.size()) {
                zzgya zzgyaVar3 = this.zza;
                long jZza = zzgzvVar.zza(i11);
                zzgyaVar3.zzv(i10, (jZza >> 63) ^ (jZza + jZza));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar4 = this.zza;
        zzgyaVar4.zzs(i10, 2);
        int iZzE2 = 0;
        for (int i13 = 0; i13 < zzgzvVar.size(); i13++) {
            long jZza2 = zzgzvVar.zza(i13);
            iZzE2 += zzgya.zzE((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        zzgyaVar4.zzu(iZzE2);
        while (i11 < zzgzvVar.size()) {
            long jZza3 = zzgzvVar.zza(i11);
            zzgyaVar4.zzw((jZza3 >> 63) ^ (jZza3 + jZza3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzG(int i10, String str) {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof zzgzs)) {
            while (i11 < list.size()) {
                this.zza.zzq(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzgzs zzgzsVar = (zzgzs) list;
        while (i11 < list.size()) {
            Object objZzc = zzgzsVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzq(i10, (String) objZzc);
            } else {
                this.zza.zzN(i10, (zzgxn) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzI(int i10, int i11) {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzJ(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzgya.zzD(((Integer) list.get(i12)).intValue());
            }
            zzgyaVar.zzu(iZzD);
            while (i11 < list.size()) {
                zzgyaVar.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z2) {
            while (i11 < zzgywVar.size()) {
                this.zza.zzt(i10, zzgywVar.zzd(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzgywVar.size(); i13++) {
            iZzD2 += zzgya.zzD(zzgywVar.zzd(i13));
        }
        zzgyaVar2.zzu(iZzD2);
        while (i11 < zzgywVar.size()) {
            zzgyaVar2.zzu(zzgywVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzK(int i10, long j) {
        this.zza.zzv(i10, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzL(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int iZzE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzE += zzgya.zzE(((Long) list.get(i12)).longValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i11 < list.size()) {
                zzgyaVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z2) {
            while (i11 < zzgzvVar.size()) {
                this.zza.zzv(i10, zzgzvVar.zza(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int iZzE2 = 0;
        for (int i13 = 0; i13 < zzgzvVar.size(); i13++) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i13));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i11 < zzgzvVar.size()) {
            zzgyaVar2.zzw(zzgzvVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzb(int i10, boolean z2) {
        this.zza.zzM(i10, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzc(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgxd)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzM(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzgyaVar.zzu(i12);
            while (i11 < list.size()) {
                zzgyaVar.zzL(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzgxd zzgxdVar = (zzgxd) list;
        if (!z2) {
            while (i11 < zzgxdVar.size()) {
                this.zza.zzM(i10, zzgxdVar.zzh(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgxdVar.size(); i15++) {
            zzgxdVar.zzh(i15);
            i14++;
        }
        zzgyaVar2.zzu(i14);
        while (i11 < zzgxdVar.size()) {
            zzgyaVar2.zzL(zzgxdVar.zzh(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzd(int i10, zzgxn zzgxnVar) {
        this.zza.zzN(i10, zzgxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzN(i10, (zzgxn) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzf(int i10, double d10) {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzg(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgyc)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzgyaVar.zzu(i12);
            while (i11 < list.size()) {
                zzgyaVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzgyc zzgycVar = (zzgyc) list;
        if (!z2) {
            while (i11 < zzgycVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzgycVar.zzd(i11)));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgycVar.size(); i15++) {
            zzgycVar.zzd(i15);
            i14 += 8;
        }
        zzgyaVar2.zzu(i14);
        while (i11 < zzgycVar.size()) {
            zzgyaVar2.zzk(Double.doubleToRawLongBits(zzgycVar.zzd(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzi(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzj(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int iZzE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzE += zzgya.zzE(((Integer) list.get(i12)).intValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i11 < list.size()) {
                zzgyaVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z2) {
            while (i11 < zzgywVar.size()) {
                this.zza.zzl(i10, zzgywVar.zzd(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int iZzE2 = 0;
        for (int i13 = 0; i13 < zzgywVar.size(); i13++) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i13));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i11 < zzgywVar.size()) {
            zzgyaVar2.zzm(zzgywVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzk(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzl(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzgyaVar.zzu(i12);
            while (i11 < list.size()) {
                zzgyaVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z2) {
            while (i11 < zzgywVar.size()) {
                this.zza.zzh(i10, zzgywVar.zzd(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgywVar.size(); i15++) {
            zzgywVar.zzd(i15);
            i14 += 4;
        }
        zzgyaVar2.zzu(i14);
        while (i11 < zzgywVar.size()) {
            zzgyaVar2.zzi(zzgywVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzm(int i10, long j) {
        this.zza.zzj(i10, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzn(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzgyaVar.zzu(i12);
            while (i11 < list.size()) {
                zzgyaVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z2) {
            while (i11 < zzgzvVar.size()) {
                this.zza.zzj(i10, zzgzvVar.zza(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgzvVar.size(); i15++) {
            zzgzvVar.zza(i15);
            i14 += 8;
        }
        zzgyaVar2.zzu(i14);
        while (i11 < zzgzvVar.size()) {
            zzgyaVar2.zzk(zzgzvVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzo(int i10, float f10) {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzp(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgym)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzgyaVar.zzu(i12);
            while (i11 < list.size()) {
                zzgyaVar.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzgym zzgymVar = (zzgym) list;
        if (!z2) {
            while (i11 < zzgymVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzgymVar.zzd(i11)));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgymVar.size(); i15++) {
            zzgymVar.zzd(i15);
            i14 += 4;
        }
        zzgyaVar2.zzu(i14);
        while (i11 < zzgymVar.size()) {
            zzgyaVar2.zzi(Float.floatToRawIntBits(zzgymVar.zzd(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzq(int i10, Object obj, zzhaz zzhazVar) {
        zzgya zzgyaVar = this.zza;
        zzgyaVar.zzs(i10, 3);
        zzhazVar.zzj((zzhag) obj, zzgyaVar.zze);
        zzgyaVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzr(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzs(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int iZzE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzE += zzgya.zzE(((Integer) list.get(i12)).intValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i11 < list.size()) {
                zzgyaVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z2) {
            while (i11 < zzgywVar.size()) {
                this.zza.zzl(i10, zzgywVar.zzd(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int iZzE2 = 0;
        for (int i13 = 0; i13 < zzgywVar.size(); i13++) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i13));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i11 < zzgywVar.size()) {
            zzgyaVar2.zzm(zzgywVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzt(int i10, long j) {
        this.zza.zzv(i10, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzu(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int iZzE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzE += zzgya.zzE(((Long) list.get(i12)).longValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i11 < list.size()) {
                zzgyaVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z2) {
            while (i11 < zzgzvVar.size()) {
                this.zza.zzv(i10, zzgzvVar.zza(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int iZzE2 = 0;
        for (int i13 = 0; i13 < zzgzvVar.size(); i13++) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i13));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i11 < zzgzvVar.size()) {
            zzgyaVar2.zzw(zzgzvVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzv(int i10, Object obj, zzhaz zzhazVar) {
        this.zza.zzn(i10, (zzhag) obj, zzhazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzw(int i10, Object obj) {
        if (obj instanceof zzgxn) {
            this.zza.zzp(i10, (zzgxn) obj);
        } else {
            this.zza.zzo(i10, (zzhag) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzx(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzy(int i10, List list, boolean z2) {
        int i11 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z2) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzgyaVar.zzu(i12);
            while (i11 < list.size()) {
                zzgyaVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z2) {
            while (i11 < zzgywVar.size()) {
                this.zza.zzh(i10, zzgywVar.zzd(i11));
                i11++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgywVar.size(); i15++) {
            zzgywVar.zzd(i15);
            i14 += 4;
        }
        zzgyaVar2.zzu(i14);
        while (i11 < zzgywVar.size()) {
            zzgyaVar2.zzi(zzgywVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzz(int i10, long j) {
        this.zza.zzj(i10, j);
    }
}
