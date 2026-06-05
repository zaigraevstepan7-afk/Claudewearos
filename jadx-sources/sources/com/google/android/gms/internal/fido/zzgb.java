package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;
import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c6 = cArr[i10];
            boolean z2 = true;
            zzbm.zzd(c6 < '\u0080', "Non-ASCII character: %s", c6);
            if (bArr[c6] != -1) {
                z2 = false;
            }
            zzbm.zzd(z2, "Duplicate character: %s", c6);
            bArr[c6] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.zzh == zzgbVar.zzh && Arrays.equals(this.zzf, zzgbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i10) {
        return this.zzf[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    public final zzgb zzb() {
        int i10;
        boolean z2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i12 >= cArr.length) {
                return this;
            }
            if (zzba.zza(cArr[i12])) {
                int i13 = 0;
                while (true) {
                    if (i13 >= cArr.length) {
                        z2 = false;
                        break;
                    }
                    char c6 = cArr[i13];
                    if (c6 >= 'A' && c6 <= 'Z') {
                        z2 = true;
                        break;
                    }
                    i13++;
                }
                zzbm.zzf(!z2, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i11 >= cArr3.length) {
                        break;
                    }
                    char c10 = cArr3[i11];
                    if (zzba.zza(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i11] = (char) c10;
                    i11++;
                }
                zzgb zzgbVar = new zzgb(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzgbVar.zzh) {
                    return zzgbVar;
                }
                byte[] bArr = zzgbVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i10 = 65; i10 <= 90; i10++) {
                    int i14 = i10 | 32;
                    byte[] bArr2 = zzgbVar.zzg;
                    byte b10 = bArr2[i10];
                    byte b11 = bArr2[i14];
                    if (b10 == -1) {
                        bArrCopyOf[i10] = b11;
                    } else {
                        char c11 = (char) i10;
                        char c12 = (char) i14;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzbo.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                        bArrCopyOf[i14] = b10;
                    }
                }
                return new zzgb(zzgbVar.zze.concat(".ignoreCase()"), zzgbVar.zzf, bArrCopyOf, true);
            }
            i12++;
        }
    }

    public final boolean zzc(char c6) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgb(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzgh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzgh.zza(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z2;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(a.d(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
