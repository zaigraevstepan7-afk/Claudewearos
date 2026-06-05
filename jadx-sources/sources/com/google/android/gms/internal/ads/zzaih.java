package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaih implements zzaie {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaih(long j, int i10, long j4, int i11, long j10, long[] jArr) {
        this.zza = j;
        this.zzb = i10;
        this.zzc = j4;
        this.zzd = i11;
        this.zze = j10;
        this.zzg = jArr;
        this.zzf = j10 != -1 ? j + j10 : -1L;
    }

    public static zzaih zzb(zzaig zzaigVar, long j) {
        long jZza = zzaigVar.zza();
        if (jZza == -9223372036854775807L) {
            return null;
        }
        zzael zzaelVar = zzaigVar.zza;
        return new zzaih(j, zzaelVar.zzc, jZza, zzaelVar.zzf, zzaigVar.zzc, zzaigVar.zzf);
    }

    private final long zzf(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j4 = j - this.zza;
        if (j4 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        zzdd.zzb(jArr);
        double d10 = (j4 * 256.0d) / this.zze;
        int iZzd = zzex.zzd(jArr, (long) d10, true, true);
        long jZzf = zzf(iZzd);
        long j10 = jArr[iZzd];
        int i10 = iZzd + 1;
        long jZzf2 = zzf(i10);
        return Math.round((j10 == (iZzd == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j10) / (r0 - j10)) * (jZzf2 - jZzf)) + jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        if (!zzh()) {
            zzaet zzaetVar = new zzaet(0L, this.zza + this.zzb);
            return new zzaeq(zzaetVar, zzaetVar);
        }
        long j4 = this.zzc;
        String str = zzex.zza;
        long jMax = Math.max(0L, Math.min(j, j4));
        double d10 = (jMax * 100.0d) / j4;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.zzg;
                zzdd.zzb(jArr);
                double d12 = jArr[i10];
                d11 = (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - i10)) + d12;
            }
        }
        long j10 = this.zze;
        zzaet zzaetVar2 = new zzaet(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j10), j10 - 1)));
        return new zzaeq(zzaetVar2, zzaetVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return this.zzg != null;
    }
}
