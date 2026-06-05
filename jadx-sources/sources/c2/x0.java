package c2;

import android.content.res.Resources;
import android.graphics.Rect;
import b0.c1;
import c1.z3;
import com.google.android.gms.internal.ads.zzbch;
import f1.q2;
import java.util.List;
import java.util.Map;
import t.g1;
import t.m1;
import t2.v1;
import t2.w1;
import t2.x1;
import t2.y1;
import v2.d2;
import v2.g2;
import v2.i1;
import w2.k1;
import w2.l1;
import w2.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, int i10) {
        super(1);
        this.f3061a = i10;
        this.f3062b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [t2.f1, v2.a] */
    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f3061a;
        int i11 = 0;
        ti.c cVar = null;
        pi.o oVar = pi.o.f13011a;
        Object obj2 = this.f3062b;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) obj;
                y0 y0Var = (y0) obj2;
                f0Var.p(y0Var.H);
                f0Var.j(y0Var.I);
                f0Var.m(y0Var.J);
                f0Var.s(0.0f);
                f0Var.h(0.0f);
                f0Var.d(y0Var.K);
                f0Var.w(0.0f);
                f0Var.b(0.0f);
                f0Var.g(0.0f);
                f0Var.u(y0Var.L);
                f0Var.J0(y0Var.M);
                f0Var.y(y0Var.N);
                f0Var.q(y0Var.O);
                f0Var.k(null);
                f0Var.n(y0Var.P);
                f0Var.t(y0Var.Q);
                f0Var.U(y0Var.R);
                f0Var.i(y0Var.S);
                f0Var.o(y0Var.T);
                return oVar;
            case 1:
                d3.x.d((d3.z) obj, ((d3.j) obj2).f4723a);
                return oVar;
            case 2:
                d3.x.c((d3.z) obj, (String) obj2);
                return oVar;
            case 3:
                ((List) obj).add((Float) ((f0.u0) obj2).a());
                return true;
            case 4:
                e2.d dVar = (e2.d) obj;
                f2.b bVar = (f2.b) obj2;
                j jVar = bVar.f6524l;
                if (bVar.f6526n && bVar.f6535w && jVar != null) {
                    ac.d dVarC0 = dVar.C0();
                    long jY = dVarC0.y();
                    dVarC0.h().f();
                    try {
                        ((ac.d) ((ld.i) dVarC0.f373b).f10924b).h().m(jVar);
                        bVar.c(dVar);
                    } finally {
                        m1.r(dVarC0, jY);
                    }
                } else {
                    bVar.c(dVar);
                }
                return oVar;
            case 5:
                a5.d dVar2 = (a5.d) obj;
                fj.l.f(dVar2, "e");
                g5.d dVar3 = (g5.d) obj2;
                dVar3.f().execute(new g5.b(dVar3, dVar2, i11));
                return oVar;
            case 6:
                i2.c0 c0Var = (i2.c0) obj;
                i2.c cVar2 = (i2.c) obj2;
                cVar2.g(c0Var);
                ej.c cVar3 = cVar2.f8185i;
                if (cVar3 != null) {
                    cVar3.invoke(c0Var);
                }
                return oVar;
            case 7:
                a5.d dVar4 = (a5.d) obj;
                fj.l.f(dVar4, "e");
                i5.c cVar4 = (i5.c) obj2;
                cVar4.g().execute(new i5.b(cVar4, dVar4, i11));
                return oVar;
            case 8:
                Throwable th2 = (Throwable) obj;
                p2.o0 o0Var = (p2.o0) obj2;
                qj.l lVar = o0Var.f12749c;
                if (lVar != null) {
                    lVar.x(th2);
                }
                o0Var.f12749c = null;
                return oVar;
            case 9:
                return obj == ((q.b0) obj2) ? "(this)" : String.valueOf(obj);
            case 10:
                return obj == ((q.d0) obj2) ? "(this)" : String.valueOf(obj);
            case 11:
                return obj == ((q.h0) obj2) ? "(this)" : String.valueOf(obj);
            case 12:
                return Boolean.valueOf(fj.l.b(obj, obj2));
            case 13:
                g1 g1Var = (g1) obj;
                s.q qVar = (s.q) obj2;
                if (fj.l.b(g1Var.b(), qVar.J.b())) {
                    int i12 = s.j.f14633b;
                } else {
                    q2 q2Var = (q2) qVar.J.f14668c.g(g1Var.b());
                    if (q2Var != null) {
                        long j = ((s3.l) q2Var.getValue()).f14751a;
                    }
                }
                q2 q2Var2 = (q2) qVar.J.f14668c.g(g1Var.c());
                if (q2Var2 != null) {
                    long j4 = ((s3.l) q2Var2.getValue()).f14751a;
                }
                if (((s.a1) qVar.I.getValue()) == null) {
                    return t.d.s(0.0f, 400.0f, null, 5);
                }
                long j10 = 1;
                return t.d.s(0.0f, 400.0f, new s3.l((j10 & 4294967295L) | (j10 << 32)), 1);
            case 14:
                t.o oVar2 = (t.o) obj;
                float f10 = oVar2.f15240b;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = oVar2.f15241c;
                if (f11 < -0.5f) {
                    f11 = -0.5f;
                }
                if (f11 > 0.5f) {
                    f11 = 0.5f;
                }
                float f12 = oVar2.f15242d;
                float f13 = f12 >= -0.5f ? f12 : -0.5f;
                float f14 = f13 <= 0.5f ? f13 : 0.5f;
                float f15 = oVar2.f15239a;
                float f16 = f15 >= 0.0f ? f15 : 0.0f;
                return new w(w.b(e0.b(f10, f11, f14, f16 <= 1.0f ? f16 : 1.0f, d2.d.f4652x), (d2.c) obj2));
            case 15:
                v2.a aVar = (v2.a) obj;
                v2.g0 g0Var = (v2.g0) obj2;
                if (aVar.Q() != Integer.MAX_VALUE) {
                    if (aVar.f().f17653b) {
                        aVar.j0();
                    }
                    for (Map.Entry entry : aVar.f().f17660i.entrySet()) {
                        v2.g0.a(g0Var, (t2.a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.A());
                    }
                    i1 i1Var = aVar.A().J;
                    fj.l.c(i1Var);
                    while (!i1Var.equals(g0Var.f17652a.A())) {
                        for (t2.a aVar2 : g0Var.b(i1Var).keySet()) {
                            v2.g0.a(g0Var, aVar2, g0Var.c(i1Var, aVar2), i1Var);
                        }
                        i1Var = i1Var.J;
                        fj.l.c(i1Var);
                    }
                }
                return oVar;
            case 16:
                ((g1.e) obj2).b((v1.m) obj);
                return Boolean.TRUE;
            case 17:
                ((v2.f0) obj2).Z((s3.c) obj);
                return oVar;
            case 18:
                b2.c cVar5 = (b2.c) obj;
                v3.o oVar3 = (v3.o) obj2;
                if (oVar3.G) {
                    qj.b0.w(oVar3.e1(), null, new t0.f(oVar3, cVar5, cVar, 8), 3);
                }
                return oVar;
            case 19:
                return Boolean.valueOf(((a2.e0) obj).x1(((a2.f) obj2).f19a));
            case 20:
                v2.k0 k0Var = (v2.k0) obj;
                w2.t tVar = ((w2.k) obj2).I;
                if (tVar.getInsetsListener().f15631z.g() > 0) {
                    q.v vVar = x1.f15670a;
                    k0Var.f17706a = true;
                    v2.n0 n0Var = k0Var.f17709d;
                    t2.w wVarZ0 = n0Var.Z0();
                    if (s3.j.a(k0Var.f17707b, 9223372034707292159L)) {
                        k0Var.f17707b = yd.f.d0(wVarZ0.X(0L));
                        k0Var.f17708c = wVarZ0.I();
                    }
                    n0Var.d1().Z.b();
                    long jI = wVarZ0.I();
                    q.g0 g0Var2 = tVar.getInsetsListener().f15630f;
                    int i13 = (int) (jI >> 32);
                    int i14 = (int) (jI & 4294967295L);
                    for (v1 v1Var : x1.f15671b) {
                        Object objG = g0Var2.g(v1Var);
                        fj.l.c(objG);
                        y1 y1Var = (y1) objG;
                        w1 w1Var = (w1) v1Var;
                        x1.a(k0Var, w1Var.f15666c, y1Var.f15680h, i13, i14);
                        if (((Boolean) y1Var.f15674b.getValue()).booleanValue()) {
                            x1.a(k0Var, y1Var.f15678f, y1Var.j, i13, i14);
                            x1.a(k0Var, y1Var.f15679g, y1Var.f15682k, i13, i14);
                        }
                        x1.a(k0Var, w1Var.f15667d, y1Var.f15681i, i13, i14);
                    }
                    q.b0 b0Var = tVar.getInsetsListener().A;
                    if (b0Var.i()) {
                        t1.q qVar2 = tVar.getInsetsListener().B;
                        Object[] objArr = b0Var.f13033a;
                        int i15 = b0Var.f13034b;
                        while (i11 < i15) {
                            f1.a1 a1Var = (f1.a1) objArr[i11];
                            t2.p pVar = (t2.p) qVar2.get(i11);
                            Rect rect = (Rect) a1Var.getValue();
                            k0Var.f(pVar.b(), rect.left);
                            k0Var.f(pVar.d(), rect.top);
                            k0Var.f(pVar.c(), rect.right);
                            k0Var.f(pVar.a(), rect.bottom);
                            i11++;
                        }
                    }
                }
                return oVar;
            case zzbch.zzt.zzm /* 21 */:
                return Boolean.valueOf(((q.k) obj2).a(((d3.r) obj).f4768f));
            case 22:
                return Boolean.valueOf(w2.f0.c((d3.r) obj, (Resources) obj2));
            case 23:
                return new z3((w2.i1) obj2, 12);
            case 24:
                if (k1.f18310b.compareAndSet(false, true)) {
                    ((sj.c) obj2).h(oVar);
                }
                return oVar;
            case 25:
                e2.d dVar5 = (e2.d) obj;
                u uVarH = dVar5.C0().h();
                ej.e eVar = ((l1) obj2).f18319d;
                if (eVar != null) {
                    eVar.invoke(uVarH, (f2.b) dVar5.C0().f374c);
                }
                return oVar;
            case 26:
                l3.k kVar = (l3.k) obj;
                t0.r rVar = kVar.f9921b;
                if (rVar != null) {
                    kVar.a(rVar);
                    kVar.f9921b = null;
                }
                o1 o1Var = (o1) obj2;
                g1.e eVar2 = o1Var.f18345d;
                Object[] objArr2 = eVar2.f7024a;
                int i16 = eVar2.f7026c;
                while (true) {
                    if (i11 >= i16) {
                        i11 = -1;
                    } else if (!fj.l.b((g2) objArr2[i11], kVar)) {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    eVar2.l(i11);
                }
                if (eVar2.f7026c == 0) {
                    o1Var.f18343b.a();
                }
                return oVar;
            case 27:
                y1.e eVar3 = (y1.e) obj;
                if (!eVar3.f17565a.G) {
                    return d2.f17607b;
                }
                y1.e eVar4 = eVar3.I;
                if (eVar4 != null) {
                    x0 x0Var = new x0((w8.h) obj2, 27);
                    if (x0Var.invoke(eVar4) == d2.f17606a) {
                        v2.n.E(eVar4, x0Var);
                    }
                }
                eVar3.I = null;
                eVar3.H = null;
                return d2.f17606a;
            case 28:
                v2.h0 h0Var = (v2.h0) obj;
                ((c1) obj2).invoke(h0Var);
                h0Var.f();
                return oVar;
            default:
                f0 f0Var2 = (f0) obj;
                z1.o oVar4 = (z1.o) obj2;
                f0Var2.d(f0Var2.e() * oVar4.f20367b);
                f0Var2.y(oVar4.f20368c);
                f0Var2.q(oVar4.f20369d);
                f0Var2.n(oVar4.f20370e);
                f0Var2.t(oVar4.f20371f);
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(s.q qVar, long j) {
        super(1);
        this.f3061a = 13;
        this.f3062b = qVar;
    }
}
