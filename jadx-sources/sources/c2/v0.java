package c2;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f3048d = new v0(e0.d(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f3049a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3050b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3051c;

    public v0(long j, long j4, float f10) {
        this.f3049a = j;
        this.f3050b = j4;
        this.f3051c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return w.d(this.f3049a, v0Var.f3049a) && b2.b.c(this.f3050b, v0Var.f3050b) && this.f3051c == v0Var.f3051c;
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Float.hashCode(this.f3051c) + gk.b.j(Long.hashCode(this.f3049a) * 31, this.f3050b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        m1.q(this.f3049a, sb2, ", offset=");
        sb2.append((Object) b2.b.h(this.f3050b));
        sb2.append(", blurRadius=");
        return gk.b.o(sb2, this.f3051c, ')');
    }
}
