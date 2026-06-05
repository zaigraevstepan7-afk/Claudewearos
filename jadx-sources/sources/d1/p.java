package d1;

import c1.w6;
import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements x.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final w6 f4551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f4552b;

    public p(q qVar) {
        this.f4552b = qVar;
        this.f4551a = new w6(qVar, 1);
    }

    @Override // x.r0
    public final Object a(w6.z zVar, x.l0 l0Var) {
        Object objB = this.f4552b.b(f1.f17190b, new o(this, zVar, null), l0Var);
        return objB == ui.a.f17085a ? objB : pi.o.f13011a;
    }
}
