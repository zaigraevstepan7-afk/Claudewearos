package vf;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import t.m1;
import zf.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class m {
    static {
        of.f[] fVarArr = {new of.f(nf.j.class, 11)};
        HashMap map = new HashMap();
        of.f fVar = fVarArr[0];
        Class cls = fVar.f12453a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(m1.h(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f12453a;
        Collections.unmodifiableMap(map);
        int i10 = r1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        nf.n.h(p.f18063c);
        nf.n.h(h.f18046a);
        nf.n.f(new b(), true);
        uf.k kVar = l.f18054a;
        uf.i iVar = uf.i.f17042b;
        iVar.e(l.f18054a);
        iVar.d(l.f18055b);
        iVar.c(l.f18056c);
        iVar.b(l.f18057d);
        uf.h hVar = uf.h.f17040b;
        hVar.b(b.f18023f);
        if (rf.a.a()) {
            return;
        }
        nf.n.f(new b(zf.b.class, new of.f[]{new of.f(nf.j.class, 10)}), true);
        iVar.e(e.f18042a);
        iVar.d(e.f18043b);
        iVar.c(e.f18044c);
        iVar.b(e.f18045d);
        hVar.b(b.f18022e);
    }
}
