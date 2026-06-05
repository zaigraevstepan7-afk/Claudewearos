package zg;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Double f20602c;

    public i(Double d10, r rVar) {
        super(rVar);
        this.f20602c = d10;
    }

    @Override // zg.n
    public final int b(n nVar) {
        return this.f20602c.compareTo(((i) nVar).f20602c);
    }

    @Override // zg.n
    public final int e() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f20602c.equals(iVar.f20602c) && this.f20609a.equals(iVar.f20609a);
    }

    @Override // zg.r
    public final String g(int i10) {
        return m1.v(i(i10), "number:") + ug.l.a(this.f20602c.doubleValue());
    }

    @Override // zg.r
    public final Object getValue() {
        return this.f20602c;
    }

    public final int hashCode() {
        return this.f20609a.hashCode() + this.f20602c.hashCode();
    }

    @Override // zg.r
    public final r m(r rVar) {
        ug.l.c(u0.l.j(rVar));
        return new i(this.f20602c, rVar);
    }
}
