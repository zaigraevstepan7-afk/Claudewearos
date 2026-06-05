package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o1 implements c2.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2509b;

    public /* synthetic */ o1(Object obj, int i10) {
        this.f2508a = i10;
        this.f2509b = obj;
    }

    @Override // c2.x
    public final long a() {
        switch (this.f2508a) {
            case 0:
                p1 p1Var = (p1) this.f2509b;
                long jA = p1Var.M.a();
                if (jA != 16) {
                    return jA;
                }
                y4 y4Var = (y4) v2.n.h(p1Var, a5.f1888a);
                if (y4Var != null) {
                    long j = y4Var.f2910a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((c2.w) v2.n.h(p1Var, g1.f2116a)).f3060a;
            default:
                return ((b5) this.f2509b).f1941c;
        }
    }
}
