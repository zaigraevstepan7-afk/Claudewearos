package eb;

import f1.a1;
import pi.o;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends vi.i implements ej.e {
    public final /* synthetic */ ej.a A;
    public final /* synthetic */ int B;
    public final /* synthetic */ float C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ t.c E;
    public final /* synthetic */ t.c F;
    public final /* synthetic */ int G;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f5879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f5880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.c f5882f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f5883z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z2, t.c cVar, float f10, float f11, ej.c cVar2, k kVar, ej.a aVar, int i10, float f12, a1 a1Var, t.c cVar3, t.c cVar4, int i11, ti.c cVar5) {
        super(2, cVar5);
        this.f5878b = z2;
        this.f5879c = cVar;
        this.f5880d = f10;
        this.f5881e = f11;
        this.f5882f = cVar2;
        this.f5883z = kVar;
        this.A = aVar;
        this.B = i10;
        this.C = f12;
        this.D = a1Var;
        this.E = cVar3;
        this.F = cVar4;
        this.G = i11;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        f fVar = new f(this.f5878b, this.f5879c, this.f5880d, this.f5881e, this.f5882f, this.f5883z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, cVar);
        fVar.f5877a = obj;
        return fVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((z) obj, (ti.c) obj2);
        o oVar = o.f13011a;
        fVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        z zVar = (z) this.f5877a;
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        b0.w(zVar, null, new c(this.f5878b, this.f5879c, this.f5880d, this.f5881e, this.f5882f, this.f5883z, this.A, this.B, this.C, this.D, null), 3);
        b0.w(zVar, null, new d(this.f5878b, this.E, this.f5880d, this.f5881e, this.B, this.C, null), 3);
        b0.w(zVar, null, new e(this.f5878b, this.F, this.f5880d, this.f5881e, this.G, null, 0), 3);
        return o.f13011a;
    }
}
