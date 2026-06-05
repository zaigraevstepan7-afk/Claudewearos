package ta;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f16168a;

    public l(String str) {
        fj.l.f(str, "query");
        this.f16168a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && fj.l.b(this.f16168a, ((l) obj).f16168a);
    }

    public final int hashCode() {
        return this.f16168a.hashCode();
    }

    public final String toString() {
        return m1.j("SearchQueryChanged(query=", this.f16168a, ")");
    }
}
