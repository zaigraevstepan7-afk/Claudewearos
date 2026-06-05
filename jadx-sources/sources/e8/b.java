package e8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(str);
        this.f5806a = i10;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f5806a) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 1:
            default:
                return super.fillInStackTrace();
            case 2:
                synchronized (this) {
                }
                return this;
            case 3:
                synchronized (this) {
                }
                return this;
        }
    }
}
