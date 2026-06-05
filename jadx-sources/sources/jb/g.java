package jb;

import f1.i0;
import f1.s;
import ib.q0;
import v1.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.e {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8830a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f8834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8835f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8836z;

    public /* synthetic */ g(float f10, q0 q0Var, float f11, boolean z2, boolean z10, lb.b bVar, p1.e eVar, int i10) {
        this.f8831b = f10;
        this.f8835f = q0Var;
        this.f8834e = f11;
        this.f8832c = z2;
        this.f8833d = z10;
        this.f8836z = bVar;
        this.A = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8830a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = s.O(1572865);
                uk.c.f(this.f8831b, (q0) this.f8835f, this.f8834e, this.f8832c, this.f8833d, (lb.b) this.f8836z, (p1.e) this.A, (i0) obj, iO);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO2 = s.O(1);
                mb.a.f((c2.g) this.f8835f, this.f8831b, this.f8832c, this.f8833d, this.f8834e, (d) this.f8836z, (o) this.A, (i0) obj, iO2);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ g(c2.g gVar, float f10, boolean z2, boolean z10, float f11, d dVar, o oVar, int i10) {
        this.f8835f = gVar;
        this.f8831b = f10;
        this.f8832c = z2;
        this.f8833d = z10;
        this.f8834e = f11;
        this.f8836z = dVar;
        this.A = oVar;
    }
}
