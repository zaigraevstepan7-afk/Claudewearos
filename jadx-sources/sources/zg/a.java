package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20587c;

    public a(Boolean bool, r rVar) {
        super(rVar);
        this.f20587c = bool.booleanValue();
    }

    @Override // zg.n
    public final int b(n nVar) {
        boolean z2 = ((a) nVar).f20587c;
        boolean z10 = this.f20587c;
        if (z10 == z2) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    @Override // zg.n
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20587c == aVar.f20587c && this.f20609a.equals(aVar.f20609a);
    }

    @Override // zg.r
    public final String g(int i10) {
        return i(i10) + "boolean:" + this.f20587c;
    }

    @Override // zg.r
    public final Object getValue() {
        return Boolean.valueOf(this.f20587c);
    }

    public final int hashCode() {
        return this.f20609a.hashCode() + (this.f20587c ? 1 : 0);
    }

    @Override // zg.r
    public final r m(r rVar) {
        return new a(Boolean.valueOf(this.f20587c), rVar);
    }
}
