package w2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f18351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(t tVar, int i10) {
        super(1);
        this.f18350a = i10;
        this.f18351b = tVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f18350a) {
            case 0:
                ((a2.q) this.f18351b.getFocusOwner()).g(((a2.f) obj).f19a, false);
                return pi.o.f13011a;
            case 1:
                ej.a aVar = (ej.a) obj;
                t tVar = this.f18351b;
                tVar.getUncaughtExceptionHandler$ui();
                Handler handler = tVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.a();
                } else {
                    Handler handler2 = tVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new p0.c(4, aVar));
                    }
                }
                return pi.o.f13011a;
            default:
                t tVar2 = this.f18351b;
                return new i0(tVar2, tVar2.getTextInputService(), (qj.z) obj);
        }
    }
}
