package lb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f10302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f10303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(Context context, float f10, float f11, f1.a1 a1Var, ti.c cVar) {
        super(2, cVar);
        this.f10301a = context;
        this.f10302b = f10;
        this.f10303c = f11;
        this.f10304d = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new g3(this.f10301a, this.f10302b, this.f10303c, this.f10304d, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g3) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        float f10 = q3.f10603g;
        return q3.P(this.f10301a, qi.l.M0(((ib.v0) this.f10304d.getValue()).f8466e, 4), this.f10302b, this.f10303c, null);
    }
}
