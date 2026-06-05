package ab;

import android.content.Context;
import c2.e0;
import f1.a1;
import f1.p1;
import k0.b1;
import k0.f0;
import lb.q3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Object obj3, ti.c cVar, int i10) {
        super(2, cVar);
        this.f322a = i10;
        this.f323b = obj;
        this.f324c = obj2;
        this.f325d = obj3;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f322a) {
            case 0:
                p pVar = new p((t.c) this.f324c, (t.c) this.f325d, cVar, 0);
                pVar.f323b = obj;
                return pVar;
            case 1:
                return new p((hb.h) this.f323b, (a1) this.f324c, (a1) this.f325d, cVar, 1);
            case 2:
                p pVar2 = new p((p2.a0) this.f324c, (b1) this.f325d, cVar, 2);
                pVar2.f323b = obj;
                return pVar2;
            case 3:
                return new p((lb.g) this.f323b, (a1) this.f324c, (a1) this.f325d, cVar, 3);
            case 4:
                return new p((Context) this.f323b, (a1) this.f324c, (a1) this.f325d, cVar, 4);
            case 5:
                p pVar3 = new p((Context) this.f324c, (String) this.f325d, cVar, 5);
                pVar3.f323b = obj;
                return pVar3;
            case 6:
                return new p((a1) this.f323b, (a1) this.f324c, (a1) this.f325d, cVar, 6);
            case 7:
                p pVar4 = new p((Context) this.f324c, (c2.g) this.f325d, cVar, 7);
                pVar4.f323b = obj;
                return pVar4;
            case 8:
                p pVar5 = new p((a1) this.f324c, (Context) this.f325d, cVar, 8);
                pVar5.f323b = obj;
                return pVar5;
            default:
                return new p((mg.d) this.f323b, (ra.c) this.f324c, (String) this.f325d, cVar, 9);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f322a) {
            case 0:
                p pVar = (p) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar = pi.o.f13011a;
                pVar.invokeSuspend(oVar);
                return oVar;
            case 1:
                p pVar2 = (p) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar2 = pi.o.f13011a;
                pVar2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                return ((p) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 3:
                p pVar3 = (p) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar3 = pi.o.f13011a;
                pVar3.invokeSuspend(oVar3);
                return oVar3;
            case 4:
                p pVar4 = (p) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar4 = pi.o.f13011a;
                pVar4.invokeSuspend(oVar4);
                return oVar4;
            case 5:
                p pVar5 = (p) create((p1) obj, (ti.c) obj2);
                pi.o oVar5 = pi.o.f13011a;
                pVar5.invokeSuspend(oVar5);
                return oVar5;
            case 6:
                p pVar6 = (p) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar6 = pi.o.f13011a;
                pVar6.invokeSuspend(oVar6);
                return oVar6;
            case 7:
                return ((p) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 8:
                p pVar7 = (p) create((p1) obj, (ti.c) obj2);
                pi.o oVar7 = pi.o.f13011a;
                pVar7.invokeSuspend(oVar7);
                return oVar7;
            default:
                p pVar8 = (p) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar8 = pi.o.f13011a;
                pVar8.invokeSuspend(oVar8);
                return oVar8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Object objR;
        int i10 = this.f322a;
        int i11 = 1;
        boolean zBooleanValue = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        pi.o oVar = pi.o.f13011a;
        Object obj2 = this.f325d;
        Object obj3 = this.f324c;
        switch (i10) {
            case 0:
                qj.z zVar = (qj.z) this.f323b;
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                qj.b0.w(zVar, null, new o((t.c) obj3, null, 0), 3);
                qj.b0.w(zVar, null, new o((t.c) obj2, null, 1), 3);
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                if (((Boolean) ((a1) obj3).getValue()).booleanValue()) {
                    ((hb.h) this.f323b).d(((Number) ((a1) obj2).getValue()).floatValue());
                    break;
                }
                break;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                qj.z zVar2 = (qj.z) this.f323b;
                qj.a0 a0Var = qj.a0.f13538a;
                p2.a0 a0Var2 = (p2.a0) obj3;
                b1 b1Var = (b1) obj2;
                qj.b0.w(zVar2, null, new f0(a0Var2, b1Var, objArr2 == true ? 1 : 0, i11), 1);
                break;
            case 3:
                a1 a1Var = (a1) obj2;
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                float f10 = q3.f10603g;
                if (!((Boolean) ((a1) obj3).getValue()).booleanValue() && q3.B(a1Var)) {
                    a1Var.setValue(Boolean.FALSE);
                    ((lb.g) this.f323b).y(false);
                    break;
                }
                break;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                uk.c.R(obj);
                q3.J((Context) this.f323b, (a1) obj3, (a1) obj2, false);
                break;
            case 5:
                p1 p1Var = (p1) this.f323b;
                ui.a aVar6 = ui.a.f17085a;
                uk.c.R(obj);
                Context context = (Context) obj3;
                fj.l.f(context, "<this>");
                p1Var.setValue(mb.a.n(context, (String) obj2));
                break;
            case 6:
                ui.a aVar7 = ui.a.f17085a;
                uk.c.R(obj);
                if (!((Boolean) ((a1) this.f323b).getValue()).booleanValue()) {
                    ((a1) obj3).setValue(Boolean.FALSE);
                    ((a1) obj2).setValue(null);
                    break;
                }
                break;
            case 7:
                ui.a aVar8 = ui.a.f17085a;
                uk.c.R(obj);
                try {
                    objR = new c2.g(mb.a.l((Context) obj3, e0.j((c2.g) obj2)));
                } catch (Throwable th2) {
                    objR = uk.c.r(th2);
                }
                if (!(objR instanceof pi.j)) {
                    break;
                }
                break;
            case 8:
                p1 p1Var2 = (p1) this.f323b;
                ui.a aVar9 = ui.a.f17085a;
                uk.c.R(obj);
                String str = (String) ((a1) obj3).getValue();
                if (str != null) {
                    mb.c cVarO = mb.a.o((Context) obj2, str);
                    Boolean boolValueOf = cVarO != null ? Boolean.valueOf(cVarO.f11443c) : null;
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                }
                p1Var2.setValue(Boolean.valueOf(zBooleanValue));
                break;
            default:
                ui.a aVar10 = ui.a.f17085a;
                uk.c.R(obj);
                mg.d dVar = (mg.d) this.f323b;
                ra.c cVar = (ra.c) obj3;
                mg.d dVarB = dVar.b("devlogs").b(cVar.f13948a).b("viewers").b((String) obj2);
                dVarB.c().addOnSuccessListener(new ac.h(new m(dVarB, dVar, cVar, 18), 25));
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f322a = i10;
        this.f324c = obj;
        this.f325d = obj2;
    }
}
