package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaow {
    public static Pair zza(zzadu zzaduVar) throws zzaz {
        zzaduVar.zzj();
        zzaov zzaovVarZzd = zzd(1684108385, zzaduVar, new zzen(8));
        zzaduVar.zzk(8);
        return Pair.create(Long.valueOf(zzaduVar.zzf()), Long.valueOf(zzaovVarZzd.zzb));
    }

    public static zzaou zzb(zzadu zzaduVar) {
        byte[] bArr;
        zzen zzenVar = new zzen(16);
        long j = zzd(1718449184, zzaduVar, zzenVar).zzb;
        zzdd.zzf(j >= 16);
        zzaduVar.zzh(zzenVar.zzN(), 0, 16);
        zzenVar.zzL(0);
        int iZzk = zzenVar.zzk();
        int iZzk2 = zzenVar.zzk();
        int iZzj = zzenVar.zzj();
        int iZzj2 = zzenVar.zzj();
        int iZzk3 = zzenVar.zzk();
        int iZzk4 = zzenVar.zzk();
        int i10 = ((int) j) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            zzaduVar.zzh(bArr, 0, i10);
        } else {
            bArr = zzex.zzb;
        }
        byte[] bArr2 = bArr;
        zzaduVar.zzk((int) (zzaduVar.zze() - zzaduVar.zzf()));
        return new zzaou(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr2);
    }

    public static boolean zzc(zzadu zzaduVar) {
        zzen zzenVar = new zzen(8);
        int i10 = zzaov.zza(zzaduVar, zzenVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        zzaduVar.zzh(zzenVar.zzN(), 0, 4);
        zzenVar.zzL(0);
        int iZzg = zzenVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        zzea.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static zzaov zzd(int i10, zzadu zzaduVar, zzen zzenVar) throws zzaz {
        zzaov zzaovVarZza = zzaov.zza(zzaduVar, zzenVar);
        while (true) {
            int i11 = zzaovVarZza.zza;
            if (i11 == i10) {
                return zzaovVarZza;
            }
            m6.a.n(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = zzaovVarZza.zzb;
            long j4 = 8 + j;
            if ((1 & j) != 0) {
                j4 = 9 + j;
            }
            if (j4 > 2147483647L) {
                throw zzaz.zzc("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            zzaduVar.zzk((int) j4);
            zzaovVarZza = zzaov.zza(zzaduVar, zzenVar);
        }
    }
}
