package e8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final k f5818a;

    /* renamed from: b, reason: collision with root package name */
    public final mf.a f5819b;

    public f(k kVar, mf.a aVar) {
        this.f5818a = kVar;
        this.f5819b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5818a.f5827a != this) {
            return;
        }
        if (i.f5825f.n(this.f5818a, this, i.e(this.f5819b))) {
            i.b(this.f5818a);
        }
    }
}
