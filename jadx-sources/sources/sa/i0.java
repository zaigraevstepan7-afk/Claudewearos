package sa;

import f1.a1;
import java.util.concurrent.CancellationException;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f14873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f14874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f14875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.a f14876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f14877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(t.c cVar, float f10, ej.a aVar, a1 a1Var, ti.c cVar2) {
        super(2, cVar2);
        this.f14874b = cVar;
        this.f14875c = f10;
        this.f14876d = aVar;
        this.f14877e = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new i0(this.f14874b, this.f14875c, this.f14876d, this.f14877e, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        t.c cVar;
        Float f10;
        u0 u0VarS;
        Float f11;
        i0 i0Var;
        Throwable th2;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f14873a;
        a1 a1Var = this.f14877e;
        try {
            if (i10 == 0) {
                uk.c.R(obj);
                try {
                    cg.b.e(a1Var, true);
                    cVar = this.f14874b;
                    f10 = new Float(this.f14875c);
                    u0VarS = t.d.s(1.0f, 400.0f, null, 4);
                    f11 = new Float(0.0f);
                    this.f14873a = 1;
                    i0Var = this;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    cg.b.e(a1Var, false);
                    throw th2;
                }
                try {
                    if (t.c.d(cVar, f10, u0VarS, f11, null, i0Var, 8) == aVar) {
                        return aVar;
                    }
                } catch (CancellationException unused) {
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    cg.b.e(a1Var, false);
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    uk.c.R(obj);
                    i0Var = this;
                } catch (Throwable th5) {
                    th2 = th5;
                    cg.b.e(a1Var, false);
                    throw th2;
                }
            }
            i0Var.f14876d.a();
        } catch (CancellationException unused2) {
        }
        cg.b.e(a1Var, false);
        return pi.o.f13011a;
    }
}
