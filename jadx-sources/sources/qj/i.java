package qj;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13582a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13583b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f13582a = i10;
        this.f13583b = obj;
    }

    @Override // qj.j
    public final void a(Throwable th2) {
        switch (this.f13582a) {
            case 0:
                ((ScheduledFuture) this.f13583b).cancel(false);
                break;
            case 1:
                ((ej.c) this.f13583b).invoke(th2);
                break;
            default:
                ((o0) this.f13583b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f13582a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f13583b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ej.c) this.f13583b).getClass().getSimpleName() + '@' + b0.n(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f13583b) + ']';
        }
    }
}
