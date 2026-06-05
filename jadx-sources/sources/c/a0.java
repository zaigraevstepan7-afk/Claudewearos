package c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 implements androidx.lifecycle.r, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.v f1801b;

    public a0(w wVar, b0 b0Var, androidx.lifecycle.v vVar) {
        this.f1800a = wVar;
        this.f1801b = vVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1801b.f(this);
    }

    @Override // androidx.lifecycle.r
    public final void e(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        androidx.lifecycle.n nVar2 = androidx.lifecycle.n.ON_START;
        w wVar = this.f1800a;
        if (nVar == nVar2) {
            wVar.g(true);
        } else if (nVar == androidx.lifecycle.n.ON_STOP) {
            wVar.g(false);
        }
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            wVar.e();
            this.f1801b.f(this);
        }
    }
}
