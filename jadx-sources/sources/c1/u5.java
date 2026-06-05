package c1;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2743a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2745c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2747e;

    public /* synthetic */ u5(ej.a aVar, boolean z2, c2.g gVar, c2.n nVar) {
        this.f2746d = aVar;
        this.f2745c = z2;
        this.f2747e = gVar;
        this.f2744b = nVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f2743a) {
            case 0:
                ej.a aVar = (ej.a) this.f2746d;
                ej.a aVar2 = (ej.a) this.f2747e;
                ej.c cVar = (ej.c) this.f2744b;
                return new x5(this.f2745c, aVar, aVar2, (y5) obj, cVar);
            case 1:
                List list = (List) this.f2746d;
                Map map = (Map) this.f2747e;
                ej.c cVar2 = (ej.c) this.f2744b;
                e0.g gVar = (e0.g) obj;
                fj.l.f(gVar, "$this$LazyVerticalGrid");
                gVar.p(list.size(), new d1.b0(5, new ra.p0(3), list), new ra.i1(2, list), new p1.e(new sa.o(list, map, cVar2, this.f2745c), true, -1117249557));
                return pi.o.f13011a;
            default:
                ej.a aVar3 = (ej.a) this.f2746d;
                c2.g gVar2 = (c2.g) this.f2747e;
                c2.n nVar = (c2.n) this.f2744b;
                v2.h0 h0Var = (v2.h0) obj;
                h0Var.f();
                e2.b bVar = h0Var.f17669a;
                if (((Boolean) aVar3.a()).booleanValue()) {
                    if (this.f2745c) {
                        long jL0 = bVar.L0();
                        ac.d dVar = bVar.f5738b;
                        long jY = dVar.y();
                        dVar.h().f();
                        try {
                            ((ld.i) dVar.f373b).S(-1.0f, 1.0f, jL0);
                            e2.d.A0(h0Var, gVar2, nVar, 46);
                        } finally {
                            t.m1.r(dVar, jY);
                        }
                    } else {
                        e2.d.A0(h0Var, gVar2, nVar, 46);
                    }
                }
                return pi.o.f13011a;
        }
    }

    public /* synthetic */ u5(List list, Map map, ej.c cVar, boolean z2) {
        this.f2746d = list;
        this.f2747e = map;
        this.f2744b = cVar;
        this.f2745c = z2;
    }

    public /* synthetic */ u5(boolean z2, ej.a aVar, ej.a aVar2, ej.c cVar) {
        this.f2745c = z2;
        this.f2746d = aVar;
        this.f2747e = aVar2;
        this.f2744b = cVar;
    }
}
