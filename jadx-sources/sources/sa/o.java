package sa;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f14916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f14917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14918d;

    public o(List list, Map map, ej.c cVar, boolean z2) {
        this.f14915a = list;
        this.f14916b = map;
        this.f14917c = cVar;
        this.f14918d = z2;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        Object obj5 = (e0.i) obj;
        int iIntValue = ((Number) obj2).intValue();
        f1.i0 i0Var = (f1.i0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (i0Var.f(obj5) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= i0Var.d(iIntValue) ? 32 : 16;
        }
        if (i0Var.T(i10 & 1, (i10 & 147) != 146)) {
            na.b bVar = (na.b) this.f14915a.get(iIntValue);
            i0Var.b0(128184448);
            Iterable iterable = (List) this.f14916b.get(bVar.f11968a);
            if (iterable == null) {
                iterable = qi.s.f13520a;
            }
            List listM0 = qi.l.M0(iterable, 4);
            ej.c cVar = this.f14917c;
            boolean zF = i0Var.f(cVar) | i0Var.f(bVar);
            Object objQ = i0Var.Q();
            if (zF || objQ == f1.m.f6385a) {
                objQ = new n(0, cVar, bVar);
                i0Var.l0(objQ);
            }
            p.b(bVar, listM0, (ej.a) objQ, null, this.f14918d, i0Var, 0);
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
