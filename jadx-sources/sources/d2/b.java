package d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4622a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4623b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f4624c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f4625d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4626e = 0;

    static {
        long j = 3;
        long j4 = j << 32;
        f4622a = (0 & 4294967295L) | j4;
        f4623b = (1 & 4294967295L) | j4;
        f4624c = j4 | (2 & 4294967295L);
        f4625d = (j & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j, long j4) {
        return j == j4;
    }

    public static String b(long j) {
        return a(j, f4622a) ? "Rgb" : a(j, f4623b) ? "Xyz" : a(j, f4624c) ? "Lab" : a(j, f4625d) ? "Cmyk" : "Unknown";
    }
}
