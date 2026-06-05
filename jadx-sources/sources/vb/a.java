package vb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18011a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18012b;

    public a(int i10, long j) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f18011a = i10;
        this.f18012b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y3.e.a(this.f18011a, aVar.f18011a) && this.f18012b == aVar.f18012b;
    }

    public final int hashCode() {
        int iB = (y3.e.b(this.f18011a) ^ 1000003) * 1000003;
        long j = this.f18012b;
        return iB ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f18011a;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        sb2.append(this.f18012b);
        sb2.append("}");
        return sb2.toString();
    }
}
