package y8;

import b0.t1;
import f1.i0;
import java.util.List;
import pi.o;
import v1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f20266a;

    public i(List list) {
        this.f20266a = list;
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
            h hVar = (h) this.f20266a.get(iIntValue);
            i0Var.b0(-1902493664);
            a.b(hVar.f20262a, hVar.f20263b, hVar.f20264c, hVar.f20265d, i0Var, 0);
            b0.d.e(i0Var, t1.e(12, l.f17564b));
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        return o.f13011a;
    }
}
