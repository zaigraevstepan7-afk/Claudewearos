package x3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f19827a;

    /* renamed from: b, reason: collision with root package name */
    public j f19828b;

    /* renamed from: c, reason: collision with root package name */
    public k f19829c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19830d;

    public final void finalize() {
        k kVar;
        j jVar = this.f19828b;
        if (jVar != null) {
            i iVar = jVar.f19832b;
            if (!iVar.isDone()) {
                iVar.x(new e8.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f19827a, 3));
            }
        }
        if (this.f19830d || (kVar = this.f19829c) == null) {
            return;
        }
        kVar.w(null);
    }
}
