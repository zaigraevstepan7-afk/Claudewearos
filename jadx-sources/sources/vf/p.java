package vf;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p implements nf.m {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f18061a = Logger.getLogger(p.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18062b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final p f18063c = new p();

    @Override // nf.m
    public final Object a(ac.d dVar) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) dVar.f373b).values().iterator();
        while (it.hasNext()) {
            for (nf.k kVar : (List) it.next()) {
                nf.b bVar = kVar.f12331h;
                if (bVar instanceof n) {
                    n nVar = (n) bVar;
                    byte[] bArr = kVar.f12326c;
                    bg.a aVarA = bg.a.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(nVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + nVar.c() + " has wrong output prefix (" + nVar.b() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new o(dVar);
    }

    @Override // nf.m
    public final Class b() {
        return nf.j.class;
    }

    @Override // nf.m
    public final Class c() {
        return nf.j.class;
    }
}
