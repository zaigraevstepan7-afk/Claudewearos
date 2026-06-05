package x;

import fj.s;
import java.util.List;
import java.util.concurrent.CancellationException;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19598a = 0;

    /* renamed from: b, reason: collision with root package name */
    public fj.s f19599b;

    /* renamed from: c, reason: collision with root package name */
    public int f19600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f19601d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19603f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s1 f19604z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(float f10, m mVar, h2 h2Var, ti.c cVar) {
        super(2, cVar);
        this.f19601d = f10;
        this.f19603f = mVar;
        this.f19604z = h2Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f19598a) {
            case 0:
                return new l(this.f19601d, (m) this.f19603f, (h2) this.f19604z, cVar);
            default:
                return new l((y.g) this.f19602e, this.f19601d, (ej.c) this.f19603f, this.f19604z, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f19598a) {
        }
        return ((l) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [y.d] */
    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        t.k kVar;
        fj.s sVar;
        t.u uVar;
        ab.m mVar;
        float f11;
        float f12;
        long j;
        float f13;
        final fj.s sVar2;
        Object objB;
        float f14;
        float f15;
        switch (this.f19598a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f19600c;
                if (i10 == 0) {
                    uk.c.R(obj);
                    f10 = this.f19601d;
                    if (Math.abs(f10) > 1.0f) {
                        fj.s sVar3 = new fj.s();
                        sVar3.f6804a = f10;
                        fj.s sVar4 = new fj.s();
                        t.k kVarB = t.d.b(0.0f, f10, 28);
                        try {
                            m mVar2 = (m) this.f19603f;
                            uVar = mVar2.f19625a;
                            mVar = new ab.m(sVar4, (h2) this.f19604z, sVar3, mVar2);
                            this.f19599b = sVar3;
                            this.f19602e = kVarB;
                            this.f19600c = 1;
                        } catch (CancellationException unused) {
                            kVar = kVarB;
                            sVar = sVar3;
                            sVar.f6804a = ((Number) kVar.b()).floatValue();
                            f10 = sVar.f6804a;
                            return new Float(f10);
                        }
                        if (t.d.f(kVarB, uVar, false, mVar, this) == aVar) {
                            return aVar;
                        }
                        sVar = sVar3;
                        f10 = sVar.f6804a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (t.k) this.f19602e;
                    sVar = this.f19599b;
                    try {
                        uk.c.R(obj);
                    } catch (CancellationException unused2) {
                        sVar.f6804a = ((Number) kVar.b()).floatValue();
                        f10 = sVar.f6804a;
                        return new Float(f10);
                    }
                    f10 = sVar.f6804a;
                }
                return new Float(f10);
            default:
                final ej.c cVar = (ej.c) this.f19603f;
                y.g gVar = (y.g) this.f19602e;
                q5.b bVar = gVar.f20131a;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f19600c;
                int i12 = 0;
                if (i11 == 0) {
                    uk.c.R(obj);
                    t.u uVar2 = gVar.f20132b;
                    float f16 = this.f19601d;
                    float fI = t.d.i(uVar2, 0.0f, f16);
                    g0.h0 h0Var = (g0.h0) bVar.f13235b;
                    int iM = h0Var.m();
                    f1.j1 j1Var = h0Var.f6901m;
                    int i13 = ((g0.z) j1Var.getValue()).f6996c + iM;
                    if (i13 == 0) {
                        f12 = f16;
                        f13 = 0.0f;
                        f11 = 0.0f;
                    } else {
                        int i14 = f16 < 0.0f ? h0Var.f6894e + 1 : h0Var.f6894e;
                        int iP = cg.b.p(((int) (fI / i13)) + i14, 0, h0Var.l());
                        h0Var.m();
                        int i15 = ((g0.z) j1Var.getValue()).f6996c;
                        f11 = 0.0f;
                        long j4 = i14;
                        long j10 = 1;
                        long j11 = j4 - j10;
                        if (j11 < 0) {
                            f12 = f16;
                            j = 0;
                        } else {
                            f12 = f16;
                            j = j11;
                        }
                        int i16 = (int) j;
                        long j12 = j4 + j10;
                        if (j12 > 2147483647L) {
                            j12 = 2147483647L;
                        }
                        int iAbs = Math.abs((cg.b.p(cg.b.p(iP, i16, (int) j12), 0, h0Var.l()) - i14) * i13) - i13;
                        if (iAbs < 0) {
                            iAbs = 0;
                        }
                        f13 = iAbs == 0 ? iAbs : iAbs * Math.signum(f12);
                    }
                    if (Float.isNaN(f13)) {
                        a0.a.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    sVar2 = new fj.s();
                    float fSignum = Math.signum(f12) * Math.abs(f13);
                    sVar2.f6804a = fSignum;
                    cVar.invoke(new Float(fSignum));
                    float f17 = sVar2.f6804a;
                    final int i17 = 0;
                    ?? r42 = new ej.c() { // from class: y.d
                        @Override // ej.c
                        public final Object invoke(Object obj2) {
                            int i18 = i17;
                            float fFloatValue = ((Float) obj2).floatValue();
                            switch (i18) {
                                case 0:
                                    s sVar5 = sVar2;
                                    float f18 = sVar5.f6804a - fFloatValue;
                                    sVar5.f6804a = f18;
                                    cVar.invoke(Float.valueOf(f18));
                                    break;
                                default:
                                    s sVar6 = sVar2;
                                    float f19 = sVar6.f6804a - fFloatValue;
                                    sVar6.f6804a = f19;
                                    cVar.invoke(Float.valueOf(f19));
                                    break;
                            }
                            return o.f13011a;
                        }
                    };
                    this.f19599b = sVar2;
                    this.f19600c = 1;
                    objB = y.g.b(gVar, this.f19604z, f17, this.f19601d, r42, this);
                    if (objB != aVar2) {
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return obj;
                }
                fj.s sVar5 = this.f19599b;
                uk.c.R(obj);
                sVar2 = sVar5;
                f11 = 0.0f;
                objB = obj;
                t.k kVar2 = (t.k) objB;
                float fFloatValue = ((Number) kVar2.b()).floatValue();
                g0.h0 h0Var2 = (g0.h0) bVar.f13235b;
                y.m mVar3 = h0Var2.k().f7006n;
                List list = h0Var2.k().f6994a;
                int size = list.size();
                float f18 = Float.NEGATIVE_INFINITY;
                float f19 = Float.POSITIVE_INFINITY;
                while (i12 < size) {
                    g0.i iVar = (g0.i) list.get(i12);
                    int iD = uk.c.D(h0Var2.k());
                    float f20 = f11;
                    int i18 = -h0Var2.k().f6999f;
                    int i19 = i12;
                    int i20 = h0Var2.k().f6997d;
                    List list2 = list;
                    int i21 = h0Var2.k().f6995b;
                    int i22 = iVar.j;
                    h0Var2.l();
                    float fA = i22 - mVar3.a(iD, i21, i18, i20);
                    if (fA <= f20 && fA > f18) {
                        f18 = fA;
                    }
                    if (fA >= f20 && fA < f19) {
                        f19 = fA;
                    }
                    i12 = i19 + 1;
                    f11 = f20;
                    list = list2;
                }
                float f21 = f11;
                if (f18 == Float.NEGATIVE_INFINITY) {
                    f18 = f19;
                }
                if (f19 == Float.POSITIVE_INFINITY) {
                    f19 = f18;
                }
                if (!h0Var2.d()) {
                    if (u1.b.s(h0Var2, fFloatValue)) {
                        f18 = f21;
                        f19 = f18;
                    } else {
                        f19 = f21;
                    }
                }
                if (h0Var2.c()) {
                    f14 = f18;
                    f15 = f19;
                } else if (u1.b.s(h0Var2, fFloatValue)) {
                    f15 = f19;
                    f14 = f21;
                } else {
                    f14 = f21;
                    f15 = f14;
                }
                float fFloatValue2 = ((Number) ((g0.p) bVar.f13236c).c(Float.valueOf(fFloatValue), Float.valueOf(f14), Float.valueOf(f15))).floatValue();
                if (fFloatValue2 != f14 && fFloatValue2 != f15 && fFloatValue2 != f21) {
                    a0.a.c("Final Snapping Offset Should Be one of " + f14 + ", " + f15 + " or 0.0");
                }
                if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
                    fFloatValue2 = f21;
                }
                if (Float.isNaN(fFloatValue2)) {
                    a0.a.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                sVar2.f6804a = fFloatValue2;
                t.k kVarK = t.d.k(kVar2, f21, f21, 30);
                t.u0 u0Var = gVar.f20133c;
                final int i23 = 1;
                ej.c cVar2 = new ej.c() { // from class: y.d
                    @Override // ej.c
                    public final Object invoke(Object obj2) {
                        int i182 = i23;
                        float fFloatValue3 = ((Float) obj2).floatValue();
                        switch (i182) {
                            case 0:
                                s sVar52 = sVar2;
                                float f182 = sVar52.f6804a - fFloatValue3;
                                sVar52.f6804a = f182;
                                cVar.invoke(Float.valueOf(f182));
                                break;
                            default:
                                s sVar6 = sVar2;
                                float f192 = sVar6.f6804a - fFloatValue3;
                                sVar6.f6804a = f192;
                                cVar.invoke(Float.valueOf(f192));
                                break;
                        }
                        return o.f13011a;
                    }
                };
                this.f19599b = null;
                this.f19600c = 2;
                Object objB2 = y.k.b(this.f19604z, fFloatValue2, fFloatValue2, kVarK, u0Var, cVar2, this);
                if (objB2 != aVar2) {
                    return objB2;
                }
                return aVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y.g gVar, float f10, ej.c cVar, s1 s1Var, ti.c cVar2) {
        super(2, cVar2);
        this.f19602e = gVar;
        this.f19601d = f10;
        this.f19603f = cVar;
        this.f19604z = s1Var;
    }
}
