package u6;

import android.os.Looper;
import c1.z2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public vj.d f16788a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f16789b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f16790c;

    /* renamed from: d, reason: collision with root package name */
    public b4.e f16791d;

    /* renamed from: e, reason: collision with root package name */
    public g f16792e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16794g;

    /* renamed from: f, reason: collision with root package name */
    public final qh.c f16793f = new qh.c(new a2.i(0, this, u.class, "onClosed", "onClosed()V", 0, 0, 10));

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f16795h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f16796i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        if (this.f16794g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!m() || n()) {
            return;
        }
        ti.h hVar = (ti.h) this.f16795h.get();
        if ((hVar != null ? (c0) hVar.C(c0.f16686b) : null) != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        f7.b bVarH = j().H();
        if (!bVarH.c()) {
            z2 z2Var = new z2(i(), null, 12);
            Thread.interrupted();
            qj.b0.A(ti.i.f16336a, new ab.r(z2Var, null));
        }
        if (bVarH.X()) {
            bVarH.B();
        } else {
            bVarH.f();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(qi.v.g0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(cg.b.D((lj.b) entry.getKey()), entry.getValue());
        }
        return qi.s.f13520a;
    }

    public abstract g e();

    public r5.g f() {
        throw new pi.g();
    }

    public f7.e g(a aVar) {
        fj.l.f(aVar, "config");
        throw new pi.g();
    }

    public final void h() {
        j().H().K();
        if (n()) {
            return;
        }
        g gVarI = i();
        n0 n0Var = gVarI.f16700b;
        s1.g gVar = gVarI.f16703e;
        f fVar = gVarI.f16704f;
        n0Var.getClass();
        fj.l.f(gVar, "onRefreshScheduled");
        fj.l.f(fVar, "onRefreshCompleted");
        if (n0Var.f16763i.compareAndSet(false, true)) {
            vj.d dVar = n0Var.f16755a.f16788a;
            ti.c cVar = null;
            if (dVar != null) {
                qj.b0.w(dVar, new qj.y(), new t0.f(n0Var, fVar, cVar, 3), 2);
            } else {
                fj.l.l("coroutineScope");
                throw null;
            }
        }
    }

    public final g i() {
        g gVar = this.f16792e;
        if (gVar != null) {
            return gVar;
        }
        fj.l.l("internalTracker");
        throw null;
    }

    public final f7.e j() {
        b4.e eVar = this.f16791d;
        if (eVar == null) {
            fj.l.l("connectionManager");
            throw null;
        }
        f7.e eVar2 = (f7.e) eVar.f1539h;
        if (eVar2 != null) {
            return eVar2;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set k() {
        return qi.l.V0(new ArrayList(qi.m.s0(qi.u.f13522a)));
    }

    public LinkedHashMap l() {
        int iG0 = qi.v.g0(qi.m.s0(qi.u.f13522a));
        if (iG0 < 16) {
            iG0 = 16;
        }
        return new LinkedHashMap(iG0);
    }

    public final boolean m() {
        b4.e eVar = this.f16791d;
        if (eVar != null) {
            return ((f7.e) eVar.f1539h) != null;
        }
        fj.l.l("connectionManager");
        throw null;
    }

    public final boolean n() {
        return p() && j().H().c();
    }

    public final void o(e7.a aVar) throws Exception {
        fj.l.f(aVar, "connection");
        g gVarI = i();
        n0 n0Var = gVarI.f16700b;
        n0Var.getClass();
        e7.c cVarD0 = aVar.d0("PRAGMA query_only");
        try {
            cVarD0.a0();
            boolean zX = cVarD0.x();
            uk.c.q(cVarD0, null);
            if (!zX) {
                uk.c.y(aVar, "PRAGMA temp_store = MEMORY");
                uk.c.y(aVar, "PRAGMA recursive_triggers = 1");
                uk.c.y(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (n0Var.f16757c) {
                    uk.c.y(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    uk.c.y(aVar, nj.l.z0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                k kVar = n0Var.f16761g;
                ReentrantLock reentrantLock = kVar.f16731a;
                reentrantLock.lock();
                try {
                    kVar.f16734d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (gVarI.f16705g) {
            }
        } finally {
        }
    }

    public final boolean p() {
        b4.e eVar = this.f16791d;
        if (eVar == null) {
            fj.l.l("connectionManager");
            throw null;
        }
        f7.b bVar = (f7.b) eVar.f1540i;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final void q() {
        j().H().z();
    }
}
