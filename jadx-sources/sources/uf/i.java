package uf;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import zf.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f17042b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17043a = new AtomicReference(new t(new wh.s(11)));

    public final nf.b a(p pVar) {
        AtomicReference atomicReference = this.f17043a;
        t tVar = (t) atomicReference.get();
        tVar.getClass();
        bg.a aVar = (bg.a) pVar.f17053b;
        if (!tVar.f17064b.containsKey(new r(p.class, aVar))) {
            try {
                e eVar = new e();
                ((w0) pVar.f17055d).ordinal();
                return eVar;
            } catch (GeneralSecurityException e10) {
                throw new b3.e("Creating a LegacyProtoKey failed", e10);
            }
        }
        t tVar2 = (t) atomicReference.get();
        tVar2.getClass();
        r rVar = new r(p.class, aVar);
        HashMap map = tVar2.f17064b;
        if (map.containsKey(rVar)) {
            return ((a) map.get(rVar)).f17033b.a(pVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + rVar + " available");
    }

    public final synchronized void b(a aVar) {
        wh.s sVar = new wh.s((t) this.f17043a.get());
        sVar.n(aVar);
        this.f17043a.set(new t(sVar));
    }

    public final synchronized void c(c cVar) {
        wh.s sVar = new wh.s((t) this.f17043a.get());
        sVar.o(cVar);
        this.f17043a.set(new t(sVar));
    }

    public final synchronized void d(j jVar) {
        wh.s sVar = new wh.s((t) this.f17043a.get());
        sVar.p(jVar);
        this.f17043a.set(new t(sVar));
    }

    public final synchronized void e(k kVar) {
        wh.s sVar = new wh.s((t) this.f17043a.get());
        sVar.q(kVar);
        this.f17043a.set(new t(sVar));
    }
}
