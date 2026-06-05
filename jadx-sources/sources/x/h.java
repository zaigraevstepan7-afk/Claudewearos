package x;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f19538a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f19540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f19541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f19542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f19543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, d3 d3Var, d dVar, long j, ti.c cVar) {
        super(2, cVar);
        this.f19540c = iVar;
        this.f19541d = d3Var;
        this.f19542e = dVar;
        this.f19543f = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        h hVar = new h(this.f19540c, this.f19541d, this.f19542e, this.f19543f, cVar);
        hVar.f19539b = obj;
        return hVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        i iVar = this.f19540c;
        yh.c cVar = iVar.M;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f19538a;
        try {
            try {
                if (i10 == 0) {
                    uk.c.R(obj);
                    qj.e1 e1VarO = qj.b0.o(((qj.z) this.f19539b).Q());
                    iVar.P = true;
                    l2 l2Var = iVar.I;
                    v.f1 f1Var = v.f1.f17189a;
                    v0.r0 r0Var = new v0.r0(this.f19541d, iVar, this.f19542e, this.f19543f, e1VarO, null);
                    this.f19538a = 1;
                    if (l2Var.f(f1Var, r0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                cVar.z();
                iVar.P = false;
                cVar.d(null);
                iVar.N = false;
                return pi.o.f13011a;
            } catch (CancellationException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            iVar.P = false;
            cVar.d(null);
            iVar.N = false;
            throw th2;
        }
    }
}
