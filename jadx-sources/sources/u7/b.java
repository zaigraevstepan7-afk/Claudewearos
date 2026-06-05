package u7;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import t.m1;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements a, b8.a {
    public static final String E = m.l("Processor");
    public final List A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16812b;

    /* renamed from: c, reason: collision with root package name */
    public final t7.b f16813c;

    /* renamed from: d, reason: collision with root package name */
    public final ac.d f16814d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f16815e;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f16817z = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f16816f = new HashMap();
    public final HashSet B = new HashSet();
    public final ArrayList C = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f16811a = null;
    public final Object D = new Object();

    public b(Context context, t7.b bVar, ac.d dVar, WorkDatabase workDatabase, List list) {
        this.f16812b = context;
        this.f16813c = bVar;
        this.f16814d = dVar;
        this.f16815e = workDatabase;
        this.A = list;
    }

    public static boolean c(String str, l lVar) {
        boolean zIsDone;
        if (lVar == null) {
            m.g().c(E, m1.i("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        lVar.L = true;
        lVar.h();
        mf.a aVar = lVar.K;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            lVar.K.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = lVar.f16853f;
        if (listenableWorker == null || zIsDone) {
            m.g().c(l.M, "WorkSpec " + lVar.f16852e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        m.g().c(E, m1.i("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.D) {
            this.C.add(aVar);
        }
    }

    @Override // u7.a
    public final void b(String str, boolean z2) {
        synchronized (this.D) {
            try {
                this.f16817z.remove(str);
                int i10 = 0;
                m.g().c(E, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z2, new Throwable[0]);
                ArrayList arrayList = this.C;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((a) obj).b(str, z2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(String str) {
        boolean z2;
        synchronized (this.D) {
            try {
                z2 = this.f16817z.containsKey(str) || this.f16816f.containsKey(str);
            } finally {
            }
        }
        return z2;
    }

    public final void e(a aVar) {
        synchronized (this.D) {
            this.C.remove(aVar);
        }
    }

    public final void f(String str, t7.g gVar) {
        synchronized (this.D) {
            try {
                m.g().i(E, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                l lVar = (l) this.f16817z.remove(str);
                if (lVar != null) {
                    if (this.f16811a == null) {
                        PowerManager.WakeLock wakeLockA = d8.j.a(this.f16812b, "ProcessorForegroundLck");
                        this.f16811a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f16816f.put(str, lVar);
                    i4.c.startForegroundService(this.f16812b, b8.c.c(this.f16812b, str, gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g(String str, p1.l lVar) {
        synchronized (this.D) {
            try {
                if (d(str)) {
                    m.g().c(E, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f16812b;
                t7.b bVar = this.f16813c;
                ac.d dVar = this.f16814d;
                WorkDatabase workDatabase = this.f16815e;
                p1.l lVar2 = new p1.l(9);
                Context applicationContext = context.getApplicationContext();
                List list = this.A;
                if (lVar == null) {
                    lVar = lVar2;
                }
                l lVar3 = new l();
                lVar3.A = new t7.i();
                e8.k kVar = new e8.k();
                lVar3.J = kVar;
                lVar3.K = null;
                lVar3.f16848a = applicationContext;
                lVar3.f16854z = dVar;
                lVar3.C = this;
                lVar3.f16849b = str;
                lVar3.f16850c = list;
                lVar3.f16851d = lVar;
                lVar3.f16853f = null;
                lVar3.B = bVar;
                lVar3.D = workDatabase;
                lVar3.E = workDatabase.w();
                lVar3.F = workDatabase.r();
                lVar3.G = workDatabase.x();
                b8.b bVar2 = new b8.b(9);
                bVar2.f1613c = this;
                bVar2.f1612b = str;
                bVar2.f1614d = kVar;
                kVar.addListener(bVar2, (f8.b) this.f16814d.f375d);
                this.f16817z.put(str, lVar3);
                ((d8.h) this.f16814d.f373b).execute(lVar3);
                m.g().c(E, m1.w(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.D) {
            try {
                if (this.f16816f.isEmpty()) {
                    Context context = this.f16812b;
                    String str = b8.c.C;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f16812b.startService(intent);
                    } catch (Throwable th2) {
                        m.g().f(E, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f16811a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f16811a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean i(String str) {
        boolean zC;
        synchronized (this.D) {
            m.g().c(E, "Processor stopping foreground work " + str, new Throwable[0]);
            zC = c(str, (l) this.f16816f.remove(str));
        }
        return zC;
    }

    public final boolean j(String str) {
        boolean zC;
        synchronized (this.D) {
            m.g().c(E, "Processor stopping background work " + str, new Throwable[0]);
            zC = c(str, (l) this.f16817z.remove(str));
        }
        return zC;
    }
}
