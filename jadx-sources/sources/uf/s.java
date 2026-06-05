package uf;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Class f17061a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f17062b;

    public s(Class cls, Class cls2) {
        this.f17061a = cls;
        this.f17062b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f17061a.equals(this.f17061a) && sVar.f17062b.equals(this.f17062b);
    }

    public final int hashCode() {
        return Objects.hash(this.f17061a, this.f17062b);
    }

    public final String toString() {
        return this.f17061a.getSimpleName() + " with serialization type: " + this.f17062b.getSimpleName();
    }
}
