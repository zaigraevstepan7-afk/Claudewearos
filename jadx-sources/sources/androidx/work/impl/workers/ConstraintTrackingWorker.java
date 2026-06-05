package androidx.work.impl.workers;

import ah.d;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import e8.k;
import f8.a;
import java.util.ArrayList;
import java.util.List;
import t7.m;
import y7.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {
    public static final String D = m.l("ConstraintTrkngWrkr");
    public volatile boolean A;
    public final k B;
    public ListenableWorker C;

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f1259f;

    /* renamed from: z, reason: collision with root package name */
    public final Object f1260z;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1259f = workerParameters;
        this.f1260z = new Object();
        this.A = false;
        this.B = new k();
    }

    @Override // y7.b
    public final void e(ArrayList arrayList) {
        m.g().c(D, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f1260z) {
            this.A = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return u7.k.p0(getApplicationContext()).f16843e;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.C;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.C;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.C.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final mf.a startWork() {
        getBackgroundExecutor().execute(new d(this, 7));
        return this.B;
    }

    @Override // y7.b
    public final void f(List list) {
    }
}
