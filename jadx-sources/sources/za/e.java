package za;

import fj.l;
import pi.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final h f20481a;

    /* renamed from: b, reason: collision with root package name */
    public final h f20482b;

    public e(h hVar, h hVar2) {
        this.f20481a = hVar;
        this.f20482b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.b(this.f20481a, eVar.f20481a) && l.b(this.f20482b, eVar.f20482b);
    }

    public final int hashCode() {
        return this.f20482b.hashCode() + (this.f20481a.hashCode() * 31);
    }

    public final String toString() {
        return "TwentyFourHour(hours=" + this.f20481a + ", minutes=" + this.f20482b + ")";
    }
}
