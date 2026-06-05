package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import e8.k;
import mf.a;
import t7.l;
import t7.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    public k f1224f;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract l doWork();

    @Override // androidx.work.ListenableWorker
    public final a startWork() {
        this.f1224f = new k();
        getBackgroundExecutor().execute(new s(this, 0));
        return this.f1224f;
    }
}
