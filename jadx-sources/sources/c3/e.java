package c3;

import android.os.CancellationSignal;
import fj.m;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f3086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CancellationSignal cancellationSignal, int i10) {
        super(1);
        this.f3085a = i10;
        this.f3086b = cancellationSignal;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f3085a) {
            case 0:
                if (((Throwable) obj) != null) {
                    this.f3086b.cancel();
                }
                break;
            default:
                this.f3086b.cancel();
                break;
        }
        return o.f13011a;
    }
}
