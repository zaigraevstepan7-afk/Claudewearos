package d1;

import c1.w6;
import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4546a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f4547b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4548c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Serializable f4549d;

    public /* synthetic */ o(int i10, ti.c cVar) {
        super(i10, cVar);
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f4546a) {
            case 0:
                return new o((p) this.f4548c, (w6.z) this.f4549d, (ti.c) obj3).invokeSuspend(pi.o.f13011a);
            default:
                o oVar = new o(3, (ti.c) obj3);
                oVar.f4548c = (tj.f) obj;
                oVar.f4549d = (Throwable) obj2;
                return oVar.invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4546a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f4547b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    w6 w6Var = ((p) this.f4548c).f4551a;
                    w6.z zVar = (w6.z) this.f4549d;
                    this.f4547b = 1;
                    if (zVar.invoke(w6Var, this) == aVar) {
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
                tj.f fVar = (tj.f) this.f4548c;
                Throwable th2 = (Throwable) this.f4549d;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f4547b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    String message = th2.getMessage();
                    if (message == null) {
                        message = "No message provided";
                    }
                    a9.d dVar = new a9.d(new a9.b(message));
                    this.f4548c = null;
                    this.f4549d = null;
                    this.f4547b = 1;
                    if (fVar.b(dVar, this) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, w6.z zVar, ti.c cVar) {
        super(3, cVar);
        this.f4548c = pVar;
        this.f4549d = zVar;
    }
}
