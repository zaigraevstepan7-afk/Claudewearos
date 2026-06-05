package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;
import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzft {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzft(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c6 = cArr[i10];
            boolean z2 = true;
            zzff.zzc(c6 < '\u0080', "Non-ASCII character: %s", c6);
            if (bArr[c6] != -1) {
                z2 = false;
            }
            zzff.zzc(z2, "Duplicate character: %s", c6);
            bArr[c6] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzft) && Arrays.equals(this.zzf, ((zzft) obj).zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i10) {
        return this.zzf[i10];
    }

    public final int zzb(char c6) throws zzfw {
        if (c6 > '\u007f') {
            throw new zzfw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c6))));
        }
        byte b10 = this.zzg[c6];
        if (b10 != -1) {
            return b10;
        }
        if (c6 <= ' ' || c6 == '\u007f') {
            throw new zzfw("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c6))));
        }
        throw new zzfw("Unrecognized character: " + c6);
    }

    public final boolean zzc(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final boolean zzd(char c6) {
        return this.zzg[61] != -1;
    }

    private zzft(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzga.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzga.zza(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(a.d(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
