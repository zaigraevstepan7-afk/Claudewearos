package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgxw extends zzgya {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgxw(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(gk.b.l(length, i11, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzL(byte b10) throws zzgxx {
        int i10 = this.zzc;
        try {
            int i11 = i10 + 1;
            try {
                this.zza[i10] = b10;
                this.zzc = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzgxx(i10, this.zzb, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzM(int i10, boolean z2) throws zzgxx {
        zzu(i10 << 3);
        zzL(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzN(int i10, zzgxn zzgxnVar) throws zzgxx {
        zzu((i10 << 3) | 2);
        zzu(zzgxnVar.zzd());
        zzgxnVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgya, com.google.android.gms.internal.ads.zzgxe
    public final void zza(byte[] bArr, int i10, int i11) throws zzgxx {
        zze(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) throws zzgxx {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxx(this.zzc, this.zzb, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzh(int i10, int i11) throws zzgxx {
        zzu((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzi(int i10) throws zzgxx {
        int i11 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zzc = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxx(i11, this.zzb, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzj(int i10, long j) throws zzgxx {
        zzu((i10 << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzk(long j) throws zzgxx {
        int i10 = this.zzc;
        try {
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
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxx(i10, this.zzb, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzl(int i10, int i11) throws zzgxx {
        zzu(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzm(int i10) throws zzgxx {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzn(int i10, zzhag zzhagVar, zzhaz zzhazVar) throws zzgxx {
        zzu((i10 << 3) | 2);
        zzu(((zzgww) zzhagVar).zzaM(zzhazVar));
        zzhazVar.zzj(zzhagVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzo(int i10, zzhag zzhagVar) throws zzgxx {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzu(zzhagVar.zzaY());
        zzhagVar.zzcZ(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzp(int i10, zzgxn zzgxnVar) throws zzgxx {
        zzu(11);
        zzt(2, i10);
        zzN(3, zzgxnVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzq(int i10, String str) throws zzgxx {
        zzu((i10 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws zzgxx {
        int i10 = this.zzc;
        try {
            int iZzD = zzgya.zzD(str.length() * 3);
            int iZzD2 = zzgya.zzD(str.length());
            if (iZzD2 != iZzD) {
                zzu(zzhbx.zze(str));
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = zzhbx.zzd(str, bArr, i11, this.zzb - i11);
                return;
            }
            int i12 = i10 + iZzD2;
            this.zzc = i12;
            int iZzd = zzhbx.zzd(str, this.zza, i12, this.zzb - i12);
            this.zzc = i10;
            zzu((iZzd - i10) - iZzD2);
            this.zzc = iZzd;
        } catch (zzhbw e10) {
            this.zzc = i10;
            zzG(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgxx(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzs(int i10, int i11) throws zzgxx {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzt(int i10, int i11) throws zzgxx {
        zzu(i10 << 3);
        zzu(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzu(int i10) throws zzgxx {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zzc;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.zza[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new zzgxx(i12, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzgxx(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zza[i12] = (byte) i10;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzv(int i10, long j) throws zzgxx {
        zzu(i10 << 3);
        zzw(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzw(long j) throws zzgxx {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zzc;
        if (!zzgya.zzb || this.zzb - i11 < 10) {
            int i12 = i11;
            while ((j & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.zza[i12] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i12 = i13;
                        throw new zzgxx(i12, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i12 + 1;
            try {
                this.zza[i12] = (byte) j;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new zzgxx(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzhbs.zzq(this.zza, i11, (byte) (((int) j) | 128));
                j >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzhbs.zzq(this.zza, i11, (byte) j);
        }
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzK() {
    }
}
