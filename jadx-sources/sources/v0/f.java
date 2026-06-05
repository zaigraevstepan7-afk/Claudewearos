package v0;

import android.graphics.Rect;
import c1.u5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17384a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pi.c f17386c;

    public /* synthetic */ f(ej.a aVar, boolean z2) {
        this.f17386c = aVar;
        this.f17385b = z2;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f17384a) {
            case 0:
                final ej.a aVar = (ej.a) this.f17386c;
                v1.o oVar = (v1.o) obj;
                f1.i0 i0Var = (f1.i0) obj2;
                ((Integer) obj3).getClass();
                i0Var.b0(-196777734);
                final long j = ((a1) i0Var.j(b1.f17363a)).f17349a;
                boolean zE = i0Var.e(j) | i0Var.f(aVar);
                final boolean z2 = this.f17385b;
                boolean zG = zE | i0Var.g(z2);
                Object objQ = i0Var.Q();
                if (zG || objQ == f1.m.f6385a) {
                    objQ = new ej.c() { // from class: v0.g
                        @Override // ej.c
                        public final Object invoke(Object obj4) {
                            z1.d dVar = (z1.d) obj4;
                            return dVar.f(new u5(aVar, z2, u3.c.f(dVar, Float.intBitsToFloat((int) (dVar.f20354a.a() >> 32)) / 2.0f), new c2.n(j, 5)));
                        }
                    };
                    i0Var.l0(objQ);
                }
                v1.o oVarF = z1.h.f(oVar, (ej.c) objQ);
                i0Var.p(false);
                return oVarF;
            default:
                ej.c cVar = (ej.c) this.f17386c;
                xa.f fVar = (xa.f) obj;
                Rect rect = (Rect) obj2;
                Rect rect2 = (Rect) obj3;
                fj.l.f(fVar, "app");
                fj.l.f(rect, "itemBounds");
                fj.l.f(rect2, "iconBounds");
                if (!this.f17385b) {
                    cVar.invoke(new wa.m0(fVar, rect, rect2));
                }
                return pi.o.f13011a;
        }
    }

    public /* synthetic */ f(ej.c cVar, boolean z2) {
        this.f17385b = z2;
        this.f17386c = cVar;
    }
}
