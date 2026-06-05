package ak;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public w f745a;

    /* renamed from: b, reason: collision with root package name */
    public s f746b;

    /* renamed from: d, reason: collision with root package name */
    public String f748d;

    /* renamed from: e, reason: collision with root package name */
    public k f749e;

    /* renamed from: g, reason: collision with root package name */
    public b0 f751g;

    /* renamed from: h, reason: collision with root package name */
    public z f752h;

    /* renamed from: i, reason: collision with root package name */
    public z f753i;
    public z j;

    /* renamed from: k, reason: collision with root package name */
    public long f754k;

    /* renamed from: l, reason: collision with root package name */
    public long f755l;

    /* renamed from: m, reason: collision with root package name */
    public wh.s f756m;

    /* renamed from: c, reason: collision with root package name */
    public int f747c = -1;

    /* renamed from: f, reason: collision with root package name */
    public yh.c f750f = new yh.c(2);

    public static void b(String str, z zVar) {
        if (zVar.f763z != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (zVar.A != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (zVar.B != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (zVar.C != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final z a() {
        if (this.f745a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f746b == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f747c >= 0) {
            if (this.f748d != null) {
                return new z(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.f747c);
    }
}
