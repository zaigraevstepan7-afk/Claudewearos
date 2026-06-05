package i1;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements u1.e, Iterable, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f8133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8135c;

    public i(h hVar, int i10, int i11) {
        this.f8133a = hVar;
        this.f8134b = i10;
        this.f8135c = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f8134b == this.f8134b && iVar.f8135c == this.f8135c && fj.l.b(iVar.f8133a, this.f8133a);
    }

    public final int hashCode() {
        return (this.f8133a.hashCode() * 31) + this.f8134b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        h hVar = this.f8133a;
        if (hVar.A != this.f8135c) {
            j.f();
        }
        int i10 = this.f8134b;
        hVar.z(i10);
        return new d(hVar, i10 + 1, hVar.f8126a[(i10 * 5) + 3] + i10);
    }
}
