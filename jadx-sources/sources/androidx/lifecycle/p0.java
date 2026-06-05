package androidx.lifecycle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 implements r, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1118a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f1119b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1120c;

    public p0(String str, o0 o0Var) {
        this.f1118a = str;
        this.f1119b = o0Var;
    }

    @Override // androidx.lifecycle.r
    public final void e(t tVar, n nVar) {
        if (nVar == n.ON_DESTROY) {
            this.f1120c = false;
            tVar.h().f(this);
        }
    }

    public final void s(v vVar, mh.g gVar) {
        fj.l.f(gVar, "registry");
        fj.l.f(vVar, "lifecycle");
        if (this.f1120c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1120c = true;
        vVar.a(this);
        gVar.z(this.f1118a, (c.g) this.f1119b.f1117a.f734e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
