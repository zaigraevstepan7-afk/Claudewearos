package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzul implements zzvf, zzve {
    public final zzvf zza;
    long zzb;
    private zzve zzc;
    private zzuk[] zzd = new zzuk[0];
    private long zze = 0;

    public zzul(zzvf zzvfVar, boolean z2, long j, long j4) {
        this.zza = zzvfVar;
        this.zzb = j4;
    }

    private static long zzr(long j, long j4, long j10) {
        long jMax = Math.max(j, j4);
        return j10 != Long.MIN_VALUE ? Math.min(jMax, j10) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmi zzmiVar) {
        if (j == 0) {
            return 0L;
        }
        long j4 = zzmiVar.zzc;
        String str = zzex.zza;
        long jMax = Math.max(0L, Math.min(j4, j));
        long j10 = zzmiVar.zzd;
        long j11 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j10, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j));
        if (jMax != j4 || jMax2 != j10) {
            zzmiVar = new zzmi(jMax, jMax2);
        }
        return this.zza.zza(j, zzmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzr(jZzd2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        for (zzuk zzukVar : this.zzd) {
            if (zzukVar != null) {
                zzukVar.zzc();
            }
        }
        return zzr(this.zza.zze(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j) {
        int length = zzwzVarArr.length;
        this.zzd = new zzuk[length];
        zzwz[] zzwzVarArr2 = new zzwz[length];
        int i10 = 0;
        while (true) {
            zzwz zzwzVar = null;
            if (i10 >= zzwzVarArr.length) {
                break;
            }
            zzuk[] zzukVarArr = this.zzd;
            zzuk zzukVar = (zzuk) zzwzVarArr[i10];
            zzukVarArr[i10] = zzukVar;
            if (zzukVar != null) {
                zzwzVar = zzukVar.zza;
            }
            zzwzVarArr2[i10] = zzwzVar;
            i10++;
        }
        long jZzf = this.zza.zzf(zzywVarArr, zArr, zzwzVarArr2, zArr2, j);
        long jZzr = zzr(jZzf, j, this.zzb);
        long j4 = -9223372036854775807L;
        if (zzq()) {
            if (jZzf < j) {
                j4 = jZzr;
                break;
            }
            if (jZzf != 0) {
                for (zzyw zzywVar : zzywVarArr) {
                    if (zzywVar != null) {
                        zzz zzzVarZzb = zzywVar.zzb();
                        if (!zzay.zzf(zzzVarZzb.zzo, zzzVarZzb.zzk)) {
                            j4 = jZzr;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j4;
        for (int i11 = 0; i11 < zzwzVarArr.length; i11++) {
            zzwz zzwzVar2 = zzwzVarArr2[i11];
            if (zzwzVar2 == null) {
                this.zzd[i11] = null;
            } else {
                zzuk[] zzukVarArr2 = this.zzd;
                zzuk zzukVar2 = zzukVarArr2[i11];
                if (zzukVar2 == null || zzukVar2.zza != zzwzVar2) {
                    zzukVarArr2[i11] = new zzuk(this, zzwzVar2);
                }
            }
            zzwzVarArr[i11] = this.zzd[i11];
        }
        return jZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j, boolean z2) {
        this.zza.zzh(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzi(zzxb zzxbVar) {
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzk(zzvf zzvfVar) {
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zzc = zzveVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j4) {
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        return this.zza.zzo(zzlaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
