package ca;

import t.m1;
import u1.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3142b;

    public a(float f10, float f11) {
        this.f3141a = f10;
        this.f3142b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f3141a, aVar.f3141a) == 0 && Float.compare(this.f3142b, aVar.f3142b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3142b) + (Float.hashCode(this.f3141a) * 31);
    }

    public final String toString() {
        return m1.k("CellPosition(x=", d.g(this.f3141a), ", y=", d.g(this.f3142b), ")");
    }
}
