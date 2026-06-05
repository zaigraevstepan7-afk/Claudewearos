package ab;

import android.graphics.Rect;
import c1.y7;
import c2.e0;
import c2.f0;
import t.m1;
import t2.e1;
import t2.f1;
import v2.h0;
import x.d3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f312d;

    public /* synthetic */ l(float f10, Object obj, Object obj2, int i10) {
        this.f309a = i10;
        this.f310b = f10;
        this.f311c = obj;
        this.f312d = obj2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f309a) {
            case 0:
                Rect rect = (Rect) this.f311c;
                Rect rect2 = (Rect) this.f312d;
                f0 f0Var = (f0) obj;
                fj.l.f(f0Var, "$this$graphicsLayer");
                float f10 = this.f310b;
                f0Var.p(f10);
                f0Var.j(f10);
                int iWidth = rect.width();
                if (iWidth < 1) {
                    iWidth = 1;
                }
                f0Var.J0(e0.h((rect2.exactCenterX() - rect.left) / iWidth, (rect2.exactCenterY() - rect.top) / (rect.height() >= 1 ? r4 : 1)));
                break;
            case 1:
                f1 f1Var = (f1) this.f311c;
                e1 e1Var = (e1) obj;
                t.c cVar = ((y7) this.f312d).L;
                e1.D(e1Var, f1Var, (int) (cVar != null ? ((Number) cVar.e()).floatValue() : this.f310b), 0);
                break;
            case 2:
                float f11 = this.f310b;
                c2.g gVar = (c2.g) this.f311c;
                c2.n nVar = (c2.n) this.f312d;
                h0 h0Var = (h0) obj;
                h0Var.f();
                ac.d dVar = h0Var.f17669a.f5738b;
                long jY = dVar.y();
                dVar.h().f();
                try {
                    ld.i iVar = (ld.i) dVar.f373b;
                    iVar.U(f11, 0.0f);
                    iVar.R(0L, 45.0f);
                    e2.d.A0(h0Var, gVar, nVar, 46);
                    break;
                } finally {
                    m1.r(dVar, jY);
                }
            default:
                d3 d3Var = (d3) this.f311c;
                ej.c cVar2 = (ej.c) this.f312d;
                long jLongValue = ((Long) obj).longValue();
                if (d3Var.f19494b == Long.MIN_VALUE) {
                    d3Var.f19494b = jLongValue;
                }
                float f12 = d3Var.f19497e;
                t.l lVar = new t.l(f12);
                float f13 = this.f310b;
                t.l lVar2 = d3.f19492f;
                long jB = f13 == 0.0f ? d3Var.f19493a.b(new t.l(f12), lVar2, d3Var.f19495c) : hj.a.I((jLongValue - d3Var.f19494b) / f13);
                float f14 = ((t.l) d3Var.f19493a.d(jB, lVar, lVar2, d3Var.f19495c)).f15223a;
                d3Var.f19495c = (t.l) d3Var.f19493a.k(jB, lVar, lVar2, d3Var.f19495c);
                d3Var.f19494b = jLongValue;
                float f15 = d3Var.f19497e - f14;
                d3Var.f19497e = f14;
                cVar2.invoke(Float.valueOf(f15));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ l(f1 f1Var, y7 y7Var, float f10) {
        this.f309a = 1;
        this.f311c = f1Var;
        this.f312d = y7Var;
        this.f310b = f10;
    }

    public /* synthetic */ l(d3 d3Var, float f10, ej.c cVar) {
        this.f309a = 3;
        this.f311c = d3Var;
        this.f310b = f10;
        this.f312d = cVar;
    }
}
