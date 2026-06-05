package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface c {
    default int E0(long j) {
        return Math.round(W0(j));
    }

    default int I0(float f10) {
        float fW0 = w0(f10);
        return Float.isInfinite(fW0) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : Math.round(fW0);
    }

    default long J(float f10) {
        float[] fArr = t3.b.f15686a;
        if (r0() < 1.03f) {
            return hj.a.D(4294967296L, f10 / r0());
        }
        t3.a aVarA = t3.b.a(r0());
        return hj.a.D(4294967296L, aVarA != null ? aVarA.a(f10) : f10 / r0());
    }

    default long K(long j) {
        if (j != 9205357640488583168L) {
            return x8.a.c(l0(Float.intBitsToFloat((int) (j >> 32))), l0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float N(long j) {
        float fC;
        float fR0;
        if (!p.a(o.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = t3.b.f15686a;
        if (r0() >= 1.03f) {
            t3.a aVarA = t3.b.a(r0());
            fC = o.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fR0 = r0();
        } else {
            fC = o.c(j);
            fR0 = r0();
        }
        return fR0 * fC;
    }

    default long Q0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fW0 = w0(h.b(j));
        float fW02 = w0(h.a(j));
        return (Float.floatToRawIntBits(fW02) & 4294967295L) | (Float.floatToRawIntBits(fW0) << 32);
    }

    default float W0(long j) {
        if (!p.a(o.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return w0(N(j));
    }

    default long Z(float f10) {
        return J(l0(f10));
    }

    float e();

    default float h0(int i10) {
        return i10 / e();
    }

    default float l0(float f10) {
        return f10 / e();
    }

    float r0();

    default float w0(float f10) {
        return e() * f10;
    }
}
