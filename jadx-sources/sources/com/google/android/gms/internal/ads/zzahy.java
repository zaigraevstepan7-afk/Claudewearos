package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzahy {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = i11 + 1;
            if ((zza[i11] & i10) != 0) {
                return i12;
            }
            i11 = i12;
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i10, boolean z2) {
        long j = bArr[0] & 255;
        if (z2) {
            j &= ~zza[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j = (j << 8) | (bArr[i11] & 255);
        }
        return j;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzadu zzaduVar, boolean z2, boolean z10, int i10) {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzaduVar.zzn(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iZzb = zzb(bArr[0] & 255);
            this.zzd = iZzb;
            if (iZzb == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i11 = this.zzd;
        if (i11 > i10) {
            this.zzc = 0;
            return -2L;
        }
        if (i11 != 1) {
            zzaduVar.zzi(this.zzb, 1, i11 - 1);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z10);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}
