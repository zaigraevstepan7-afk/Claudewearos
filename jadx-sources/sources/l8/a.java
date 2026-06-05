package l8;

import b4.e;
import fj.l;
import fj.w;
import java.util.Map;
import kk.c0;
import kk.k;
import kk.p;
import kk.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: c, reason: collision with root package name */
    public final k f10088c;

    public a(k kVar) {
        l.f(kVar, "delegate");
        this.f10088c = kVar;
    }

    @Override // kk.k
    public final e b(t tVar) {
        l.f(tVar, "path");
        e eVarB = this.f10088c.b(tVar);
        if (eVarB == null) {
            return null;
        }
        t tVar2 = (t) eVarB.f1535d;
        if (tVar2 == null) {
            return eVarB;
        }
        boolean z2 = eVarB.f1533b;
        boolean z10 = eVarB.f1534c;
        Long l10 = (Long) eVarB.f1536e;
        Long l11 = (Long) eVarB.f1537f;
        Long l12 = (Long) eVarB.f1538g;
        Long l13 = (Long) eVarB.f1539h;
        Map map = (Map) eVarB.f1540i;
        l.f(map, "extras");
        return new e(z2, z10, tVar2, l10, l11, l12, l13, map);
    }

    @Override // kk.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10088c.close();
    }

    @Override // kk.k
    public final p e(t tVar) {
        return this.f10088c.e(tVar);
    }

    @Override // kk.k
    public final c0 g(t tVar) {
        l.f(tVar, "file");
        return this.f10088c.g(tVar);
    }

    public final String toString() {
        return w.a(a.class).c() + '(' + this.f10088c + ')';
    }
}
