package ca;

import t.m1;
import u1.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f3143a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3144b;

    public b(float f10, float f11) {
        this.f3143a = f10;
        this.f3144b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f3143a, bVar.f3143a) == 0 && Float.compare(this.f3144b, bVar.f3144b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3144b) + (Float.hashCode(this.f3143a) * 31);
    }

    public final String toString() {
        return m1.k("CellSize(width=", d.g(this.f3143a), ", height=", d.g(this.f3144b), ")");
    }
}
