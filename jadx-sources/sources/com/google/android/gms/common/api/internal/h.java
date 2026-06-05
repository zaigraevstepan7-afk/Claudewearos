package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements Handler.Callback {
    public static final Status I = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status J = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object K = new Object();
    public static h L;
    public final AtomicInteger A;
    public final AtomicInteger B;
    public final ConcurrentHashMap C;
    public c0 D;
    public final q.f E;
    public final q.f F;
    public final zau G;
    public volatile boolean H;

    /* renamed from: a, reason: collision with root package name */
    public long f3542a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3543b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.u f3544c;

    /* renamed from: d, reason: collision with root package name */
    public pd.b f3545d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3546e;

    /* renamed from: f, reason: collision with root package name */
    public final nd.e f3547f;

    /* renamed from: z, reason: collision with root package name */
    public final t0.j f3548z;

    public h(Context context, Looper looper) {
        nd.e eVar = nd.e.f12278d;
        this.f3542a = 10000L;
        this.f3543b = false;
        this.A = new AtomicInteger(1);
        this.B = new AtomicInteger(0);
        this.C = new ConcurrentHashMap(5, 0.75f, 1);
        this.D = null;
        this.E = new q.f(0);
        this.F = new q.f(0);
        this.H = true;
        this.f3546e = context;
        zau zauVar = new zau(looper, this);
        this.G = zauVar;
        this.f3547f = eVar;
        this.f3548z = new t0.j(8);
        PackageManager packageManager = context.getPackageManager();
        if (ud.c.f16989g == null) {
            ud.c.f16989g = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (ud.c.f16989g.booleanValue()) {
            this.H = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (K) {
            try {
                h hVar = L;
                if (hVar != null) {
                    hVar.B.incrementAndGet();
                    zau zauVar = hVar.G;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status e(a aVar, nd.b bVar) {
        return new Status(17, y8.f.b("API: ", aVar.f3499b.f3497c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f12269c, bVar);
    }

    public static h h(Context context) {
        h hVar;
        HandlerThread handlerThread;
        synchronized (K) {
            if (L == null) {
                synchronized (com.google.android.gms.common.internal.m.f3671a) {
                    try {
                        handlerThread = com.google.android.gms.common.internal.m.f3673c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.google.android.gms.common.internal.m.f3673c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.google.android.gms.common.internal.m.f3673c;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = nd.e.f12277c;
                L = new h(applicationContext, looper);
            }
            hVar = L;
        }
        return hVar;
    }

    public final void b(c0 c0Var) {
        synchronized (K) {
            try {
                if (this.D != c0Var) {
                    this.D = c0Var;
                    this.E.clear();
                }
                this.E.addAll(c0Var.f3519e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        if (this.f3543b) {
            return false;
        }
        com.google.android.gms.common.internal.t tVar = (com.google.android.gms.common.internal.t) com.google.android.gms.common.internal.s.b().f3703a;
        if (tVar != null && !tVar.f3705b) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f3548z.f15363b).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean d(nd.b bVar, int i10) {
        nd.e eVar = this.f3547f;
        eVar.getClass();
        Context context = this.f3546e;
        if (!wd.a.H(context)) {
            int i11 = bVar.f12268b;
            PendingIntent activity = bVar.f12269c;
            if (!((i11 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = eVar.b(context, null, i11);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, zzd.zza | 134217728);
                }
            }
            if (activity != null) {
                int i12 = GoogleApiActivity.f3484b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                eVar.h(context, i11, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    public final g0 f(com.google.android.gms.common.api.m mVar) {
        a apiKey = mVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.C;
        g0 g0Var = (g0) concurrentHashMap.get(apiKey);
        if (g0Var == null) {
            g0Var = new g0(this, mVar);
            concurrentHashMap.put(apiKey, g0Var);
        }
        if (g0Var.f3536b.requiresSignIn()) {
            this.F.add(apiKey);
        }
        g0Var.k();
        return g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, com.google.android.gms.common.api.m r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L7e
            com.google.android.gms.common.api.internal.a r3 = r11.getApiKey()
            boolean r11 = r8.c()
            if (r11 != 0) goto Ld
            goto L4c
        Ld:
            com.google.android.gms.common.internal.s r11 = com.google.android.gms.common.internal.s.b()
            java.lang.Object r11 = r11.f3703a
            com.google.android.gms.common.internal.t r11 = (com.google.android.gms.common.internal.t) r11
            r0 = 1
            if (r11 == 0) goto L4f
            boolean r1 = r11.f3705b
            if (r1 == 0) goto L4c
            boolean r11 = r11.f3706c
            java.util.concurrent.ConcurrentHashMap r1 = r8.C
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.common.api.internal.g0 r1 = (com.google.android.gms.common.api.internal.g0) r1
            if (r1 == 0) goto L4a
            com.google.android.gms.common.api.g r2 = r1.f3536b
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.f
            if (r4 == 0) goto L4c
            com.google.android.gms.common.internal.f r2 = (com.google.android.gms.common.internal.f) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L4a
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L4a
            com.google.android.gms.common.internal.j r11 = com.google.android.gms.common.api.internal.n0.a(r1, r2, r10)
            if (r11 == 0) goto L4c
            int r2 = r1.E
            int r2 = r2 + r0
            r1.E = r2
            boolean r0 = r11.f3651c
            goto L4f
        L4a:
            r0 = r11
            goto L4f
        L4c:
            r10 = 0
            r1 = r8
            goto L69
        L4f:
            com.google.android.gms.common.api.internal.n0 r11 = new com.google.android.gms.common.api.internal.n0
            r1 = 0
            if (r0 == 0) goto L5a
            long r4 = java.lang.System.currentTimeMillis()
            goto L5b
        L5a:
            r4 = r1
        L5b:
            if (r0 == 0) goto L61
            long r1 = android.os.SystemClock.elapsedRealtime()
        L61:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L69:
            if (r10 == 0) goto L7f
            com.google.android.gms.tasks.Task r9 = r9.getTask()
            com.google.android.gms.internal.base.zau r11 = r1.G
            r11.getClass()
            com.google.android.gms.common.api.internal.e0 r0 = new com.google.android.gms.common.api.internal.e0
            r2 = 0
            r0.<init>(r11, r2)
            r9.addOnCompleteListener(r0, r10)
            return
        L7e:
            r1 = r8
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.h.g(com.google.android.gms.tasks.TaskCompletionSource, int, com.google.android.gms.common.api.m):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        g0 g0Var;
        boolean z2;
        nd.d[] dVarArrG;
        boolean z10;
        int i10;
        int i11 = message.what;
        com.google.android.gms.common.internal.v vVar = com.google.android.gms.common.internal.v.f3711a;
        int i12 = 12;
        zau zauVar = this.G;
        int i13 = 0;
        ConcurrentHashMap concurrentHashMap = this.C;
        switch (i11) {
            case 1:
                this.f3542a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zauVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, (a) it.next()), this.f3542a);
                }
                return true;
            case 2:
                throw m1.f(message.obj);
            case 3:
                for (g0 g0Var2 : concurrentHashMap.values()) {
                    com.google.android.gms.common.internal.e0.c(g0Var2.F.G);
                    g0Var2.D = null;
                    g0Var2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                p0 p0Var = (p0) message.obj;
                com.google.android.gms.common.api.m mVar = p0Var.f3577c;
                y0 y0Var = p0Var.f3575a;
                g0 g0VarF = (g0) concurrentHashMap.get(mVar.getApiKey());
                if (g0VarF == null) {
                    g0VarF = f(p0Var.f3577c);
                }
                if (!g0VarF.f3536b.requiresSignIn() || this.B.get() == p0Var.f3576b) {
                    g0VarF.l(y0Var);
                    return true;
                }
                y0Var.a(I);
                g0VarF.p();
                return true;
            case 5:
                int i14 = message.arg1;
                nd.b bVar = (nd.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        g0Var = (g0) it2.next();
                        if (g0Var.f3541z == i14) {
                        }
                    } else {
                        g0Var = null;
                    }
                }
                if (g0Var == null) {
                    Log.wtf("GoogleApiManager", m6.a.e(i14, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i15 = bVar.f12268b;
                if (i15 != 13) {
                    g0Var.b(e(g0Var.f3537c, bVar));
                    return true;
                }
                this.f3547f.getClass();
                AtomicBoolean atomicBoolean = nd.i.f12283a;
                g0Var.b(new Status(17, y8.f.b("Error resolution was canceled by the user, original error message: ", nd.b.b(i15), ": ", bVar.f12270d), null, null));
                return true;
            case 6:
                Context context = this.f3546e;
                if (context.getApplicationContext() instanceof Application) {
                    c.b((Application) context.getApplicationContext());
                    c cVar = c.f3510e;
                    cVar.a(new f0(this, i13));
                    AtomicBoolean atomicBoolean2 = cVar.f3511a;
                    AtomicBoolean atomicBoolean3 = cVar.f3512b;
                    if (atomicBoolean3.get()) {
                        z2 = true;
                    } else {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        z2 = true;
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (atomicBoolean2.get()) {
                        return z2;
                    }
                    this.f3542a = 300000L;
                    return z2;
                }
                return true;
            case 7:
                f((com.google.android.gms.common.api.m) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    g0 g0Var3 = (g0) concurrentHashMap.get(message.obj);
                    com.google.android.gms.common.internal.e0.c(g0Var3.F.G);
                    if (g0Var3.B) {
                        g0Var3.k();
                        return true;
                    }
                }
                return true;
            case 10:
                q.f fVar = this.F;
                fVar.getClass();
                q.a aVar = new q.a(fVar);
                while (aVar.hasNext()) {
                    g0 g0Var4 = (g0) concurrentHashMap.remove((a) aVar.next());
                    if (g0Var4 != null) {
                        g0Var4.p();
                    }
                }
                fVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    g0 g0Var5 = (g0) concurrentHashMap.get(message.obj);
                    h hVar = g0Var5.F;
                    com.google.android.gms.common.internal.e0.c(hVar.G);
                    boolean z11 = g0Var5.B;
                    if (z11) {
                        a aVar2 = g0Var5.f3537c;
                        zau zauVar2 = g0Var5.F.G;
                        if (z11) {
                            zauVar2.removeMessages(11, aVar2);
                            zauVar2.removeMessages(9, aVar2);
                            g0Var5.B = false;
                        }
                        g0Var5.b(hVar.f3547f.d(hVar.f3546e, nd.f.f12279a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        g0Var5.f3536b.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((g0) concurrentHashMap.get(message.obj)).j(true);
                    return true;
                }
                return true;
            case 14:
                d0 d0Var = (d0) message.obj;
                a aVar3 = d0Var.f3525a;
                TaskCompletionSource taskCompletionSource = d0Var.f3526b;
                if (concurrentHashMap.containsKey(aVar3)) {
                    taskCompletionSource.setResult(Boolean.valueOf(((g0) concurrentHashMap.get(aVar3)).j(false)));
                    return true;
                }
                taskCompletionSource.setResult(Boolean.FALSE);
                return true;
            case 15:
                h0 h0Var = (h0) message.obj;
                if (!concurrentHashMap.containsKey(h0Var.f3549a)) {
                    return true;
                }
                g0 g0Var6 = (g0) concurrentHashMap.get(h0Var.f3549a);
                if (!g0Var6.C.contains(h0Var) || g0Var6.B) {
                    return true;
                }
                if (g0Var6.f3536b.isConnected()) {
                    g0Var6.d();
                    return true;
                }
                g0Var6.k();
                return true;
            case 16:
                h0 h0Var2 = (h0) message.obj;
                if (!concurrentHashMap.containsKey(h0Var2.f3549a)) {
                    return true;
                }
                g0 g0Var7 = (g0) concurrentHashMap.get(h0Var2.f3549a);
                ArrayList arrayList = g0Var7.C;
                zau zauVar3 = g0Var7.F.G;
                LinkedList<y0> linkedList = g0Var7.f3535a;
                if (!arrayList.remove(h0Var2)) {
                    return true;
                }
                zauVar3.removeMessages(15, h0Var2);
                zauVar3.removeMessages(16, h0Var2);
                nd.d dVar = h0Var2.f3550b;
                ArrayList arrayList2 = new ArrayList(linkedList.size());
                for (y0 y0Var2 : linkedList) {
                    if ((y0Var2 instanceof m0) && (dVarArrG = ((m0) y0Var2).g(g0Var7)) != null && ud.c.e(dVarArrG, dVar)) {
                        arrayList2.add(y0Var2);
                    }
                }
                int size = arrayList2.size();
                while (i13 < size) {
                    y0 y0Var3 = (y0) arrayList2.get(i13);
                    linkedList.remove(y0Var3);
                    y0Var3.b(new com.google.android.gms.common.api.x(dVar));
                    i13++;
                }
                return true;
            case 17:
                com.google.android.gms.common.internal.u uVar = this.f3544c;
                if (uVar == null) {
                    return true;
                }
                if (uVar.f3709a > 0 || c()) {
                    if (this.f3545d == null) {
                        this.f3545d = new pd.b(this.f3546e, null, pd.b.f12865a, vVar, com.google.android.gms.common.api.l.f3608c);
                    }
                    pd.b bVar2 = this.f3545d;
                    bVar2.getClass();
                    x xVarA = y.a();
                    xVarA.f3599e = new nd.d[]{zaf.zaa};
                    xVarA.f3597c = false;
                    xVarA.f3598d = new yh.c(uVar, i12);
                    bVar2.doBestEffortWrite(xVarA.a());
                }
                this.f3544c = null;
                return true;
            case 18:
                o0 o0Var = (o0) message.obj;
                long j = o0Var.f3573c;
                com.google.android.gms.common.internal.r rVar = o0Var.f3571a;
                int i16 = o0Var.f3572b;
                if (j == 0) {
                    com.google.android.gms.common.internal.u uVar2 = new com.google.android.gms.common.internal.u(i16, Arrays.asList(rVar));
                    if (this.f3545d == null) {
                        this.f3545d = new pd.b(this.f3546e, null, pd.b.f12865a, vVar, com.google.android.gms.common.api.l.f3608c);
                    }
                    pd.b bVar3 = this.f3545d;
                    bVar3.getClass();
                    x xVarA2 = y.a();
                    xVarA2.f3599e = new nd.d[]{zaf.zaa};
                    xVarA2.f3597c = false;
                    xVarA2.f3598d = new yh.c(uVar2, i12);
                    bVar3.doBestEffortWrite(xVarA2.a());
                    return true;
                }
                com.google.android.gms.common.internal.u uVar3 = this.f3544c;
                if (uVar3 != null) {
                    List list = uVar3.f3710b;
                    if (uVar3.f3709a != i16 || (list != null && list.size() >= o0Var.f3574d)) {
                        zauVar.removeMessages(17);
                        com.google.android.gms.common.internal.u uVar4 = this.f3544c;
                        if (uVar4 != null) {
                            if (uVar4.f3709a > 0 || c()) {
                                if (this.f3545d == null) {
                                    z10 = true;
                                    i10 = i16;
                                    this.f3545d = new pd.b(this.f3546e, null, pd.b.f12865a, vVar, com.google.android.gms.common.api.l.f3608c);
                                } else {
                                    z10 = true;
                                    i10 = i16;
                                }
                                pd.b bVar4 = this.f3545d;
                                bVar4.getClass();
                                x xVarA3 = y.a();
                                xVarA3.f3599e = new nd.d[]{zaf.zaa};
                                xVarA3.f3597c = false;
                                xVarA3.f3598d = new yh.c(uVar4, i12);
                                bVar4.doBestEffortWrite(xVarA3.a());
                            } else {
                                z10 = true;
                                i10 = i16;
                            }
                            this.f3544c = null;
                        }
                    } else {
                        com.google.android.gms.common.internal.u uVar5 = this.f3544c;
                        if (uVar5.f3710b == null) {
                            uVar5.f3710b = new ArrayList();
                        }
                        uVar5.f3710b.add(rVar);
                    }
                    z10 = true;
                    i10 = i16;
                } else {
                    z10 = true;
                    i10 = i16;
                }
                if (this.f3544c != null) {
                    return z10;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(rVar);
                this.f3544c = new com.google.android.gms.common.internal.u(i10, arrayList3);
                zauVar.sendMessageDelayed(zauVar.obtainMessage(17), o0Var.f3573c);
                return z10;
            case 19:
                this.f3543b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i11);
                return false;
        }
    }

    public final void i(nd.b bVar, int i10) {
        if (d(bVar, i10)) {
            return;
        }
        zau zauVar = this.G;
        zauVar.sendMessage(zauVar.obtainMessage(5, i10, 0, bVar));
    }
}
