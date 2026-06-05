package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgwm implements zzgrc {
    private static final ThreadLocal zza = new zzgwl();
    private final SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public zzgwm(byte[] bArr) throws GeneralSecurityException {
        zzgwq.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKeySpec);
        byte[] bArrZza = zzgqt.zza(cipherZzb.doFinal(new byte[16]));
        this.zzc = bArrZza;
        this.zzd = zzgqt.zza(bArrZza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzglu.zza(1)) {
            return (Cipher) zza.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrc
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArrZzc;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zzb;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKey);
        int length = bArr.length;
        int i11 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i12 = i11 - 1;
        int i13 = i12 * 16;
        if (i11 * 16 == length) {
            bArrZzc = zzgvs.zzc(bArr, i13, this.zzc, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = this.zzd;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrZzc = zzgvs.zzc(bArrCopyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i14 = 0; i14 < i12; i14++) {
            zzc(bArr3, bArr, i14 * 16, bArr4);
            if (cipherZzb.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zzc(bArr3, bArrZzc, 0, bArr4);
        if (cipherZzb.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i10 == 16 ? bArr3 : Arrays.copyOf(bArr3, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
