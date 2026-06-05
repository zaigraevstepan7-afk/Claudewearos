package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzafo {
    private final zzafn zza;
    private final zzaez zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzafo(int i10, zzafn zzafnVar, zzaez zzaezVar) {
        this.zza = zzafnVar;
        int iZzb = zzafnVar.zzb();
        boolean z2 = true;
        if (iZzb != 1) {
            if (iZzb == 2) {
                iZzb = 2;
            } else {
                z2 = false;
            }
        }
        zzdd.zzd(z2);
        this.zzc = zzh(i10, iZzb == 2 ? 1667497984 : 1651965952);
        this.zze = zzafnVar.zzc();
        this.zzb = zzaezVar;
        this.zzd = iZzb == 2 ? zzh(i10, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzafnVar.zzd;
    }

    private static int zzh(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long zzi(int i10) {
        return (this.zze * i10) / this.zzf;
    }

    private final zzaet zzj(int i10) {
        return new zzaet(this.zzn[i10] * zzi(1), this.zzm[i10]);
    }

    public final zzaeq zza(long j) {
        if (this.zzk == 0) {
            zzaet zzaetVar = new zzaet(0L, this.zzl);
            return new zzaeq(zzaetVar, zzaetVar);
        }
        int iZzi = (int) (j / zzi(1));
        int iZzc = zzex.zzc(this.zzn, iZzi, true, true);
        if (this.zzn[iZzc] == iZzi) {
            zzaet zzaetVarZzj = zzj(iZzc);
            return new zzaeq(zzaetVarZzj, zzaetVarZzj);
        }
        zzaet zzaetVarZzj2 = zzj(iZzc);
        int i10 = iZzc + 1;
        return i10 < this.zzm.length ? new zzaeq(zzaetVarZzj2, zzj(i10)) : new zzaeq(zzaetVarZzj2, zzaetVarZzj2);
    }

    public final void zzb(long j, boolean z2) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z2) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i10 = this.zzk;
            jArr2[i10] = j;
            this.zzn[i10] = this.zzj;
            this.zzk = i10 + 1;
        }
        this.zzj++;
    }

    public final void zzc() {
        int i10;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i10 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i10;
    }

    public final void zzd(int i10) {
        this.zzg = i10;
        this.zzh = i10;
    }

    public final void zze(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzex.zzd(this.zzm, j, true, true)];
        }
    }

    public final boolean zzf(int i10) {
        return this.zzc == i10 || this.zzd == i10;
    }

    public final boolean zzg(zzadu zzaduVar) {
        int i10 = this.zzh;
        zzaez zzaezVar = this.zzb;
        int iZzf = i10 - zzaezVar.zzf(zzaduVar, i10, false);
        this.zzh = iZzf;
        boolean z2 = iZzf == 0;
        if (z2) {
            if (this.zzg > 0) {
                zzaezVar.zzt(zzi(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z2;
    }
}
