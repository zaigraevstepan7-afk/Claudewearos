package lb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h3 extends vi.i implements ej.e {
    public final /* synthetic */ Context A;
    public final /* synthetic */ f1.a1 B;

    /* renamed from: a, reason: collision with root package name */
    public f1.p1 f10330a;

    /* renamed from: b, reason: collision with root package name */
    public int f10331b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10332c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f10334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f10335f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f10336z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(boolean z2, float f10, float f11, float f12, Context context, f1.a1 a1Var, ti.c cVar) {
        super(2, cVar);
        this.f10333d = z2;
        this.f10334e = f10;
        this.f10335f = f11;
        this.f10336z = f12;
        this.A = context;
        this.B = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        h3 h3Var = new h3(this.f10333d, this.f10334e, this.f10335f, this.f10336z, this.A, this.B, cVar);
        h3Var.f10332c = obj;
        return h3Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h3) create((f1.p1) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        f1.p1 p1Var = (f1.p1) this.f10332c;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f10331b;
        if (i10 == 0) {
            uk.c.R(obj);
            float f10 = this.f10335f;
            boolean z2 = this.f10333d;
            float f11 = z2 ? this.f10334e : f10;
            if (z2) {
                f10 = this.f10336z;
            }
            float f12 = f10;
            xj.e eVar = qj.m0.f13601a;
            g3 g3Var = new g3(this.A, f11, f12, this.B, null);
            this.f10332c = null;
            this.f10330a = p1Var;
            this.f10331b = 1;
            obj = qj.b0.G(eVar, g3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p1Var = this.f10330a;
            uk.c.R(obj);
        }
        p1Var.setValue(obj);
        return pi.o.f13011a;
    }
}
