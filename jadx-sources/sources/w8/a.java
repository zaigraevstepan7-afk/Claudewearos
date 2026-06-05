package w8;

import ak.x;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import w5.a0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18916a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f18917b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18918c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f18919d;

    /* renamed from: e, reason: collision with root package name */
    public volatile i0 f18920e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f18921f;

    /* renamed from: g, reason: collision with root package name */
    public final qh.c f18922g;

    /* renamed from: h, reason: collision with root package name */
    public volatile zzan f18923h;

    /* renamed from: i, reason: collision with root package name */
    public volatile l f18924i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f18925k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18926l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18927m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18928n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18929o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18930p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18931q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18932r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18933s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18934t;

    /* renamed from: u, reason: collision with root package name */
    public final y9.a f18935u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f18936v;

    /* renamed from: w, reason: collision with root package name */
    public ExecutorService f18937w;

    /* renamed from: x, reason: collision with root package name */
    public volatile zzev f18938x;

    /* renamed from: y, reason: collision with root package name */
    public final Long f18939y;

    public a(y9.a aVar, Context context) {
        this.f18916a = new Object();
        this.f18917b = 0;
        this.f18919d = new Handler(Looper.getMainLooper());
        this.f18925k = 0;
        long jNextLong = new Random().nextLong();
        this.f18939y = Long.valueOf(jNextLong);
        this.f18918c = j();
        this.f18921f = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(j());
        zzksVarZzc.zzn(this.f18921f.getPackageName());
        zzksVarZzc.zzm(jNextLong);
        this.f18922g = new qh.c(this.f18921f, (zzku) zzksVarZzc.zzf());
        zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f18920e = new i0(this.f18921f, null, this.f18922g);
        this.f18935u = aVar;
        this.f18921f.getPackageName();
    }

    public static Future g(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new a8.e(26, futureSubmit, runnable, false), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            zze.zzm("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static String j() {
        try {
            return (String) x8.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    public void a(rc.f fVar, l7.n nVar) {
        if (!c()) {
            c cVar = u.j;
            s(2, 3, cVar);
            l7.n.g(cVar);
            return;
        }
        if (TextUtils.isEmpty(fVar.f14339a)) {
            zze.zzl("BillingClient", "Please provide a valid purchase token.");
            c cVar2 = u.f18984g;
            s(26, 3, cVar2);
            l7.n.g(cVar2);
            return;
        }
        if (!this.f18927m) {
            c cVar3 = u.f18979b;
            s(27, 3, cVar3);
            l7.n.g(cVar3);
        } else {
            if (g(new mc.g(this, nVar, fVar), 30000L, new t7.s(this, nVar), Looper.myLooper() == null ? this.f18919d : new Handler(Looper.myLooper()), k()) == null) {
                c cVarH = h();
                s(25, 3, cVarH);
                l7.n.g(cVarH);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r5 = this;
            r0 = 12
            com.google.android.gms.internal.play_billing.zzkd r0 = w8.s.d(r0)     // Catch: java.lang.Throwable -> La
            r5.m(r0)     // Catch: java.lang.Throwable -> La
            goto L12
        La:
            r0 = move-exception
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unable to log."
            com.google.android.gms.internal.play_billing.zze.zzm(r1, r2, r0)
        L12:
            java.lang.Object r0 = r5.f18916a
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.i0 r1 = r5.f18920e     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L36
            com.google.android.gms.common.api.internal.i0 r1 = r5.f18920e     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r1.f3555e     // Catch: java.lang.Throwable -> L2e
            w8.v r2 = (w8.v) r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r1.f3552b     // Catch: java.lang.Throwable -> L2e
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L2e
            r2.b(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r1.f3556f     // Catch: java.lang.Throwable -> L2e
            w8.v r1 = (w8.v) r1     // Catch: java.lang.Throwable -> L2e
            r1.b(r3)     // Catch: java.lang.Throwable -> L2e
            goto L36
        L2e:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while shutting down broadcast manager while ending connection!"
            com.google.android.gms.internal.play_billing.zze.zzm(r2, r3, r1)     // Catch: java.lang.Throwable -> L5f
        L36:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unbinding from service."
            com.google.android.gms.internal.play_billing.zze.zzk(r1, r2)     // Catch: java.lang.Throwable -> L41
            r5.o()     // Catch: java.lang.Throwable -> L41
            goto L49
        L41:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while unbinding from the service while ending connection!"
            com.google.android.gms.internal.play_billing.zze.zzm(r2, r3, r1)     // Catch: java.lang.Throwable -> L5f
        L49:
            r1 = 3
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.ExecutorService r2 = r5.f18937w     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L57
            r2.shutdownNow()     // Catch: java.lang.Throwable -> L59
            r2 = 0
            r5.f18937w = r2     // Catch: java.lang.Throwable -> L59
            r5.f18938x = r2     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L63
            goto L5b
        L59:
            r2 = move-exception
            goto L61
        L5b:
            r5.n(r1)     // Catch: java.lang.Throwable -> L5f
            goto L6c
        L5f:
            r1 = move-exception
            goto L73
        L61:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L63
        L63:
            r2 = move-exception
            java.lang.String r3 = "BillingClient"
            java.lang.String r4 = "There was an exception while shutting down the executor service while ending connection!"
            com.google.android.gms.internal.play_billing.zze.zzm(r3, r4, r2)     // Catch: java.lang.Throwable -> L6e
            goto L5b
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return
        L6e:
            r2 = move-exception
            r5.n(r1)     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.a.b():void");
    }

    public final boolean c() {
        boolean z2;
        synchronized (this.f18916a) {
            try {
                z2 = false;
                if (this.f18917b == 2 && this.f18923h != null && this.f18924i != null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0552 A[Catch: Exception -> 0x055e, CancellationException -> 0x0561, TimeoutException -> 0x0564, TRY_ENTER, TryCatch #6 {CancellationException -> 0x0561, TimeoutException -> 0x0564, Exception -> 0x055e, blocks: (B:211:0x0552, B:219:0x0567, B:221:0x057c, B:246:0x0605, B:245:0x05f3, B:235:0x05d0, B:248:0x060c), top: B:269:0x0550 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0567 A[Catch: Exception -> 0x055e, CancellationException -> 0x0561, TimeoutException -> 0x0564, TryCatch #6 {CancellationException -> 0x0561, TimeoutException -> 0x0564, Exception -> 0x055e, blocks: (B:211:0x0552, B:219:0x0567, B:221:0x057c, B:246:0x0605, B:245:0x05f3, B:235:0x05d0, B:248:0x060c), top: B:269:0x0550 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w8.c d(android.app.Activity r29, final f0.a1 r30) {
        /*
            Method dump skipped, instructions count: 1647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.a.d(android.app.Activity, f0.a1):w8.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(a0 a0Var, ac.l lVar) {
        if (!c()) {
            c cVar = u.j;
            s(2, 7, cVar);
            lVar.d(cVar, new ArrayList());
        } else {
            if (!this.f18931q) {
                zze.zzl("BillingClient", "Querying product details is not supported.");
                c cVar2 = u.f18991o;
                s(20, 7, cVar2);
                lVar.d(cVar2, new ArrayList());
                return;
            }
            if (g(new j(this, a0Var, lVar, 0), 30000L, new a8.e(27, this, lVar, 0 == true ? 1 : 0), Looper.myLooper() == null ? this.f18919d : new Handler(Looper.myLooper()), k()) == null) {
                c cVarH = h();
                s(25, 7, cVarH);
                lVar.d(cVarH, new ArrayList());
            }
        }
    }

    public void f(p7.k kVar) {
        c cVarR;
        synchronized (this.f18916a) {
            try {
                if (c()) {
                    cVarR = r();
                } else if (this.f18917b == 1) {
                    zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    cVarR = u.f18982e;
                    s(37, 6, cVarR);
                } else if (this.f18917b == 3) {
                    zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    cVarR = u.j;
                    s(38, 6, cVarR);
                } else {
                    n(1);
                    o();
                    zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.f18924i = new l(this, kVar);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.f18921f.getPackageManager().queryIntentServices(intent, 0);
                    int i10 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        n(0);
                        zze.zzk("BillingClient", "Billing service unavailable on device.");
                        cVarR = u.f18980c;
                        s(i10, 6, cVarR);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f18918c);
                                synchronized (this.f18916a) {
                                    try {
                                        if (this.f18917b == 2) {
                                            cVarR = r();
                                        } else if (this.f18917b != 1) {
                                            zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            cVarR = u.j;
                                            s(117, 6, cVarR);
                                        } else {
                                            l lVar = this.f18924i;
                                            if (this.f18921f.bindService(intent2, lVar, 1)) {
                                                zze.zzk("BillingClient", "Service was bonded successfully.");
                                                cVarR = null;
                                            } else {
                                                zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        n(0);
                        zze.zzk("BillingClient", "Billing service unavailable on device.");
                        cVarR = u.f18980c;
                        s(i10, 6, cVarR);
                    }
                }
            } finally {
            }
        }
        if (cVarR != null) {
            kVar.j(cVarR);
        }
    }

    public final c h() {
        int[] iArr = {0, 3};
        synchronized (this.f18916a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f18917b == iArr[i10]) {
                    return u.j;
                }
            }
            return u.f18985h;
        }
    }

    public final void i() {
        if (TextUtils.isEmpty(null)) {
            this.f18921f.getPackageName();
        }
    }

    public final synchronized ExecutorService k() {
        try {
            if (this.f18937w == null) {
                this.f18937w = Executors.newFixedThreadPool(zze.zza, new rc.b());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f18937w;
    }

    public final void l(zzjz zzjzVar) {
        try {
            qh.c cVar = this.f18922g;
            int i10 = this.f18925k;
            cVar.getClass();
            try {
                zzks zzksVar = (zzks) ((zzku) cVar.f13507b).zzn();
                zzksVar.zza(i10);
                cVar.f13507b = (zzku) zzksVar.zzf();
                cVar.Q(zzjzVar);
            } catch (Throwable th2) {
                zze.zzm("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zze.zzm("BillingClient", "Unable to log.", th3);
        }
    }

    public final void m(zzkd zzkdVar) {
        try {
            qh.c cVar = this.f18922g;
            int i10 = this.f18925k;
            cVar.getClass();
            try {
                zzks zzksVar = (zzks) ((zzku) cVar.f13507b).zzn();
                zzksVar.zza(i10);
                cVar.f13507b = (zzku) zzksVar.zzf();
                cVar.R(zzkdVar);
            } catch (Throwable th2) {
                zze.zzm("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zze.zzm("BillingClient", "Unable to log.", th3);
        }
    }

    public final void n(int i10) {
        synchronized (this.f18916a) {
            try {
                if (this.f18917b == 3) {
                    return;
                }
                int i11 = this.f18917b;
                zze.zzk("BillingClient", "Setting clientState from " + (i11 != 0 ? i11 != 1 ? i11 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f18917b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        synchronized (this.f18916a) {
            if (this.f18924i != null) {
                try {
                    this.f18921f.unbindService(this.f18924i);
                } catch (Throwable th2) {
                    try {
                        zze.zzm("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f18923h = null;
                        this.f18924i = null;
                    } finally {
                        this.f18923h = null;
                        this.f18924i = null;
                    }
                }
            }
        }
    }

    public final x p(c cVar, int i10, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        t(i10, 7, cVar, s.a(exc));
        return new x(cVar.f18942a, cVar.f18943b, new ArrayList());
    }

    public final void q(c cVar, int i10, Exception exc) {
        zze.zzm("BillingClient", "Error in acknowledge purchase!", exc);
        t(i10, 3, cVar, s.a(exc));
        l7.n.g(cVar);
    }

    public final c r() {
        zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzkbVarZzc = zzkd.zzc();
        zzkbVarZzc.zzn(6);
        zzlv zzlvVarZzc = zzlx.zzc();
        zzlvVarZzc.zza(true);
        zzkbVarZzc.zzm(zzlvVarZzc);
        m((zzkd) zzkbVarZzc.zzf());
        return u.f18986i;
    }

    public final void s(int i10, int i11, c cVar) {
        try {
            l(s.b(i10, i11, cVar));
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t(int i10, int i11, c cVar, String str) {
        try {
            l(s.c(i10, i11, cVar, str));
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void u(c cVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f18919d.post(new a8.e(28, this, cVar, false));
    }

    public a(y9.a aVar, Context context, ac.h hVar) {
        String strJ = j();
        this.f18916a = new Object();
        this.f18917b = 0;
        this.f18919d = new Handler(Looper.getMainLooper());
        this.f18925k = 0;
        long jNextLong = new Random().nextLong();
        this.f18939y = Long.valueOf(jNextLong);
        this.f18918c = strJ;
        this.f18921f = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(strJ);
        zzksVarZzc.zzn(this.f18921f.getPackageName());
        zzksVarZzc.zzm(jNextLong);
        this.f18922g = new qh.c(this.f18921f, (zzku) zzksVarZzc.zzf());
        if (hVar == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f18920e = new i0(this.f18921f, hVar, this.f18922g);
        this.f18935u = aVar;
        this.f18936v = false;
        this.f18921f.getPackageName();
    }
}
