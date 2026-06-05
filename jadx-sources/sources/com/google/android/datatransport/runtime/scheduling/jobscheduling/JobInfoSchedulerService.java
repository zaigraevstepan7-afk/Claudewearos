package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import ac.e;
import ac.g;
import ac.n;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import ec.a;
import java.util.concurrent.Executor;
import p1.l;
import ub.i;
import ub.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3436a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        l lVarA = i.a();
        lVarA.D(string);
        lVarA.f12662d = a.b(i10);
        if (string2 != null) {
            lVarA.f12661c = Base64.decode(string2, 0);
        }
        n nVar = p.a().f16981d;
        ((Executor) nVar.f410e).execute(new g(nVar, lVarA.f(), i11, new e(0, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
