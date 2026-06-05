package c2;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f3030c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3031d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3032e;

    public p0(List list, long j, float f10) {
        this.f3030c = list;
        this.f3031d = j;
        this.f3032e = f10;
    }

    @Override // c2.u0
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j4 = this.f3031d;
        if ((9223372034707292159L & j4) == 9205357640488583168L) {
            long jZ = x8.a.z(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jZ >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ & 4294967295L));
        } else {
            int i10 = (int) (j4 >> 32);
            if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
                i10 = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i10);
            int i11 = (int) (j4 & 4294967295L);
            if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
                i11 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fD = this.f3032e;
        if (fD == Float.POSITIVE_INFINITY) {
            fD = b2.e.d(j) / 2;
        }
        float f10 = fD;
        List list = this.f3030c;
        e0.K(list, null);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = e0.E(((w) list.get(i12)).f3060a);
        }
        return new RadialGradient(fIntBitsToFloat3, fIntBitsToFloat4, f10, iArr, (float[]) null, e0.D(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f3030c.equals(p0Var.f3030c) && b2.b.c(this.f3031d, p0Var.f3031d) && this.f3032e == p0Var.f3032e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + gk.b.f(this.f3032e, gk.b.j(this.f3030c.hashCode() * 961, this.f3031d, 31), 31);
    }

    public final String toString() {
        String str;
        long j = this.f3031d;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) b2.b.h(j)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f3032e;
        if ((Float.floatToRawIntBits(f10) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040) {
            str2 = "radius=" + f10 + ", ";
        }
        return "RadialGradient(colors=" + this.f3030c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) e0.J(0)) + ')';
    }
}
