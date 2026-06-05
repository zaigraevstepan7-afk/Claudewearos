package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f17387a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f17388b;

    /* renamed from: c, reason: collision with root package name */
    public static final d3.y f17389c = new d3.y("SelectionHandleInfo");

    static {
        float f10 = 25;
        f17387a = f10;
        f17388b = f10;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
