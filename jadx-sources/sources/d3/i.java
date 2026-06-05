package d3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f4720c = new i(0.0f, new kj.d(0.0f, 0.0f));

    /* renamed from: a, reason: collision with root package name */
    public final float f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final kj.d f4722b;

    public i(float f10, kj.d dVar) {
        this.f4721a = f10;
        this.f4722b = dVar;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f4721a == iVar.f4721a && fj.l.b(this.f4722b, iVar.f4722b);
    }

    public final int hashCode() {
        return (this.f4722b.hashCode() + (Float.hashCode(this.f4721a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f4721a + ", range=" + this.f4722b + ", steps=0)";
    }
}
