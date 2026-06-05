package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgxo extends zzgxt {
    private final byte[] zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzgxo(byte[] bArr, int i10, int i11, boolean z2, zzgxs zzgxsVar) {
        super(null);
        this.zzk = f.API_PRIORITY_OTHER;
        this.zza = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
    }

    private final void zzC() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzA() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzB() {
        return zzq() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final double zza() {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final float zzb() {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzd(int i10) {
        if (i10 < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = (this.zzh - this.zzi) + i10;
        if (i11 < 0) {
            throw new zzgzk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzk;
        if (i11 > i12) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i11;
        zzC();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zze() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzf() {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzg() {
        return zzi();
    }

    public final int zzh() throws zzgzk {
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzh = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int zzi() {
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zza;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzh = i14;
                return i10;
            }
        }
        return (int) zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzj() {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzk() {
        return zzgxt.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzl() throws zzgzk {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int iZzi = zzi();
        this.zzj = iZzi;
        if ((iZzi >>> 3) != 0) {
            return iZzi;
        }
        throw new zzgzk("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzm() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzn() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzo() {
        return zzq();
    }

    public final long zzp() throws zzgzk {
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzh = i10 + 8;
        long j = bArr[i10];
        long j4 = bArr[i10 + 2];
        long j10 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j4 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    public final long zzq() {
        long j;
        long j4;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zza;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzh = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j10 = (-2080896) ^ i18;
                            i13 = i17;
                            j = j10;
                        } else {
                            i15 = i10 + 5;
                            long j11 = (bArr[i17] << 28) ^ i18;
                            if (j11 >= 0) {
                                j = j11 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j12 = (bArr[i15] << 35) ^ j11;
                                if (j12 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j13 = j12 ^ (bArr[i13] << 42);
                                    if (j13 >= 0) {
                                        j = j13 ^ 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j12 = j13 ^ (bArr[i19] << 49);
                                        if (j12 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            long j14 = (j12 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                i13 = i10 + 10;
                                                if (bArr[i19] >= 0) {
                                                    j = j14;
                                                }
                                            } else {
                                                j = j14;
                                            }
                                        }
                                    }
                                    i13 = i19;
                                }
                                j = j12 ^ j4;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.zzh = i13;
                return j;
            }
        }
        return zzr();
    }

    public final long zzr() throws zzgzk {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.zzh;
            if (i11 == this.zzf) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.zza;
            this.zzh = i11 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i10;
            if ((bArr[i11] & 128) == 0) {
                return j;
            }
        }
        throw new zzgzk("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzs() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzt() {
        return zzgxt.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzu() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final zzgxn zzv() throws zzgzk {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzi <= i10 - i11) {
                zzgxn zzgxnVarZzv = zzgxn.zzv(this.zza, i11, iZzi);
                this.zzh += iZzi;
                return zzgxnVarZzv;
            }
        }
        if (iZzi == 0) {
            return zzgxn.zzb;
        }
        if (iZzi > 0) {
            int i12 = this.zzf;
            int i13 = this.zzh;
            if (iZzi <= i12 - i13) {
                int i14 = iZzi + i13;
                this.zzh = i14;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zza, i13, i14);
                zzgxn zzgxnVar = zzgxn.zzb;
                return new zzgxk(bArrCopyOfRange);
            }
        }
        if (iZzi <= 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzw() throws zzgzk {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzi <= i10 - i11) {
                String str = new String(this.zza, i11, iZzi, zzgzi.zza);
                this.zzh += iZzi;
                return str;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzx() throws zzgzk {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzi <= i10 - i11) {
                String strZzh = zzhbx.zzh(this.zza, i11, iZzi);
                this.zzh += iZzi;
                return strZzh;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi <= 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzy(int i10) throws zzgzk {
        if (this.zzj != i10) {
            throw new zzgzk("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzz(int i10) {
        this.zzk = i10;
        zzC();
    }
}
