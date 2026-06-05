package zk;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20647a;

    public b(String str) {
        this.f20647a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.b(this.f20647a, ((b) obj).f20647a);
    }

    @Override // zk.a
    public final String getValue() {
        return this.f20647a;
    }

    public final int hashCode() {
        return this.f20647a.hashCode();
    }

    public final String toString() {
        return this.f20647a;
    }
}
