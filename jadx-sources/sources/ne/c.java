package ne;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f12307a;

    /* renamed from: b, reason: collision with root package name */
    public long f12308b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f12309c;

    /* renamed from: d, reason: collision with root package name */
    public int f12310d;

    /* renamed from: e, reason: collision with root package name */
    public int f12311e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f12309c;
        return timeInterpolator != null ? timeInterpolator : a.f12302b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12307a == cVar.f12307a && this.f12308b == cVar.f12308b && this.f12310d == cVar.f12310d && this.f12311e == cVar.f12311e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12307a;
        long j4 = this.f12308b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31)) * 31) + this.f12310d) * 31) + this.f12311e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f12307a);
        sb2.append(" duration: ");
        sb2.append(this.f12308b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f12310d);
        sb2.append(" repeatMode: ");
        return m6.a.h(sb2, this.f12311e, "}\n");
    }
}
