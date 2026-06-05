package t;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends vi.i implements ej.c {
    public final /* synthetic */ ej.c A;

    /* renamed from: a, reason: collision with root package name */
    public k f15090a;

    /* renamed from: b, reason: collision with root package name */
    public fj.r f15091b;

    /* renamed from: c, reason: collision with root package name */
    public int f15092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f15093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f15095f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f15096z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Object obj, f fVar, long j, ej.c cVar2, ti.c cVar3) {
        super(1, cVar3);
        this.f15093d = cVar;
        this.f15094e = obj;
        this.f15095f = fVar;
        this.f15096z = j;
        this.A = cVar2;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        return new a(this.f15093d, this.f15094e, this.f15095f, this.f15096z, this.A, cVar);
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        return ((a) create((ti.c) obj)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        fj.r rVar;
        f fVar = this.f15095f;
        c cVar = this.f15093d;
        k kVar2 = cVar.f15109c;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f15092c;
        try {
            if (i10 == 0) {
                uk.c.R(obj);
                kVar2.f15212c = (p) cVar.f15107a.f15249a.invoke(this.f15094e);
                cVar.f15111e.setValue(fVar.g());
                cVar.f15110d.setValue(Boolean.TRUE);
                k kVar3 = new k(kVar2.f15210a, kVar2.f15211b.getValue(), d.j(kVar2.f15212c), kVar2.f15213d, Long.MIN_VALUE, kVar2.f15215f);
                fj.r rVar2 = new fj.r();
                long j = this.f15096z;
                e0.t tVar = new e0.t(cVar, kVar3, this.A, rVar2, 11);
                this.f15090a = kVar3;
                this.f15091b = rVar2;
                this.f15092c = 1;
                if (d.e(kVar3, fVar, j, tVar, this) == aVar) {
                    return aVar;
                }
                kVar = kVar3;
                rVar = rVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = this.f15091b;
                kVar = this.f15090a;
                uk.c.R(obj);
            }
            g gVar = rVar.f6803a ? g.f15168a : g.f15169b;
            c.b(cVar);
            return new h(kVar, gVar);
        } catch (CancellationException e10) {
            c.b(cVar);
            throw e10;
        }
    }
}
