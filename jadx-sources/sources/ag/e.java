package ag;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements nf.c {

    /* renamed from: c, reason: collision with root package name */
    public static final List f437c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f438d = new byte[16];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f439e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final ac.d f440a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f441b;

    public e(byte[] bArr) throws GeneralSecurityException {
        if (!gk.b.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f437c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(m6.a.h(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f441b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f440a = new ac.d(bArrCopyOfRange);
    }

    @Override // nf.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) k.f450b.f452a.q("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f441b, "AES"), new IvParameterSpec(bArr3));
        return cg.b.y(bArrC, cipher.doFinal(bArr));
    }

    @Override // nf.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) k.f450b.f452a.q("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f441b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrX;
        int length = bArr.length;
        ac.d dVar = this.f440a;
        if (length == 0) {
            return dVar.a(16, f439e);
        }
        byte[] bArrA = dVar.a(16, f438d);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = cg.b.X(u1.p.f(bArrA), dVar.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrA.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrA.length;
            bArrX = Arrays.copyOf(bArr3, bArr3.length);
            for (int i11 = 0; i11 < bArrA.length; i11++) {
                int i12 = length2 + i11;
                bArrX[i12] = (byte) (bArrX[i12] ^ bArrA[i11]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = Byte.MIN_VALUE;
            bArrX = cg.b.X(bArrCopyOf, u1.p.f(bArrA));
        }
        return dVar.a(16, bArrX);
    }
}
