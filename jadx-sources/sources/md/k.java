package md;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public t0.j f11628c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f11631f;

    /* renamed from: a, reason: collision with root package name */
    public int f11626a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f11627b = new Messenger(new zzf(Looper.getMainLooper(), new gf.e(this, 1)));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f11629d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f11630e = new SparseArray();

    public /* synthetic */ k(m mVar) {
        this.f11631f = mVar;
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.f11626a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f11626a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f11626a = 4;
            td.a.a().b((Context) this.f11631f.f11639b, this);
            a5.a aVar = new a5.a(str, securityException);
            Iterator it = this.f11629d.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(aVar);
            }
            this.f11629d.clear();
            for (int i11 = 0; i11 < this.f11630e.size(); i11++) {
                ((l) this.f11630e.valueAt(i11)).b(aVar);
            }
            this.f11630e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f11626a == 2 && this.f11629d.isEmpty() && this.f11630e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f11626a = 3;
                td.a.a().b((Context) this.f11631f.f11639b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(l lVar) throws Throwable {
        Throwable th2;
        int i10;
        td.a aVarA;
        Context context;
        try {
            try {
                i10 = this.f11626a;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.f11629d.add(lVar);
                        return true;
                    }
                    if (i10 != 2) {
                        return false;
                    }
                    this.f11629d.add(lVar);
                    ((ScheduledExecutorService) this.f11631f.f11640c).execute(new j(this, 0));
                    return true;
                }
                this.f11629d.add(lVar);
                if (this.f11626a != 0) {
                    throw new IllegalStateException();
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f11626a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    aVarA = td.a.a();
                    context = (Context) this.f11631f.f11639b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (aVarA.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f11631f.f11640c).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e11) {
                    e = e11;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th4) {
                th2 = th4;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f11631f.f11640c).execute(new a8.e(10, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f11631f.f11640c).execute(new j(this, 2));
    }
}
