package mg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zg.l f11667a;

    /* renamed from: b, reason: collision with root package name */
    public final d f11668b;

    public a(d dVar, zg.l lVar) {
        this.f11667a = lVar;
        this.f11668b = dVar;
    }

    public final a a(String str) {
        return new a(this.f11668b.b(str), zg.l.e(this.f11667a.f20605a.l(new rg.h(str))));
    }

    public final boolean b() {
        return !this.f11667a.f20605a.isEmpty();
    }

    public final Object c(Class cls) {
        return vg.b.b(this.f11667a.f20605a.getValue(), cls);
    }

    public final String toString() {
        return "DataSnapshot { key = " + this.f11668b.d() + ", value = " + this.f11667a.f20605a.s(true) + " }";
    }
}
