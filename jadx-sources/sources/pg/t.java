package pg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f12954b;

    public /* synthetic */ t(v vVar, int i10) {
        this.f12953a = i10;
        this.f12954b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12953a) {
            case 0:
                v vVar = this.f12954b;
                p1.l lVar = vVar.j;
                if (!vVar.f12959b && !vVar.f12960c) {
                    if (lVar.A()) {
                        lVar.l(null, "timed out on connect", new Object[0]);
                    }
                    ((ah.e) vVar.f12958a.f15363b).a();
                    break;
                }
                break;
            default:
                v vVar2 = this.f12954b;
                t0.j jVar = vVar2.f12958a;
                if (jVar != null) {
                    jVar.t("0");
                    vVar2.e();
                    break;
                }
                break;
        }
    }
}
