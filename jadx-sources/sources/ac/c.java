package ac;

import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f369a;

    /* renamed from: b, reason: collision with root package name */
    public final long f370b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f371c;

    public c(long j, long j4, Set set) {
        this.f369a = j;
        this.f370b = j4;
        this.f371c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f369a == cVar.f369a && this.f370b == cVar.f370b && this.f371c.equals(cVar.f371c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f369a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j4 = this.f370b;
        return ((i10 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f371c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f369a + ", maxAllowedDelay=" + this.f370b + ", flags=" + this.f371c + "}";
    }
}
