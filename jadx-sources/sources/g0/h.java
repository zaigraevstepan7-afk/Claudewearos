package g0;

import f0.r0;
import f0.v0;
import v.f1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f6888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6889b;

    public h(h0 h0Var, boolean z2) {
        this.f6888a = h0Var;
        this.f6889b = z2;
    }

    @Override // f0.r0
    public final int a() {
        h0 h0Var = this.f6888a;
        return (int) (h0Var.k().f6998e == o1.f19664a ? h0Var.k().b() & 4294967295L : h0Var.k().b() >> 32);
    }

    @Override // f0.r0
    public final float b() {
        return x8.a.t(this.f6888a);
    }

    @Override // f0.r0
    public final int c() {
        h0 h0Var = this.f6888a;
        return (-h0Var.k().f6999f) + h0Var.k().f6997d;
    }

    @Override // f0.r0
    public final float d() {
        h0 h0Var = this.f6888a;
        return l0.a(h0Var.k(), h0Var.l());
    }

    @Override // f0.r0
    public final d3.d e() {
        boolean z2 = this.f6889b;
        h0 h0Var = this.f6888a;
        return z2 ? new d3.d(h0Var.l(), 1) : new d3.d(1, h0Var.l());
    }

    @Override // f0.r0
    public final Object f(int i10, v0 v0Var) {
        h0 h0Var = this.f6888a;
        h0Var.getClass();
        Object objB = h0Var.b(f1.f17189a, new v0(h0Var, i10, null, 1), v0Var);
        ui.a aVar = ui.a.f17085a;
        pi.o oVar = pi.o.f13011a;
        if (objB != aVar) {
            objB = oVar;
        }
        return objB == aVar ? objB : oVar;
    }
}
