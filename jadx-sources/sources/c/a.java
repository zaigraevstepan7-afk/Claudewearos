package c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1795a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1796b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1797c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1798d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1799e;

    public a(j6.b bVar) {
        fj.l.f(bVar, "navigationEvent");
        float f10 = bVar.f8699c;
        float f11 = bVar.f8700d;
        float f12 = bVar.f8698b;
        int i10 = bVar.f8697a;
        long j = bVar.f8701e;
        this.f1795a = f10;
        this.f1796b = f11;
        this.f1797c = f12;
        this.f1798d = i10;
        this.f1799e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f1795a + ", touchY=" + this.f1796b + ", progress=" + this.f1797c + ", swipeEdge=" + this.f1798d + ", frameTimeMillis=" + this.f1799e + ')';
    }
}
