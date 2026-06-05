package m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public int f11147a;

    /* renamed from: b, reason: collision with root package name */
    public int f11148b;

    /* renamed from: c, reason: collision with root package name */
    public int f11149c;

    /* renamed from: d, reason: collision with root package name */
    public int f11150d;

    /* renamed from: e, reason: collision with root package name */
    public int f11151e;

    /* renamed from: f, reason: collision with root package name */
    public int f11152f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11153g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11154h;

    public final void a(int i10, int i11) {
        this.f11149c = i10;
        this.f11150d = i11;
        this.f11154h = true;
        if (this.f11153g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f11147a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f11148b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f11147a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f11148b = i11;
        }
    }
}
