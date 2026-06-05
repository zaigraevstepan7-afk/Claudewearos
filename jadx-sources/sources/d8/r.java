package d8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final s f5036a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5037b;

    public r(s sVar, String str) {
        this.f5036a = sVar;
        this.f5037b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5036a.f5042d) {
            try {
                if (((r) this.f5036a.f5040b.remove(this.f5037b)) != null) {
                    q qVar = (q) this.f5036a.f5041c.remove(this.f5037b);
                    if (qVar != null) {
                        String str = this.f5037b;
                        t7.m.g().c(w7.e.C, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((w7.e) qVar).d();
                    }
                } else {
                    t7.m.g().c("WrkTimerRunnable", "Timer with " + this.f5037b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
