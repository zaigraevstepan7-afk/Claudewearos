package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f17717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f17720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, long j, long j4, v1 v1Var) {
        super(0);
        this.f17717a = n0Var;
        this.f17718b = j;
        this.f17719c = j4;
        this.f17720d = v1Var;
    }

    @Override // ej.a
    public final Object a() {
        n0 n0Var = this.f17717a;
        n0Var.h1().f17706a = false;
        n0Var.h1().f17707b = this.f17718b;
        n0Var.h1().f17708c = this.f17719c;
        ej.c cVarH = this.f17720d.f17795a.h();
        if (cVarH != null) {
            cVarH.invoke(n0Var.h1());
        }
        return pi.o.f13011a;
    }
}
