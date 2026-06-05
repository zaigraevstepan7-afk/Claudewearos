package ta;

import f1.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements ej.e {
    public final /* synthetic */ Object A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16170a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f16172c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.a f16173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej.a f16174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.a f16175f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f16176z;

    public /* synthetic */ o(v1.o oVar, mi.p pVar, boolean z2, ej.c cVar, ej.a aVar, ej.a aVar2, ej.a aVar3, int i10) {
        this.f16176z = oVar;
        this.A = pVar;
        this.f16171b = z2;
        this.f16172c = cVar;
        this.f16173d = aVar;
        this.f16174e = aVar2;
        this.f16175f = aVar3;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16170a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(7);
                u.d((v1.o) this.f16176z, (mi.p) this.A, this.f16171b, this.f16172c, this.f16173d, this.f16174e, this.f16175f, (i0) obj, iO);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO2 = f1.s.O(1);
                ua.k.c(this.f16171b, this.f16172c, this.f16173d, this.f16174e, this.f16175f, (ej.a) this.f16176z, (ej.a) this.A, (i0) obj, iO2);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ o(boolean z2, ej.c cVar, ej.a aVar, ej.a aVar2, ej.a aVar3, ej.a aVar4, ej.a aVar5, int i10) {
        this.f16171b = z2;
        this.f16172c = cVar;
        this.f16173d = aVar;
        this.f16174e = aVar2;
        this.f16175f = aVar3;
        this.f16176z = aVar4;
        this.A = aVar5;
    }
}
