package fi;

import f1.j1;
import f1.s;
import fj.l;
import g3.n0;
import k0.e1;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public m f6773a;

    /* renamed from: b, reason: collision with root package name */
    public long f6774b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6775c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6776d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6777e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6778f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6779g;

    public k(ej.a aVar) {
        l.f(aVar, "shapeBlock");
        this.f6775c = aVar;
        this.f6774b = 9205357640488583168L;
        this.f6779g = new j(this, 0);
    }

    public static void a(k kVar, m mVar, s3.c cVar, n0 n0Var, int i10) {
        if ((i10 & 1) != 0) {
            mVar = kVar.f6773a;
        }
        if ((i10 & 2) != 0) {
            cVar = (s3.c) kVar.f6775c;
        }
        k3.i iVar = (k3.i) kVar.f6776d;
        if ((i10 & 8) != 0) {
            n0Var = (n0) kVar.f6777e;
        }
        Object obj = kVar.f6778f;
        m mVar2 = kVar.f6773a;
        j1 j1Var = (j1) kVar.f6779g;
        if (mVar == mVar2 && l.b(cVar, (s3.c) kVar.f6775c) && l.b(iVar, (k3.i) kVar.f6776d) && l.b(n0Var, (n0) kVar.f6777e)) {
            if (l.b(obj, kVar.f6778f)) {
                return;
            }
            kVar.f6778f = obj;
            j1Var.setValue(Boolean.TRUE);
            return;
        }
        kVar.f6773a = mVar;
        kVar.f6775c = cVar;
        kVar.f6776d = iVar;
        kVar.f6777e = n0Var;
        j1Var.setValue(Boolean.TRUE);
    }

    public k(m mVar, s3.c cVar, k3.i iVar, n0 n0Var, Object obj) {
        this.f6773a = mVar;
        this.f6775c = cVar;
        this.f6776d = iVar;
        this.f6777e = n0Var;
        this.f6778f = obj;
        this.f6779g = s.A(Boolean.TRUE);
        this.f6774b = e1.a((n0) this.f6777e, (s3.c) this.f6775c, (k3.i) this.f6776d, e1.f9075a, 1);
    }
}
