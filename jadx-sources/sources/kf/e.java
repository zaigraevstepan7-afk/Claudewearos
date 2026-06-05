package kf;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f9559o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f9560a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f9561b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9562c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9566g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f9567h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f9568i;

    /* renamed from: m, reason: collision with root package name */
    public d f9571m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f9572n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9563d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9564e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f9565f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final j0 f9569k = new IBinder.DeathRecipient() { // from class: kf.j0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            e eVar = this.f9583a;
            int i10 = 0;
            eVar.f9561b.b("reportBinderDeath", new Object[0]);
            if (eVar.j.get() != null) {
                throw new ClassCastException();
            }
            eVar.f9561b.b("%s : Binder has died.", eVar.f9562c);
            ArrayList arrayList = eVar.f9563d;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((i0) obj).a(new RemoteException(String.valueOf(eVar.f9562c).concat(" : Binder has died.")));
            }
            eVar.f9563d.clear();
            synchronized (eVar.f9565f) {
                eVar.e();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f9570l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [kf.j0] */
    public e(Context context, h0 h0Var, String str, Intent intent, l0 l0Var) {
        this.f9560a = context;
        this.f9561b = h0Var;
        this.f9562c = str;
        this.f9567h = intent;
        this.f9568i = l0Var;
    }

    public static void b(e eVar, i0 i0Var) {
        IInterface iInterface = eVar.f9572n;
        h0 h0Var = eVar.f9561b;
        ArrayList arrayList = eVar.f9563d;
        int i10 = 0;
        if (iInterface != null || eVar.f9566g) {
            if (!eVar.f9566g) {
                i0Var.run();
                return;
            } else {
                h0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(i0Var);
                return;
            }
        }
        h0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(i0Var);
        d dVar = new d(eVar, 0);
        eVar.f9571m = dVar;
        eVar.f9566g = true;
        if (eVar.f9560a.bindService(eVar.f9567h, dVar, 1)) {
            return;
        }
        h0Var.b("Failed to bind to the service.", new Object[0]);
        eVar.f9566g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i0) obj).a(new f("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f9559o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f9562c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f9562c, 10);
                    handlerThread.start();
                    map.put(this.f9562c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f9562c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(i0 i0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new k0(this, i0Var.c(), taskCompletionSource, i0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f9565f) {
            this.f9564e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f9564e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f9562c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
