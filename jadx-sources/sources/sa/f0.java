package sa;

import x.e2;
import x.l2;
import x.y1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14843a;

    /* renamed from: b, reason: collision with root package name */
    public int f14844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f14845c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f14846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, float f10, float f11, ti.c cVar, int i10) {
        super(2, cVar);
        this.f14843a = i10;
        this.f14847e = obj;
        this.f14845c = f10;
        this.f14846d = f11;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14843a) {
            case 0:
                return new f0((t.c) this.f14847e, this.f14845c, this.f14846d, cVar, 0);
            default:
                return new f0((e2) this.f14847e, this.f14845c, this.f14846d, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14843a) {
        }
        return ((f0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14843a) {
            case 0:
                t.c cVar = (t.c) this.f14847e;
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f14844b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    Float f10 = new Float(cg.b.o(((Number) cVar.e()).floatValue() + this.f14845c, this.f14846d, 0.0f));
                    this.f14844b = 1;
                    if (cVar.f(f10, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f14844b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    l2 l2Var = ((e2) this.f14847e).f19509g0;
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f14845c) << 32) | (Float.floatToRawIntBits(this.f14846d) & 4294967295L);
                    this.f14844b = 1;
                    if (y1.a(l2Var, jFloatToRawIntBits, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
