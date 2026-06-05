package lg;

import com.google.android.gms.common.internal.e0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f10964f = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f10965a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f10966b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f10967c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f10968d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final a8.e f10969e = new a8.e(this);

    public k(Executor executor) {
        e0.i(executor);
        this.f10965a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e0.i(runnable);
        synchronized (this.f10966b) {
            int i10 = this.f10967c;
            if (i10 != 4 && i10 != 3) {
                long j = this.f10968d;
                j jVar = new j(0, runnable);
                this.f10966b.add(jVar);
                this.f10967c = 2;
                try {
                    this.f10965a.execute(this.f10969e);
                    if (this.f10967c != 2) {
                        return;
                    }
                    synchronized (this.f10966b) {
                        try {
                            if (this.f10968d == j && this.f10967c == 2) {
                                this.f10967c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f10966b) {
                        try {
                            int i11 = this.f10967c;
                            boolean z2 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f10966b.removeLastOccurrence(jVar)) {
                                z2 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z2) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f10966b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f10965a + "}";
    }
}
