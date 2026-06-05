package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import p1.l;
import t.m1;
import t7.m;
import u7.a;
import u7.b;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1249c = m.l("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public k f1250a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1251b = new HashMap();

    @Override // u7.a
    public final void b(String str, boolean z2) {
        JobParameters jobParameters;
        m.g().c(f1249c, m1.v(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f1251b) {
            jobParameters = (JobParameters) this.f1251b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k kVarP0 = k.p0(getApplicationContext());
            this.f1250a = kVarP0;
            kVarP0.f16845g.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            m.g().m(f1249c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f1250a;
        if (kVar != null) {
            kVar.f16845g.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f1250a == null) {
            m.g().c(f1249c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            m.g().f(f1249c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f1251b) {
            try {
                if (this.f1251b.containsKey(string)) {
                    m.g().c(f1249c, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                m.g().c(f1249c, "onStartJob for " + string, new Throwable[0]);
                this.f1251b.put(string, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                l lVar = new l(9);
                if (jobParameters.getTriggeredContentUris() != null) {
                    lVar.f12661c = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    lVar.f12660b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    lVar.f12662d = jobParameters.getNetwork();
                }
                this.f1250a.t0(string, lVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        PersistableBundle extras;
        if (this.f1250a == null) {
            m.g().c(f1249c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            m.g().f(f1249c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        m.g().c(f1249c, m1.i("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f1251b) {
            this.f1251b.remove(string);
        }
        this.f1250a.u0(string);
        b bVar = this.f1250a.f16845g;
        synchronized (bVar.D) {
            zContains = bVar.B.contains(string);
        }
        return !zContains;
    }
}
