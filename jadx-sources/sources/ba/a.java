package ba;

import c2.w0;
import ej.f;
import f1.i0;
import fj.l;
import v.t;
import v1.o;
import z1.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f1635b;

    public /* synthetic */ a(w0 w0Var, int i10) {
        this.f1634a = i10;
        this.f1635b = w0Var;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        o oVar = (o) obj;
        i0 i0Var = (i0) obj2;
        Integer num = (Integer) obj3;
        switch (this.f1634a) {
            case 0:
                num.intValue();
                l.f(oVar, "$this$modifyIf");
                i0Var.b0(-569761184);
                o oVarC = h.c(oVar, this.f1635b);
                i0Var.p(false);
                return oVarC;
            case 1:
                num.getClass();
                l.f(oVar, "$this$modifyIf");
                i0Var.b0(-1346631558);
                o oVarC2 = oVar.c(new t(1, ((ha.b) i0Var.j(ha.d.f7768a)).f7761k, this.f1635b));
                i0Var.p(false);
                return oVarC2;
            default:
                num.getClass();
                l.f(oVar, "$this$modifyIf");
                i0Var.b0(494600893);
                o oVarC3 = oVar.c(new t(1, ((ha.b) i0Var.j(ha.d.f7768a)).f7761k, this.f1635b));
                i0Var.p(false);
                return oVarC3;
        }
    }
}
