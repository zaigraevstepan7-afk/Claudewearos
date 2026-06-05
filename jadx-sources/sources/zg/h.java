package zg;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Map f20601c;

    public h(Map map, r rVar) {
        super(rVar);
        this.f20601c = map;
    }

    @Override // zg.n
    public final /* bridge */ /* synthetic */ int b(n nVar) {
        return 0;
    }

    @Override // zg.n
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20601c.equals(hVar.f20601c) && this.f20609a.equals(hVar.f20609a);
    }

    @Override // zg.r
    public final String g(int i10) {
        return i(i10) + "deferredValue:" + this.f20601c;
    }

    @Override // zg.r
    public final Object getValue() {
        return this.f20601c;
    }

    public final int hashCode() {
        return this.f20609a.hashCode() + this.f20601c.hashCode();
    }

    @Override // zg.r
    public final r m(r rVar) {
        ug.l.c(u0.l.j(rVar));
        return new h(this.f20601c, rVar);
    }
}
