package fc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final h f6696i = new h(320, 50, "320x50_mb");
    public static final h j;

    /* renamed from: k, reason: collision with root package name */
    public static final h f6697k;

    /* renamed from: a, reason: collision with root package name */
    public final int f6698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6699b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6700c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6701d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6702e;

    /* renamed from: f, reason: collision with root package name */
    public int f6703f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6704g;

    /* renamed from: h, reason: collision with root package name */
    public int f6705h;

    static {
        new h(468, 60, "468x60_as");
        new h(320, 100, "320x100_as");
        new h(728, 90, "728x90_as");
        new h(300, 250, "300x250_as");
        new h(160, 600, "160x600_as");
        new h(-1, -2, "smart_banner");
        j = new h(-3, -4, "fluid");
        f6697k = new h(0, 0, "invalid");
        new h(50, 50, "50x50_mb");
        new h(-3, 0, "search_v2");
    }

    public h(int i10, int i11) {
        this(i10, i11, gk.b.n(i10 == -1 ? "FULL" : String.valueOf(i10), "x", i11 == -2 ? "AUTO" : String.valueOf(i11), "_as"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6698a == hVar.f6698a && this.f6699b == hVar.f6699b && this.f6700c.equals(hVar.f6700c);
    }

    public final int hashCode() {
        return this.f6700c.hashCode();
    }

    public final String toString() {
        return this.f6700c;
    }

    public h(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(m6.a.d(i10, "Invalid width for AdSize: "));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(m6.a.d(i11, "Invalid height for AdSize: "));
        }
        this.f6698a = i10;
        this.f6699b = i11;
        this.f6700c = str;
    }
}
