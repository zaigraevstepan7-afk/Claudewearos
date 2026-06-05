package eb;

import pi.o;
import qj.z;
import t.o1;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5870a;

    /* renamed from: b, reason: collision with root package name */
    public int f5871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.c f5873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f5875f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f5876z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z2, t.c cVar, float f10, float f11, int i10, ti.c cVar2, int i11) {
        super(2, cVar2);
        this.f5870a = i11;
        this.f5872c = z2;
        this.f5873d = cVar;
        this.f5874e = f10;
        this.f5875f = f11;
        this.f5876z = i10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f5870a) {
            case 0:
                return new e(this.f5872c, this.f5873d, this.f5874e, this.f5875f, this.f5876z, cVar, 0);
            case 1:
                return new e(this.f5872c, this.f5873d, this.f5874e, this.f5875f, this.f5876z, cVar, 1);
            case 2:
                return new e(this.f5872c, this.f5873d, this.f5874e, this.f5875f, this.f5876z, cVar, 2);
            default:
                return new e(this.f5872c, this.f5873d, this.f5874e, this.f5875f, this.f5876z, cVar, 3);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f5870a) {
        }
        return ((e) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5870a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f5871b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    if (this.f5872c) {
                        Float f10 = new Float(1.0f);
                        float f11 = this.f5874e + 0.08f;
                        if (f11 > 1.4f) {
                            f11 = 1.4f;
                        }
                        u0 u0VarS = t.d.s(f11, this.f5875f * 1.1f, null, 4);
                        this.f5871b = 1;
                        obj = t.c.d(this.f5873d, f10, u0VarS, null, null, this, 12);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        Float f12 = new Float(1.0f);
                        o1 o1VarT = t.d.t(this.f5876z, 0, i.f5898a, 2);
                        this.f5871b = 2;
                        obj = t.c.d(this.f5873d, f12, o1VarT, null, null, this, 12);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                } else if (i10 == 1) {
                    uk.c.R(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f5871b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    if (this.f5872c) {
                        Float f13 = new Float(0.0f);
                        u0 u0VarS2 = t.d.s(this.f5874e, this.f5875f, null, 4);
                        this.f5871b = 1;
                        obj = t.c.d(this.f5873d, f13, u0VarS2, null, null, this, 12);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        Float f14 = new Float(0.0f);
                        o1 o1VarT2 = t.d.t(this.f5876z, 0, i.f5900c, 2);
                        this.f5871b = 2;
                        obj = t.c.d(this.f5873d, f14, o1VarT2, null, null, this, 12);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                } else if (i11 == 1) {
                    uk.c.R(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f5871b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    if (this.f5872c) {
                        Float f15 = new Float(0.0f);
                        u0 u0VarS3 = t.d.s(this.f5874e, this.f5875f * 0.92f, null, 4);
                        this.f5871b = 1;
                        obj = t.c.d(this.f5873d, f15, u0VarS3, null, null, this, 12);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        Float f16 = new Float(0.0f);
                        o1 o1VarT3 = t.d.t(this.f5876z, 0, i.f5900c, 2);
                        this.f5871b = 2;
                        obj = t.c.d(this.f5873d, f16, o1VarT3, null, null, this, 12);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    }
                } else if (i12 == 1) {
                    uk.c.R(obj);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            default:
                ui.a aVar4 = ui.a.f17085a;
                int i13 = this.f5871b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    if (this.f5872c) {
                        Float f17 = new Float(0.0f);
                        float f18 = this.f5874e + 0.08f;
                        if (f18 > 1.4f) {
                            f18 = 1.4f;
                        }
                        u0 u0VarS4 = t.d.s(f18, this.f5875f * 1.1f, null, 4);
                        this.f5871b = 1;
                        obj = t.c.d(this.f5873d, f17, u0VarS4, null, null, this, 12);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    } else {
                        Float f19 = new Float(0.0f);
                        o1 o1VarT4 = t.d.t(this.f5876z, 0, i.f5900c, 2);
                        this.f5871b = 2;
                        obj = t.c.d(this.f5873d, f19, o1VarT4, null, null, this, 12);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    }
                } else if (i13 == 1) {
                    uk.c.R(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
        }
    }
}
