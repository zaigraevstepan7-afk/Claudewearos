package ra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13967a;

    /* renamed from: b, reason: collision with root package name */
    public int f13968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f13969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i10, f1.a1 a1Var, ti.c cVar) {
        super(2, cVar);
        this.f13967a = i10;
        this.f13969c = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f13967a) {
            case 0:
                return new d0(0, this.f13969c, cVar);
            case 1:
                return new d0(1, this.f13969c, cVar);
            case 2:
                return new d0(2, this.f13969c, cVar);
            default:
                return new d0(3, this.f13969c, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f13967a) {
            case 0:
                return ((d0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((d0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
            case 2:
                ((d0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
                return ui.a.f17085a;
            default:
                return ((d0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f13967a;
        pi.o oVar = pi.o.f13011a;
        f1.a1 a1Var = this.f13969c;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i11 = this.f13968b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    b.m(a1Var, false);
                    this.f13968b = 1;
                    if (qj.b0.i(100L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                b.m(a1Var, true);
                return oVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i12 = this.f13968b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    this.f13968b = 1;
                    if (qj.b0.i(200L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                t.o1 o1Var = va.m.f17955a;
                a1Var.setValue(Boolean.TRUE);
                return oVar;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i13 = this.f13968b;
                if (i13 != 0 && i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uk.c.R(obj);
                do {
                    String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
                    fj.l.e(str, "format(...)");
                    a1Var.setValue(str);
                    this.f13968b = 1;
                } while (qj.b0.i(1000L, this) != aVar3);
                return aVar3;
            default:
                ui.a aVar4 = ui.a.f17085a;
                int i14 = this.f13968b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    oj.f fVar = oj.a.f12531b;
                    long jJ0 = yd.f.j0(1, oj.c.f12539e);
                    this.f13968b = 1;
                    Object objI = qj.b0.i(qj.b0.D(jJ0), this);
                    if (objI != aVar4) {
                        objI = oVar;
                    }
                    if (objI == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                int i15 = za.d.f20480c;
                a1Var.setValue(Boolean.TRUE);
                return oVar;
        }
    }
}
