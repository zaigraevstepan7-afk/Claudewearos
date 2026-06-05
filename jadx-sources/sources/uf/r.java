package uf;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f17059a;

    /* renamed from: b, reason: collision with root package name */
    public final bg.a f17060b;

    public r(Class cls, bg.a aVar) {
        this.f17059a = cls;
        this.f17060b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f17059a.equals(this.f17059a) && rVar.f17060b.equals(this.f17060b);
    }

    public final int hashCode() {
        return Objects.hash(this.f17059a, this.f17060b);
    }

    public final String toString() {
        return this.f17059a.getSimpleName() + ", object identifier: " + this.f17060b;
    }
}
