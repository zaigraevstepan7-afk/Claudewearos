package t;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(String str, int i10) {
        super(str);
        this.f15236a = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f15236a) {
            case 0:
                setStackTrace(u.a.f16473a);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }
}
