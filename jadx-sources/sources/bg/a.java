package bg;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1773a;

    public a(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f1773a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f1773a, this.f1773a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1773a);
    }

    public final String toString() {
        return "Bytes(" + hj.a.r(this.f1773a) + ")";
    }
}
