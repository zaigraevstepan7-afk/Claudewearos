package ua;

import f1.i0;
import f1.m;
import java.util.List;
import java.util.Set;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f16927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f16928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f16929c;

    public j(List list, Set set, ej.c cVar) {
        this.f16927a = list;
        this.f16928b = set;
        this.f16929c = cVar;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        d0.c cVar = (d0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        i0 i0Var = (i0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (i0Var.f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= i0Var.d(iIntValue) ? 32 : 16;
        }
        if (i0Var.T(i10 & 1, (i10 & 147) != 146)) {
            xa.f fVar = (xa.f) this.f16927a.get(iIntValue);
            i0Var.b0(-849960565);
            String str = fVar.f19863b;
            Set set = this.f16928b;
            boolean zContains = set.contains(str);
            ej.c cVar2 = this.f16929c;
            boolean zF = i0Var.f(cVar2) | i0Var.h(set) | i0Var.f(fVar);
            Object objQ = i0Var.Q();
            if (zF || objQ == m.f6385a) {
                objQ = new i(cVar2, set, fVar);
                i0Var.l0(objQ);
            }
            k.a(fVar, zContains, (ej.c) objQ, i0Var, 0);
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        return o.f13011a;
    }
}
