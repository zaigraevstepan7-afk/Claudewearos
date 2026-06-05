package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f6167a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6168b;

    public m(int i10, int i11) {
        this.f6167a = i10;
        this.f6168b = i11;
        if (!(i10 >= 0)) {
            a0.a.a("negative start index");
        }
        if (i11 >= i10) {
            return;
        }
        a0.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f6167a == mVar.f6167a && this.f6168b == mVar.f6168b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6168b) + (Integer.hashCode(this.f6167a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f6167a);
        sb2.append(", end=");
        return m6.a.g(sb2, this.f6168b, ')');
    }
}
