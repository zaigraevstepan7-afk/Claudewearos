package ac;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import pg.q;
import pg.t;
import pg.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements cc.b, lg.g, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f399e;

    public /* synthetic */ k(n nVar, Iterable iterable, ub.i iVar, long j) {
        this.f395a = 0;
        this.f397c = nVar;
        this.f398d = iterable;
        this.f399e = iVar;
        this.f396b = j;
    }

    @Override // lg.g
    public ScheduledFuture a(final p7.k kVar) {
        switch (this.f395a) {
            case 1:
                lg.f fVar = (lg.f) this.f397c;
                Runnable runnable = (Runnable) this.f398d;
                return fVar.f10959b.schedule(new lg.d(fVar, runnable, kVar, 1), this.f396b, (TimeUnit) this.f399e);
            default:
                final lg.f fVar2 = (lg.f) this.f397c;
                final Callable callable = (Callable) this.f398d;
                return fVar2.f10959b.schedule(new Callable() { // from class: lg.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fVar2.f10958a.submit(new ac.e(15, callable, kVar));
                    }
                }, this.f396b, (TimeUnit) this.f399e);
        }
    }

    @Override // cc.b
    public Object c() {
        n nVar = (n) this.f397c;
        Iterable iterable = (Iterable) this.f398d;
        ub.i iVar = (ub.i) this.f399e;
        bc.h hVar = (bc.h) ((bc.d) nVar.f408c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + bc.h.t(iterable);
            SQLiteDatabase sQLiteDatabaseB = hVar.b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.n(cursorRawQuery.getInt(0), xb.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseB.endTransaction();
            }
        }
        hVar.g(new bc.e(((dc.a) nVar.f412g).a() + this.f396b, iVar));
        return null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws InterruptedException {
        q qVar = (q) this.f397c;
        Task task = (Task) this.f398d;
        Task task2 = (Task) this.f399e;
        p1.l lVar = qVar.f12948y;
        if (this.f396b != qVar.B) {
            lVar.l(null, "Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
            return;
        }
        pg.l lVar2 = qVar.f12932h;
        pg.l lVar3 = pg.l.f12907b;
        if (lVar2 != lVar3) {
            if (lVar2 == pg.l.f12906a) {
                lVar.l(null, "Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                return;
            }
            return;
        }
        lVar.l(null, "Successfully fetched token, opening connection", new Object[0]);
        String str = (String) task.getResult();
        String str2 = (String) task2.getResult();
        pg.l lVar4 = qVar.f12932h;
        hj.a.z(lVar4 == lVar3, "Trying to open network connection while in the wrong state: %s", lVar4);
        if (str == null) {
            rg.k kVar = qVar.f12925a;
            kVar.getClass();
            kVar.l(rg.c.f14386c, Boolean.FALSE);
        }
        qVar.f12940q = str;
        qVar.f12942s = str2;
        qVar.f12932h = pg.l.f12908c;
        pg.a aVar = new pg.a(qVar.f12944u, qVar.f12926b, qVar.f12927c, qVar, qVar.A, str2);
        qVar.f12931g = aVar;
        p1.l lVar5 = (p1.l) aVar.f12886e;
        if (lVar5.A()) {
            lVar5.l(null, "Opening a connection", new Object[0]);
        }
        v vVar = (v) aVar.f12884c;
        t0.j jVar = vVar.f12958a;
        ah.e eVar = (ah.e) jVar.f15363b;
        p1.l lVar6 = ((v) jVar.f15364c).j;
        try {
            eVar.c();
        } catch (ah.f e10) {
            if (lVar6.A()) {
                lVar6.l(e10, "Error connecting", new Object[0]);
            }
            eVar.a();
            try {
                ah.i iVar = eVar.f473g;
                if (iVar.f490g.getState() != Thread.State.NEW) {
                    iVar.f490g.join();
                }
                eVar.f476k.join();
            } catch (InterruptedException e11) {
                lVar6.o("Interrupted while shutting down websocket threads", e11);
            }
        }
        vVar.f12965h = vVar.f12966i.schedule(new t(vVar, 0), 30000L, TimeUnit.MILLISECONDS);
    }

    public /* synthetic */ k(lg.f fVar, Object obj, long j, TimeUnit timeUnit, int i10) {
        this.f395a = i10;
        this.f397c = fVar;
        this.f398d = obj;
        this.f396b = j;
        this.f399e = timeUnit;
    }

    public /* synthetic */ k(q qVar, long j, Task task, Task task2) {
        this.f395a = 3;
        this.f397c = qVar;
        this.f396b = j;
        this.f398d = task;
        this.f399e = task2;
    }
}
