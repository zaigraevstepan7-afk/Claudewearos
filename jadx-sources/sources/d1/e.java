package d1;

import c1.v5;
import c1.x5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.i implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public int f4491a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ n f4492b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ o0 f4493c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f4495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f4496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, float f10, ti.c cVar) {
        super(4, cVar);
        this.f4495e = qVar;
        this.f4496f = f10;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        e eVar = new e(this.f4495e, this.f4496f, (ti.c) obj4);
        eVar.f4492b = (n) obj;
        eVar.f4493c = (o0) obj2;
        eVar.f4494d = obj3;
        return eVar.invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f4491a;
        if (i10 == 0) {
            uk.c.R(obj);
            n nVar = this.f4492b;
            float fD = this.f4493c.d(this.f4494d);
            if (!Float.isNaN(fD)) {
                fj.s sVar = new fj.s();
                q qVar = this.f4495e;
                float fG = Float.isNaN(qVar.j.g()) ? 0.0f : qVar.j.g();
                sVar.f6804a = fG;
                t.j jVar = ((x5) qVar.f4556c.f193b).f2866c;
                v5 v5Var = new v5(nVar, sVar, 1);
                this.f4492b = null;
                this.f4493c = null;
                this.f4491a = 1;
                if (t.d.d(fG, fD, this.f4496f, jVar, v5Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        return pi.o.f13011a;
    }
}
