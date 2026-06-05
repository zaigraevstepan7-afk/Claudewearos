package a0;

import java.util.concurrent.CancellationException;
import p1.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(str);
        this.f2a = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2a) {
            case 0:
                setStackTrace(c.f3a);
                break;
            case 1:
                setStackTrace(j.f12647a);
                break;
            default:
                setStackTrace(s2.b.f14735a);
                break;
        }
        return this;
    }
}
