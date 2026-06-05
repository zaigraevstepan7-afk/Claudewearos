package sj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f15074a;

    public h(Throwable th2) {
        this.f15074a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return fj.l.b(this.f15074a, ((h) obj).f15074a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f15074a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // sj.i
    public final String toString() {
        return "Closed(" + this.f15074a + ')';
    }
}
