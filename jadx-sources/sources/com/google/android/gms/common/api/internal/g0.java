package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements com.google.android.gms.common.api.n, com.google.android.gms.common.api.o {
    public final q0 A;
    public boolean B;
    public final /* synthetic */ h F;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.g f3536b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3537c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f3538d;

    /* renamed from: z, reason: collision with root package name */
    public final int f3541z;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f3535a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f3539e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3540f = new HashMap();
    public final ArrayList C = new ArrayList();
    public nd.b D = null;
    public int E = 0;

    public g0(h hVar, com.google.android.gms.common.api.m mVar) {
        this.F = hVar;
        zau zauVar = hVar.G;
        com.google.android.gms.common.api.g gVarZab = mVar.zab(zauVar.getLooper(), this);
        this.f3536b = gVarZab;
        this.f3537c = mVar.getApiKey();
        this.f3538d = new b0();
        this.f3541z = mVar.zaa();
        if (gVarZab.requiresSignIn()) {
            this.A = mVar.zac(hVar.f3546e, zauVar);
        } else {
            this.A = null;
        }
    }

    public final void a(nd.b bVar) {
        HashSet hashSet = this.f3539e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (com.google.android.gms.common.internal.e0.l(bVar, nd.b.f12266e)) {
                this.f3536b.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        com.google.android.gms.common.internal.e0.c(this.F.G);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z2) {
        com.google.android.gms.common.internal.e0.c(this.F.G);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f3535a.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (!z2 || y0Var.f3605a == 2) {
                if (status != null) {
                    y0Var.a(status);
                } else {
                    y0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f3535a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            y0 y0Var = (y0) arrayList.get(i10);
            if (!this.f3536b.isConnected()) {
                return;
            }
            if (h(y0Var)) {
                linkedList.remove(y0Var);
            }
        }
    }

    public final void e() {
        h hVar = this.F;
        com.google.android.gms.common.internal.e0.c(hVar.G);
        this.D = null;
        a(nd.b.f12266e);
        zau zauVar = hVar.G;
        if (this.B) {
            a aVar = this.f3537c;
            zauVar.removeMessages(11, aVar);
            zauVar.removeMessages(9, aVar);
            this.B = false;
        }
        Iterator it = this.f3540f.values().iterator();
        if (it.hasNext()) {
            throw gk.b.k(it);
        }
        d();
        g();
    }

    public final void f(int i10) {
        h hVar = this.F;
        zau zauVar = hVar.G;
        com.google.android.gms.common.internal.e0.c(hVar.G);
        this.D = null;
        this.B = true;
        String lastDisconnectMessage = this.f3536b.getLastDisconnectMessage();
        b0 b0Var = this.f3538d;
        b0Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        b0Var.a(new Status(20, sb2.toString(), null, null), true);
        a aVar = this.f3537c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, aVar), 5000L);
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 11, aVar), 120000L);
        ((SparseIntArray) hVar.f3548z.f15363b).clear();
        Iterator it = this.f3540f.values().iterator();
        if (it.hasNext()) {
            m6.a.q(it.next());
            throw null;
        }
    }

    public final void g() {
        h hVar = this.F;
        zau zauVar = hVar.G;
        a aVar = this.f3537c;
        zauVar.removeMessages(12, aVar);
        zauVar.sendMessageDelayed(zauVar.obtainMessage(12, aVar), hVar.f3542a);
    }

    public final boolean h(y0 y0Var) {
        nd.d dVar;
        if (!(y0Var instanceof m0)) {
            b0 b0Var = this.f3538d;
            com.google.android.gms.common.api.g gVar = this.f3536b;
            y0Var.d(b0Var, gVar.requiresSignIn());
            try {
                y0Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        m0 m0Var = (m0) y0Var;
        nd.d[] dVarArrG = m0Var.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
        } else {
            nd.d[] availableFeatures = this.f3536b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new nd.d[0];
            }
            q.e eVar = new q.e(availableFeatures.length);
            for (nd.d dVar2 : availableFeatures) {
                eVar.put(dVar2.f12274a, Long.valueOf(dVar2.b()));
            }
            int length = dVarArrG.length;
            for (int i10 = 0; i10 < length; i10++) {
                dVar = dVarArrG[i10];
                Long l10 = (Long) eVar.get(dVar.f12274a);
                if (l10 == null || l10.longValue() < dVar.b()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            b0 b0Var2 = this.f3538d;
            com.google.android.gms.common.api.g gVar2 = this.f3536b;
            y0Var.d(b0Var2, gVar2.requiresSignIn());
            try {
                y0Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f3536b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f12274a + ", " + dVar.b() + ").");
        if (!this.F.H || !m0Var.f(this)) {
            m0Var.b(new com.google.android.gms.common.api.x(dVar));
            return true;
        }
        h0 h0Var = new h0(this.f3537c, dVar);
        int iIndexOf = this.C.indexOf(h0Var);
        if (iIndexOf >= 0) {
            h0 h0Var2 = (h0) this.C.get(iIndexOf);
            this.F.G.removeMessages(15, h0Var2);
            zau zauVar = this.F.G;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, h0Var2), 5000L);
        } else {
            this.C.add(h0Var);
            zau zauVar2 = this.F.G;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, h0Var), 5000L);
            zau zauVar3 = this.F.G;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, h0Var), 120000L);
            nd.b bVar = new nd.b(2, null);
            if (!i(bVar)) {
                this.F.d(bVar, this.f3541z);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6.get() == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(nd.b r6) {
        /*
            r5 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.h.K
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.h r1 = r5.F     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.c0 r2 = r1.D     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            q.f r1 = r1.E     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.a r2 = r5.f3537c     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            com.google.android.gms.common.api.internal.h r1 = r5.F     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.c0 r1 = r1.D     // Catch: java.lang.Throwable -> L45
            int r2 = r5.f3541z     // Catch: java.lang.Throwable -> L45
            r1.getClass()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.z0 r3 = new com.google.android.gms.common.api.internal.z0     // Catch: java.lang.Throwable -> L45
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L45
        L21:
            java.util.concurrent.atomic.AtomicReference r6 = r1.f3516b     // Catch: java.lang.Throwable -> L45
        L23:
            r2 = 0
            boolean r2 = r6.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L36
            com.google.android.gms.internal.base.zau r6 = r1.f3517c     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.common.api.internal.a1 r2 = new com.google.android.gms.common.api.internal.a1     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L45
            r6.post(r2)     // Catch: java.lang.Throwable -> L45
            goto L42
        L36:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L23
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L21
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r6 = 1
            return r6
        L45:
            r6 = move-exception
            goto L4a
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r6 = 0
            return r6
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.g0.i(nd.b):boolean");
    }

    public final boolean j(boolean z2) {
        com.google.android.gms.common.internal.e0.c(this.F.G);
        com.google.android.gms.common.api.g gVar = this.f3536b;
        if (!gVar.isConnected() || !this.f3540f.isEmpty()) {
            return false;
        }
        b0 b0Var = this.f3538d;
        if (((Map) b0Var.f3507a).isEmpty() && ((Map) b0Var.f3508b).isEmpty()) {
            gVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z2) {
            return false;
        }
        g();
        return false;
    }

    public final void k() {
        h hVar = this.F;
        com.google.android.gms.common.internal.e0.c(hVar.G);
        com.google.android.gms.common.api.g gVar = this.f3536b;
        if (gVar.isConnected() || gVar.isConnecting()) {
            return;
        }
        try {
            t0.j jVar = hVar.f3548z;
            Context context = hVar.f3546e;
            SparseIntArray sparseIntArray = (SparseIntArray) jVar.f15363b;
            com.google.android.gms.common.internal.e0.i(context);
            int iD = 0;
            if (gVar.requiresGooglePlayServices()) {
                int minApkVersion = gVar.getMinApkVersion();
                int i10 = ((SparseIntArray) jVar.f15363b).get(minApkVersion, -1);
                if (i10 != -1) {
                    iD = i10;
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            iD = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i11);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (iD == -1) {
                        iD = ((nd.e) jVar.f15364c).d(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iD);
                }
            }
            if (iD != 0) {
                nd.b bVar = new nd.b(iD, null);
                Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + bVar.toString());
                m(bVar, null);
                return;
            }
            i0 i0Var = new i0();
            i0Var.f3556f = hVar;
            i0Var.f3554d = null;
            i0Var.f3555e = null;
            i0Var.f3551a = false;
            i0Var.f3552b = gVar;
            i0Var.f3553c = this.f3537c;
            if (gVar.requiresSignIn()) {
                q0 q0Var = this.A;
                com.google.android.gms.common.internal.e0.i(q0Var);
                Handler handler = q0Var.f3579b;
                com.google.android.gms.common.internal.i iVar = q0Var.f3582e;
                je.a aVar = q0Var.f3583f;
                if (aVar != null) {
                    aVar.disconnect();
                }
                iVar.f3646g = Integer.valueOf(System.identityHashCode(q0Var));
                q0Var.f3583f = (je.a) q0Var.f3580c.buildClient(q0Var.f3578a, handler.getLooper(), iVar, (Object) iVar.f3645f, (com.google.android.gms.common.api.n) q0Var, (com.google.android.gms.common.api.o) q0Var);
                q0Var.f3584z = i0Var;
                Set set = q0Var.f3581d;
                if (set == null || set.isEmpty()) {
                    handler.post(new ah.d(q0Var, 6));
                } else {
                    je.a aVar2 = q0Var.f3583f;
                    aVar2.getClass();
                    aVar2.connect(new com.google.android.gms.common.internal.s(aVar2));
                }
            }
            try {
                gVar.connect(i0Var);
            } catch (SecurityException e10) {
                m(new nd.b(10), e10);
            }
        } catch (IllegalStateException e11) {
            m(new nd.b(10), e11);
        }
    }

    public final void l(y0 y0Var) {
        com.google.android.gms.common.internal.e0.c(this.F.G);
        boolean zIsConnected = this.f3536b.isConnected();
        LinkedList linkedList = this.f3535a;
        if (zIsConnected) {
            if (h(y0Var)) {
                g();
                return;
            } else {
                linkedList.add(y0Var);
                return;
            }
        }
        linkedList.add(y0Var);
        nd.b bVar = this.D;
        if (bVar == null || bVar.f12268b == 0 || bVar.f12269c == null) {
            k();
        } else {
            m(bVar, null);
        }
    }

    public final void m(nd.b bVar, RuntimeException runtimeException) {
        je.a aVar;
        com.google.android.gms.common.internal.e0.c(this.F.G);
        q0 q0Var = this.A;
        if (q0Var != null && (aVar = q0Var.f3583f) != null) {
            aVar.disconnect();
        }
        com.google.android.gms.common.internal.e0.c(this.F.G);
        this.D = null;
        ((SparseIntArray) this.F.f3548z.f15363b).clear();
        a(bVar);
        if ((this.f3536b instanceof pd.c) && bVar.f12268b != 24) {
            h hVar = this.F;
            hVar.f3543b = true;
            zau zauVar = hVar.G;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (bVar.f12268b == 4) {
            b(h.J);
            return;
        }
        if (this.f3535a.isEmpty()) {
            this.D = bVar;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.e0.c(this.F.G);
            c(null, runtimeException, false);
            return;
        }
        if (!this.F.H) {
            b(h.e(this.f3537c, bVar));
            return;
        }
        c(h.e(this.f3537c, bVar), null, true);
        if (this.f3535a.isEmpty() || i(bVar) || this.F.d(bVar, this.f3541z)) {
            return;
        }
        if (bVar.f12268b == 18) {
            this.B = true;
        }
        if (!this.B) {
            b(h.e(this.f3537c, bVar));
            return;
        }
        h hVar2 = this.F;
        a aVar2 = this.f3537c;
        zau zauVar2 = hVar2.G;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, aVar2), 5000L);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void n() {
        Looper looperMyLooper = Looper.myLooper();
        zau zauVar = this.F.G;
        if (looperMyLooper == zauVar.getLooper()) {
            e();
        } else {
            zauVar.post(new ah.d(this, 4));
        }
    }

    public final void o(nd.b bVar) {
        com.google.android.gms.common.internal.e0.c(this.F.G);
        com.google.android.gms.common.api.g gVar = this.f3536b;
        gVar.disconnect("onSignInFailed for " + gVar.getClass().getName() + " with " + String.valueOf(bVar));
        m(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void onConnectionFailed(nd.b bVar) {
        m(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onConnectionSuspended(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        zau zauVar = this.F.G;
        if (looperMyLooper == zauVar.getLooper()) {
            f(i10);
        } else {
            zauVar.post(new b8.f(i10, 1, this));
        }
    }

    public final void p() {
        com.google.android.gms.common.internal.e0.c(this.F.G);
        Status status = h.I;
        b(status);
        this.f3538d.a(status, false);
        for (m mVar : (m[]) this.f3540f.keySet().toArray(new m[0])) {
            l(new x0(mVar, new TaskCompletionSource()));
        }
        a(new nd.b(4));
        com.google.android.gms.common.api.g gVar = this.f3536b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new p7.k(this, 4));
        }
    }
}
