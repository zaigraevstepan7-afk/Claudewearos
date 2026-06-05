package pg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.j f12956b;

    public /* synthetic */ u(t0.j jVar, int i10) {
        this.f12955a = i10;
        this.f12956b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12955a) {
            case 0:
                t0.j jVar = this.f12956b;
                ((v) jVar.f15364c).f12965h.cancel(false);
                v vVar = (v) jVar.f15364c;
                vVar.f12959b = true;
                if (vVar.j.A()) {
                    ((v) jVar.f15364c).j.l(null, "websocket opened", new Object[0]);
                }
                ((v) jVar.f15364c).e();
                break;
            default:
                t0.j jVar2 = this.f12956b;
                if (((v) jVar2.f15364c).j.A()) {
                    ((v) jVar2.f15364c).j.l(null, "closed", new Object[0]);
                }
                v.a((v) jVar2.f15364c);
                break;
        }
    }
}
