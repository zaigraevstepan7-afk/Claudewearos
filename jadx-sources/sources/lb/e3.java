package lb;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10257a;

    /* renamed from: b, reason: collision with root package name */
    public f1.p1 f10258b;

    /* renamed from: c, reason: collision with root package name */
    public int f10259c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f10261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f10262f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10263z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(Context context, g gVar, f1.a1 a1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f10257a = i10;
        this.f10261e = context;
        this.f10262f = gVar;
        this.f10263z = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f10257a) {
            case 0:
                e3 e3Var = new e3(this.f10261e, this.f10262f, this.f10263z, cVar, 0);
                e3Var.f10260d = obj;
                return e3Var;
            case 1:
                e3 e3Var2 = new e3(this.f10261e, this.f10262f, this.f10263z, cVar, 1);
                e3Var2.f10260d = obj;
                return e3Var2;
            default:
                e3 e3Var3 = new e3(this.f10261e, this.f10262f, this.f10263z, cVar, 2);
                e3Var3.f10260d = obj;
                return e3Var3;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.p1 p1Var = (f1.p1) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f10257a) {
        }
        return ((e3) create(p1Var, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        f1.p1 p1Var;
        f1.p1 p1Var2;
        f1.p1 p1Var3;
        int i10 = this.f10257a;
        pi.o oVar = pi.o.f13011a;
        f1.a1 a1Var = this.f10263z;
        g gVar = this.f10262f;
        switch (i10) {
            case 0:
                f1.p1 p1Var4 = (f1.p1) this.f10260d;
                ui.a aVar = ui.a.f17085a;
                int i11 = this.f10259c;
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f10260d = p1Var4;
                    this.f10258b = p1Var4;
                    this.f10259c = 1;
                    float f10 = q3.f10603g;
                    String strA = gVar.a();
                    String str = strA == null ? "img.png" : strA;
                    Uri uriS = gVar.s();
                    xj.e eVar = qj.m0.f13601a;
                    obj = qj.b0.G(xj.d.f20094c, new ab.s(this.f10261e, str, uriS, (ti.c) null, 14), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    p1Var = p1Var4;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p1Var = this.f10258b;
                    uk.c.R(obj);
                }
                p1Var.setValue(obj);
                if (p1Var4.f6412a.getValue() == null) {
                    return oVar;
                }
                c2.g gVar2 = (c2.g) p1Var4.f6412a.getValue();
                float f11 = q3.f10603g;
                a1Var.setValue(gVar2);
                return oVar;
            case 1:
                f1.p1 p1Var5 = (f1.p1) this.f10260d;
                ui.a aVar2 = ui.a.f17085a;
                int i12 = this.f10259c;
                if (i12 == 0) {
                    uk.c.R(obj);
                    this.f10260d = p1Var5;
                    this.f10258b = p1Var5;
                    this.f10259c = 1;
                    float f12 = q3.f10603g;
                    String strA2 = gVar.a();
                    String str2 = strA2 == null ? "img.png" : strA2;
                    Uri uriS2 = gVar.s();
                    xj.e eVar2 = qj.m0.f13601a;
                    obj = qj.b0.G(xj.d.f20094c, new ab.s(this.f10261e, str2, uriS2, (ti.c) null, 14), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    p1Var2 = p1Var5;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p1Var2 = this.f10258b;
                    uk.c.R(obj);
                }
                p1Var2.setValue(obj);
                if (p1Var5.f6412a.getValue() == null) {
                    return oVar;
                }
                c2.g gVar3 = (c2.g) p1Var5.f6412a.getValue();
                float f13 = q3.f10603g;
                a1Var.setValue(gVar3);
                return oVar;
            default:
                f1.p1 p1Var6 = (f1.p1) this.f10260d;
                ui.a aVar3 = ui.a.f17085a;
                int i13 = this.f10259c;
                if (i13 == 0) {
                    uk.c.R(obj);
                    this.f10260d = p1Var6;
                    this.f10258b = p1Var6;
                    this.f10259c = 1;
                    float f14 = q3.f10603g;
                    String strA3 = gVar.a();
                    String str3 = strA3 == null ? "img.png" : strA3;
                    Uri uriS3 = gVar.s();
                    xj.e eVar3 = qj.m0.f13601a;
                    obj = qj.b0.G(xj.d.f20094c, new ab.s(this.f10261e, str3, uriS3, (ti.c) null, 14), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    p1Var3 = p1Var6;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p1Var3 = this.f10258b;
                    uk.c.R(obj);
                }
                p1Var3.setValue(obj);
                if (p1Var6.f6412a.getValue() == null) {
                    return oVar;
                }
                c2.g gVar4 = (c2.g) p1Var6.f6412a.getValue();
                float f15 = q3.f10603g;
                a1Var.setValue(gVar4);
                return oVar;
        }
    }
}
