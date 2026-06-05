package androidx.work;

import ac.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import d8.m;
import d8.n;
import d8.o;
import e8.k;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import mf.a;
import t7.f;
import t7.g;
import t7.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1218a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f1219b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1220c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1221d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1222e;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1218a = context;
        this.f1219b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f1218a;
    }

    public Executor getBackgroundExecutor() {
        return this.f1219b.f1230f;
    }

    public a getForegroundInfoAsync() {
        k kVar = new k();
        kVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.f1219b.f1225a;
    }

    public final f getInputData() {
        return this.f1219b.f1226b;
    }

    public final Network getNetwork() {
        return (Network) this.f1219b.f1228d.f12662d;
    }

    public final int getRunAttemptCount() {
        return this.f1219b.f1229e;
    }

    public final Set<String> getTags() {
        return this.f1219b.f1227c;
    }

    public f8.a getTaskExecutor() {
        return this.f1219b.f1231g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f1219b.f1228d.f12660b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f1219b.f1228d.f12661c;
    }

    public u getWorkerFactory() {
        return this.f1219b.f1232h;
    }

    public boolean isRunInForeground() {
        return this.f1222e;
    }

    public final boolean isStopped() {
        return this.f1220c;
    }

    public final boolean isUsed() {
        return this.f1221d;
    }

    public final a setForegroundAsync(g gVar) {
        this.f1222e = true;
        n nVar = this.f1219b.j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        nVar.getClass();
        k kVar = new k();
        ((d) nVar.f5029a).f(new m(nVar, kVar, id2, gVar, applicationContext));
        return kVar;
    }

    public a setProgressAsync(f fVar) {
        o oVar = this.f1219b.f1233i;
        getApplicationContext();
        UUID id2 = getId();
        oVar.getClass();
        k kVar = new k();
        ((d) oVar.f5034b).f(new ad.f(2, oVar, id2, fVar, kVar, false));
        return kVar;
    }

    public void setRunInForeground(boolean z2) {
        this.f1222e = z2;
    }

    public final void setUsed() {
        this.f1221d = true;
    }

    public abstract a startWork();

    public final void stop() {
        this.f1220c = true;
        onStopped();
    }

    public void onStopped() {
    }
}
