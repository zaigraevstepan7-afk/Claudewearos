package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends p1.b {

    /* renamed from: a, reason: collision with root package name */
    public qj.l f6273a;

    /* renamed from: b, reason: collision with root package name */
    public ej.c f6274b;

    @Override // p1.b
    public final void a() {
        this.f6274b = null;
        this.f6273a = null;
    }

    @Override // p1.b
    public final void b(Throwable th2) {
        qj.l lVar = this.f6273a;
        if (lVar != null) {
            lVar.resumeWith(uk.c.r(th2));
        }
    }
}
