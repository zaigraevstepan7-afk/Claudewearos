package ag;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements nf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f435a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f436b;

    public d(byte[] bArr, int i10) throws GeneralSecurityException {
        this.f435a = i10;
        switch (i10) {
            case 1:
                this.f436b = new pf.d(bArr, 0);
                return;
            case 2:
                this.f436b = new pf.d(bArr, 1);
                return;
            default:
                if (!gk.b.b(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f436b = new pf.b(bArr);
                return;
        }
    }

    @Override // nf.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f435a) {
            case 0:
                byte[] bArrA = p.a(12);
                pf.b bVar = (pf.b) this.f436b;
                boolean z2 = bVar.f12876b;
                if (bArrA.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArr3 = new byte[z2 ? bArr.length + 28 : bArr.length + 16];
                if (z2) {
                    System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecA = pf.b.a(bArrA);
                a aVar = pf.b.f12874c;
                ((Cipher) aVar.get()).init(1, bVar.f12875a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) aVar.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, z2 ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(m6.a.e(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = p.a(12);
                byteBufferAllocate.put(bArrA2);
                ((pf.d) this.f436b).b(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = p.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((pf.d) this.f436b).b(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // nf.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f435a) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                pf.b bVar = (pf.b) this.f436b;
                boolean z2 = bVar.f12876b;
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length < (z2 ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z2 && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecA = pf.b.a(bArrCopyOf);
                a aVar = pf.b.f12874c;
                ((Cipher) aVar.get()).init(2, bVar.f12875a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) aVar.get()).updateAAD(bArr2);
                }
                int i10 = z2 ? 12 : 0;
                int length = bArr.length;
                if (z2) {
                    length -= 12;
                }
                return ((Cipher) aVar.get()).doFinal(bArr, i10, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((pf.d) this.f436b).a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((pf.d) this.f436b).a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
