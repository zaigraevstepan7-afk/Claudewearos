package y;

import t.u0;
import x.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements b, z4.d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20155a;

    public /* synthetic */ n(Object obj) {
        this.f20155a = obj;
    }

    @Override // y.b
    public Object a(s1 s1Var, Float f10, Float f11, ej.c cVar, f fVar) {
        float fFloatValue = f10.floatValue();
        float fFloatValue2 = f11.floatValue();
        Object objB = k.b(s1Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, t.d.b(0.0f, fFloatValue2, 28), (u0) this.f20155a, cVar, fVar);
        return objB == ui.a.f17085a ? objB : (a) objB;
    }

    public void b(Object obj) {
        a5.d dVar = (a5.d) obj;
        fj.l.f(dVar, "e");
        qj.l lVar = (qj.l) this.f20155a;
        if (lVar.u()) {
            lVar.resumeWith(uk.c.r(dVar));
        }
    }

    public void c(Object obj) {
        z4.k kVar = (z4.k) obj;
        fj.l.f(kVar, "result");
        qj.l lVar = (qj.l) this.f20155a;
        if (lVar.u()) {
            lVar.resumeWith(kVar);
        }
    }
}
