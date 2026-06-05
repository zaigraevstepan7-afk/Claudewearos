package nf;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12332a;

    public l(byte[] bArr) {
        this.f12332a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        byte[] bArr = this.f12332a;
        int length = bArr.length;
        byte[] bArr2 = lVar.f12332a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = lVar.f12332a[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f12332a, ((l) obj).f12332a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12332a);
    }

    public final String toString() {
        return hj.a.r(this.f12332a);
    }
}
