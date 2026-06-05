package rh;

import ak.x;
import y3.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14504a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14505b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14506c;

    public b(String str, long j, int i10) {
        this.f14504a = str;
        this.f14505b = j;
        this.f14506c = i10;
    }

    public static x a() {
        x xVar = new x(7);
        xVar.f744d = 0L;
        return xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = bVar.f14506c;
        String str = bVar.f14504a;
        String str2 = this.f14504a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f14505b != bVar.f14505b) {
            return false;
        }
        int i11 = this.f14506c;
        return i11 == 0 ? i10 == 0 : e.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f14504a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f14505b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i11 = this.f14506c;
        return (i11 != 0 ? e.b(i11) : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f14504a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f14505b);
        sb2.append(", responseCode=");
        int i10 = this.f14506c;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
