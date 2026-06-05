package f0;

import c1.b8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final s1.b f6101a;

    /* renamed from: b, reason: collision with root package name */
    public final b8 f6102b;

    /* renamed from: c, reason: collision with root package name */
    public final q.g0 f6103c;

    public a0(s1.b bVar, b8 b8Var) {
        this.f6101a = bVar;
        this.f6102b = b8Var;
        long[] jArr = q.n0.f13108a;
        this.f6103c = new q.g0();
    }

    public final ej.e a(int i10, Object obj, Object obj2) {
        q.g0 g0Var = this.f6103c;
        z zVar = (z) g0Var.g(obj);
        if (zVar != null && zVar.f6223c == i10 && fj.l.b(zVar.f6222b, obj2)) {
            p1.e eVar = zVar.f6224d;
            if (eVar != null) {
                return eVar;
            }
            p1.e eVar2 = new p1.e(new ab.g(6, zVar.f6225e, zVar), true, 818252804);
            zVar.f6224d = eVar2;
            return eVar2;
        }
        z zVar2 = new z(this, i10, obj, obj2);
        g0Var.m(obj, zVar2);
        p1.e eVar3 = zVar2.f6224d;
        if (eVar3 != null) {
            return eVar3;
        }
        p1.e eVar4 = new p1.e(new ab.g(6, this, zVar2), true, 818252804);
        zVar2.f6224d = eVar4;
        return eVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        z zVar = (z) this.f6103c.g(obj);
        if (zVar != null) {
            return zVar.f6222b;
        }
        b0 b0Var = (b0) this.f6102b.a();
        int iD = b0Var.d(obj);
        if (iD != -1) {
            return b0Var.c(iD);
        }
        return null;
    }
}
