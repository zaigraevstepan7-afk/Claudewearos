package c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final long f3052b = e0.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f3053c = e0.d(4282664004L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f3054d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3055e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f3056f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f3057g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f3058h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3059i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f3060a;

    static {
        e0.d(4287137928L);
        e0.d(4291611852L);
        f3054d = e0.d(4294967295L);
        f3055e = e0.d(4294901760L);
        e0.d(4278255360L);
        f3056f = e0.d(4278190335L);
        e0.d(4294967040L);
        e0.d(4278255615L);
        e0.d(4294902015L);
        f3057g = e0.c(0);
        f3058h = e0.b(0.0f, 0.0f, 0.0f, 0.0f, d2.d.f4649u);
    }

    public /* synthetic */ w(long j) {
        this.f3060a = j;
    }

    public static final /* synthetic */ w a(long j) {
        return new w(j);
    }

    public static final long b(long j, d2.c cVar) {
        d2.g gVarE;
        d2.c cVarG = g(j);
        int i10 = cVarG.f4629c;
        int i11 = cVar.f4629c;
        if ((i10 | i11) < 0) {
            gVarE = d2.j.e(cVarG, cVar);
        } else {
            q.v vVar = d2.h.f4661a;
            int i12 = i10 | (i11 << 6);
            Object objB = vVar.b(i12);
            if (objB == null) {
                objB = d2.j.e(cVarG, cVar);
                vVar.i(i12, objB);
            }
            gVarE = (d2.g) objB;
        }
        return gVarE.a(j);
    }

    public static long c(long j, float f10) {
        return e0.b(i(j), h(j), f(j), f10, g(j));
    }

    public static final boolean d(long j, long j4) {
        return j == j4;
    }

    public static final float e(long j) {
        float fQ;
        float f10;
        if ((63 & j) == 0) {
            fQ = (float) wd.a.Q((j >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fQ = (float) wd.a.Q((j >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fQ / f10;
    }

    public static final float f(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) wd.a.Q((j >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 16) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - a0.f2961a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final d2.c g(long j) {
        float[] fArr = d2.d.f4630a;
        return d2.d.f4653y[(int) (j & 63)];
    }

    public static final float h(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) wd.a.Q((j >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 32) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - a0.f2961a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float i(long j) {
        int i10;
        int i11;
        int i12;
        if ((63 & j) == 0) {
            return ((float) wd.a.Q((j >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j >>> 48) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - a0.f2961a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String j(long j) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(i(j));
        sb2.append(", ");
        sb2.append(h(j));
        sb2.append(", ");
        sb2.append(f(j));
        sb2.append(", ");
        sb2.append(e(j));
        sb2.append(", ");
        return m6.a.i(sb2, g(j).f4627a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f3060a == ((w) obj).f3060a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3060a);
    }

    public final String toString() {
        return j(this.f3060a);
    }
}
