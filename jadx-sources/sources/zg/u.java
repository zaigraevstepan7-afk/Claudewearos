package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f20621c;

    public u(String str, r rVar) {
        super(rVar);
        this.f20621c = str;
    }

    @Override // zg.n
    public final int b(n nVar) {
        return this.f20621c.compareTo(((u) nVar).f20621c);
    }

    @Override // zg.n
    public final int e() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f20621c.equals(uVar.f20621c) && this.f20609a.equals(uVar.f20609a);
    }

    @Override // zg.r
    public final String g(int i10) {
        int iB = y3.e.b(i10);
        String str = this.f20621c;
        if (iB == 0) {
            return i(i10) + "string:" + str;
        }
        if (iB != 1) {
            throw new IllegalArgumentException("Invalid hash version for string node: ".concat(y8.f.d(i10)));
        }
        return i(i10) + "string:" + ug.l.f(str);
    }

    @Override // zg.r
    public final Object getValue() {
        return this.f20621c;
    }

    public final int hashCode() {
        return this.f20609a.hashCode() + this.f20621c.hashCode();
    }

    @Override // zg.r
    public final r m(r rVar) {
        return new u(this.f20621c, rVar);
    }
}
