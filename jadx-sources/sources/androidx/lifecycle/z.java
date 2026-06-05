package androidx.lifecycle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends a0 implements r {

    /* renamed from: e, reason: collision with root package name */
    public final t f1160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f1161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, t tVar, c0 c0Var) {
        super(b0Var, c0Var);
        this.f1161f = b0Var;
        this.f1160e = tVar;
    }

    @Override // androidx.lifecycle.a0
    public final void c() {
        this.f1160e.h().f(this);
    }

    @Override // androidx.lifecycle.a0
    public final boolean d(t tVar) {
        return this.f1160e == tVar;
    }

    @Override // androidx.lifecycle.r
    public final void e(t tVar, n nVar) {
        t tVar2 = this.f1160e;
        o oVar = tVar2.h().f1141c;
        if (oVar == o.f1111a) {
            this.f1161f.h(this.f1057a);
            return;
        }
        o oVar2 = null;
        while (oVar2 != oVar) {
            a(f());
            oVar2 = oVar;
            oVar = tVar2.h().f1141c;
        }
    }

    @Override // androidx.lifecycle.a0
    public final boolean f() {
        return this.f1160e.h().f1141c.compareTo(o.f1114d) >= 0;
    }
}
