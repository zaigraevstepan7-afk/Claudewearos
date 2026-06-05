package eb;

import pi.o;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends vi.i implements ej.e {
    public final /* synthetic */ t.c A;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f5886c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f5887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5889f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ t.c f5890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z2, t.c cVar, float f10, float f11, int i10, t.c cVar2, t.c cVar3, ti.c cVar4) {
        super(2, cVar4);
        this.f5885b = z2;
        this.f5886c = cVar;
        this.f5887d = f10;
        this.f5888e = f11;
        this.f5889f = i10;
        this.f5890z = cVar2;
        this.A = cVar3;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        g gVar = new g(this.f5885b, this.f5886c, this.f5887d, this.f5888e, this.f5889f, this.f5890z, this.A, cVar);
        gVar.f5884a = obj;
        return gVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((z) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        z zVar = (z) this.f5884a;
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        b0.w(zVar, null, new e(this.f5885b, this.f5886c, this.f5887d, this.f5888e, this.f5889f, null, 1), 3);
        b0.w(zVar, null, new e(this.f5885b, this.f5890z, this.f5887d, this.f5888e, this.f5889f, null, 2), 3);
        return b0.w(zVar, null, new e(this.f5885b, this.A, this.f5887d, this.f5888e, this.f5889f, null, 3), 3);
    }
}
