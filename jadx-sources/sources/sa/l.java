package sa;

import android.graphics.Rect;
import f1.h1;
import f1.q2;
import t.j1;
import wa.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14901c;

    public /* synthetic */ l(float f10, Object obj, int i10) {
        this.f14899a = i10;
        this.f14900b = f10;
        this.f14901c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f14899a;
        pi.o oVar = pi.o.f13011a;
        float f10 = this.f14900b;
        Object obj2 = this.f14901c;
        switch (i10) {
            case 0:
                q2 q2Var = (q2) obj2;
                v2.h0 h0Var = (v2.h0) obj;
                fj.l.f(h0Var, "$this$drawWithContent");
                h0Var.f();
                if (((Number) q2Var.getValue()).floatValue() > 0.0f) {
                    e2.d.P(h0Var, y9.a.l(qi.k.c0(new c2.w[]{new c2.w(c2.w.f3057g), new c2.w(c2.w.c(c2.w.f3052b, ((Number) q2Var.getValue()).floatValue()))}), f10, 8), 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (h0Var.f17669a.a() >> 32))) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), 0.0f, null, null, 6, 58);
                    break;
                }
                break;
            case 1:
                j1 j1Var = (j1) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = j1Var.g();
                h1 h1Var = j1Var.f15206g;
                if (!zG) {
                    if (h1Var.g() == Long.MIN_VALUE) {
                        h1Var.h(jLongValue);
                        j1Var.f15200a.f15224a.setValue(Boolean.TRUE);
                    }
                    long jG = jLongValue - h1Var.g();
                    if (f10 != 0.0f) {
                        jG = hj.a.I(jG / f10);
                    }
                    if (j1Var.f15201b == null) {
                        j1Var.f15205f.h(jG);
                    }
                    j1Var.h(jG, f10 == 0.0f);
                    break;
                }
                break;
            case 2:
                kj.d dVar = (kj.d) obj2;
                d3.i iVar = new d3.i(((Number) cg.b.r(Float.valueOf(f10), dVar)).floatValue(), dVar);
                lj.d[] dVarArr = d3.x.f4803a;
                d3.y yVar = d3.v.f4778c;
                lj.d dVar2 = d3.x.f4803a[1];
                ((d3.z) obj).b(yVar, iVar);
                break;
            case 3:
                q0 q0Var = (q0) obj2;
                c2.f0 f0Var = (c2.f0) obj;
                fj.l.f(f0Var, "$this$graphicsLayer");
                f0Var.p(f10);
                f0Var.j(f10);
                Rect rect = q0Var.f19141e;
                Rect rect2 = q0Var.f19142f;
                int iWidth = rect.width();
                if (iWidth < 1) {
                    iWidth = 1;
                }
                f0Var.J0(c2.e0.h((rect2.exactCenterX() - rect.left) / iWidth, (rect2.exactCenterY() - rect.top) / (rect.height() >= 1 ? r7 : 1)));
                break;
            default:
                ((g0.d) obj2).e(((Float) obj).floatValue() * f10);
                break;
        }
        return oVar;
    }

    public /* synthetic */ l(Object obj, float f10, int i10) {
        this.f14899a = i10;
        this.f14901c = obj;
        this.f14900b = f10;
    }
}
