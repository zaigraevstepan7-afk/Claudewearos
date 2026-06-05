package vf;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h implements nf.m {

    /* renamed from: a, reason: collision with root package name */
    public static final h f18046a = new h();

    @Override // nf.m
    public final Object a(ac.d dVar) throws GeneralSecurityException {
        if (((nf.k) dVar.f374c) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentMap) dVar.f373b).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new g();
    }

    @Override // nf.m
    public final Class b() {
        return f.class;
    }

    @Override // nf.m
    public final Class c() {
        return f.class;
    }
}
