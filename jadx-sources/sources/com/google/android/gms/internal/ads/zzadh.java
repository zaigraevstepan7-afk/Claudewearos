package com.google.android.gms.internal.ads;

import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzadh implements zzaes {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzadh(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        StringBuilder sb2 = new StringBuilder("ChunkIndex(length=");
        sb2.append(this.zza);
        sb2.append(", sizes=");
        sb2.append(string);
        sb2.append(", offsets=");
        m1.s(sb2, string2, ", timeUs=", string3, ", durationsUs=");
        return m6.a.j(sb2, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        long[] jArr = this.zze;
        int iZzd = zzex.zzd(jArr, j, true, true);
        long j4 = jArr[iZzd];
        long[] jArr2 = this.zzc;
        zzaet zzaetVar = new zzaet(j4, jArr2[iZzd]);
        if (zzaetVar.zzb >= j || iZzd == this.zza - 1) {
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
