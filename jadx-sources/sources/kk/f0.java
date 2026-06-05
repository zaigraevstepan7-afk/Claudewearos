package kk;

import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f0 extends k {

    /* renamed from: f, reason: collision with root package name */
    public static final t f9696f;

    /* renamed from: c, reason: collision with root package name */
    public final t f9697c;

    /* renamed from: d, reason: collision with root package name */
    public final k f9698d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9699e;

    static {
        String str = t.f9726b;
        f9696f = lh.e.f("/");
    }

    public f0(t tVar, k kVar, LinkedHashMap linkedHashMap) {
        fj.l.f(kVar, "fileSystem");
        this.f9697c = tVar;
        this.f9698d = kVar;
        this.f9699e = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // kk.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b4.e b(kk.t r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.f0.b(kk.t):b4.e");
    }

    @Override // kk.k
    public final p e(t tVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // kk.k
    public final c0 g(t tVar) throws Throwable {
        Throwable th2;
        x xVarJ;
        fj.l.f(tVar, "file");
        t tVar2 = f9696f;
        tVar2.getClass();
        lk.h hVar = (lk.h) this.f9699e.get(lk.c.b(tVar2, tVar, true));
        if (hVar == null) {
            throw new FileNotFoundException("no such file: " + tVar);
        }
        long j = hVar.f11022f;
        p pVarE = this.f9698d.e(this.f9697c);
        try {
            xVarJ = u6.v.j(pVarE.b(hVar.f11024h));
            try {
                pVarE.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (pVarE != null) {
                try {
                    pVarE.close();
                } catch (Throwable th5) {
                    mk.b.i(th4, th5);
                }
            }
            th2 = th4;
            xVarJ = null;
        }
        if (th2 != null) {
            throw th2;
        }
        fj.l.f(xVarJ, "<this>");
        lk.b.g(xVarJ, null);
        if (hVar.f11023g == 0) {
            return new lk.e(xVarJ, j, true);
        }
        return new lk.e(new o(u6.v.j(new lk.e(xVarJ, hVar.f11021e, true)), new Inflater(true)), j, false);
    }
}
