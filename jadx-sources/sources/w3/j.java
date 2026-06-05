package w3;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f18516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(x xVar, int i10) {
        super(1);
        this.f18515a = i10;
        this.f18516b = xVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f18515a) {
            case 0:
                t2.w wVarD0 = ((t2.w) obj).d0();
                fj.l.c(wVarD0);
                this.f18516b.q(wVarD0);
                break;
            case 1:
                s3.l lVar = new s3.l(((s3.l) obj).f14751a);
                x xVar = this.f18516b;
                xVar.m19setPopupContentSizefhxjrPA(lVar);
                xVar.r();
                break;
            default:
                ej.a aVar = (ej.a) obj;
                x xVar2 = this.f18516b;
                Handler handler = xVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.a();
                } else {
                    Handler handler2 = xVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new p0.c(5, aVar));
                    }
                }
                break;
        }
        return pi.o.f13011a;
    }
}
