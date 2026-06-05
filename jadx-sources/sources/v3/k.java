package v3;

import f1.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17836a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17838c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi.c f17839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i10, int i11, ej.c cVar, ej.c cVar2, v1.o oVar) {
        super(2);
        this.f17839d = cVar;
        this.f17841f = oVar;
        this.f17840e = cVar2;
        this.f17837b = i10;
        this.f17838c = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f17836a;
        i0 i0Var = (i0) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                ej.c cVar = (ej.c) this.f17839d;
                v1.o oVar = (v1.o) this.f17841f;
                j.a(f1.s.O(this.f17837b | 1), this.f17838c, cVar, (ej.c) this.f17840e, i0Var, oVar);
                break;
            default:
                u0.c.a((ej.a) this.f17839d, (w3.u) this.f17840e, (p1.e) this.f17841f, i0Var, f1.s.O(this.f17837b | 1), this.f17838c);
                break;
        }
        return pi.o.f13011a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ej.a aVar, w3.u uVar, p1.e eVar, int i10, int i11) {
        super(2);
        this.f17839d = aVar;
        this.f17840e = uVar;
        this.f17841f = eVar;
        this.f17837b = i10;
        this.f17838c = i11;
    }
}
