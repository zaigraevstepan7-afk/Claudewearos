package vf;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import uf.q;
import zf.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final ac.d f18058a;

    /* renamed from: b, reason: collision with root package name */
    public final lh.e f18059b;

    /* renamed from: c, reason: collision with root package name */
    public final lh.e f18060c;

    public o(ac.d dVar) throws GeneralSecurityException {
        this.f18058a = dVar;
        boolean zIsEmpty = ((xf.a) dVar.f375d).f20047a.isEmpty();
        lh.e eVar = q.f17058a;
        if (zIsEmpty) {
            this.f18059b = eVar;
            this.f18060c = eVar;
            return;
        }
        uf.f fVar = (uf.f) uf.g.f17037b.f17039a.get();
        fVar = fVar == null ? uf.g.f17038c : fVar;
        q.a(dVar);
        fVar.getClass();
        this.f18059b = eVar;
        this.f18060c = eVar;
    }

    @Override // nf.j
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        lh.e eVar = this.f18060c;
        if (length <= 5) {
            eVar.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        ac.d dVar = this.f18058a;
        for (nf.k kVar : dVar.x(bArrCopyOf)) {
            try {
                ((nf.j) kVar.f12325b).a(bArrCopyOfRange, kVar.f12328e.equals(q1.LEGACY) ? cg.b.y(bArr2, p.f18062b) : bArr2);
                eVar.getClass();
                return;
            } catch (GeneralSecurityException e10) {
                p.f18061a.info("tag prefix matches a key, but cannot verify: " + e10);
            }
        }
        Iterator it = dVar.x(nf.b.f12312a).iterator();
        while (it.hasNext()) {
            try {
                ((nf.j) ((nf.k) it.next()).f12325b).a(bArr, bArr2);
                eVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        eVar.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // nf.j
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        lh.e eVar = this.f18059b;
        nf.k kVar = (nf.k) this.f18058a.f374c;
        if (kVar.f12328e.equals(q1.LEGACY)) {
            bArr = cg.b.y(bArr, p.f18062b);
        }
        try {
            byte[] bArr2 = kVar.f12326c;
            byte[] bArrY = cg.b.y(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((nf.j) kVar.f12325b).b(bArr));
            int i10 = kVar.f12329f;
            eVar.getClass();
            return bArrY;
        } catch (GeneralSecurityException e10) {
            eVar.getClass();
            throw e10;
        }
    }
}
