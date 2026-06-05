package y4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f20203a;

    /* renamed from: b, reason: collision with root package name */
    public int f20204b;

    /* renamed from: c, reason: collision with root package name */
    public float f20205c;

    /* renamed from: d, reason: collision with root package name */
    public float f20206d;

    /* renamed from: e, reason: collision with root package name */
    public long f20207e;

    /* renamed from: f, reason: collision with root package name */
    public long f20208f;

    /* renamed from: g, reason: collision with root package name */
    public long f20209g;

    /* renamed from: h, reason: collision with root package name */
    public float f20210h;

    /* renamed from: i, reason: collision with root package name */
    public int f20211i;

    public final float a(long j) {
        if (j < this.f20207e) {
            return 0.0f;
        }
        long j4 = this.f20209g;
        if (j4 < 0 || j < j4) {
            return d.b((j - r0) / this.f20203a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f20210h;
        return (d.b((j - j4) / this.f20211i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
