package d8;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f5038e = t7.m.l("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f5039a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5040b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5041c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5042d;

    public s() {
        p pVar = new p();
        pVar.f5035a = 0;
        this.f5040b = new HashMap();
        this.f5041c = new HashMap();
        this.f5042d = new Object();
        this.f5039a = Executors.newSingleThreadScheduledExecutor(pVar);
    }

    public final void a(String str, w7.e eVar) {
        synchronized (this.f5042d) {
            t7.m.g().c(f5038e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            r rVar = new r(this, str);
            this.f5040b.put(str, rVar);
            this.f5041c.put(str, eVar);
            this.f5039a.schedule(rVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f5042d) {
            try {
                if (((r) this.f5040b.remove(str)) != null) {
                    t7.m.g().c(f5038e, "Stopping timer for " + str, new Throwable[0]);
                    this.f5041c.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
