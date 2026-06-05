package c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f3065a;

    public z0(long j) {
        this.f3065a = j;
    }

    @Override // c2.s
    public final void a(float f10, long j, h hVar) {
        hVar.c(1.0f);
        long jC = this.f3065a;
        if (f10 != 1.0f) {
            jC = w.c(jC, w.e(jC) * f10);
        }
        hVar.e(jC);
        if (hVar.f3001c != null) {
            hVar.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            return w.d(this.f3065a, ((z0) obj).f3065a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Long.hashCode(this.f3065a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) w.j(this.f3065a)) + ')';
    }
}
