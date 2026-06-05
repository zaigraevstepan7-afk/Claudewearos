package t3;

import fj.l;
import java.util.Arrays;
import lh.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f15689a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f15690b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f15689a = fArr;
        this.f15690b = fArr2;
    }

    @Override // t3.a
    public final float a(float f10) {
        return e.e(f10, this.f15690b, this.f15689a);
    }

    @Override // t3.a
    public final float b(float f10) {
        return e.e(f10, this.f15689a, this.f15690b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f15689a, cVar.f15689a) && Arrays.equals(this.f15690b, cVar.f15690b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15690b) + (Arrays.hashCode(this.f15689a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f15689a);
        l.e(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f15690b);
        l.e(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
