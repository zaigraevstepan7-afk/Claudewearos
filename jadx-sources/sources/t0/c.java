package t0;

import a2.w;
import k0.t0;
import k0.z;
import w2.d2;
import w2.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15351b;

    public /* synthetic */ c(e eVar, int i10) {
        this.f15350a = i10;
        this.f15351b = eVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f15350a) {
            case 0:
                v2.n.u(this.f15351b);
                break;
            case 1:
                this.f15351b.O.h(true);
                break;
            case 2:
                this.f15351b.O.d(true);
                break;
            case 3:
                this.f15351b.O.f();
                break;
            case 4:
                v2.n.u(this.f15351b);
                break;
            case 5:
                this.f15351b.O.p();
                break;
            case 6:
                e eVar = this.f15351b;
                z zVar = eVar.L.f9285w;
                zVar.f9344b.f9280r.L(eVar.P.f9918e);
                break;
            default:
                e eVar2 = this.f15351b;
                t0 t0Var = eVar2.L;
                w wVar = eVar2.Q;
                if (t0Var.b()) {
                    d2 d2Var = t0Var.f9266c;
                    if (d2Var != null) {
                        ((g1) d2Var).b();
                    }
                } else {
                    w.a(wVar);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
