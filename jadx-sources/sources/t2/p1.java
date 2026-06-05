package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f15622a;

    /* renamed from: b, reason: collision with root package name */
    public m0 f15623b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f15624c = new o1(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final o1 f15625d = new o1(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final o1 f15626e = new o1(this, 1);

    public p1(r1 r1Var) {
        this.f15622a = r1Var;
    }

    public final m0 a() {
        m0 m0Var = this.f15623b;
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
