package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaoe {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzen zzb = new zzen();

    public zzaoe(int i10) {
    }

    private final int zze(zzadu zzaduVar) {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzaduVar.zzj();
        return 0;
    }

    public final int zza(zzadu zzaduVar, zzaep zzaepVar, int i10) {
        if (i10 <= 0) {
            zze(zzaduVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaduVar);
                return 0;
            }
            if (this.zzd) {
                long j4 = this.zzf;
                if (j4 == -9223372036854775807L) {
                    zze(zzaduVar);
                    return 0;
                }
                zzeu zzeuVar = this.zza;
                this.zzh = zzeuVar.zzc(this.zzg) - zzeuVar.zzb(j4);
                zze(zzaduVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzaduVar.zzd());
            if (zzaduVar.zzf() != 0) {
                zzaepVar.zza = 0L;
                return 1;
            }
            zzen zzenVar = this.zzb;
            zzenVar.zzI(iMin);
            zzaduVar.zzj();
            zzaduVar.zzh(zzenVar.zzN(), 0, iMin);
            int iZzc = zzenVar.zzc();
            int iZzd = zzenVar.zzd();
            while (true) {
                if (iZzc >= iZzd) {
                    break;
                }
                if (zzenVar.zzN()[iZzc] == 71) {
                    long jZzb = zzaon.zzb(zzenVar, iZzc, i10);
                    if (jZzb != -9223372036854775807L) {
                        j = jZzb;
                        break;
                    }
                }
                iZzc++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long jZzd = zzaduVar.zzd();
        int iMin2 = (int) Math.min(112800L, jZzd);
        long j10 = jZzd - iMin2;
        if (zzaduVar.zzf() != j10) {
            zzaepVar.zza = j10;
            return 1;
        }
        zzen zzenVar2 = this.zzb;
        zzenVar2.zzI(iMin2);
        zzaduVar.zzj();
        zzaduVar.zzh(zzenVar2.zzN(), 0, iMin2);
        int iZzc2 = zzenVar2.zzc();
        int iZzd2 = zzenVar2.zzd();
        int i11 = iZzd2 - 188;
        while (true) {
            if (i11 < iZzc2) {
                break;
            }
            byte[] bArrZzN = zzenVar2.zzN();
            int i12 = -4;
            int i13 = 0;
            while (true) {
                if (i12 > 4) {
                    break;
                }
                int i14 = (i12 * 188) + i11;
                if (i14 < iZzc2 || i14 >= iZzd2 || bArrZzN[i14] != 71) {
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 5) {
                        long jZzb2 = zzaon.zzb(zzenVar2, i11, i10);
                        if (jZzb2 != -9223372036854775807L) {
                            j = jZzb2;
                            break;
                        }
                    }
                }
                i12++;
            }
            i11--;
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
