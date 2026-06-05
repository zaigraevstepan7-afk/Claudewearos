package rg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14391a;

    /* renamed from: b, reason: collision with root package name */
    public final h f14392b;

    /* renamed from: c, reason: collision with root package name */
    public final zg.r f14393c;

    /* renamed from: d, reason: collision with root package name */
    public final b f14394d;

    public d0(long j, h hVar, zg.r rVar) {
        this.f14391a = j;
        this.f14392b = hVar;
        this.f14393c = rVar;
        this.f14394d = null;
    }

    public final b a() {
        b bVar = this.f14394d;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final zg.r b() {
        zg.r rVar = this.f14393c;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        return this.f14393c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        b bVar = d0Var.f14394d;
        zg.r rVar = d0Var.f14393c;
        if (this.f14391a != d0Var.f14391a || !this.f14392b.equals(d0Var.f14392b)) {
            return false;
        }
        zg.r rVar2 = this.f14393c;
        if (rVar2 != null) {
            if (!rVar2.equals(rVar)) {
                return false;
            }
        } else if (rVar != null) {
            return false;
        }
        b bVar2 = this.f14394d;
        return bVar2 != null ? bVar2.equals(bVar) : bVar == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f14392b.hashCode() + ((Boolean.TRUE.hashCode() + (Long.valueOf(this.f14391a).hashCode() * 31)) * 31)) * 31;
        zg.r rVar = this.f14393c;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        b bVar = this.f14394d;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f14391a + " path=" + this.f14392b + " visible=true overwrite=" + this.f14393c + " merge=" + this.f14394d + "}";
    }

    public d0(long j, h hVar, b bVar) {
        this.f14391a = j;
        this.f14392b = hVar;
        this.f14393c = null;
        this.f14394d = bVar;
    }
}
