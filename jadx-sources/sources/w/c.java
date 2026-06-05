package w;

import c2.w;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18142a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18143b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18144c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18145d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18146e;

    public c(long j, long j4, long j10, long j11, long j12) {
        this.f18142a = j;
        this.f18143b = j4;
        this.f18144c = j10;
        this.f18145d = j11;
        this.f18146e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return w.d(this.f18142a, cVar.f18142a) && w.d(this.f18143b, cVar.f18143b) && w.d(this.f18144c, cVar.f18144c) && w.d(this.f18145d, cVar.f18145d) && w.d(this.f18146e, cVar.f18146e);
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Long.hashCode(this.f18146e) + gk.b.j(gk.b.j(gk.b.j(Long.hashCode(this.f18142a) * 31, this.f18143b, 31), this.f18144c, 31), this.f18145d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        m1.q(this.f18142a, sb2, ", textColor=");
        m1.q(this.f18143b, sb2, ", iconColor=");
        m1.q(this.f18144c, sb2, ", disabledTextColor=");
        m1.q(this.f18145d, sb2, ", disabledIconColor=");
        sb2.append((Object) w.j(this.f18146e));
        sb2.append(')');
        return sb2.toString();
    }
}
