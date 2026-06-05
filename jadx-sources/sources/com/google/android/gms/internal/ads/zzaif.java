package com.google.android.gms.internal.ads;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaif implements zzaie {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzaif(long[] jArr, long[] jArr2, long j, long j4, long j10, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j10;
        this.zze = i10;
    }

    public static zzaif zzb(long j, long j4, zzael zzaelVar, zzen zzenVar) {
        int iZzm;
        zzen zzenVar2 = zzenVar;
        zzenVar2.zzM(6);
        int iZzg = zzenVar2.zzg();
        long j10 = zzaelVar.zzc;
        long j11 = iZzg;
        if (zzenVar2.zzg() <= 0) {
            return null;
        }
        long jZzt = zzex.zzt((r4 * zzaelVar.zzg) - 1, zzaelVar.zzd);
        int iZzq = zzenVar2.zzq();
        int iZzq2 = zzenVar2.zzq();
        int iZzq3 = zzenVar2.zzq();
        zzenVar2.zzM(2);
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        int i10 = 0;
        long j12 = j4 + zzaelVar.zzc;
        while (i10 < iZzq) {
            long j13 = j10;
            jArr[i10] = (i10 * jZzt) / iZzq;
            jArr2[i10] = j12;
            if (iZzq3 == 1) {
                iZzm = zzenVar2.zzm();
            } else if (iZzq3 == 2) {
                iZzm = zzenVar2.zzq();
            } else if (iZzq3 == 3) {
                iZzm = zzenVar2.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = zzenVar2.zzp();
            }
            j12 += iZzm * iZzq2;
            i10++;
            zzenVar2 = zzenVar;
            iZzq = iZzq;
            j10 = j13;
        }
        long j14 = j4 + j10;
        long jMax = j14 + j11;
        if (j != -1 && j != jMax) {
            StringBuilder sbL = m1.l("VBRI data size mismatch: ", ", ", j);
            sbL.append(jMax);
            zzea.zzf("VbriSeeker", sbL.toString());
        }
        if (jMax != j12) {
            StringBuilder sbL2 = m1.l("VBRI bytes and ToC mismatch (using max): ", ", ", jMax);
            sbL2.append(j12);
            sbL2.append("\nSeeking will be inaccurate.");
            zzea.zzf("VbriSeeker", sbL2.toString());
            jMax = Math.max(jMax, j12);
        }
        return new zzaif(jArr, jArr2, jZzt, j14, jMax, zzaelVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j) {
        return this.zza[zzex.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        long[] jArr = this.zza;
        int iZzd = zzex.zzd(jArr, j, true, true);
        long j4 = jArr[iZzd];
        long[] jArr2 = this.zzb;
        zzaet zzaetVar = new zzaet(j4, jArr2[iZzd]);
        if (zzaetVar.zzb >= j || iZzd == jArr.length - 1) {
            return new zzaeq(zzaetVar, zzaetVar);
        }
        int i10 = iZzd + 1;
        return new zzaeq(zzaetVar, new zzaet(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
