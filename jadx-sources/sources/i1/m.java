package i1;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements u1.e, Iterable, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f8165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8166b;

    /* renamed from: c, reason: collision with root package name */
    public final f f8167c;

    public m(h hVar, int i10, c cVar, f fVar) {
        this.f8165a = hVar;
        this.f8166b = i10;
        this.f8167c = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f8166b == this.f8166b && mVar.f8165a.equals(this.f8165a) && mVar.f8167c.equals(this.f8167c);
    }

    public final int hashCode() {
        return this.f8167c.hashCode() + ((this.f8165a.hashCode() + (this.f8166b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this.f8165a, this.f8166b, null, this.f8167c);
    }
}
