package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzec {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzec() {
        throw null;
    }

    public final long zza() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i10 = this.zzc;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i11 = this.zza;
        long j = jArr[i11];
        this.zza = this.zze & (i11 + 1);
        this.zzc = i10 - 1;
        return j;
    }

    public final void zzc(long j) {
        int i10 = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i10 == length) {
            int i11 = length + length;
            if (i11 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i11];
            int i12 = this.zza;
            int i13 = length - i12;
            System.arraycopy(jArr, i12, jArr2, 0, i13);
            System.arraycopy(this.zzd, 0, jArr2, i13, i12);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i14 = (this.zzb + 1) & this.zze;
        this.zzb = i14;
        jArr[i14] = j;
        this.zzc++;
    }

    public final void zzd() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public final boolean zze() {
        return this.zzc == 0;
    }

    public zzec(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new long[i11];
        this.zze = r3.length - 1;
    }
}
