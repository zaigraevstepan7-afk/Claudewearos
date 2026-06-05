package r8;

import androidx.lifecycle.t;
import androidx.lifecycle.v;
import h8.q;
import qj.e1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements o, androidx.lifecycle.e {

    /* renamed from: a, reason: collision with root package name */
    public final v f13898a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f13899b;

    public k(v vVar, e1 e1Var) {
        this.f13898a = vVar;
        this.f13899b = e1Var;
    }

    @Override // r8.o
    public final Object a(q qVar) throws Throwable {
        Object objF = u1.b.f(this.f13898a, qVar);
        return objF == ui.a.f17085a ? objF : pi.o.f13011a;
    }

    @Override // r8.o
    public final void c() {
        this.f13898a.f(this);
    }

    @Override // androidx.lifecycle.e
    public final void l(t tVar) {
        this.f13899b.e(null);
    }

    @Override // r8.o
    public final void start() {
        this.f13898a.a(this);
    }
}
