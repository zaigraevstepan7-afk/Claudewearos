package cb;

import f1.a1;
import f1.f1;
import f1.g1;
import pi.o;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.i implements ej.e {
    public final /* synthetic */ g1 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ a1 E;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f3188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f3189c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f3190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f3191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1 f3192f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1 f3193z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, f1 f1Var, f1 f1Var2, f1 f1Var3, f1 f1Var4, f1 f1Var5, f1 f1Var6, g1 g1Var, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, ti.c cVar) {
        super(2, cVar);
        this.f3187a = mVar;
        this.f3188b = f1Var;
        this.f3189c = f1Var2;
        this.f3190d = f1Var3;
        this.f3191e = f1Var4;
        this.f3192f = f1Var5;
        this.f3193z = f1Var6;
        this.A = g1Var;
        this.B = a1Var;
        this.C = a1Var2;
        this.D = a1Var3;
        this.E = a1Var4;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new l(this.f3187a, this.f3188b, this.f3189c, this.f3190d, this.f3191e, this.f3192f, this.f3193z, this.A, this.B, this.C, this.D, this.E, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((z) obj, (ti.c) obj2);
        o oVar = o.f13011a;
        lVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        this.f3187a.a(this.f3188b.g(), this.f3189c.g(), this.f3190d.g(), this.f3191e.g(), this.f3192f.g(), this.f3193z.g(), this.A.g(), ((Boolean) this.B.getValue()).booleanValue(), ((Boolean) this.C.getValue()).booleanValue(), ((Boolean) this.D.getValue()).booleanValue(), ((Boolean) this.E.getValue()).booleanValue());
        return o.f13011a;
    }
}
