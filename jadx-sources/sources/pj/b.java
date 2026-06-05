package pj;

import fj.l;
import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f13015c = new b(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f13016a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13017b;

    public b(long j, long j4) {
        this.f13016a = j;
        this.f13017b = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        l.f(bVar, "other");
        long j = bVar.f13016a;
        long j4 = this.f13016a;
        return j4 != j ? Long.compareUnsigned(j4, j) : Long.compareUnsigned(this.f13017b, bVar.f13017b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13016a == bVar.f13016a && this.f13017b == bVar.f13017b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13016a ^ this.f13017b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        x8.a.y(this.f13016a, bArr, 0, 0, 4);
        bArr[8] = 45;
        x8.a.y(this.f13016a, bArr, 9, 4, 6);
        bArr[13] = 45;
        x8.a.y(this.f13016a, bArr, 14, 6, 8);
        bArr[18] = 45;
        x8.a.y(this.f13017b, bArr, 19, 0, 2);
        bArr[23] = 45;
        x8.a.y(this.f13017b, bArr, 24, 2, 8);
        return new String(bArr, nj.a.f12342a);
    }
}
