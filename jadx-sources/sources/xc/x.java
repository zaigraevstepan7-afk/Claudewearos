package xc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f20036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20037c;

    public /* synthetic */ x(y yVar, String str, int i10) {
        this.f20035a = i10;
        this.f20036b = yVar;
        this.f20037c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20035a) {
            case 0:
                this.f20036b.f20039b.f19890b.evaluateJavascript(this.f20037c, null);
                break;
            default:
                this.f20036b.f20039b.f19890b.evaluateJavascript(this.f20037c, null);
                break;
        }
    }
}
