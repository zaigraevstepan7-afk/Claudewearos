package ke;

import ah.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import i4.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ud.f;
import ud.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f9536n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f9537o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f9538p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9539a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f9540b;

    /* renamed from: c, reason: collision with root package name */
    public int f9541c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f9542d;

    /* renamed from: e, reason: collision with root package name */
    public long f9543e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f9544f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9545g;

    /* renamed from: h, reason: collision with root package name */
    public zzb f9546h;

    /* renamed from: i, reason: collision with root package name */
    public final ud.b f9547i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f9548k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f9549l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f9550m;

    public a(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f9539a = new Object();
        this.f9541c = 0;
        this.f9544f = new HashSet();
        this.f9545g = true;
        this.f9547i = ud.b.f16982a;
        this.f9548k = new HashMap();
        this.f9549l = new AtomicInteger(0);
        e0.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f9546h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f9540b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = g.f16994a;
        synchronized (g.class) {
            Boolean bool = g.f16996c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = c.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                g.f16996c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i10 = f.f16993a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoB = wd.b.a(context).b(0, packageName);
                    if (applicationInfoB == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i11 = applicationInfoB.uid;
                        workSource = new WorkSource();
                        Method method2 = g.f16995b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i11), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method3 = g.f16994a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i11));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f9540b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f9537o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f9538p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f9537o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f9537o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f9550m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j) {
        this.f9549l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f9536n), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f9539a) {
            try {
                if (!b()) {
                    this.f9546h = zzb.zza(false, null);
                    this.f9540b.acquire();
                    this.f9547i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f9541c++;
                if (this.f9545g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f9548k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f9548k.put(null, bVar);
                }
                bVar.f9551a++;
                this.f9547i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j4 > this.f9543e) {
                    this.f9543e = j4;
                    ScheduledFuture scheduledFuture = this.f9542d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f9542d = this.f9550m.schedule(new d(this, 9), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.f9539a) {
            z2 = this.f9541c > 0;
        }
        return z2;
    }

    public final void c() {
        if (this.f9549l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f9539a) {
            try {
                if (this.f9545g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f9548k.containsKey(null)) {
                    b bVar = (b) this.f9548k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f9551a - 1;
                        bVar.f9551a = i10;
                        if (i10 == 0) {
                            this.f9548k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f9544f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f9539a) {
            try {
                if (b()) {
                    if (this.f9545g) {
                        int i10 = this.f9541c - 1;
                        this.f9541c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f9541c = 0;
                    }
                    d();
                    Iterator it = this.f9548k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f9551a = 0;
                    }
                    this.f9548k.clear();
                    ScheduledFuture scheduledFuture = this.f9542d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f9542d = null;
                        this.f9543e = 0L;
                    }
                    if (this.f9540b.isHeld()) {
                        try {
                            try {
                                this.f9540b.release();
                                if (this.f9546h != null) {
                                    this.f9546h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e10);
                                if (this.f9546h != null) {
                                    this.f9546h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f9546h != null) {
                                this.f9546h = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
