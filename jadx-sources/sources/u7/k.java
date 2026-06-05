package u7;

import ac.n;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t7.m;
import u6.q;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: k, reason: collision with root package name */
    public static k f16837k;

    /* renamed from: l, reason: collision with root package name */
    public static k f16838l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f16839m;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16840b;

    /* renamed from: c, reason: collision with root package name */
    public final t7.b f16841c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f16842d;

    /* renamed from: e, reason: collision with root package name */
    public final ac.d f16843e;

    /* renamed from: f, reason: collision with root package name */
    public final List f16844f;

    /* renamed from: g, reason: collision with root package name */
    public final b f16845g;

    /* renamed from: h, reason: collision with root package name */
    public final p7.k f16846h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16847i;
    public BroadcastReceiver.PendingResult j;

    static {
        m.l("WorkManagerImpl");
        f16837k = null;
        f16838l = null;
        f16839m = new Object();
    }

    public k(Context context, t7.b bVar, ac.d dVar) throws Resources.NotFoundException {
        q qVarK;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        d8.h hVar = (d8.h) dVar.f373b;
        int i10 = WorkDatabase.f1235l;
        byte b10 = 0;
        if (z2) {
            fj.l.f(applicationContext, "context");
            qVarK = new q(applicationContext, WorkDatabase.class, null);
            qVarK.f16774i = true;
        } else {
            String str = j.f16835a;
            qVarK = u1.b.k(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            qVarK.f16773h = new k3.a(applicationContext, b10);
        }
        fj.l.f(hVar, "executor");
        qVarK.f16771f = hVar;
        qVarK.f16769d.add(new f());
        qVarK.a(i.f16828a);
        qVarK.a(new h(applicationContext, 2, 3));
        qVarK.a(i.f16829b);
        qVarK.a(i.f16830c);
        int i11 = 5;
        qVarK.a(new h(applicationContext, 5, 6));
        qVarK.a(i.f16831d);
        qVarK.a(i.f16832e);
        qVarK.a(i.f16833f);
        qVarK.a(new h(applicationContext));
        qVarK.a(new h(applicationContext, 10, 11));
        qVarK.a(i.f16834g);
        qVarK.f16780p = false;
        qVarK.f16781q = true;
        WorkDatabase workDatabase = (WorkDatabase) qVarK.b();
        Context applicationContext2 = context.getApplicationContext();
        m mVar = new m(bVar.f16098f);
        synchronized (m.class) {
            m.f16122b = mVar;
        }
        String str2 = d.f16818a;
        x7.b bVar2 = new x7.b(applicationContext2, this);
        d8.f.a(applicationContext2, SystemJobService.class, true);
        m.g().c(d.f16818a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List listAsList = Arrays.asList(bVar2, new v7.b(applicationContext2, bVar, dVar, this));
        b bVar3 = new b(context, bVar, dVar, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.f16840b = applicationContext3;
        this.f16841c = bVar;
        this.f16843e = dVar;
        this.f16842d = workDatabase;
        this.f16844f = listAsList;
        this.f16845g = bVar3;
        this.f16846h = new p7.k(workDatabase, i11);
        this.f16847i = false;
        if (applicationContext3.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f16843e.f(new d8.d(applicationContext3, this));
    }

    public static k p0(Context context) {
        k kVar;
        Object obj = f16839m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kVar = f16837k;
                    if (kVar == null) {
                        kVar = f16838l;
                    }
                }
                return kVar;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (kVar != null) {
            return kVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void q0(Context context, t7.b bVar) {
        synchronized (f16839m) {
            try {
                k kVar = f16837k;
                if (kVar != null && f16838l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f16838l == null) {
                        f16838l = new k(applicationContext, bVar, new ac.d(bVar.f16094b));
                    }
                    f16837k = f16838l;
                }
            } finally {
            }
        }
    }

    public final void r0() {
        synchronized (f16839m) {
            try {
                this.f16847i = true;
                BroadcastReceiver.PendingResult pendingResult = this.j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s0() {
        ArrayList arrayListE;
        String str = x7.b.f19841e;
        Context context = this.f16840b;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = x7.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            int size = arrayListE.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListE.get(i10);
                i10++;
                x7.b.b(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f16842d;
        n nVarW = workDatabase.w();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarW.f406a;
        workDatabase_Impl.b();
        c8.e eVar = (c8.e) nVarW.f414i;
        g7.i iVarA = eVar.a();
        workDatabase_Impl.c();
        try {
            iVarA.b();
            workDatabase_Impl.q();
            workDatabase_Impl.h();
            eVar.i(iVarA);
            d.a(this.f16841c, workDatabase, this.f16844f);
        } catch (Throwable th2) {
            workDatabase_Impl.h();
            eVar.i(iVarA);
            throw th2;
        }
    }

    public final void t0(String str, p1.l lVar) {
        b8.b bVar = new b8.b(3);
        bVar.f1613c = this;
        bVar.f1612b = str;
        bVar.f1614d = lVar;
        this.f16843e.f(bVar);
    }

    public final void u0(String str) {
        this.f16843e.f(new d8.i(this, str, false));
    }
}
