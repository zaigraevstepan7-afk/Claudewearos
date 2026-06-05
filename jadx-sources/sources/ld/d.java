package ld;

import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.p;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public g6.a f10908a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10909b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10910c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10911d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10912e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f10913f;

    /* renamed from: g, reason: collision with root package name */
    public volatile h6.a f10914g;

    /* renamed from: h, reason: collision with root package name */
    public volatile h6.a f10915h;

    /* renamed from: i, reason: collision with root package name */
    public final Semaphore f10916i;
    public final Set j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = h6.a.A;
        this.f10909b = false;
        this.f10910c = false;
        this.f10911d = true;
        this.f10912e = false;
        signInHubActivity.getApplicationContext();
        this.f10913f = threadPoolExecutor;
        this.f10916i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f10914g != null) {
            if (!this.f10909b) {
                this.f10912e = true;
            }
            if (this.f10915h != null) {
                this.f10914g.getClass();
                this.f10914g = null;
                return;
            }
            this.f10914g.getClass();
            h6.a aVar = this.f10914g;
            aVar.f7658d.set(true);
            if (aVar.f7656b.cancel(false)) {
                this.f10915h = this.f10914g;
            }
            this.f10914g = null;
        }
    }

    public final void b() {
        if (this.f10915h != null || this.f10914g == null) {
            return;
        }
        this.f10914g.getClass();
        h6.a aVar = this.f10914g;
        Executor executor = this.f10913f;
        if (aVar.f7657c == 1) {
            aVar.f7657c = 2;
            aVar.f7655a.getClass();
            executor.execute(aVar.f7656b);
        } else {
            int iB = y3.e.b(aVar.f7657c);
            if (iB == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iB == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final void c() throws InterruptedException {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((p) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f10916i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        v.k(sb2, this);
        sb2.append(" id=");
        sb2.append(0);
        sb2.append("}");
        return sb2.toString();
    }
}
