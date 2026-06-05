package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaoc implements zzade {
    private final zzeu zza;
    private final zzen zzb = new zzen();
    private final int zzc;

    public zzaoc(int i10, zzeu zzeuVar, int i11) {
        this.zzc = i10;
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadd zza(zzadu zzaduVar, long j) {
        int iZza;
        int iZza2;
        long jZzf = zzaduVar.zzf();
        int iMin = (int) Math.min(112800L, zzaduVar.zzd() - jZzf);
        zzen zzenVar = this.zzb;
        zzenVar.zzI(iMin);
        zzaduVar.zzh(zzenVar.zzN(), 0, iMin);
        int iZzd = zzenVar.zzd();
        long j4 = -1;
        long j10 = -9223372036854775807L;
        long j11 = -1;
        while (zzenVar.zza() >= 188 && (iZza2 = (iZza = zzaon.zza(zzenVar.zzN(), zzenVar.zzc(), iZzd)) + 188) <= iZzd) {
            long jZzb = zzaon.zzb(zzenVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 > j) {
                    return j10 == -9223372036854775807L ? zzadd.zzd(jZzb2, jZzf) : zzadd.zze(jZzf + j11);
                }
                j11 = iZza;
                if (100000 + jZzb2 > j) {
                    return zzadd.zze(jZzf + j11);
                }
                j10 = jZzb2;
            }
            zzenVar.zzL(iZza2);
            j4 = iZza2;
        }
        return j10 != -9223372036854775807L ? zzadd.zzf(j10, jZzf + j4) : zzadd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzb() {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
