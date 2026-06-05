package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgan {
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
    public zzgan(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c6 = cArr[i10];
            boolean z2 = true;
            zzfve.zzg(c6 < '\u0080', "Non-ASCII character: %s", c6);
            if (bArr[c6] != -1) {
                z2 = false;
            }
            zzfve.zzg(z2, "Duplicate character: %s", c6);
            bArr[c6] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgan) {
            zzgan zzganVar = (zzgan) obj;
            if (this.zzi == zzganVar.zzi && Arrays.equals(this.zzf, zzganVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i10) {
        return this.zzf[i10];
    }

    public final int zzb(char c6) throws zzgaq {
        if (c6 > '\u007f') {
            throw new zzgaq("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c6))));
        }
        byte b10 = this.zzg[c6];
        if (b10 != -1) {
            return b10;
        }
        if (c6 <= ' ' || c6 == '\u007f') {
            throw new zzgaq("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c6))));
        }
        throw new zzgaq("Unrecognized character: " + c6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    public final zzgan zzc() {
        boolean z2;
        int i10 = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i10 >= length) {
                return this;
            }
            if (zzfuk.zze(cArr[i10])) {
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z2 = false;
                        break;
                    }
                    if (zzfuk.zzd(cArr[i11])) {
                        z2 = true;
                        break;
                    }
                    i11++;
                }
                zzfve.zzm(!z2, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i12 = 0; i12 < cArr.length; i12++) {
                    char c6 = cArr[i12];
                    if (zzfuk.zze(c6)) {
                        c6 ^= 32;
                    }
                    cArr2[i12] = (char) c6;
                }
                zzgan zzganVar = new zzgan(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzganVar.zzi) {
                    return zzganVar;
                }
                byte[] bArr = zzganVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i13 = 65; i13 <= 90; i13++) {
                    int i14 = i13 | 32;
                    byte b10 = bArr[i13];
                    byte b11 = bArr[i14];
                    if (b10 == -1) {
                        bArrCopyOf[i13] = b11;
                    } else {
                        char c10 = (char) i13;
                        char c11 = (char) i14;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzfvv.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c10), Character.valueOf(c11)));
                        }
                        bArrCopyOf[i14] = b10;
                    }
                }
                return new zzgan(zzganVar.zze.concat(".ignoreCase()"), zzganVar.zzf, bArrCopyOf, true);
            }
            i10++;
        }
    }

    public final boolean zzd(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final boolean zze(char c6) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgan(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzc = zzgbb.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzc;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzc);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = iZzc >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzgbb.zzb(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z2;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(m6.a.d(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
