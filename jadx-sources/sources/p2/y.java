package p2;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final long f12779a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12780b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12781c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12782d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12783e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12784f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12785g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12786h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f12787i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final float f12788k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12789l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12790m;

    public y(long j, long j4, long j10, long j11, boolean z2, float f10, int i10, boolean z10, ArrayList arrayList, long j12, float f11, long j13, long j14) {
        this.f12779a = j;
        this.f12780b = j4;
        this.f12781c = j10;
        this.f12782d = j11;
        this.f12783e = z2;
        this.f12784f = f10;
        this.f12785g = i10;
        this.f12786h = z10;
        this.f12787i = arrayList;
        this.j = j12;
        this.f12788k = f11;
        this.f12789l = j13;
        this.f12790m = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return v.e(this.f12779a, yVar.f12779a) && this.f12780b == yVar.f12780b && b2.b.c(this.f12781c, yVar.f12781c) && b2.b.c(this.f12782d, yVar.f12782d) && this.f12783e == yVar.f12783e && Float.compare(this.f12784f, yVar.f12784f) == 0 && this.f12785g == yVar.f12785g && this.f12786h == yVar.f12786h && this.f12787i.equals(yVar.f12787i) && b2.b.c(this.j, yVar.j) && Float.compare(this.f12788k, yVar.f12788k) == 0 && b2.b.c(this.f12789l, yVar.f12789l) && b2.b.c(this.f12790m, yVar.f12790m);
    }

    public final int hashCode() {
        return Long.hashCode(this.f12790m) + gk.b.j(gk.b.f(this.f12788k, gk.b.j((this.f12787i.hashCode() + gk.b.i(gk.b.g(this.f12785g, gk.b.f(this.f12784f, gk.b.i(gk.b.j(gk.b.j(gk.b.j(Long.hashCode(this.f12779a) * 31, this.f12780b, 31), this.f12781c, 31), this.f12782d, 31), 31, this.f12783e), 31), 31), 31, this.f12786h)) * 31, this.j, 31), 31), this.f12789l, 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) v.j(this.f12779a)) + ", uptime=" + this.f12780b + ", positionOnScreen=" + ((Object) b2.b.h(this.f12781c)) + ", position=" + ((Object) b2.b.h(this.f12782d)) + ", down=" + this.f12783e + ", pressure=" + this.f12784f + ", type=" + ((Object) g0.a(this.f12785g)) + ", activeHover=" + this.f12786h + ", historical=" + this.f12787i + ", scrollDelta=" + ((Object) b2.b.h(this.j)) + ", scaleGestureFactor=" + this.f12788k + ", panGestureOffset=" + ((Object) b2.b.h(this.f12789l)) + ", originalEventPosition=" + ((Object) b2.b.h(this.f12790m)) + ')';
    }
}
