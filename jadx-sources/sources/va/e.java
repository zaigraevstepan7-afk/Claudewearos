package va;

import f1.a1;
import qj.b0;
import qj.z;
import t.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.i implements ej.e {
    public final /* synthetic */ t.c A;
    public final /* synthetic */ float B;
    public final /* synthetic */ t.c C;
    public final /* synthetic */ t.c D;
    public final /* synthetic */ a1 E;

    /* renamed from: a, reason: collision with root package name */
    public int f17925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f17926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f17927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.c f17928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f17929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.c f17930f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f17931z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ej.a aVar, a1 a1Var, t.c cVar, float f10, t.c cVar2, float f11, t.c cVar3, float f12, t.c cVar4, t.c cVar5, a1 a1Var2, ti.c cVar6) {
        super(2, cVar6);
        this.f17926b = aVar;
        this.f17927c = a1Var;
        this.f17928d = cVar;
        this.f17929e = f10;
        this.f17930f = cVar2;
        this.f17931z = f11;
        this.A = cVar3;
        this.B = f12;
        this.C = cVar4;
        this.D = cVar5;
        this.E = a1Var2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new e(this.f17926b, this.f17927c, this.f17928d, this.f17929e, this.f17930f, this.f17931z, this.A, this.B, this.C, this.D, this.E, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f17925a;
        pi.o oVar = pi.o.f13011a;
        if (i10 == 0) {
            uk.c.R(obj);
            o1 o1Var = f.f17932a;
            if (!((Boolean) this.f17927c.getValue()).booleanValue()) {
                return oVar;
            }
            d dVar = new d(this.f17928d, this.f17929e, this.f17930f, this.f17931z, this.A, this.B, this.C, this.D, null);
            this.f17925a = 1;
            if (b0.h(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        o1 o1Var2 = f.f17932a;
        this.E.setValue(Boolean.FALSE);
        this.f17926b.a();
        return oVar;
    }
}
