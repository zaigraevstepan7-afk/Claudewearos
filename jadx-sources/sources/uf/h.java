package uf;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f17040b = new h();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17041a = new AtomicReference(new o(new qh.c(10)));

    public final Class a(Class cls) {
        HashMap map = ((o) this.f17041a.get()).f17051b;
        if (map.containsKey(cls)) {
            return ((nf.m) map.get(cls)).b();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(l lVar) {
        qh.c cVar = new qh.c((o) this.f17041a.get());
        cVar.K(lVar);
        this.f17041a.set(new o(cVar));
    }
}
