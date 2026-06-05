package androidx.lifecycle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final v f1151a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1152b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1153c;

    public w0(v vVar, n nVar) {
        fj.l.f(vVar, "registry");
        fj.l.f(nVar, "event");
        this.f1151a = vVar;
        this.f1152b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1153c) {
            return;
        }
        this.f1151a.d(this.f1152b);
        this.f1153c = true;
    }
}
