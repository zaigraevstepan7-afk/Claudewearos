package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaig {
    public final zzael zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaig(zzael zzaelVar, long j, long j4, long[] jArr, int i10, int i11) {
        this.zza = new zzael(zzaelVar);
        this.zzb = j;
        this.zzc = j4;
        this.zzf = jArr;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzaig zzb(zzael zzaelVar, zzen zzenVar) {
        long[] jArr;
        int i10;
        int i11;
        int iZzg = zzenVar.zzg();
        int iZzp = (iZzg & 1) != 0 ? zzenVar.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? zzenVar.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = zzenVar.zzm();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzg & 8) != 0) {
            zzenVar.zzM(4);
        }
        if (zzenVar.zza() >= 24) {
            zzenVar.zzM(21);
            int iZzo = zzenVar.zzo();
            i11 = iZzo & 4095;
            i10 = iZzo >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzaig(zzaelVar, iZzp, jZzu, jArr2, i10, i11);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return zzex.zzt((j * r4.zzg) - 1, this.zza.zzd);
    }
}
