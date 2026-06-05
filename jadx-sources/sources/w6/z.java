package w6;

import c1.w6;
import f1.j1;
import g0.b0;
import k0.l1;
import qj.e1;
import v.f1;
import v.i1;
import x.j2;
import x.l0;
import x.l2;
import x.o0;
import x.o1;
import x.p0;
import x.q0;
import x.r1;
import x.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18886a;

    /* renamed from: b, reason: collision with root package name */
    public int f18887b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Object obj2, Object obj3, ti.c cVar, int i10) {
        super(2, cVar);
        this.f18886a = i10;
        this.f18888c = obj;
        this.f18889d = obj2;
        this.f18890e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ej.e, vi.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ej.e, vi.i] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f18886a) {
            case 0:
                z zVar = new z((qj.r) this.f18889d, (ej.e) this.f18890e, cVar);
                zVar.f18888c = obj;
                return zVar;
            case 1:
                return new z((tj.e) this.f18888c, (g0.d) this.f18889d, (qj.z) this.f18890e, cVar, 1);
            case 2:
                z zVar2 = new z((x.n) this.f18889d, (ej.e) this.f18890e, cVar, 2);
                zVar2.f18888c = obj;
                return zVar2;
            case 3:
                return new z((x.n) this.f18888c, (f1) this.f18889d, (ej.e) this.f18890e, cVar, 3);
            case 4:
                z zVar3 = new z((l0) this.f18889d, (q0) this.f18890e, cVar, 4);
                zVar3.f18888c = obj;
                return zVar3;
            case 5:
                z zVar4 = new z((q0) this.f18889d, (x.w) this.f18890e, cVar, 5);
                zVar4.f18888c = obj;
                return zVar4;
            case 6:
                z zVar5 = new z((l0) this.f18889d, (l2) this.f18890e, cVar, 6);
                zVar5.f18888c = obj;
                return zVar5;
            case 7:
                z zVar6 = new z((l2) this.f18889d, (ej.e) this.f18890e, cVar, 7);
                zVar6.f18888c = obj;
                return zVar6;
            case 8:
                return new z((l1) this.f18888c, (r1) this.f18889d, (p2.w) this.f18890e, cVar, 8);
            default:
                z zVar7 = new z((e1) this.f18889d, (ej.e) this.f18890e, cVar);
                zVar7.f18888c = obj;
                return zVar7;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18886a) {
        }
        return ((z) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ej.e, vi.i] */
    /* JADX WARN: Type inference failed for: r4v14, types: [ej.e, vi.i] */
    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        qj.z zVar;
        int i10 = this.f18886a;
        ti.c cVar = null;
        int i11 = 2;
        pi.o oVar = pi.o.f13011a;
        Object obj2 = this.f18890e;
        Object obj3 = this.f18889d;
        int i12 = 1;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                ?? r12 = this.f18887b;
                try {
                    if (r12 == 0) {
                        uk.c.R(obj);
                        qj.z zVar2 = (qj.z) this.f18888c;
                        qj.r rVar = (qj.r) obj3;
                        ?? r42 = (vi.i) obj2;
                        this.f18888c = rVar;
                        this.f18887b = 1;
                        obj = r42.invoke(zVar2, this);
                        r12 = rVar;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (r12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qj.q qVar = (qj.q) this.f18888c;
                        uk.c.R(obj);
                        r12 = qVar;
                    }
                } catch (Throwable th2) {
                    obj = uk.c.r(th2);
                }
                Throwable thA = pi.k.a(obj);
                qj.r rVar2 = (qj.r) r12;
                if (thA == null) {
                    rVar2.R(obj);
                    return oVar;
                }
                rVar2.h0(thA);
                return oVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i13 = this.f18887b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                tj.e eVar = (tj.e) this.f18888c;
                if (eVar == null) {
                    return oVar;
                }
                b1.g gVar = new b1.g(9, (g0.d) obj3, (qj.z) obj2);
                this.f18887b = 1;
                return eVar.c(gVar, this) == aVar2 ? aVar2 : oVar;
            case 2:
                j1 j1Var = ((x.n) obj3).f19640d;
                ui.a aVar3 = ui.a.f17085a;
                int i14 = this.f18887b;
                try {
                    if (i14 == 0) {
                        uk.c.R(obj);
                        s1 s1Var = (s1) this.f18888c;
                        j1Var.setValue(Boolean.TRUE);
                        this.f18887b = 1;
                        if (((ej.e) obj2).invoke(s1Var, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                    }
                    j1Var.setValue(Boolean.FALSE);
                    return oVar;
                } catch (Throwable th3) {
                    j1Var.setValue(Boolean.FALSE);
                    throw th3;
                }
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                int i15 = this.f18887b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                x.n nVar = (x.n) this.f18888c;
                v.j1 j1Var2 = nVar.f19639c;
                b0 b0Var = nVar.f19638b;
                z zVar3 = new z(nVar, (ej.e) obj2, cVar, i11);
                this.f18887b = 1;
                j1Var2.getClass();
                return qj.b0.h(new i1((f1) obj3, j1Var2, zVar3, b0Var, null), this) == aVar4 ? aVar4 : oVar;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                int i16 = this.f18887b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                x.a aVar6 = new x.a(i12, (w6) this.f18888c, (q0) obj2);
                this.f18887b = 1;
                return ((l0) obj3).invoke(aVar6, this) == aVar5 ? aVar5 : oVar;
            case 5:
                q0 q0Var = (q0) obj3;
                ui.a aVar7 = ui.a.f17085a;
                int i17 = this.f18887b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                qj.z zVar4 = (qj.z) this.f18888c;
                ej.f fVar = q0Var.f19685g0;
                long jF = s3.q.f(((x.w) obj2).f19743a, q0Var.f19686h0 ? -1.0f : 1.0f);
                o1 o1Var = q0Var.f19682d0;
                o0 o0Var = p0.f19671a;
                Float f10 = new Float(o1Var == o1.f19664a ? s3.q.c(jF) : s3.q.b(jF));
                this.f18887b = 1;
                return fVar.c(zVar4, f10, this) == aVar7 ? aVar7 : oVar;
            case 6:
                ui.a aVar8 = ui.a.f17085a;
                int i18 = this.f18887b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                x.a aVar9 = new x.a(i11, (j2) this.f18888c, (l2) obj2);
                this.f18887b = 1;
                return ((l0) obj3).invoke(aVar9, this) == aVar8 ? aVar8 : oVar;
            case 7:
                ui.a aVar10 = ui.a.f17085a;
                int i19 = this.f18887b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                l2 l2Var = (l2) obj3;
                l2Var.f19622k = (s1) this.f18888c;
                j2 j2Var = l2Var.f19623l;
                this.f18887b = 1;
                return ((ej.e) obj2).invoke(j2Var, this) == aVar10 ? aVar10 : oVar;
            case 8:
                ui.a aVar11 = ui.a.f17085a;
                int i20 = this.f18887b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                l1 l1Var = (l1) this.f18888c;
                long j = ((p2.w) obj2).f12762c;
                this.f18887b = 1;
                l1 l1Var2 = new l1(l1Var.f9168d, l1Var.f9169e, l1Var.f9170f, this);
                l1Var2.f9166b = (r1) obj3;
                l1Var2.f9167c = j;
                return l1Var2.invokeSuspend(oVar) == aVar11 ? aVar11 : oVar;
            default:
                ui.a aVar12 = ui.a.f17085a;
                int i21 = this.f18887b;
                if (i21 == 0) {
                    uk.c.R(obj);
                    qj.z zVar5 = (qj.z) this.f18888c;
                    this.f18888c = zVar5;
                    this.f18887b = 1;
                    if (((e1) obj3).W(this) != aVar12) {
                        zVar = zVar5;
                    }
                    return aVar12;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                zVar = (qj.z) this.f18888c;
                uk.c.R(obj);
                this.f18888c = null;
                this.f18887b = 2;
                if (((vi.i) obj2).invoke(zVar, this) != aVar12) {
                    return oVar;
                }
                return aVar12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f18886a = i10;
        this.f18889d = obj;
        this.f18890e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(qj.r rVar, ej.e eVar, ti.c cVar) {
        super(2, cVar);
        this.f18886a = 0;
        this.f18889d = rVar;
        this.f18890e = (vi.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(e1 e1Var, ej.e eVar, ti.c cVar) {
        super(2, cVar);
        this.f18886a = 9;
        this.f18889d = e1Var;
        this.f18890e = (vi.i) eVar;
    }
}
