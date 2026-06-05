package c1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2310a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2315f;

    public /* synthetic */ k0(int i10, w1 w1Var, c2.w0 w0Var, ej.a aVar, v1.o oVar, boolean z2) {
        this.f2311b = aVar;
        this.f2312c = oVar;
        this.f2313d = z2;
        this.f2314e = w1Var;
        this.f2315f = w0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2310a;
        pi.o oVar = pi.o.f13011a;
        Object obj3 = this.f2312c;
        Object obj4 = this.f2311b;
        Object obj5 = this.f2315f;
        Object obj6 = this.f2314e;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(1);
                n0.c((f3.a) obj6, (ej.a) obj4, (v1.o) obj3, this.f2313d, (i0) obj5, (f1.i0) obj, iO);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iO2 = f1.s.O(1572865);
                z4.f(iO2, (w1) obj6, (c2.w0) obj5, (ej.a) obj4, (f1.i0) obj, (v1.o) obj3, this.f2313d);
                break;
            case 2:
                k7 k7Var = k7.f2344a;
                k7 k7Var2 = k7.f2344a;
                ((Integer) obj2).getClass();
                int iO3 = f1.s.O(114822145);
                ((k7) obj6).a(this.f2313d, (z.k) obj4, (g7) obj3, (c2.w0) obj5, (f1.i0) obj, iO3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iO4 = f1.s.O(1);
                mb.a.c(this.f2313d, (mi.p) obj6, (ej.a) obj4, (ej.a) obj5, (v1.o) obj3, (f1.i0) obj, iO4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iO5 = f1.s.O(55);
                nb.e.c((String) obj6, (String) obj5, this.f2313d, (ej.a) obj4, (v1.o) obj3, (f1.i0) obj, iO5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iO6 = f1.s.O(27697);
                nb.v.g((nb.q) obj6, (ej.c) obj4, this.f2313d, (ej.c) obj5, (v1.o) obj3, (f1.i0) obj, iO6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO7 = f1.s.O(1);
                sa.p.b((na.b) obj6, (List) obj5, (ej.a) obj4, (v1.o) obj3, this.f2313d, (f1.i0) obj, iO7);
                break;
        }
        return oVar;
    }

    public /* synthetic */ k0(k7 k7Var, boolean z2, z.k kVar, g7 g7Var, c2.w0 w0Var, int i10) {
        k7 k7Var2 = k7.f2344a;
        k7 k7Var3 = k7.f2344a;
        this.f2314e = k7Var;
        this.f2313d = z2;
        this.f2311b = kVar;
        this.f2312c = g7Var;
        this.f2315f = w0Var;
    }

    public /* synthetic */ k0(f3.a aVar, ej.a aVar2, v1.o oVar, boolean z2, i0 i0Var, int i10) {
        this.f2314e = aVar;
        this.f2311b = aVar2;
        this.f2312c = oVar;
        this.f2313d = z2;
        this.f2315f = i0Var;
    }

    public /* synthetic */ k0(String str, String str2, boolean z2, ej.a aVar, v1.o oVar, int i10) {
        this.f2314e = str;
        this.f2315f = str2;
        this.f2313d = z2;
        this.f2311b = aVar;
        this.f2312c = oVar;
    }

    public /* synthetic */ k0(na.b bVar, List list, ej.a aVar, v1.o oVar, boolean z2, int i10) {
        this.f2314e = bVar;
        this.f2315f = list;
        this.f2311b = aVar;
        this.f2312c = oVar;
        this.f2313d = z2;
    }

    public /* synthetic */ k0(nb.q qVar, ej.c cVar, boolean z2, ej.c cVar2, v1.o oVar, int i10) {
        this.f2314e = qVar;
        this.f2311b = cVar;
        this.f2313d = z2;
        this.f2315f = cVar2;
        this.f2312c = oVar;
    }

    public /* synthetic */ k0(boolean z2, mi.p pVar, ej.a aVar, ej.a aVar2, v1.o oVar, int i10) {
        this.f2313d = z2;
        this.f2314e = pVar;
        this.f2311b = aVar;
        this.f2315f = aVar2;
        this.f2312c = oVar;
    }
}
