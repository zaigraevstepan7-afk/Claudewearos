package k0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import c1.z4;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import x.j2;
import x.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9319d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i10) {
        this.f9316a = i10;
        this.f9317b = obj;
        this.f9318c = obj2;
        this.f9319d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List] */
    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9316a;
        f1.f fVar = f1.m.f6385a;
        pi.o oVar = pi.o.f13011a;
        Object obj3 = this.f9319d;
        Object obj4 = this.f9318c;
        Object obj5 = this.f9317b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                s.f((v1.o) obj5, (v0.u0) obj4, (p1.e) obj3, (f1.i0) obj, f1.s.O(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                lb.r.f((String) obj4, (String) obj3, (v1.o) obj5, (f1.i0) obj, f1.s.O(7));
                break;
            case 2:
                ej.c cVar = (ej.c) obj5;
                f1.a1 a1Var = (f1.a1) obj4;
                f1.a1 a1Var2 = (f1.a1) obj3;
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    boolean zF = i0Var.f(cVar);
                    Object objQ = i0Var.Q();
                    if (zF || objQ == fVar) {
                        objQ = new nb.c(cVar, a1Var, a1Var2, 0);
                        i0Var.l0(objQ);
                    }
                    z4.i((ej.a) objQ, null, false, null, null, null, nb.a.f11971a, i0Var, 805306368, 510);
                    break;
                }
            case 3:
                v1.o oVar2 = (v1.o) obj5;
                f1.a1 a1Var3 = (f1.a1) obj4;
                p1.e eVar = (p1.e) obj3;
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    Object objQ2 = i0Var2.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new ab.i(a1Var3, 17);
                        i0Var2.l0(objQ2);
                    }
                    v1.o oVarM = t2.z.m(oVar2, (ej.c) objQ2);
                    t2.q0 q0VarD = b0.r.d(v1.b.f17547a, true);
                    int iHashCode = Long.hashCode(i0Var2.T);
                    f1.n1 n1VarL = i0Var2.l();
                    v1.o oVarC = v1.a.c(i0Var2, oVarM);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar2);
                    } else {
                        i0Var2.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
                    f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                    f1.s.M(v2.g.f17650g, i0Var2, Integer.valueOf(iHashCode));
                    f1.s.I(v2.g.f17651h, i0Var2);
                    f1.s.M(v2.g.f17647d, i0Var2, oVarC);
                    eVar.invoke(i0Var2, 0);
                    i0Var2.p(true);
                    break;
                }
            case 4:
                t1.q qVar = (t1.q) obj5;
                lb.g gVar = (lb.g) obj3;
                xa.f fVar3 = (xa.f) obj;
                Rect rect = (Rect) obj2;
                eb.j jVar = eb.j.f5901a;
                fj.l.f(fVar3, "app");
                fj.l.f(rect, "iconBounds");
                b2.c cVar2 = (b2.c) ((f1.a1) obj4).getValue();
                if (cVar2 != null) {
                    long j = fVar3.f19862a;
                    ListIterator listIterator = qVar.listIterator();
                    int i11 = 0;
                    while (true) {
                        ri.a aVar = (ri.a) listIterator;
                        if (!aVar.hasNext()) {
                            i11 = -1;
                        } else if (((eb.k) aVar.next()).f5904a != j) {
                            i11++;
                        }
                    }
                    int i12 = i11 >= 0 ? ((eb.k) qVar.get(i11)).f5909f + 1 : 0;
                    int i13 = rect.left;
                    int i14 = (int) cVar2.f1502a;
                    int i15 = rect.top;
                    int i16 = (int) cVar2.f1503b;
                    s3.k kVar = new s3.k(i13 - i14, i15 - i16, rect.right - i14, rect.bottom - i16);
                    Bitmap bitmap = fVar3.f19864c.f19855a;
                    String str = fVar3.f19863b;
                    eb.j jVar2 = eb.j.f5901a;
                    eb.k kVar2 = new eb.k(j, kVar, bitmap, str, jVar, i12, false);
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator2 = qVar.listIterator();
                    while (true) {
                        ri.a aVar2 = (ri.a) listIterator2;
                        if (!aVar2.hasNext()) {
                            ArrayList arrayListN0 = arrayList;
                            if (gVar.f10289a.getBoolean("open_animation_limit_concurrent", false)) {
                                arrayListN0 = qi.l.N0(1, arrayList);
                            }
                            ArrayList arrayListJ0 = qi.l.J0(arrayListN0, kVar2);
                            qVar.clear();
                            qVar.addAll(arrayListJ0);
                            break;
                        } else {
                            eb.k kVarA = (eb.k) aVar2.next();
                            if (kVarA.f5904a == j) {
                                kVarA = null;
                            } else if (kVarA.f5908e == eb.j.f5901a) {
                                kVarA = eb.k.a(kVarA, 111);
                            }
                            if (kVarA != null) {
                                arrayList.add(kVarA);
                            }
                        }
                    }
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                sa.g.b((List) obj4, (v1.o) obj5, (ej.c) obj3, (f1.i0) obj, f1.s.O(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                va.a.a((mi.p) obj5, (ej.a) obj4, (ej.a) obj3, (f1.i0) obj, f1.s.O(49));
                break;
            default:
                fj.s sVar = (fj.s) obj5;
                l2 l2Var = (l2) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = l2Var.h(l2Var.d(fFloatValue - sVar.f6804a));
                l2 l2Var2 = ((j2) obj3).f19583a;
                sVar.f6804a += l2Var.d(l2Var.g(l2Var2.c(l2Var2.f19622k, jH, 1)));
                break;
        }
        return oVar;
    }

    public /* synthetic */ x(Object obj, Object obj2, pi.c cVar, int i10, int i11) {
        this.f9316a = i11;
        this.f9317b = obj;
        this.f9318c = obj2;
        this.f9319d = cVar;
    }

    public /* synthetic */ x(String str, String str2, v1.o oVar, int i10) {
        this.f9316a = 1;
        this.f9318c = str;
        this.f9319d = str2;
        this.f9317b = oVar;
    }

    public /* synthetic */ x(List list, v1.o oVar, ej.c cVar, int i10) {
        this.f9316a = 5;
        this.f9318c = list;
        this.f9317b = oVar;
        this.f9319d = cVar;
    }
}
