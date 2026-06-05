package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2668c;

    public /* synthetic */ s1(float f10, int i10, long j) {
        this.f2666a = i10;
        this.f2667b = f10;
        this.f2668c = j;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f2666a) {
            case 0:
                e2.d dVar = (e2.d) obj;
                float f10 = this.f2667b;
                float fW0 = dVar.w0(f10);
                long jFloatToRawIntBits = (Float.floatToRawIntBits(dVar.w0(f10) / r2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                float fW02 = dVar.w0(f10) / 2;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.a() & 4294967295L));
                dVar.R(this.f2668c, jFloatToRawIntBits, (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fW02) << 32), fW0, (480 & 16) != 0 ? 0 : 0);
                break;
            default:
                e2.d dVar2 = (e2.d) obj;
                float f11 = this.f2667b;
                float fW03 = dVar2.w0(f11);
                float f12 = 2;
                float fW04 = dVar2.w0(f11) / f12;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.a() >> 32));
                float fW05 = dVar2.w0(f11) / f12;
                dVar2.R(this.f2668c, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fW04) & 4294967295L), (Float.floatToRawIntBits(fW05) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32), fW03, (480 & 16) != 0 ? 0 : 0);
                break;
        }
        return pi.o.f13011a;
    }
}
