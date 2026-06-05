package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.i1 f2003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.f f2004c;

    public d0(long j, b0.i1 i1Var, ej.f fVar) {
        this.f2002a = j;
        this.f2003b = i1Var;
        this.f2004c = fVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            d1.i.b(this.f2002a, ((o8) i0Var.j(p8.f2587a)).f2553m, p1.j.d(417635459, new c0(0, this.f2003b, this.f2004c), i0Var), i0Var, 384);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
