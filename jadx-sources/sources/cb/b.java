package cb;

import c1.k8;
import c1.l8;
import c1.p;
import c1.w0;
import c1.x0;
import c1.z4;
import c2.w;
import f1.i0;
import f1.s;
import nb.v;
import pi.o;
import ra.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f3148b;

    public /* synthetic */ b(int i10, int i11, ej.a aVar) {
        this.f3147a = i11;
        this.f3148b = aVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f3147a;
        ej.a aVar = this.f3148b;
        o oVar = o.f13011a;
        int i11 = 1;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    p1.e eVarD = p1.j.d(555500429, new b(i11, aVar), i0Var);
                    float f10 = l8.f2398a;
                    long j = w.f3057g;
                    long j4 = w.f3058h;
                    w0 w0Var = (w0) i0Var.j(x0.f2845a);
                    k8 k8Var = w0Var.Z;
                    if (k8Var == null) {
                        k8 k8Var2 = new k8(x0.c(w0Var, e1.f.f5393a), x0.c(w0Var, e1.f.f5395c), x0.c(w0Var, e1.f.f5394b), x0.c(w0Var, e1.f.f5397e), x0.c(w0Var, e1.f.f5398f), x0.c(w0Var, e1.f.f5396d));
                        w0Var.Z = k8Var2;
                        k8Var = k8Var2;
                    }
                    if (j == 16) {
                        j = k8Var.f2349a;
                    }
                    long j10 = j;
                    long j11 = j4 != 16 ? j4 : k8Var.f2350b;
                    long j12 = j4 != 16 ? j4 : k8Var.f2351c;
                    long j13 = j4 != 16 ? j4 : k8Var.f2352d;
                    long j14 = j4 != 16 ? j4 : k8Var.f2353e;
                    if (j4 == 16) {
                        j4 = k8Var.f2354f;
                    }
                    p.b(null, eVarD, null, 0.0f, null, new k8(j10, j11, j12, j13, j14, j4), i0Var, 390);
                    break;
                }
            case 1:
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    z4.f(1572864, null, null, this.f3148b, i0Var2, null, false);
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                a.b(aVar, (i0) obj, s.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                lb.c.e(aVar, (i0) obj, s.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                mb.a.k(aVar, (i0) obj, s.O(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                v.h(aVar, (i0) obj, s.O(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                o1.e(aVar, (i0) obj, s.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                y8.a.c(aVar, (i0) obj, s.O(1));
                break;
        }
        return oVar;
    }

    public /* synthetic */ b(int i10, ej.a aVar) {
        this.f3147a = i10;
        this.f3148b = aVar;
    }
}
