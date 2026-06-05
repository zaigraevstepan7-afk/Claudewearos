package r3;

import c2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f13667a;

    public c(long j) {
        this.f13667a = j;
        if (j != 16) {
            return;
        }
        m3.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // r3.o
    public final long a() {
        return this.f13667a;
    }

    @Override // r3.o
    public final c2.s b() {
        return null;
    }

    @Override // r3.o
    public final float e() {
        return w.e(this.f13667a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && w.d(this.f13667a, ((c) obj).f13667a);
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Long.hashCode(this.f13667a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) w.j(this.f13667a)) + ')';
    }
}
