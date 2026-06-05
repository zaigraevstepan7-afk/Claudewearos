package uf;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Class f17048a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f17049b;

    public n(Class cls, Class cls2) {
        this.f17048a = cls;
        this.f17049b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f17048a.equals(this.f17048a) && nVar.f17049b.equals(this.f17049b);
    }

    public final int hashCode() {
        return Objects.hash(this.f17048a, this.f17049b);
    }

    public final String toString() {
        return this.f17048a.getSimpleName() + " with primitive type: " + this.f17049b.getSimpleName();
    }
}
