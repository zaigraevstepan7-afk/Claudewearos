package c2;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f3010c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3011d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3012e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3013f;

    public j0(List list, ArrayList arrayList, long j, long j4) {
        this.f3010c = list;
        this.f3011d = arrayList;
        this.f3012e = j;
        this.f3013f = j4;
    }

    @Override // c2.u0
    public final Shader b(long j) {
        float[] fArr;
        long j4 = this.f3012e;
        int i10 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        long j10 = this.f3013f;
        int i12 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
        int i13 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L);
        List list = this.f3010c;
        List list2 = this.f3011d;
        e0.K(list, list2);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = e0.E(((w) list.get(i14)).f3060a);
        }
        if (list2 != null) {
            fArr = new float[list2.size()];
            Iterator it = list2.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                fArr[i15] = ((Number) it.next()).floatValue();
                i15++;
            }
        } else {
            fArr = null;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, fArr, e0.D(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f3010c.equals(j0Var.f3010c) && fj.l.b(this.f3011d, j0Var.f3011d) && b2.b.c(this.f3012e, j0Var.f3012e) && b2.b.c(this.f3013f, j0Var.f3013f);
    }

    public final int hashCode() {
        int iHashCode = this.f3010c.hashCode() * 31;
        List list = this.f3011d;
        return Integer.hashCode(0) + gk.b.j(gk.b.j((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f3012e, 31), this.f3013f, 31);
    }

    public final String toString() {
        String str;
        long j = this.f3012e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) b2.b.h(j)) + ", ";
        } else {
            str = "";
        }
        long j4 = this.f3013f;
        if (((((j4 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) b2.b.h(j4)) + ", ";
        }
        return "LinearGradient(colors=" + this.f3010c + ", stops=" + this.f3011d + ", " + str + str2 + "tileMode=" + ((Object) e0.J(0)) + ')';
    }
}
