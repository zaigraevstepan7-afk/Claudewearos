package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f1 extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f17640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(i1 i1Var, int i10) {
        super(0);
        this.f17639a = i10;
        this.f17640b = i1Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f17639a) {
            case 0:
                i1 i1Var = this.f17640b;
                c2.u uVar = i1Var.f17684a0;
                fj.l.c(uVar);
                i1Var.q1(uVar, i1Var.Z);
                break;
            default:
                i1 i1Var2 = this.f17640b.J;
                if (i1Var2 != null) {
                    i1Var2.D1();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
