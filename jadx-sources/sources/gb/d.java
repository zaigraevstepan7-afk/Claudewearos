package gb;

import androidx.lifecycle.h0;
import c2.w0;
import f1.i0;
import f1.q2;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7275a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7279e;

    public /* synthetic */ d(float f10, boolean z2, z zVar, t.c cVar) {
        this.f7277c = f10;
        this.f7276b = z2;
        this.f7278d = zVar;
        this.f7279e = cVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        v1.o oVarL;
        switch (this.f7275a) {
            case 0:
                z zVar = (z) this.f7278d;
                t.c cVar = (t.c) this.f7279e;
                hb.h hVar = (hb.h) obj;
                b2.b bVar = (b2.b) obj3;
                fj.l.f(hVar, "$this$DampedDragAnimation");
                float fIntBitsToFloat = ((Float.intBitsToFloat((int) (bVar.f1500a >> 32)) / this.f7277c) * (this.f7276b ? 1.0f : -1.0f)) + ((Number) hVar.f7807l.f15111e.getValue()).floatValue();
                float f10 = 2;
                if (fIntBitsToFloat < 0.0f) {
                    fIntBitsToFloat = 0.0f;
                }
                if (fIntBitsToFloat <= f10) {
                    f10 = fIntBitsToFloat;
                }
                hVar.d(f10);
                b0.w(zVar, null, new h0(cVar, bVar, null, 10), 3);
                return pi.o.f13011a;
            default:
                w0 w0Var = (w0) this.f7278d;
                q2 q2Var = (q2) this.f7279e;
                v1.o oVar = (v1.o) obj;
                i0 i0Var = (i0) obj2;
                ((Integer) obj3).getClass();
                fj.l.f(oVar, "$this$modifyIf");
                i0Var.b0(456580753);
                if (this.f7276b) {
                    oVarL = yd.f.U(((Number) q2Var.getValue()).floatValue(), 46, w0Var, oVar);
                } else {
                    float f11 = (float) 0.8d;
                    oVarL = a.a.L(oVar, w0Var, 0L, f11, f11, this.f7277c, 66);
                }
                i0Var.p(false);
                return oVarL;
        }
    }

    public /* synthetic */ d(boolean z2, w0 w0Var, float f10, q2 q2Var) {
        this.f7276b = z2;
        this.f7278d = w0Var;
        this.f7277c = f10;
        this.f7279e = q2Var;
    }
}
