package gi;

import c2.a1;
import c2.g0;
import f1.j1;
import f1.s;
import fj.l;
import ld.i;
import t.m1;
import t2.w;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements fi.a {

    /* renamed from: a, reason: collision with root package name */
    public final f2.b f7431a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f7432b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f7433c;

    /* renamed from: d, reason: collision with root package name */
    public fi.g f7434d;

    public d(f2.b bVar, ej.c cVar) {
        l.f(bVar, "graphicsLayer");
        l.f(cVar, "onDraw");
        this.f7431a = bVar;
        this.f7432b = cVar;
        this.f7433c = s.A(null);
    }

    @Override // fi.a
    public final boolean a() {
        return true;
    }

    @Override // fi.a
    public final void b(e2.d dVar, s3.c cVar, w wVar, ej.c cVar2) {
        w wVar2;
        long jE;
        l.f(dVar, "<this>");
        l.f(cVar, "density");
        if (wVar == null || (wVar2 = (w) this.f7433c.getValue()) == null) {
            return;
        }
        ac.d dVarC0 = dVar.C0();
        long jY = dVarC0.y();
        dVarC0.h().f();
        try {
            i iVar = (i) dVarC0.f373b;
            if (cVar2 != null) {
                c().f(iVar, cVar, cVar2);
            }
            try {
                jE = wVar2.C(wVar, 0L);
            } catch (Exception unused) {
                jE = b2.b.e(wVar.x(0L), wVar2.x(0L));
            }
            iVar.U(-Float.intBitsToFloat((int) (jE >> 32)), -Float.intBitsToFloat((int) (jE & 4294967295L)));
            v.C(dVar, this.f7431a);
        } finally {
            m1.r(dVarC0, jY);
        }
    }

    public final fi.g c() {
        fi.g gVar = this.f7434d;
        if (gVar != null) {
            gVar.f6761a = 9205357640488583168L;
            gVar.f6762b = 1.0f;
            gVar.f6763c = 1.0f;
            gVar.f6764d = 1.0f;
            gVar.f6765e = 1.0f;
            int i10 = g0.f2998b;
            gVar.f6766f = 0.0f;
            long j = a1.f2962b;
            gVar.f6767z = null;
            return gVar;
        }
        fi.g gVar2 = new fi.g();
        gVar2.f6761a = 9205357640488583168L;
        gVar2.f6762b = 1.0f;
        gVar2.f6763c = 1.0f;
        gVar2.f6764d = 1.0f;
        gVar2.f6765e = 1.0f;
        int i11 = g0.f2998b;
        long j4 = a1.f2962b;
        this.f7434d = gVar2;
        return gVar2;
    }
}
