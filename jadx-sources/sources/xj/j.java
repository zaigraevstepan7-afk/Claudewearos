package xj;

import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f20101c;

    public j(Runnable runnable, long j, boolean z2) {
        super(j, z2);
        this.f20101c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20101c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f20101c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.n(runnable));
        sb2.append(", ");
        sb2.append(this.f20099a);
        sb2.append(", ");
        return m6.a.i(sb2, this.f20100b ? "Blocking" : "Non-blocking", ']');
    }
}
