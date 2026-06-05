package i0;

import f1.i0;
import f1.m;
import t.m1;
import v.a1;
import v.x0;
import v1.l;
import v1.o;
import z.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f8072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.a f8075d;

    public b(a1 a1Var, boolean z2, boolean z10, ej.a aVar) {
        this.f8072a = a1Var;
        this.f8073b = z2;
        this.f8074c = z10;
        this.f8075d = aVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        i0 i0Var = (i0) obj2;
        ((Number) obj3).intValue();
        i0Var.b0(-1525724089);
        Object objQ = i0Var.Q();
        if (objQ == m.f6385a) {
            objQ = m1.p(i0Var);
        }
        k kVar = (k) objQ;
        o oVarC = x0.a(l.f17564b, kVar, this.f8072a).c(new a(this.f8073b, kVar, null, this.f8074c, this.f8075d));
        i0Var.p(false);
        return oVarC;
    }
}
