package za;

import c2.w;
import fj.l;
import pi.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final h f20468a;

    public static h a(int i10, long j) {
        return new h(Integer.valueOf(i10), new w(j));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.b(this.f20468a, ((a) obj).f20468a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20468a.hashCode();
    }

    public final String toString() {
        return "DisplayDigit(value=" + this.f20468a + ")";
    }
}
