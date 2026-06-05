package u7;

import ac.n;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import t.m1;
import t7.m;
import u6.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public static final String M = m.l("WorkerWrapper");
    public t7.l A;
    public t7.b B;
    public b C;
    public WorkDatabase D;
    public n E;
    public t0.j F;
    public mh.g G;
    public ArrayList H;
    public String I;
    public e8.k J;
    public mf.a K;
    public volatile boolean L;

    /* renamed from: a, reason: collision with root package name */
    public Context f16848a;

    /* renamed from: b, reason: collision with root package name */
    public String f16849b;

    /* renamed from: c, reason: collision with root package name */
    public List f16850c;

    /* renamed from: d, reason: collision with root package name */
    public p1.l f16851d;

    /* renamed from: e, reason: collision with root package name */
    public c8.i f16852e;

    /* renamed from: f, reason: collision with root package name */
    public ListenableWorker f16853f;

    /* renamed from: z, reason: collision with root package name */
    public ac.d f16854z;

    public final void a(t7.l lVar) {
        boolean z2 = lVar instanceof t7.k;
        String str = M;
        if (!z2) {
            if (lVar instanceof t7.j) {
                m.g().i(str, m1.i("Worker result RETRY for ", this.I), new Throwable[0]);
                c();
                return;
            }
            m.g().i(str, m1.i("Worker result FAILURE for ", this.I), new Throwable[0]);
            if (this.f16852e.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        m.g().i(str, m1.i("Worker result SUCCESS for ", this.I), new Throwable[0]);
        if (this.f16852e.c()) {
            d();
            return;
        }
        t0.j jVar = this.F;
        String str2 = this.f16849b;
        n nVar = this.E;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            nVar.m(3, str2);
            nVar.k(str2, ((t7.k) this.A).f16121a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListL = jVar.l(str2);
            int size = arrayListL.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListL.get(i10);
                i10++;
                String str3 = (String) obj;
                if (nVar.e(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f15363b;
                    z zVarG = z.g(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        zVarG.R(1);
                    } else {
                        zVarG.k(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorN = u0.l.n(workDatabase_Impl, zVarG);
                    try {
                        if (cursorN.moveToFirst() && cursorN.getInt(0) != 0) {
                            m.g().i(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            nVar.m(1, str3);
                            nVar.l(jCurrentTimeMillis, str3);
                        }
                    } finally {
                        cursorN.close();
                        zVarG.l();
                    }
                }
            }
            workDatabase.q();
            workDatabase.h();
            e(false);
        } catch (Throwable th2) {
            workDatabase.h();
            e(false);
            throw th2;
        }
    }

    public final void b() {
        List list = this.f16850c;
        String str = this.f16849b;
        WorkDatabase workDatabase = this.D;
        if (!h()) {
            workDatabase.c();
            try {
                int iE = this.E.e(str);
                a8.j jVarV = workDatabase.v();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVarV.f215a;
                workDatabase_Impl.b();
                c8.e eVar = (c8.e) jVarV.f217c;
                g7.i iVarA = eVar.a();
                if (str == null) {
                    iVarA.R(1);
                } else {
                    iVarA.k(1, str);
                }
                workDatabase_Impl.c();
                try {
                    iVarA.b();
                    workDatabase_Impl.q();
                    if (iE == 0) {
                        e(false);
                    } else if (iE == 2) {
                        a(this.A);
                    } else if (!m1.b(iE)) {
                        c();
                    }
                    workDatabase.q();
                    workDatabase.h();
                } finally {
                    workDatabase_Impl.h();
                    eVar.i(iVarA);
                }
            } catch (Throwable th2) {
                workDatabase.h();
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).c(str);
            }
            d.a(this.B, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f16849b;
        n nVar = this.E;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            nVar.m(1, str);
            nVar.l(System.currentTimeMillis(), str);
            nVar.j(-1L, str);
            workDatabase.q();
        } finally {
            workDatabase.h();
            e(true);
        }
    }

    public final void d() {
        String str = this.f16849b;
        n nVar = this.E;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            nVar.l(System.currentTimeMillis(), str);
            nVar.m(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVar.f406a;
            workDatabase_Impl.b();
            c8.e eVar = (c8.e) nVar.f412g;
            g7.i iVarA = eVar.a();
            if (str == null) {
                iVarA.R(1);
            } else {
                iVarA.k(1, str);
            }
            workDatabase_Impl.c();
            try {
                iVarA.b();
                workDatabase_Impl.q();
                workDatabase_Impl.h();
                eVar.i(iVarA);
                nVar.j(-1L, str);
                workDatabase.q();
            } catch (Throwable th2) {
                workDatabase_Impl.h();
                eVar.i(iVarA);
                throw th2;
            }
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.D
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.D     // Catch: java.lang.Throwable -> L42
            ac.n r0 = r0.w()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            u6.z r1 = u6.z.g(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f406a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = u0.l.n(r0, r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L90
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.l()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f16848a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            d8.f.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            ac.n r0 = r5.E     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f16849b     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.m(r4, r1)     // Catch: java.lang.Throwable -> L42
            ac.n r0 = r5.E     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f16849b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.j(r2, r1)     // Catch: java.lang.Throwable -> L42
        L5a:
            c8.i r0 = r5.f16852e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.f16853f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            u7.b r0 = r5.C     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f16849b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.D     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f16816f     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.h()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.D     // Catch: java.lang.Throwable -> L42
            r0.q()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.D
            r0.h()
            e8.k r0 = r5.J
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.h(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.l()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r0 = r5.D
            r0.h()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l.e(boolean):void");
    }

    public final void f() {
        n nVar = this.E;
        String str = this.f16849b;
        int iE = nVar.e(str);
        String str2 = M;
        if (iE == 2) {
            m.g().c(str2, m1.j("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        m mVarG = m.g();
        StringBuilder sbK = m6.a.k("Status for ", str, " is ");
        sbK.append(m1.y(iE));
        sbK.append("; not doing any work");
        mVarG.c(str2, sbK.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        n nVar = this.E;
        String str = this.f16849b;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (nVar.e(str2) != 6) {
                    nVar.m(4, str2);
                }
                linkedList.addAll(this.F.l(str2));
            }
            nVar.k(str, ((t7.i) this.A).f16120a);
            workDatabase.q();
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.L) {
            return false;
        }
        m.g().c(M, m1.i("Work interrupted for ", this.I), new Throwable[0]);
        if (this.E.e(this.f16849b) == 0) {
            e(false);
            return true;
        }
        e(!m1.b(r0));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x007e, TryCatch #4 {all -> 0x007e, blocks: (B:13:0x0055, B:16:0x005f, B:21:0x0081, B:23:0x0085, B:26:0x00ad, B:28:0x00b3, B:30:0x00b9, B:43:0x0101, B:35:0x00c2, B:38:0x00d1, B:40:0x00d9), top: B:113:0x0055 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l.run():void");
    }
}
