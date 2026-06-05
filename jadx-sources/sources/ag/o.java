package ag;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final yf.a f454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455b;

    public o(yf.a aVar, int i10) throws InvalidAlgorithmParameterException {
        this.f454a = aVar;
        this.f455b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(i10, new byte[0]);
    }

    @Override // nf.j
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // nf.j
    public final byte[] b(byte[] bArr) {
        return this.f454a.a(this.f455b, bArr);
    }
}
