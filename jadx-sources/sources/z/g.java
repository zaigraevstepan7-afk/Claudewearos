package z;

import f1.a1;
import java.util.ArrayList;
import qj.z;
import tj.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20341a;

    /* renamed from: b, reason: collision with root package name */
    public int f20342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f20343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f20344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, a1 a1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f20341a = i10;
        this.f20343c = kVar;
        this.f20344d = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f20341a) {
            case 0:
                return new g(this.f20343c, this.f20344d, cVar, 0);
            default:
                return new g(this.f20343c, this.f20344d, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f20341a) {
        }
        return ((g) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f20341a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f20342b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return pi.o.f13011a;
                }
                uk.c.R(obj);
                ArrayList arrayList = new ArrayList();
                h0 h0Var = this.f20343c.f20346a;
                f fVar = new f(arrayList, this.f20344d, 0);
                this.f20342b = 1;
                h0Var.getClass();
                h0.k(h0Var, fVar, this);
                return aVar;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f20342b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return pi.o.f13011a;
                }
                uk.c.R(obj);
                ArrayList arrayList2 = new ArrayList();
                h0 h0Var2 = this.f20343c.f20346a;
                f fVar2 = new f(arrayList2, this.f20344d, 1);
                this.f20342b = 1;
                h0Var2.getClass();
                h0.k(h0Var2, fVar2, this);
                return aVar2;
        }
    }
}
