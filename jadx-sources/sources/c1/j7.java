package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j7 implements c2.x, fj.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e4 f2299a;

    public j7(e4 e4Var) {
        this.f2299a = e4Var;
    }

    @Override // c2.x
    public final long a() {
        return ((c2.w) this.f2299a.get()).f3060a;
    }

    @Override // fj.h
    public final pi.c b() {
        return this.f2299a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c2.x) || !(obj instanceof fj.h)) {
            return false;
        }
        return this.f2299a.equals(((fj.h) obj).b());
    }

    public final int hashCode() {
        return this.f2299a.hashCode();
    }
}
