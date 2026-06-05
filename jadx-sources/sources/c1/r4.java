package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2638a = e1.j.f5443c;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2639b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2640c = e1.s.f5648b;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2641d = e1.s.f5649c;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2642e = e1.j.f5442b;

    public static final void a(e2.d dVar, int i10, long j, float f10, float f11) {
        if (i10 == 1) {
            float f12 = f10 / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVar.a() >> 32)) - f12) - f11;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) / 2.0f;
            e2.d.V0(dVar, j, f12, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2)), null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (dVar.a() >> 32)) - f10) - f11;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) - f10) / 2.0f;
        e2.d.c1(dVar, j, (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L), (Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(f10)), 0.0f, null, 0, 120);
    }
}
