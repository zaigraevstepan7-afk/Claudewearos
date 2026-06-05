package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.v f1888a = new f1.v(new b6.j(13));

    /* renamed from: b, reason: collision with root package name */
    public static final b5 f1889b;

    /* renamed from: c, reason: collision with root package name */
    public static final b5 f1890c;

    static {
        long j = c2.w.f3058h;
        f1889b = new b5(Float.NaN, j, true);
        f1890c = new b5(Float.NaN, j, false);
    }

    public static b5 a(float f10, int i10) {
        boolean z2 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        long j = c2.w.f3058h;
        return (s3.f.e(f10, Float.NaN) && c2.w.d(j, j)) ? z2 ? f1889b : f1890c : new b5(f10, j, z2);
    }
}
