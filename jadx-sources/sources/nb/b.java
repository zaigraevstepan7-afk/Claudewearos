package nb;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11975a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11976b;

    public b(String str, String str2) {
        this.f11975a = str;
        this.f11976b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return fj.l.b(this.f11975a, bVar.f11975a) && fj.l.b(this.f11976b, bVar.f11976b);
    }

    public final int hashCode() {
        return this.f11976b.hashCode() + (this.f11975a.hashCode() * 31);
    }

    public final String toString() {
        return m1.k("DevSession(uid=", this.f11975a, ", email=", this.f11976b, ")");
    }
}
