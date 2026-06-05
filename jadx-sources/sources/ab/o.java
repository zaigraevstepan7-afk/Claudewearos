package ab;

import t.o1;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319a;

    /* renamed from: b, reason: collision with root package name */
    public int f320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t.c cVar, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f319a = i10;
        this.f321c = cVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f319a) {
            case 0:
                return new o(this.f321c, cVar, 0);
            case 1:
                return new o(this.f321c, cVar, 1);
            case 2:
                return new o(this.f321c, cVar, 2);
            case 3:
                return new o(this.f321c, cVar, 3);
            case 4:
                return new o(this.f321c, cVar, 4);
            case 5:
                return new o(this.f321c, cVar, 5);
            case 6:
                return new o(this.f321c, cVar, 6);
            case 7:
                return new o(this.f321c, cVar, 7);
            case 8:
                return new o(this.f321c, cVar, 8);
            case 9:
                return new o(this.f321c, cVar, 9);
            case 10:
                return new o(this.f321c, cVar, 10);
            case 11:
                return new o(this.f321c, cVar, 11);
            case 12:
                return new o(this.f321c, cVar, 12);
            case 13:
                return new o(this.f321c, cVar, 13);
            case 14:
                return new o(this.f321c, cVar, 14);
            default:
                return new o(this.f321c, cVar, 15);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f319a) {
        }
        return ((o) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f319a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f320b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    Float f10 = new Float(1.0f);
                    o1 o1VarT = t.d.t(220, 0, t.y.f15327b, 2);
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f10, o1VarT, null, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f320b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    Float f11 = new Float(0.0f);
                    o1 o1VarT2 = t.d.t(160, 0, t.y.f15327b, 2);
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f11, o1VarT2, null, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f320b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    Float f12 = new Float(0.0f);
                    this.f320b = 1;
                    if (this.f321c.f(f12, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                int i13 = this.f320b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    Float f13 = new Float(0.0f);
                    this.f320b = 1;
                    if (this.f321c.f(f13, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                int i14 = this.f320b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    Float f14 = new Float(0.0f);
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f14, null, null, null, this, 14) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 5:
                ui.a aVar6 = ui.a.f17085a;
                int i15 = this.f320b;
                if (i15 == 0) {
                    uk.c.R(obj);
                    Float f15 = new Float(0.0f);
                    u0 u0Var = new u0(1.0f, 300.0f, new Float(0.5f));
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f15, u0Var, null, null, this, 12) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 6:
                ui.a aVar7 = ui.a.f17085a;
                int i16 = this.f320b;
                if (i16 == 0) {
                    uk.c.R(obj);
                    Float f16 = new Float(0.82f);
                    o1 o1VarT3 = t.d.t(80, 0, null, 6);
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f16, o1VarT3, null, null, this, 12) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                        return pi.o.f13011a;
                    }
                    uk.c.R(obj);
                }
                Float f17 = new Float(1.0f);
                u0 u0VarS = t.d.s(0.5f, 0.0f, null, 6);
                this.f320b = 2;
                if (t.c.d(this.f321c, f17, u0VarS, null, null, this, 12) == aVar7) {
                    return aVar7;
                }
                return pi.o.f13011a;
            case 7:
                ui.a aVar8 = ui.a.f17085a;
                int i17 = this.f320b;
                if (i17 == 0) {
                    uk.c.R(obj);
                    Float f18 = new Float(0.0f);
                    this.f320b = 1;
                    if (this.f321c.f(f18, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 8:
                ui.a aVar9 = ui.a.f17085a;
                int i18 = this.f320b;
                if (i18 == 0) {
                    uk.c.R(obj);
                    Float f19 = new Float(1.0f);
                    o1 o1Var = va.f.f17932a;
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f19, o1Var, null, null, this, 12) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 9:
                ui.a aVar10 = ui.a.f17085a;
                int i19 = this.f320b;
                if (i19 == 0) {
                    uk.c.R(obj);
                    Float f20 = new Float(0.0f);
                    o1 o1Var2 = va.f.f17932a;
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f20, o1Var2, null, null, this, 12) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 10:
                ui.a aVar11 = ui.a.f17085a;
                int i20 = this.f320b;
                if (i20 == 0) {
                    uk.c.R(obj);
                    Float f21 = new Float(0.0f);
                    o1 o1Var3 = va.f.f17932a;
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f21, o1Var3, null, null, this, 12) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 11:
                ui.a aVar12 = ui.a.f17085a;
                int i21 = this.f320b;
                if (i21 == 0) {
                    uk.c.R(obj);
                    Float f22 = new Float(28.0f);
                    o1 o1Var4 = va.f.f17932a;
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f22, o1Var4, null, null, this, 12) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 12:
                ui.a aVar13 = ui.a.f17085a;
                int i22 = this.f320b;
                if (i22 == 0) {
                    uk.c.R(obj);
                    Float f23 = new Float(1.0f);
                    o1 o1Var5 = va.f.f17932a;
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f23, o1Var5, null, null, this, 12) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 13:
                ui.a aVar14 = ui.a.f17085a;
                int i23 = this.f320b;
                if (i23 == 0) {
                    uk.c.R(obj);
                    Float f24 = new Float(81.0f);
                    u0 u0Var2 = va.f.f17933b;
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f24, u0Var2, null, null, this, 12) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 14:
                ui.a aVar15 = ui.a.f17085a;
                int i24 = this.f320b;
                if (i24 == 0) {
                    uk.c.R(obj);
                    Float f25 = new Float(0.0f);
                    u0 u0Var3 = va.f.f17933b;
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f25, u0Var3, null, null, this, 12) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar16 = ui.a.f17085a;
                int i25 = this.f320b;
                if (i25 == 0) {
                    uk.c.R(obj);
                    Float f26 = new Float(0.0f);
                    o1 o1VarT4 = t.d.t(160, 0, t.y.f15327b, 2);
                    this.f320b = 1;
                    if (t.c.d(this.f321c, f26, o1VarT4, null, null, this, 12) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
