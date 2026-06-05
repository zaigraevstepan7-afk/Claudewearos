package nb;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12085a;

    public w(String str) {
        fj.l.f(str, "message");
        this.f12085a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && fj.l.b(this.f12085a, ((w) obj).f12085a);
    }

    public final int hashCode() {
        return this.f12085a.hashCode();
    }

    public final String toString() {
        return m1.j("Error(message=", this.f12085a, ")");
    }
}
