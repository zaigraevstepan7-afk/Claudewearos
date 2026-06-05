package c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1806b;

    public /* synthetic */ c(m mVar, int i10) {
        this.f1805a = i10;
        this.f1806b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1805a) {
            case 0:
                m.f(this.f1806b);
                break;
            default:
                this.f1806b.invalidateOptionsMenu();
                break;
        }
    }
}
