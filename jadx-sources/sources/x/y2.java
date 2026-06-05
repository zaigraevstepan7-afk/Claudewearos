package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f19765a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19766b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19767c;

    public y2(long j, long j4, boolean z2) {
        this.f19765a = j;
        this.f19766b = j4;
        this.f19767c = z2;
    }

    public final y2 a(y2 y2Var) {
        return new y2(b2.b.f(this.f19765a, y2Var.f19765a), Math.max(this.f19766b, y2Var.f19766b), this.f19767c || y2Var.f19767c);
    }
}
