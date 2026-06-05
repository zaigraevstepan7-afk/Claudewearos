package a9;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final b f222a;

    public d(b bVar) {
        this.f222a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && l.b(this.f222a, ((d) obj).f222a);
    }

    public final int hashCode() {
        return this.f222a.hashCode();
    }

    public final String toString() {
        return "Error(internalError=" + this.f222a + ")";
    }
}
