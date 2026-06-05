package lb;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j3 extends vi.i implements ej.e {
    public final /* synthetic */ f1.a1 A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ s C;

    /* renamed from: a, reason: collision with root package name */
    public f1.p1 f10400a;

    /* renamed from: b, reason: collision with root package name */
    public int f10401b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f10404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f10405f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f10406z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(boolean z2, float f10, float f11, float f12, f1.a1 a1Var, Context context, s sVar, ti.c cVar) {
        super(2, cVar);
        this.f10403d = z2;
        this.f10404e = f10;
        this.f10405f = f11;
        this.f10406z = f12;
        this.A = a1Var;
        this.B = context;
        this.C = sVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        j3 j3Var = new j3(this.f10403d, this.f10404e, this.f10405f, this.f10406z, this.A, this.B, this.C, cVar);
        j3Var.f10402c = obj;
        return j3Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j3) create((f1.p1) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        f1.p1 p1Var = (f1.p1) this.f10402c;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f10401b;
        if (i10 == 0) {
            uk.c.R(obj);
            float f10 = q3.f10603g;
            List listM0 = qi.l.M0(((ib.v0) this.A.getValue()).f8466e, 4);
            float f11 = this.f10405f;
            boolean z2 = this.f10403d;
            float f12 = z2 ? this.f10404e : f11;
            if (z2) {
                f11 = this.f10406z;
            }
            float f13 = f11;
            xj.e eVar = qj.m0.f13601a;
            i3 i3Var = new i3(this.B, listM0, f12, f13, this.C, null);
            this.f10402c = null;
            this.f10400a = p1Var;
            this.f10401b = 1;
            obj = qj.b0.G(eVar, i3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p1Var = this.f10400a;
            uk.c.R(obj);
        }
        p1Var.setValue(obj);
        return pi.o.f13011a;
    }
}
