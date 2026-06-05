package i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f8101a;

    public b(int i10) {
        this.f8101a = i10;
    }

    public final boolean a() {
        return this.f8101a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return m6.a.h(sb2, this.f8101a, " }");
    }
}
