package rg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pg.b f14389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14390c;

    public /* synthetic */ d(pg.b bVar, String str, int i10) {
        this.f14388a = i10;
        this.f14389b = bVar;
        this.f14390c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14388a) {
            case 0:
                this.f14389b.p(this.f14390c);
                break;
            default:
                this.f14389b.x(this.f14390c);
                break;
        }
    }
}
