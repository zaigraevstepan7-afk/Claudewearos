package of;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements nf.a {

    /* renamed from: a, reason: collision with root package name */
    public final ac.d f12448a;

    /* renamed from: b, reason: collision with root package name */
    public final lh.e f12449b;

    /* renamed from: c, reason: collision with root package name */
    public final lh.e f12450c;

    public d(ac.d dVar) throws GeneralSecurityException {
        this.f12448a = dVar;
        boolean zIsEmpty = ((xf.a) dVar.f375d).f20047a.isEmpty();
        lh.e eVar = uf.q.f17058a;
        if (zIsEmpty) {
            this.f12449b = eVar;
            this.f12450c = eVar;
            return;
        }
        uf.f fVar = (uf.f) uf.g.f17037b.f17039a.get();
        fVar = fVar == null ? uf.g.f17038c : fVar;
        uf.q.a(dVar);
        fVar.getClass();
        this.f12449b = eVar;
        this.f12450c = eVar;
    }

    @Override // nf.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        lh.e eVar = this.f12449b;
        nf.k kVar = (nf.k) this.f12448a.f374c;
        try {
            byte[] bArr3 = kVar.f12326c;
            byte[] bArrY = cg.b.y(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((nf.a) kVar.f12325b).a(bArr, bArr2));
            int i10 = kVar.f12329f;
            int length = bArr.length;
            eVar.getClass();
            return bArrY;
        } catch (GeneralSecurityException e10) {
            eVar.getClass();
            throw e10;
        }
    }

    @Override // nf.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        ac.d dVar = this.f12448a;
        lh.e eVar = this.f12450c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = dVar.x(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((nf.a) ((nf.k) it.next()).f12325b).b(bArrCopyOfRange, bArr2);
                    eVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e10) {
                    e.f12451a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                }
            }
        }
        Iterator it2 = dVar.x(nf.b.f12312a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((nf.a) ((nf.k) it2.next()).f12325b).b(bArr, bArr2);
                eVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        eVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
