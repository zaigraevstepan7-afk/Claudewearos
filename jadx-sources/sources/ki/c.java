package ki;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f9652a;

    public c(float f10) {
        this.f9652a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && s3.f.e(this.f9652a, ((c) obj).f9652a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9652a);
    }

    public final String toString() {
        return m1.j("Dp(value=", s3.f.f(this.f9652a), ")");
    }
}
