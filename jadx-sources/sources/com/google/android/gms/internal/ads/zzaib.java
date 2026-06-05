package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaib implements zzaie {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaib(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzex.zzs(jArr2[jArr2.length - 1]) : j;
    }

    public static zzaib zzb(long j, zzahg zzahgVar, long j4) {
        int length = zzahgVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j += zzahgVar.zzb + r0[i12];
            j10 += zzahgVar.zzc + zzahgVar.zze[i12];
            jArr[i11] = j;
            jArr2[i11] = j10;
        }
        return new zzaib(jArr, jArr2, j4);
    }

    private static Pair zzf(long j, long[] jArr, long[] jArr2) {
        int iZzd = zzex.zzd(jArr, j, true, true);
        long j4 = jArr[iZzd];
        long j10 = jArr2[iZzd];
        int i10 = iZzd + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j4), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i10] == j4 ? 0.0d : (j - j4) / (r6 - j4)) * (jArr2[i10] - j10))) + j10));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j) {
        return zzex.zzs(((Long) zzf(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        String str = zzex.zza;
        Pair pairZzf = zzf(zzex.zzv(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzaet zzaetVar = new zzaet(zzex.zzs(((Long) pairZzf.first).longValue()), ((Long) pairZzf.second).longValue());
        return new zzaeq(zzaetVar, zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
