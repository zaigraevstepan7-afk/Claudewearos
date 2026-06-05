package x7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c8.d;
import c8.i;
import d8.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t.m1;
import t7.m;
import u7.c;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f19841e = m.l("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f19842a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f19843b;

    /* renamed from: c, reason: collision with root package name */
    public final k f19844c;

    /* renamed from: d, reason: collision with root package name */
    public final a f19845d;

    public b(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f19842a = context;
        this.f19844c = kVar;
        this.f19843b = jobScheduler;
        this.f19845d = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            m.g().f(f19841e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            m.g().f(f19841e, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // u7.c
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // u7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r12) {
        /*
            r11 = this;
            android.content.Context r0 = r11.f19842a
            android.app.job.JobScheduler r1 = r11.f19843b
            java.util.ArrayList r0 = e(r0, r1)
            r2 = 0
            r3 = 0
            if (r0 != 0) goto Ld
            goto L49
        Ld:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            int r5 = r0.size()
            r6 = r2
        L18:
            if (r6 >= r5) goto L48
            java.lang.Object r7 = r0.get(r6)
            int r6 = r6 + 1
            android.app.job.JobInfo r7 = (android.app.job.JobInfo) r7
            java.lang.String r8 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r9 = r7.getExtras()
            if (r9 == 0) goto L35
            boolean r10 = r9.containsKey(r8)     // Catch: java.lang.NullPointerException -> L35
            if (r10 == 0) goto L35
            java.lang.String r8 = r9.getString(r8)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r8 = r3
        L36:
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L18
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.add(r7)
            goto L18
        L48:
            r3 = r4
        L49:
            if (r3 == 0) goto L72
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L72
            int r0 = r3.size()
        L55:
            if (r2 >= r0) goto L67
            java.lang.Object r4 = r3.get(r2)
            int r2 = r2 + 1
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            b(r1, r4)
            goto L55
        L67:
            u7.k r0 = r11.f19844c
            androidx.work.impl.WorkDatabase r0 = r0.f16842d
            ac.d r0 = r0.t()
            r0.J(r12)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.b.c(java.lang.String):void");
    }

    @Override // u7.c
    public final void d(i... iVarArr) {
        int iZ;
        k kVar = this.f19844c;
        WorkDatabase workDatabase = kVar.f16842d;
        e eVar = new e(workDatabase);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i iVarH = workDatabase.w().h(iVar.f3121a);
                String str = f19841e;
                if (iVarH == null) {
                    m.g().m(str, "Skipping scheduling " + iVar.f3121a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.q();
                } else if (iVarH.f3122b != 1) {
                    m.g().m(str, "Skipping scheduling " + iVar.f3121a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.q();
                } else {
                    d dVarZ = workDatabase.t().z(iVar.f3121a);
                    if (dVarZ != null) {
                        iZ = dVarZ.f3114b;
                    } else {
                        kVar.f16841c.getClass();
                        iZ = eVar.z(kVar.f16841c.f16099g);
                    }
                    if (dVarZ == null) {
                        kVar.f16842d.t().C(new d(iVar.f3121a, iZ));
                    }
                    f(iVar, iZ);
                    workDatabase.q();
                }
            } finally {
                workDatabase.h();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(i iVar, int i10) {
        int i11;
        JobScheduler jobScheduler = this.f19843b;
        a aVar = this.f19845d;
        aVar.getClass();
        t7.c cVar = iVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f3121a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.f19840a).setRequiresCharging(cVar.f16103b).setRequiresDeviceIdle(cVar.f16104c).setExtras(persistableBundle);
        int i12 = cVar.f16102a;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i12 != 6) {
            int iB = y3.e.b(i12);
            if (iB == 0) {
                i11 = 0;
            } else if (iB == 1) {
                i11 = 1;
            } else if (iB != 2) {
                i11 = 3;
                if (iB != 3) {
                    i11 = 4;
                    if (iB != 4) {
                        m.g().c(a.f19839b, "API version too low. Cannot convert network type value ".concat(m1.x(i12)), new Throwable[0]);
                        i11 = 1;
                    }
                }
            } else {
                i11 = 2;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f16104c) {
            extras.setBackoffCriteria(iVar.f3132m, iVar.f3131l == 2 ? 0 : 1);
        }
        long jMax = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (i13 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!iVar.f3136q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.f16109h.f16112a.size() > 0) {
            Iterator it = cVar.f16109h.f16112a.iterator();
            while (it.hasNext()) {
                t7.d dVar = (t7.d) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f16110a, dVar.f16111b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f16107f);
            extras.setTriggerContentMaxDelay(cVar.f16108g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(cVar.f16105d);
        extras.setRequiresStorageNotLow(cVar.f16106e);
        Object[] objArr = iVar.f3130k > 0;
        if (p4.a.a() && iVar.f3136q && objArr == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        m mVarG = m.g();
        String str = iVar.f3121a;
        String str2 = f19841e;
        mVarG.c(str2, "Scheduling work ID " + str + " Job ID " + i10, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                m.g().m(str2, "Unable to schedule work ID " + iVar.f3121a, new Throwable[0]);
                if (iVar.f3136q && iVar.f3137r == 1) {
                    iVar.f3136q = false;
                    m.g().c(str2, "Scheduling a non-expedited job (work ID " + iVar.f3121a + ")", new Throwable[0]);
                    f(iVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList arrayListE = e(this.f19842a, jobScheduler);
            int size = arrayListE != null ? arrayListE.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            k kVar = this.f19844c;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(kVar.f16842d.w().d().size()), Integer.valueOf(kVar.f16841c.f16100h));
            m.g().f(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e10);
        } catch (Throwable th2) {
            m.g().f(str2, "Unable to schedule " + iVar, th2);
        }
    }
}
