package zh;

import ai.j;
import ai.k;
import ai.m;
import ai.q;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements ci.a {
    public static final Random j = new Random();

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f20635k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f20637b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f20638c;

    /* renamed from: d, reason: collision with root package name */
    public final cg.i f20639d;

    /* renamed from: e, reason: collision with root package name */
    public final ph.d f20640e;

    /* renamed from: f, reason: collision with root package name */
    public final dg.c f20641f;

    /* renamed from: g, reason: collision with root package name */
    public final oh.b f20642g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20643h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20636a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f20644i = new HashMap();

    public i(Context context, ScheduledExecutorService scheduledExecutorService, cg.i iVar, ph.d dVar, dg.c cVar, oh.b bVar) {
        this.f20637b = context;
        this.f20638c = scheduledExecutorService;
        this.f20639d = iVar;
        this.f20640e = dVar;
        this.f20641f = cVar;
        this.f20642g = bVar;
        iVar.b();
        this.f20643h = iVar.f3369c.f3382b;
        AtomicReference atomicReference = h.f20634a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = h.f20634a;
        if (atomicReference2.get() == null) {
            h hVar = new h();
            while (true) {
                if (atomicReference2.compareAndSet(null, hVar)) {
                    com.google.android.gms.common.api.internal.c.b(application);
                    com.google.android.gms.common.api.internal.c.f3510e.a(hVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new ai.c(this, 2));
    }

    public final synchronized b a(cg.i iVar, ph.d dVar, dg.c cVar, Executor executor, ai.e eVar, ai.e eVar2, ai.e eVar3, j jVar, k kVar, m mVar, ac.d dVar2) {
        if (!this.f20636a.containsKey("firebase")) {
            iVar.b();
            dg.c cVar2 = iVar.f3368b.equals("[DEFAULT]") ? cVar : null;
            Context context = this.f20637b;
            synchronized (this) {
                b bVar = new b(cVar2, executor, eVar, eVar2, eVar3, jVar, kVar, mVar, new ac.d(iVar, dVar, jVar, eVar2, context, mVar, this.f20638c), dVar2);
                eVar2.b();
                eVar3.b();
                eVar.b();
                this.f20636a.put("firebase", bVar);
                f20635k.put("firebase", bVar);
            }
        }
        return (b) this.f20636a.get("firebase");
    }

    public final ai.e b(String str) {
        q qVar;
        ai.e eVar;
        String strK = m1.k("frc_", this.f20643h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f20638c;
        Context context = this.f20637b;
        HashMap map = q.f575c;
        synchronized (q.class) {
            try {
                HashMap map2 = q.f575c;
                if (!map2.containsKey(strK)) {
                    map2.put(strK, new q(context, strK));
                }
                qVar = (q) map2.get(strK);
            } finally {
            }
        }
        HashMap map3 = ai.e.f504d;
        synchronized (ai.e.class) {
            try {
                String str2 = qVar.f577b;
                HashMap map4 = ai.e.f504d;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new ai.e(scheduledExecutorService, qVar));
                }
                eVar = (ai.e) map4.get(str2);
            } finally {
            }
        }
        return eVar;
    }

    public final b c() throws Throwable {
        synchronized (this) {
            try {
                try {
                    ai.e eVarB = b("fetch");
                    ai.e eVarB2 = b("activate");
                    ai.e eVarB3 = b("defaults");
                    m mVar = new m(this.f20637b.getSharedPreferences("frc_" + this.f20643h + "_firebase_settings", 0));
                    k kVar = new k(this.f20638c, eVarB2, eVarB3);
                    cg.i iVar = this.f20639d;
                    oh.b bVar = this.f20642g;
                    iVar.b();
                    ag.i iVar2 = iVar.f3368b.equals("[DEFAULT]") ? new ag.i(bVar) : null;
                    if (iVar2 != null) {
                        g gVar = new g(iVar2);
                        synchronized (kVar.f542a) {
                            kVar.f542a.add(gVar);
                        }
                    }
                    t0.j jVar = new t0.j(3, false);
                    jVar.f15363b = eVarB2;
                    jVar.f15364c = eVarB3;
                    ScheduledExecutorService scheduledExecutorService = this.f20638c;
                    ac.d dVar = new ac.d(7, false);
                    dVar.f375d = Collections.newSetFromMap(new ConcurrentHashMap());
                    dVar.f373b = jVar;
                    dVar.f374c = scheduledExecutorService;
                    return a(this.f20639d, this.f20640e, this.f20641f, this.f20638c, eVarB, eVarB2, eVarB3, d(eVarB, mVar), kVar, mVar, dVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public final synchronized j d(ai.e eVar, m mVar) {
        ph.d dVar;
        oh.b fVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        cg.i iVar;
        try {
            dVar = this.f20640e;
            cg.i iVar2 = this.f20639d;
            iVar2.b();
            fVar = iVar2.f3368b.equals("[DEFAULT]") ? this.f20642g : new kg.f(7);
            scheduledExecutorService = this.f20638c;
            random = j;
            cg.i iVar3 = this.f20639d;
            iVar3.b();
            str = iVar3.f3369c.f3381a;
            iVar = this.f20639d;
            iVar.b();
        } catch (Throwable th2) {
            throw th2;
        }
        return new j(dVar, fVar, scheduledExecutorService, random, eVar, new ConfigFetchHttpClient(this.f20637b, iVar.f3369c.f3382b, str, mVar.f550a.getLong("fetch_timeout_in_seconds", 60L), mVar.f550a.getLong("fetch_timeout_in_seconds", 60L)), mVar, this.f20644i);
    }
}
