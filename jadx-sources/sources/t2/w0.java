package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 implements r1, i {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f15663b = new w0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15664a;

    public /* synthetic */ w0(int i10) {
        this.f15664a = i10;
    }

    @Override // t2.i
    public long a(long j, long j4) {
        switch (this.f15664a) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
                int i10 = j1.f15583a;
                return jFloatToRawIntBits;
            case 2:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                int i11 = j1.f15583a;
                return jFloatToRawIntBits2;
            case 3:
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits3 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L);
                int i12 = j1.f15583a;
                return jFloatToRawIntBits3;
            case 4:
                float fC = z.c(j, j4);
                long jFloatToRawIntBits4 = (Float.floatToRawIntBits(fC) << 32) | (Float.floatToRawIntBits(fC) & 4294967295L);
                int i13 = j1.f15583a;
                return jFloatToRawIntBits4;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j4 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j4 & 4294967295L))) {
                    long jFloatToRawIntBits5 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i14 = j1.f15583a;
                    return jFloatToRawIntBits5;
                }
                float fC2 = z.c(j, j4);
                long jFloatToRawIntBits6 = (Float.floatToRawIntBits(fC2) << 32) | (Float.floatToRawIntBits(fC2) & 4294967295L);
                int i15 = j1.f15583a;
                return jFloatToRawIntBits6;
        }
    }

    @Override // t2.r1
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    @Override // t2.r1
    public void d(q.r0 r0Var) {
        r0Var.clear();
    }

    public String toString() {
        switch (this.f15664a) {
            case 6:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
