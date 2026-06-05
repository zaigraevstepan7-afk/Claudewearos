package ra;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends vi.i implements ej.e {
    public final /* synthetic */ f1.a1 A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14023a = 1;

    /* renamed from: b, reason: collision with root package name */
    public f1.p1 f14024b;

    /* renamed from: c, reason: collision with root package name */
    public int f14025c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f14027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f14028f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f14029z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, ti.c cVar) {
        super(2, cVar);
        this.f14027e = context;
        this.f14028f = a1Var;
        this.f14029z = a1Var2;
        this.A = a1Var3;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14023a) {
            case 0:
                i0 i0Var = new i0(this.f14028f, this.f14027e, this.f14029z, this.A, cVar);
                i0Var.f14026d = obj;
                return i0Var;
            default:
                i0 i0Var2 = new i0(this.f14027e, this.f14028f, this.f14029z, this.A, cVar);
                i0Var2.f14026d = obj;
                return i0Var2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.p1 p1Var = (f1.p1) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14023a) {
        }
        return ((i0) create(p1Var, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        c2.g gVar;
        f1.p1 p1Var;
        f1.p1 p1Var2;
        int i10 = this.f14023a;
        pi.o oVar = pi.o.f13011a;
        f1.a1 a1Var = this.A;
        f1.a1 a1Var2 = this.f14029z;
        f1.a1 a1Var3 = this.f14028f;
        int i11 = 1;
        switch (i10) {
            case 0:
                f1.p1 p1Var3 = (f1.p1) this.f14026d;
                ui.a aVar = ui.a.f17085a;
                int i12 = this.f14025c;
                if (i12 == 0) {
                    uk.c.R(obj);
                    String str = (String) a1Var3.getValue();
                    Context context = this.f14027e;
                    gVar = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    if (str != null) {
                        String str2 = (String) a1Var3.getValue();
                        fj.l.c(str2);
                        xj.e eVar = qj.m0.f13601a;
                        xj.d dVar = xj.d.f20094c;
                        ab.r rVar = new ab.r(context, str2, objArr2 == true ? 1 : 0, 10);
                        this.f14026d = p1Var3;
                        this.f14024b = p1Var3;
                        this.f14025c = 1;
                        obj = qj.b0.G(dVar, rVar, this);
                        if (obj != aVar) {
                            p1Var = p1Var3;
                            gVar = (c2.g) obj;
                        }
                    } else if (((Uri) a1Var2.getValue()) != null) {
                        Uri uri = (Uri) a1Var2.getValue();
                        fj.l.c(uri);
                        xj.e eVar2 = qj.m0.f13601a;
                        xj.d dVar2 = xj.d.f20094c;
                        fb.a aVar2 = new fb.a(context, uri, objArr == true ? 1 : 0, i11);
                        this.f14026d = p1Var3;
                        this.f14024b = p1Var3;
                        this.f14025c = 2;
                        obj = qj.b0.G(dVar2, aVar2, this);
                        if (obj != aVar) {
                            p1Var = p1Var3;
                            gVar = (c2.g) obj;
                        }
                    } else {
                        p1Var = p1Var3;
                    }
                    return aVar;
                }
                if (i12 == 1) {
                    p1Var = this.f14024b;
                    uk.c.R(obj);
                    gVar = (c2.g) obj;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p1Var = this.f14024b;
                    uk.c.R(obj);
                    gVar = (c2.g) obj;
                }
                p1Var.setValue(gVar);
                if (p1Var3.f6412a.getValue() == null) {
                    return oVar;
                }
                a1Var.setValue((c2.g) p1Var3.f6412a.getValue());
                return oVar;
            default:
                f1.p1 p1Var4 = (f1.p1) this.f14026d;
                ui.a aVar3 = ui.a.f17085a;
                int i13 = this.f14025c;
                if (i13 == 0) {
                    uk.c.R(obj);
                    String str3 = (String) a1Var3.getValue();
                    Uri uri2 = (Uri) a1Var2.getValue();
                    this.f14026d = p1Var4;
                    this.f14024b = p1Var4;
                    this.f14025c = 1;
                    xj.e eVar3 = qj.m0.f13601a;
                    obj = qj.b0.G(xj.d.f20094c, new ab.s(this.f14027e, str3, uri2, (ti.c) null, 14), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    p1Var2 = p1Var4;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p1Var2 = this.f14024b;
                    uk.c.R(obj);
                }
                p1Var2.setValue(obj);
                if (p1Var4.f6412a.getValue() == null) {
                    return oVar;
                }
                a1Var.setValue((c2.g) p1Var4.f6412a.getValue());
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f1.a1 a1Var, Context context, f1.a1 a1Var2, f1.a1 a1Var3, ti.c cVar) {
        super(2, cVar);
        this.f14028f = a1Var;
        this.f14027e = context;
        this.f14029z = a1Var2;
        this.A = a1Var3;
    }
}
