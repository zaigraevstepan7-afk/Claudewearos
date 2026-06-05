package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzakf {
    private zzaez zzb;
    private zzadw zzc;
    private zzaka zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajy zza = new zzajy();
    private zzakc zzj = new zzakc();

    public abstract long zza(zzen zzenVar);

    public void zzb(boolean z2) {
        int i10;
        if (z2) {
            this.zzj = new zzakc();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzen zzenVar, long j, zzakc zzakcVar);

    public final int zze(zzadu zzaduVar, zzaep zzaepVar) {
        zzdd.zzb(this.zzb);
        String str = zzex.zza;
        int i10 = this.zzh;
        if (i10 != 0) {
            if (i10 == 1) {
                zzaduVar.zzk((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i10 != 2) {
                return -1;
            }
            long jZzd = this.zzd.zzd(zzaduVar);
            if (jZzd >= 0) {
                zzaepVar.zza = jZzd;
                return 1;
            }
            if (jZzd < -1) {
                zzi(-(jZzd + 2));
            }
            if (!this.zzl) {
                zzaes zzaesVarZze = this.zzd.zze();
                zzdd.zzb(zzaesVarZze);
                this.zzc.zzP(zzaesVarZze);
                this.zzb.zzl(zzaesVarZze.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zze(zzaduVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzen zzenVarZza = this.zza.zza();
            long jZza = zza(zzenVarZza);
            if (jZza >= 0) {
                long j = this.zzg;
                if (j + jZza >= this.zze) {
                    long jZzf = zzf(j);
                    this.zzb.zzr(zzenVarZza, zzenVarZza.zzd());
                    this.zzb.zzt(jZzf, 1, zzenVarZza.zzd(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZza;
            return 0;
        }
        while (true) {
            zzajy zzajyVar = this.zza;
            if (!zzajyVar.zze(zzaduVar)) {
                this.zzh = 3;
                return -1;
            }
            long jZzf2 = zzaduVar.zzf();
            long j4 = this.zzf;
            this.zzk = jZzf2 - j4;
            if (!zzc(zzajyVar.zza(), j4, this.zzj)) {
                zzz zzzVar = this.zzj.zza;
                this.zzi = zzzVar.zzH;
                if (!this.zzm) {
                    this.zzb.zzm(zzzVar);
                    this.zzm = true;
                }
                zzaka zzakaVar = this.zzj.zzb;
                if (zzakaVar != null) {
                    this.zzd = zzakaVar;
                } else if (zzaduVar.zzd() == -1) {
                    this.zzd = new zzakd(null);
                } else {
                    zzajz zzajzVarZzb = zzajyVar.zzb();
                    this.zzd = new zzaju(this, this.zzf, zzaduVar.zzd(), zzajzVarZzb.zzd + zzajzVarZzb.zze, zzajzVarZzb.zzb, (zzajzVarZzb.zza & 4) != 0);
                }
                this.zzh = 2;
                zzajyVar.zzd();
                return 0;
            }
            this.zzf = zzaduVar.zzf();
        }
    }

    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    public final void zzh(zzadw zzadwVar, zzaez zzaezVar) {
        this.zzc = zzadwVar;
        this.zzb = zzaezVar;
        zzb(true);
    }

    public void zzi(long j) {
        this.zzg = j;
    }

    public final void zzj(long j, long j4) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzg = zzg(j4);
            this.zze = jZzg;
            zzaka zzakaVar = this.zzd;
            String str = zzex.zza;
            zzakaVar.zzg(jZzg);
            this.zzh = 2;
        }
    }
}
