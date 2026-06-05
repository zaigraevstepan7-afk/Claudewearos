package u6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16689a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f16690b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f16691c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16692d;

    public d0(Executor executor) {
        fj.l.f(executor, "executor");
        this.f16689a = executor;
        this.f16690b = new ArrayDeque();
        this.f16692d = new Object();
    }

    public final void a() {
        synchronized (this.f16692d) {
            Object objPoll = this.f16690b.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f16691c = runnable;
            if (objPoll != null) {
                this.f16689a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fj.l.f(runnable, "command");
        synchronized (this.f16692d) {
            this.f16690b.offer(new ac.e(19, runnable, this));
            if (this.f16691c == null) {
                a();
            }
        }
    }
}
