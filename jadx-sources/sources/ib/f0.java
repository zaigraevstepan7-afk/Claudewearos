package ib;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8419a;

    public f0(String str) {
        fj.l.f(str, "query");
        this.f8419a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && fj.l.b(this.f8419a, ((f0) obj).f8419a);
    }

    public final int hashCode() {
        return this.f8419a.hashCode();
    }

    public final String toString() {
        return m1.j("QueryChangeEvent(query=", this.f8419a, ")");
    }
}
