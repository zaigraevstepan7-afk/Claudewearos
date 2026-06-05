package ag;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h implements nf.a {

    /* renamed from: a, reason: collision with root package name */
    public final m f445a;

    /* renamed from: b, reason: collision with root package name */
    public final nf.j f446b;

    /* renamed from: c, reason: collision with root package name */
    public final int f447c;

    public h(m mVar, nf.j jVar, int i10) {
        this.f445a = mVar;
        this.f446b = jVar;
        this.f447c = i10;
    }

    @Override // nf.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        b bVar = (b) this.f445a;
        bVar.getClass();
        int length = bArr.length;
        int i10 = bVar.f427b;
        int i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10;
        if (length > i11) {
            throw new GeneralSecurityException(m6.a.d(i11, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i10];
        byte[] bArrA = p.a(i10);
        System.arraycopy(bArrA, 0, bArr3, 0, i10);
        bVar.a(bArr, 0, bArr.length, bArr3, bVar.f427b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return cg.b.y(bArr3, this.f446b.b(cg.b.y(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // nf.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f447c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i10, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f446b.a(bArrCopyOfRange2, cg.b.y(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        b bVar = (b) this.f445a;
        bVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i11 = bVar.f427b;
        if (length2 < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i11);
        int length3 = bArrCopyOfRange.length;
        int i12 = bVar.f427b;
        byte[] bArr4 = new byte[length3 - i12];
        bVar.a(bArrCopyOfRange, i12, bArrCopyOfRange.length - i12, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
