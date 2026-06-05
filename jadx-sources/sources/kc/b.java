package kc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import nd.f;
import nd.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public nd.a f9510a;

    /* renamed from: b, reason: collision with root package name */
    public zzf f9511b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9512c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9513d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public d f9514e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f9515f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9516g;

    public b(Context context, long j, boolean z2) {
        Context applicationContext;
        e0.i(context);
        if (z2 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f9515f = context;
        this.f9512c = false;
        this.f9516g = j;
    }

    public static a a(Context context) {
        b bVar = new b(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bVar.d(false);
            a aVarF = bVar.f();
            e(aVarF, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return aVarF;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean zZzd;
        b bVar = new b(context, -1L, false);
        try {
            bVar.d(false);
            e0.h("Calling this from your main thread can lead to deadlock");
            synchronized (bVar) {
                try {
                    if (!bVar.f9512c) {
                        synchronized (bVar.f9513d) {
                            d dVar = bVar.f9514e;
                            if (dVar == null || !dVar.f9522d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            bVar.d(false);
                            if (!bVar.f9512c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e10) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                        }
                    }
                    e0.i(bVar.f9510a);
                    e0.i(bVar.f9511b);
                    try {
                        zZzd = bVar.f9511b.zzd();
                    } catch (RemoteException e11) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            bVar.g();
            return zZzd;
        } finally {
            bVar.c();
        }
    }

    public static void e(a aVar, long j, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.f9509b ? "0" : "1");
                String str = aVar.f9508a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new c(0, map).start();
        }
    }

    public final void c() {
        e0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f9515f == null || this.f9510a == null) {
                    return;
                }
                try {
                    if (this.f9512c) {
                        td.a.a().b(this.f9515f, this.f9510a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f9512c = false;
                this.f9511b = null;
                this.f9510a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d(boolean z2) {
        e0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f9512c) {
                    c();
                }
                Context context = this.f9515f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iD = f.f12280b.d(context, 12451000);
                    if (iD != 0 && iD != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    nd.a aVar = new nd.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!td.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f9510a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            this.f9511b = zze.zza(aVar.a());
                            this.f9512c = true;
                            if (z2) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final a f() {
        a aVar;
        e0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f9512c) {
                    synchronized (this.f9513d) {
                        d dVar = this.f9514e;
                        if (dVar == null || !dVar.f9522d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f9512c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                e0.i(this.f9510a);
                e0.i(this.f9511b);
                try {
                    aVar = new a(this.f9511b.zzc(), this.f9511b.zze(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f9513d) {
            d dVar = this.f9514e;
            if (dVar != null) {
                dVar.f9521c.countDown();
                try {
                    this.f9514e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f9516g;
            if (j > 0) {
                this.f9514e = new d(this, j);
            }
        }
    }
}
