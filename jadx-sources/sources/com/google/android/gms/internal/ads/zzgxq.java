package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgxq extends zzgxt {
    private final InputStream zza;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgxq(InputStream inputStream, int i10, zzgxs zzgxsVar) {
        super(null);
        this.zzl = f.API_PRIORITY_OTHER;
        byte[] bArr = zzgzi.zzb;
        this.zza = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zza.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzK(int i10) throws zzgzk {
        if (zzL(i10)) {
            return;
        }
        if (i10 <= (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzL(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 <= i13) {
            throw new IllegalStateException(m6.a.e(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.zzk;
        if (i10 > (f.API_PRIORITY_OTHER - i14) - i11 || i14 + i11 + i10 > this.zzl) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzk + i11;
            this.zzk = i14;
            i13 = this.zzg - i11;
            this.zzg = i13;
            this.zzi = 0;
        }
        try {
            int i15 = this.zza.read(this.zzf, i13, Math.min(4096 - i13, (f.API_PRIORITY_OTHER - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= 4096) {
                if (i15 <= 0) {
                    return false;
                }
                this.zzg += i15;
                zzJ();
                return this.zzg >= i10 || zzL(i10);
            }
            throw new IllegalStateException(String.valueOf(this.zza.getClass()) + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
        } catch (zzgzk e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzM(int i10, boolean z2) throws IOException {
        byte[] bArrZzN = zzN(i10);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i10) throws IOException {
        if (i10 == 0) {
            return zzgzi.zzb;
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzgzk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzC((i14 - i11) - i12);
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zza.available()) {
                    return null;
                }
            } catch (zzgzk e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zza.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i17;
                i15 += i17;
            } catch (zzgzk e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzA() {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzB() {
        return zzq() != 0;
    }

    public final void zzC(int i10) throws zzgzk {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzk;
        int i15 = i14 + i12;
        int i16 = this.zzl;
        if (i15 + i10 > i16) {
            zzC((i16 - i14) - i12);
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i15;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i10) {
            try {
                long j = i10 - i13;
                try {
                    long jSkip = this.zza.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.zza.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzgzk e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzk += i13;
                zzJ();
                throw th2;
            }
        }
        this.zzk += i13;
        zzJ();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        zzK(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
                zzK(1);
            }
        }
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
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzd(int i10) throws zzgzk {
        if (i10 < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.zzk + this.zzi + i10;
        if (i11 < 0) {
            throw new zzgzk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i11;
        zzJ();
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
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzK(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int zzi() {
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
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
                this.zzi = i14;
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
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzK(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j = bArr[i10];
        long j4 = bArr[i10 + 2];
        long j10 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j4 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    public final long zzq() {
        long j;
        long j4;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
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
                this.zzi = i13;
                return j;
            }
        }
        return zzr();
    }

    public final long zzr() throws zzgzk {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.zzi == this.zzg) {
                zzK(1);
            }
            byte[] bArr = this.zzf;
            int i11 = this.zzi;
            this.zzi = i11 + 1;
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
    public final zzgxn zzv() throws IOException {
        int iZzi = zzi();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzi <= i10 - i11 && iZzi > 0) {
            zzgxn zzgxnVarZzv = zzgxn.zzv(this.zzf, i11, iZzi);
            this.zzi += iZzi;
            return zzgxnVarZzv;
        }
        if (iZzi == 0) {
            return zzgxn.zzb;
        }
        if (iZzi < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzN = zzN(iZzi);
        if (bArrZzN != null) {
            return zzgxn.zzv(bArrZzN, 0, bArrZzN.length);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(iZzi - i14);
        byte[] bArr = new byte[iZzi];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        zzgxn zzgxnVar = zzgxn.zzb;
        return new zzgxk(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzw() throws zzgzk {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzi <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzi, zzgzi.zza);
                this.zzi += iZzi;
                return str;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzi > this.zzg) {
            return new String(zzM(iZzi, false), zzgzi.zza);
        }
        zzK(iZzi);
        String str2 = new String(this.zzf, this.zzi, iZzi, zzgzi.zza);
        this.zzi += iZzi;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzx() throws IOException {
        byte[] bArrZzM;
        int iZzi = zzi();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (iZzi <= i11 - i10 && iZzi > 0) {
            bArrZzM = this.zzf;
            this.zzi = i10 + iZzi;
        } else {
            if (iZzi == 0) {
                return "";
            }
            if (iZzi < 0) {
                throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iZzi <= i11) {
                zzK(iZzi);
                bArrZzM = this.zzf;
                this.zzi = iZzi;
            } else {
                bArrZzM = zzM(iZzi, false);
            }
        }
        return zzhbx.zzh(bArrZzM, i10, iZzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzy(int i10) throws zzgzk {
        if (this.zzj != i10) {
            throw new zzgzk("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzz(int i10) {
        this.zzl = i10;
        zzJ();
    }
}
