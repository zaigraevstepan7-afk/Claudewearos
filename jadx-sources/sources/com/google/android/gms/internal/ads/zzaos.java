package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaos implements zzaor {
    private final zzadw zza;
    private final zzaez zzb;
    private final zzaou zzc;
    private final zzz zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaos(zzadw zzadwVar, zzaez zzaezVar, zzaou zzaouVar, String str, int i10) throws zzaz {
        this.zza = zzadwVar;
        this.zzb = zzaezVar;
        this.zzc = zzaouVar;
        int i11 = zzaouVar.zzb * zzaouVar.zze;
        int i12 = zzaouVar.zzd;
        int i13 = i11 / 8;
        if (i12 != i13) {
            throw zzaz.zza("Expected block size: " + i13 + "; got: " + i12, null);
        }
        int i14 = zzaouVar.zzc * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.zze = iMax;
        zzx zzxVar = new zzx();
        zzxVar.zzG("audio/wav");
        zzxVar.zzah(str);
        zzxVar.zzC(i15);
        zzxVar.zzac(i15);
        zzxVar.zzX(iMax);
        zzxVar.zzD(zzaouVar.zzb);
        zzxVar.zzai(zzaouVar.zzc);
        zzxVar.zzab(i10);
        this.zzd = zzxVar.zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(int i10, long j) {
        zzaox zzaoxVar = new zzaox(this.zzc, 1, i10, j);
        this.zza.zzP(zzaoxVar);
        zzaez zzaezVar = this.zzb;
        zzaezVar.zzm(this.zzd);
        zzaezVar.zzl(zzaoxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final boolean zzc(zzadu zzaduVar, long j) {
        int i10;
        int i11;
        long j4 = j;
        while (j4 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int iZzf = this.zzb.zzf(zzaduVar, (int) Math.min(i11 - i10, j4), true);
            if (iZzf == -1) {
                j4 = 0;
            } else {
                this.zzg += iZzf;
                j4 -= iZzf;
            }
        }
        zzaou zzaouVar = this.zzc;
        int i12 = this.zzg;
        int i13 = zzaouVar.zzd;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jZzu = this.zzf + zzex.zzu(this.zzh, 1000000L, zzaouVar.zzc, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zzt(jZzu, 1, i15, i16, null);
            this.zzh += i14;
            this.zzg = i16;
        }
        return j4 <= 0;
    }
}
