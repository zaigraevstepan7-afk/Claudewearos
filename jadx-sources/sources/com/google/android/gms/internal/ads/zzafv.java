package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzafv implements zzade {
    private final zzaee zza;
    private final int zzb;
    private final zzadz zzc = new zzadz();

    public /* synthetic */ zzafv(zzaee zzaeeVar, int i10, zzafw zzafwVar) {
        this.zza = zzaeeVar;
        this.zzb = i10;
    }

    private final long zzc(zzadu zzaduVar) {
        while (zzaduVar.zze() < zzaduVar.zzd() - 6) {
            zzaee zzaeeVar = this.zza;
            int i10 = this.zzb;
            zzadz zzadzVar = this.zzc;
            long jZze = zzaduVar.zze();
            byte[] bArr = new byte[2];
            zzaduVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzaduVar.zzj();
                zzaduVar.zzg((int) (jZze - zzaduVar.zzf()));
            } else {
                zzen zzenVar = new zzen(16);
                System.arraycopy(bArr, 0, zzenVar.zzN(), 0, 2);
                zzenVar.zzK(zzadx.zza(zzaduVar, zzenVar.zzN(), 2, 14));
                zzaduVar.zzj();
                zzaduVar.zzg((int) (jZze - zzaduVar.zzf()));
                if (zzaea.zzc(zzenVar, zzaeeVar, i10, zzadzVar)) {
                    break;
                }
            }
            zzaduVar.zzg(1);
        }
        if (zzaduVar.zze() < zzaduVar.zzd() - 6) {
            return this.zzc.zza;
        }
        zzaduVar.zzg((int) (zzaduVar.zzd() - zzaduVar.zze()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadd zza(zzadu zzaduVar, long j) {
        long jZzf = zzaduVar.zzf();
        long jZzc = zzc(zzaduVar);
        long jZze = zzaduVar.zze();
        zzaduVar.zzg(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzaduVar);
        return (jZzc > j || jZzc2 <= j) ? jZzc2 <= j ? zzadd.zzf(jZzc2, zzaduVar.zze()) : zzadd.zzd(jZzc, jZzf) : zzadd.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final /* synthetic */ void zzb() {
    }
}
