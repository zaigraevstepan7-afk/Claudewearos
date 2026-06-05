package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q extends f {
    @Override // zg.f
    /* renamed from: b */
    public final int compareTo(r rVar) {
        return rVar == this ? 0 : 1;
    }

    @Override // zg.f, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((r) obj) == this ? 0 : 1;
    }

    @Override // zg.f
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // zg.f, zg.r
    public final boolean h(c cVar) {
        return false;
    }

    @Override // zg.f, zg.r
    public final boolean isEmpty() {
        return false;
    }

    @Override // zg.f, zg.r
    public final r t(c cVar) {
        return cVar.equals(c.f20591d) ? this : j.f20603e;
    }

    @Override // zg.f
    public final String toString() {
        return "<Max Node>";
    }

    @Override // zg.f, zg.r
    public final r c() {
        return this;
    }
}
