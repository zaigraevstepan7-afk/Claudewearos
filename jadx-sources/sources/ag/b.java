package ag;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final a f425d = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428c;

    public b(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!gk.b.b(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        q.a(bArr.length);
        this.f426a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f425d.get()).getBlockSize();
        this.f428c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f427b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f425d.get();
        byte[] bArr4 = new byte[this.f428c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f427b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f426a;
        if (z2) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
