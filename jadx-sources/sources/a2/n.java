package a2;

import android.graphics.Canvas;
import c2.a1;
import f1.q2;
import s.s0;
import s.t0;
import s.y0;
import v2.d2;
import v2.e2;
import v2.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(e0 e0Var, q qVar, ej.c cVar) {
        super(1);
        this.f37a = 0;
        this.f38b = e0Var;
        this.f39c = qVar;
        this.f40d = (fj.m) cVar;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [ej.c, fj.m] */
    @Override // ej.c
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f37a) {
            case 0:
                e0 e0Var = (e0) obj;
                if (fj.l.b(e0Var, (e0) this.f38b)) {
                    zBooleanValue = false;
                } else {
                    if (fj.l.b(e0Var, ((q) this.f39c).f46c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((fj.m) this.f40d).invoke(e0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 1:
                return new b6.g((t1.q) this.f38b, this.f39c, (s.r) this.f40d, 2);
            case 2:
                c2.f0 f0Var = (c2.f0) obj;
                q2 q2Var = (q2) this.f39c;
                q2 q2Var2 = (q2) this.f38b;
                f0Var.m(q2Var2 != null ? ((Number) q2Var2.getValue()).floatValue() : 1.0f);
                f0Var.p(q2Var != null ? ((Number) q2Var.getValue()).floatValue() : 1.0f);
                f0Var.j(q2Var != null ? ((Number) q2Var.getValue()).floatValue() : 1.0f);
                q2 q2Var3 = (q2) this.f40d;
                f0Var.J0(q2Var3 != null ? ((a1) q2Var3.getValue()).f2964a : a1.f2962b);
                return pi.o.f13011a;
            case 3:
                s0 s0Var = (s0) this.f39c;
                t0 t0Var = (t0) this.f40d;
                int iOrdinal = ((s.g0) obj).ordinal();
                a1 a1Var = null;
                if (iOrdinal == 0) {
                    y0 y0Var = s0Var.f14672a.f14585d;
                    if (y0Var != null) {
                        a1Var = new a1(y0Var.f14702a);
                    } else {
                        y0 y0Var2 = t0Var.f14677a.f14585d;
                        if (y0Var2 != null) {
                            a1Var = new a1(y0Var2.f14702a);
                        }
                    }
                } else if (iOrdinal == 1) {
                    a1Var = (a1) this.f38b;
                } else {
                    if (iOrdinal != 2) {
                        throw new b3.e();
                    }
                    y0 y0Var3 = t0Var.f14677a.f14585d;
                    if (y0Var3 != null) {
                        a1Var = new a1(y0Var3.f14702a);
                    } else {
                        y0 y0Var4 = s0Var.f14672a.f14585d;
                        if (y0Var4 != null) {
                            a1Var = new a1(y0Var4.f14702a);
                        }
                    }
                }
                return new a1(a1Var != null ? a1Var.f2964a : a1.f2962b);
            case 4:
                e2.d dVar = (e2.d) obj;
                v2.h0 h0Var = (v2.h0) this.f38b;
                v2.m mVar = h0Var.f17670b;
                h0Var.f17670b = (v2.m) this.f39c;
                try {
                    s3.c cVarK = dVar.C0().k();
                    s3.m mVarS = dVar.C0().s();
                    c2.u uVarH = dVar.C0().h();
                    long jY = dVar.C0().y();
                    f2.b bVar = (f2.b) dVar.C0().f374c;
                    ej.c cVar = (ej.c) this.f40d;
                    s3.c cVarK2 = h0Var.C0().k();
                    s3.m mVarS2 = h0Var.C0().s();
                    c2.u uVarH2 = h0Var.C0().h();
                    long jY2 = h0Var.C0().y();
                    f2.b bVar2 = (f2.b) h0Var.C0().f374c;
                    ac.d dVarC0 = h0Var.C0();
                    dVarC0.O(cVarK);
                    dVarC0.P(mVarS);
                    dVarC0.N(uVarH);
                    dVarC0.Q(jY);
                    dVarC0.f374c = bVar;
                    uVarH.f();
                    try {
                        cVar.invoke(h0Var);
                        h0Var.f17670b = mVar;
                        return pi.o.f13011a;
                    } finally {
                        uVarH.q();
                        ac.d dVarC02 = h0Var.C0();
                        dVarC02.O(cVarK2);
                        dVarC02.P(mVarS2);
                        dVarC02.N(uVarH2);
                        dVarC02.Q(jY2);
                        dVarC02.f374c = bVar2;
                    }
                } catch (Throwable th2) {
                    h0Var.f17670b = mVar;
                    throw th2;
                }
            case 5:
                v3.w wVar = (v3.w) this.f38b;
                v2.f0 f0Var2 = (v2.f0) this.f39c;
                v3.w wVar2 = (v3.w) this.f40d;
                c2.u uVarH3 = ((e2.d) obj).C0().h();
                if (wVar.getView().getVisibility() != 8) {
                    wVar.R = true;
                    r1 r1Var = f0Var2.G;
                    w2.t tVar = r1Var instanceof w2.t ? (w2.t) r1Var : null;
                    if (tVar != null) {
                        Canvas canvasA = c2.c.a(uVarH3);
                        tVar.getAndroidViewsHandler$ui().getClass();
                        wVar2.draw(canvasA);
                    }
                    wVar.R = false;
                }
                return pi.o.f13011a;
            default:
                e2 e2Var = (e2) obj;
                y1.e eVar = (y1.e) e2Var;
                if (!((y1.b) ((w2.t) v2.n.z((y1.e) this.f39c)).m15getDragAndDropManager()).f20158b.contains(eVar) || !u1.p.c(eVar, u2.b.k((w8.h) this.f40d))) {
                    return d2.f17606a;
                }
                ((fj.v) this.f38b).f6807a = e2Var;
                return d2.f17608c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f37a = i10;
        this.f38b = obj;
        this.f39c = obj2;
        this.f40d = obj3;
    }
}
