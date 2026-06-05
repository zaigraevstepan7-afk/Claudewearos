package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzmf {
    private final zzma zza;
    private final int zzb;
    private final zzma zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmf(zzma zzmaVar, zzma zzmaVar2, int i10) {
        this.zza = zzmaVar;
        this.zzb = i10;
        this.zzc = zzmaVar2;
    }

    private final int zzL(zzma zzmaVar, zzlc zzlcVar, zzze zzzeVar, zzil zzilVar) {
        if (zzmaVar != null && zzT(zzmaVar)) {
            zzma zzmaVar2 = this.zza;
            boolean z2 = zzmaVar != zzmaVar2;
            if ((zzmaVar != zzmaVar2 || !zzS()) && (zzmaVar != this.zzc || !zzU())) {
                zzwz zzwzVarZzp = zzmaVar.zzp();
                zzwz[] zzwzVarArr = zzlcVar.zzc;
                int i10 = this.zzb;
                zzwz zzwzVar = zzwzVarArr[i10];
                boolean zZzb = zzzeVar.zzb(i10);
                if (zZzb && zzwzVarZzp == zzwzVar) {
                    return 1;
                }
                if (!zzmaVar.zzR()) {
                    zzz[] zzzVarArrZzV = zzV(zzzeVar.zzc[i10]);
                    zzwz zzwzVar2 = zzwzVarArr[i10];
                    zzwzVar2.getClass();
                    zzmaVar.zzH(zzzVarArrZzV, zzwzVar2, zzlcVar.zzf(), zzlcVar.zze(), zzlcVar.zzg.zza);
                    return 3;
                }
                if (!zzmaVar.zzW()) {
                    return 0;
                }
                zzN(zzmaVar, zzilVar);
                if (!zZzb || zzH()) {
                    zzP(!z2);
                }
                return 1;
            }
        }
        return 1;
    }

    private final zzma zzM(zzlc zzlcVar) {
        if (zzlcVar != null) {
            int i10 = this.zzb;
            zzwz[] zzwzVarArr = zzlcVar.zzc;
            if (zzwzVarArr[i10] != null) {
                zzma zzmaVar = this.zza;
                zzwz zzwzVarZzp = zzmaVar.zzp();
                zzwz zzwzVar = zzwzVarArr[i10];
                if (zzwzVarZzp == zzwzVar) {
                    return zzmaVar;
                }
                zzma zzmaVar2 = this.zzc;
                if (zzmaVar2 != null && zzmaVar2.zzp() == zzwzVar) {
                    return zzmaVar2;
                }
            }
        }
        return null;
    }

    private final void zzN(zzma zzmaVar, zzil zzilVar) {
        boolean z2 = true;
        if (this.zza != zzmaVar && this.zzc != zzmaVar) {
            z2 = false;
        }
        zzdd.zzf(z2);
        if (zzT(zzmaVar)) {
            zzilVar.zzd(zzmaVar);
            zzW(zzmaVar);
            zzmaVar.zzr();
        }
    }

    private final void zzO(zzma zzmaVar, zzwz zzwzVar, zzil zzilVar, long j, boolean z2) {
        if (zzT(zzmaVar)) {
            if (zzwzVar != zzmaVar.zzp()) {
                zzN(zzmaVar, zzilVar);
            } else if (z2) {
                zzmaVar.zzJ(j);
            }
        }
    }

    private final void zzP(boolean z2) {
        if (z2) {
            if (this.zze) {
                this.zza.zzI();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzma zzmaVar = this.zzc;
            zzmaVar.getClass();
            zzmaVar.zzI();
            this.zzf = false;
        }
    }

    private final void zzQ(boolean z2) {
        if (z2) {
            zzma zzmaVar = this.zzc;
            zzmaVar.getClass();
            zzmaVar.zzu(17, this.zza);
        } else {
            zzma zzmaVar2 = this.zza;
            zzma zzmaVar3 = this.zzc;
            zzmaVar3.getClass();
            zzmaVar2.zzu(17, zzmaVar3);
        }
    }

    private final boolean zzR(zzlc zzlcVar, zzma zzmaVar) {
        if (zzmaVar == null) {
            return true;
        }
        zzwz[] zzwzVarArr = zzlcVar.zzc;
        int i10 = this.zzb;
        zzwz zzwzVar = zzwzVarArr[i10];
        if (zzmaVar.zzp() != null) {
            if (zzmaVar.zzp() == zzwzVar) {
                if (zzwzVar != null && !zzmaVar.zzQ()) {
                    zzlcVar.zzg();
                    boolean z2 = zzlcVar.zzg.zzg;
                }
            }
            zzlc zzlcVarZzg = zzlcVar.zzg();
            return zzlcVarZzg != null && zzlcVarZzg.zzc[i10] == zzmaVar.zzp();
        }
        return true;
    }

    private final boolean zzS() {
        int i10 = this.zzd;
        return i10 == 2 || i10 == 4;
    }

    private static boolean zzT(zzma zzmaVar) {
        return zzmaVar.zzcU() != 0;
    }

    private final boolean zzU() {
        return this.zzd == 3;
    }

    private static zzz[] zzV(zzyw zzywVar) {
        int iZzh = zzywVar != null ? zzywVar.zzh() : 0;
        zzz[] zzzVarArr = new zzz[iZzh];
        for (int i10 = 0; i10 < iZzh; i10++) {
            zzywVar.getClass();
            zzzVarArr[i10] = zzywVar.zza(i10);
        }
        return zzzVarArr;
    }

    private static final void zzW(zzma zzmaVar) {
        if (zzmaVar.zzcU() == 2) {
            zzmaVar.zzP();
        }
    }

    private static final void zzX(zzma zzmaVar, long j) {
        zzmaVar.zzK();
        if (zzmaVar instanceof zzxo) {
            throw null;
        }
    }

    public final void zzA() {
        int i10;
        zzdd.zzf(!zzH());
        if (zzT(this.zza)) {
            i10 = 3;
        } else {
            zzma zzmaVar = this.zzc;
            i10 = (zzmaVar == null || !zzT(zzmaVar)) ? 2 : 4;
        }
        this.zzd = i10;
    }

    public final void zzB() {
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar)) {
            zzW(zzmaVar);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2)) {
            return;
        }
        zzW(zzmaVar2);
    }

    public final boolean zzC(zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        return zzmaVarZzM == null || zzmaVarZzM.zzQ() || zzmaVarZzM.zzX() || zzmaVarZzM.zzW();
    }

    public final boolean zzD(zzlc zzlcVar) {
        return zzR(zzlcVar, this.zza) && zzR(zzlcVar, this.zzc);
    }

    public final boolean zzE(zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        return zzmaVarZzM.zzQ();
    }

    public final boolean zzF() {
        return this.zzc != null;
    }

    public final boolean zzG() {
        zzma zzmaVar = this.zza;
        boolean zZzW = zzT(zzmaVar) ? zzmaVar.zzW() : true;
        zzma zzmaVar2 = this.zzc;
        return (zzmaVar2 == null || !zzT(zzmaVar2)) ? zZzW : zZzW & zzmaVar2.zzW();
    }

    public final boolean zzH() {
        return zzS() || zzU();
    }

    public final boolean zzI(zzlc zzlcVar) {
        return (zzS() && zzM(zzlcVar) == this.zza) || (zzU() && zzM(zzlcVar) == this.zzc);
    }

    public final boolean zzJ(zzlc zzlcVar) {
        return zzM(zzlcVar) != null;
    }

    public final boolean zzK() {
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return zzT(this.zza);
        }
        zzma zzmaVar = this.zzc;
        zzmaVar.getClass();
        return zzT(zzmaVar);
    }

    public final int zza() {
        zzma zzmaVar = this.zzc;
        boolean zZzT = zzT(this.zza);
        int i10 = 0;
        if (zzmaVar != null && zzT(zzmaVar)) {
            i10 = 1;
        }
        return (zZzT ? 1 : 0) + i10;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final int zzc(zzlc zzlcVar, zzze zzzeVar, zzil zzilVar) {
        int iZzL = zzL(this.zza, zzlcVar, zzzeVar, zzilVar);
        return iZzL == 1 ? zzL(this.zzc, zzlcVar, zzzeVar, zzilVar) : iZzL;
    }

    public final long zzd(zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        Objects.requireNonNull(zzmaVarZzM);
        return zzmaVarZzM.zzcW();
    }

    public final void zze(zzil zzilVar) {
        zzN(this.zza, zzilVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            boolean z2 = zzT(zzmaVar) && this.zzd != 3;
            zzN(zzmaVar, zzilVar);
            zzP(false);
            if (z2) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzf(zzil zzilVar) {
        boolean z2;
        zzma zzmaVar;
        if (zzH()) {
            int i10 = this.zzd;
            if (i10 == 4) {
                z2 = true;
            } else if (i10 == 2) {
                i10 = 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                zzmaVar = this.zza;
            } else {
                zzmaVar = this.zzc;
                zzmaVar.getClass();
            }
            zzN(zzmaVar, zzilVar);
            zzP(z2);
            this.zzd = i10 == 4 ? 1 : 0;
        }
    }

    public final void zzg(zzme zzmeVar, zzyw zzywVar, zzwz zzwzVar, long j, boolean z2, boolean z10, long j4, long j10, zzvh zzvhVar, zzil zzilVar) throws zzin {
        zzz[] zzzVarArrZzV = zzV(zzywVar);
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.zze = true;
            zzma zzmaVar = this.zza;
            zzmaVar.zzs(zzmeVar, zzzVarArrZzV, zzwzVar, j, z2, z10, j4, j10, zzvhVar);
            zzilVar.zze(zzmaVar);
            return;
        }
        this.zzf = true;
        zzma zzmaVar2 = this.zzc;
        zzmaVar2.getClass();
        zzmaVar2.zzs(zzmeVar, zzzVarArrZzV, zzwzVar, j, z2, z10, j4, j10, zzvhVar);
        zzilVar.zze(zzmaVar2);
    }

    public final void zzh() {
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar)) {
            zzmaVar.zzt();
            return;
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2)) {
            return;
        }
        zzmaVar2.zzt();
    }

    public final void zzi(int i10, Object obj, zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        zzmaVarZzM.zzu(11, obj);
    }

    public final void zzj(zzwz zzwzVar, zzil zzilVar, long j, boolean z2) {
        zzO(this.zza, zzwzVar, zzilVar, j, z2);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzO(zzmaVar, zzwzVar, zzilVar, j, z2);
        }
    }

    public final void zzk() {
        int i10 = this.zzd;
        if (i10 == 3 || i10 == 4) {
            zzQ(i10 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzl(zzze zzzeVar, zzze zzzeVar2, long j) {
        int i10;
        int i11 = this.zzb;
        boolean zZzb = zzzeVar.zzb(i11);
        boolean zZzb2 = zzzeVar2.zzb(i11);
        zzma zzmaVar = this.zzc;
        if (zzmaVar == null || (i10 = this.zzd) == 3 || (i10 == 0 && zzT(this.zza))) {
            zzmaVar = this.zza;
        }
        if (!zZzb || zzmaVar.zzR()) {
            return;
        }
        zzb();
        zzme zzmeVar = zzzeVar.zzb[i11];
        zzme zzmeVar2 = zzzeVar2.zzb[i11];
        if (zZzb2 && Objects.equals(zzmeVar2, zzmeVar) && !zzH()) {
            return;
        }
        zzX(zzmaVar, j);
    }

    public final void zzm(zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        zzmaVarZzM.zzw();
    }

    public final void zzn() {
        this.zza.zzG();
        this.zze = false;
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzG();
            this.zzf = false;
        }
    }

    public final void zzo(long j, long j4) {
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar)) {
            zzmaVar.zzV(j, j4);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2)) {
            return;
        }
        zzmaVar2.zzV(j, j4);
    }

    public final void zzp() {
        if (!zzT(this.zza)) {
            zzP(true);
        }
        zzma zzmaVar = this.zzc;
        if (zzmaVar == null || zzT(zzmaVar)) {
            return;
        }
        zzP(false);
    }

    public final void zzq(zzlc zzlcVar, long j) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        if (zzmaVarZzM != null) {
            zzmaVarZzM.zzJ(j);
        }
    }

    public final void zzr(long j) {
        int i10;
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar) && (i10 = this.zzd) != 4 && i10 != 2) {
            zzX(zzmaVar, j);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2) || this.zzd == 3) {
            return;
        }
        zzX(zzmaVar2, j);
    }

    public final void zzs(zzlc zzlcVar, long j) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        zzX(zzmaVarZzM, j);
    }

    public final void zzt(float f10, float f11) {
        this.zza.zzM(f10, f11);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzM(f10, f11);
        }
    }

    public final void zzu(zzmh zzmhVar) {
        this.zza.zzu(18, zzmhVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzu(18, zzmhVar);
        }
    }

    public final void zzv(zzbl zzblVar) {
        this.zza.zzN(zzblVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzN(zzblVar);
        }
    }

    public final void zzw(zzabo zzaboVar) {
        if (zzb() != 2) {
            return;
        }
        this.zza.zzu(7, zzaboVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzu(7, zzaboVar);
        }
    }

    public final void zzx(Object obj) {
        if (zzb() != 2) {
            return;
        }
        int i10 = this.zzd;
        if (i10 != 4 && i10 != 1) {
            this.zza.zzu(1, obj);
            return;
        }
        zzma zzmaVar = this.zzc;
        zzmaVar.getClass();
        zzmaVar.zzu(1, obj);
    }

    public final void zzy(float f10) {
        if (zzb() != 1) {
            return;
        }
        zzma zzmaVar = this.zza;
        Float fValueOf = Float.valueOf(f10);
        zzmaVar.zzu(2, fValueOf);
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 != null) {
            zzmaVar2.zzu(2, fValueOf);
        }
    }

    public final void zzz() {
        zzma zzmaVar = this.zza;
        if (zzmaVar.zzcU() == 1 && this.zzd != 4) {
            zzmaVar.zzO();
            return;
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || zzmaVar2.zzcU() != 1 || this.zzd == 3) {
            return;
        }
        zzmaVar2.zzO();
    }
}
