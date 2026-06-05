package sf;

import ac.d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import lh.e;
import nf.k;
import uf.f;
import uf.g;
import uf.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements nf.c {

    /* renamed from: a, reason: collision with root package name */
    public final d f15025a;

    /* renamed from: b, reason: collision with root package name */
    public final e f15026b;

    /* renamed from: c, reason: collision with root package name */
    public final e f15027c;

    public b(d dVar) throws GeneralSecurityException {
        this.f15025a = dVar;
        boolean zIsEmpty = ((xf.a) dVar.f375d).f20047a.isEmpty();
        e eVar = q.f17058a;
        if (zIsEmpty) {
            this.f15026b = eVar;
            this.f15027c = eVar;
            return;
        }
        f fVar = (f) g.f17037b.f17039a.get();
        fVar = fVar == null ? g.f17038c : fVar;
        q.a(dVar);
        fVar.getClass();
        this.f15026b = eVar;
        this.f15027c = eVar;
    }

    @Override // nf.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        e eVar = this.f15026b;
        k kVar = (k) this.f15025a.f374c;
        try {
            byte[] bArr3 = kVar.f12326c;
            byte[] bArrY = cg.b.y(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((nf.c) kVar.f12325b).a(bArr, bArr2));
            int i10 = kVar.f12329f;
            eVar.getClass();
            return bArrY;
        } catch (GeneralSecurityException e10) {
            eVar.getClass();
            throw e10;
        }
    }

    @Override // nf.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        d dVar = this.f15025a;
        e eVar = this.f15027c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = dVar.x(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((nf.c) ((k) it.next()).f12325b).b(bArrCopyOfRange, bArr2);
                    eVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e10) {
                    c.f15028a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                }
            }
        }
        Iterator it2 = dVar.x(nf.b.f12312a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((nf.c) ((k) it2.next()).f12325b).b(bArr, bArr2);
                eVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        eVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
