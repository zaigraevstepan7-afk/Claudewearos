package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgxv extends zzgya {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzgxv(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b10) {
        byte[] bArr = this.zza;
        int i10 = this.zzc;
        bArr[i10] = b10;
        this.zzc = i10 + 1;
        this.zzd++;
    }

    public final void zzd(int i10) {
        int i11 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.zzc = i11 + 4;
        this.zzd += 4;
    }

    public final void zze(long j) {
        int i10 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i10] = (byte) j;
        bArr[i10 + 1] = (byte) (j >> 8);
        bArr[i10 + 2] = (byte) (j >> 16);
        bArr[i10 + 3] = (byte) (j >> 24);
        bArr[i10 + 4] = (byte) (j >> 32);
        bArr[i10 + 5] = (byte) (j >> 40);
        bArr[i10 + 6] = (byte) (j >> 48);
        bArr[i10 + 7] = (byte) (j >> 56);
        this.zzc = i10 + 8;
        this.zzd += 8;
    }

    public final void zzf(int i10) {
        if (!zzgya.zzb) {
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr[i11] = (byte) (i10 | 128);
                this.zzd++;
                i10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr2[i12] = (byte) i10;
            this.zzd++;
            return;
        }
        long j = this.zzc;
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzhbs.zzq(bArr3, i13, (byte) (i10 | 128));
            i10 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        zzhbs.zzq(bArr4, i14, (byte) i10);
        this.zzd += (int) (this.zzc - j);
    }

    public final void zzg(long j) {
        if (zzgya.zzb) {
            long j4 = this.zzc;
            while (true) {
                int i10 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    zzhbs.zzq(bArr, i11, (byte) i10);
                    this.zzd += (int) (this.zzc - j4);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzhbs.zzq(bArr2, i12, (byte) (i10 | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i14 = this.zzc;
                    this.zzc = i14 + 1;
                    bArr3[i14] = (byte) i13;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i15 = this.zzc;
                this.zzc = i15 + 1;
                bArr4[i15] = (byte) (i13 | 128);
                this.zzd++;
                j >>>= 7;
            }
        }
    }
}
