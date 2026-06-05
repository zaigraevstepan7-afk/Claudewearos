package d1;

import c1.e4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements j0, fj.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e4 f4484a;

    public c1(e4 e4Var) {
        this.f4484a = e4Var;
    }

    @Override // d1.j0
    public final float a() {
        return ((Number) this.f4484a.get()).floatValue();
    }

    @Override // fj.h
    public final pi.c b() {
        return this.f4484a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0) || !(obj instanceof fj.h)) {
            return false;
        }
        return this.f4484a.equals(((fj.h) obj).b());
    }

    public final int hashCode() {
        return this.f4484a.hashCode();
    }
}
