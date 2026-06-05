package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzadf {
    protected final zzacz zza;
    protected final zzade zzb;
    protected zzadb zzc;
    private final int zzd;

    public zzadf(zzadc zzadcVar, zzade zzadeVar, long j, long j4, long j10, long j11, long j12, long j13, int i10) {
        this.zzb = zzadeVar;
        this.zzd = i10;
        this.zza = new zzacz(zzadcVar, j, 0L, j10, j11, j12, j13);
    }

    public static final int zzf(zzadu zzaduVar, long j, zzaep zzaepVar) {
        if (j == zzaduVar.zzf()) {
            return 0;
        }
        zzaepVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzadu zzaduVar, long j) {
        long jZzf = j - zzaduVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        zzaduVar.zzk((int) jZzf);
        return true;
    }

    public final int zza(zzadu zzaduVar, zzaep zzaepVar) {
        while (true) {
            zzadb zzadbVar = this.zzc;
            zzdd.zzb(zzadbVar);
            long j = zzadbVar.zzf;
            long j4 = zzadbVar.zzg;
            long j10 = zzadbVar.zzh;
            if (j4 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzaduVar, j, zzaepVar);
            }
            if (!zzg(zzaduVar, j10)) {
                return zzf(zzaduVar, j10, zzaepVar);
            }
            zzaduVar.zzj();
            zzadd zzaddVarZza = this.zzb.zza(zzaduVar, zzadbVar.zzb);
            int i10 = zzaddVarZza.zzb;
            if (i10 == -3) {
                zzc(false, j10);
                return zzf(zzaduVar, j10, zzaepVar);
            }
            if (i10 == -2) {
                zzadb.zzh(zzadbVar, zzaddVarZza.zzc, zzaddVarZza.zzd);
            } else {
                if (i10 != -1) {
                    zzg(zzaduVar, zzaddVarZza.zzd);
                    zzc(true, zzaddVarZza.zzd);
                    return zzf(zzaduVar, zzaddVarZza.zzd, zzaepVar);
                }
                zzadb.zzg(zzadbVar, zzaddVarZza.zzc, zzaddVarZza.zzd);
            }
        }
    }

    public final zzaes zzb() {
        return this.zza;
    }

    public final void zzc(boolean z2, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        zzadb zzadbVar = this.zzc;
        if (zzadbVar == null || zzadbVar.zza != j) {
            zzacz zzaczVar = this.zza;
            this.zzc = new zzadb(j, zzaczVar.zzf(j), 0L, zzaczVar.zzc, zzaczVar.zzd, zzaczVar.zze, zzaczVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
