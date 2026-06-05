package cg;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final q.e f3366k = new q.e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3367a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3368b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3369c;

    /* renamed from: d, reason: collision with root package name */
    public final kg.g f3370d;

    /* renamed from: g, reason: collision with root package name */
    public final kg.n f3373g;

    /* renamed from: h, reason: collision with root package name */
    public final oh.b f3374h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3371e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f3372f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f3375i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public i(Context context, String str, m mVar) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        int i10 = 0;
        new CopyOnWriteArrayList();
        this.f3367a = context;
        e0.e(str);
        this.f3368b = str;
        this.f3369c = mVar;
        a aVar = FirebaseInitProvider.f4305a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new kg.d((String) it.next(), i10));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        lg.l lVar = lg.l.f10970a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i11 = 1;
        arrayList3.add(new kg.d(new FirebaseCommonRegistrar(), i11));
        arrayList3.add(new kg.d(new ExecutorsRegistrar(), i11));
        arrayList4.add(kg.b.c(context, Context.class, new Class[0]));
        arrayList4.add(kg.b.c(this, i.class, new Class[0]));
        arrayList4.add(kg.b.c(mVar, m.class, new Class[0]));
        ef.f fVar = new ef.f();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f4306b.get()) {
            arrayList4.add(kg.b.c(aVar, a.class, new Class[0]));
        }
        kg.g gVar = new kg.g(arrayList3, arrayList4, fVar);
        this.f3370d = gVar;
        Trace.endSection();
        this.f3373g = new kg.n(new d(i10, this, context));
        this.f3374h = gVar.b(lh.d.class);
        a(new f() { // from class: cg.e
            @Override // cg.f
            public final void a(boolean z2) {
                if (z2) {
                    return;
                }
                ((lh.d) this.f3362a.f3374h.get()).b();
            }
        });
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (j) {
            try {
                Iterator it = ((q.d) f3366k.values()).iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.b();
                    arrayList.add(iVar.f3368b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static i e() {
        i iVar;
        synchronized (j) {
            try {
                iVar = (i) f3366k.get("[DEFAULT]");
                if (iVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ud.c.i() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((lh.d) iVar.f3374h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public static i f(String str) {
        i iVar;
        String str2;
        synchronized (j) {
            try {
                iVar = (i) f3366k.get(str.trim());
                if (iVar == null) {
                    ArrayList arrayListD = d();
                    if (arrayListD.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListD);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((lh.d) iVar.f3374h.get()).b();
            } finally {
            }
        }
        return iVar;
    }

    public static i i(Context context) {
        synchronized (j) {
            try {
                if (f3366k.containsKey("[DEFAULT]")) {
                    return e();
                }
                m mVarA = m.a(context);
                if (mVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return j(context, mVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static i j(Context context, m mVar) {
        i iVar;
        AtomicReference atomicReference = g.f3363a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = g.f3363a;
            if (atomicReference2.get() == null) {
                g gVar = new g();
                while (true) {
                    if (atomicReference2.compareAndSet(null, gVar)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.f3510e.a(gVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            q.e eVar = f3366k;
            e0.k("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            e0.j(context, "Application context cannot be null.");
            iVar = new i(context, "[DEFAULT]", mVar);
            eVar.put("[DEFAULT]", iVar);
        }
        iVar.h();
        return iVar;
    }

    public final void a(f fVar) {
        b();
        if (this.f3371e.get() && com.google.android.gms.common.api.internal.c.f3510e.f3511a.get()) {
            fVar.a(true);
        }
        this.f3375i.add(fVar);
    }

    public final void b() {
        e0.k("FirebaseApp was deleted", !this.f3372f.get());
    }

    public final Object c(Class cls) {
        b();
        return this.f3370d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        iVar.b();
        return this.f3368b.equals(iVar.f3368b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        b();
        sb2.append(ud.c.h(this.f3368b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        b();
        sb2.append(ud.c.h(this.f3369c.f3382b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void h() {
        HashMap map;
        if (!((UserManager) this.f3367a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb2.append(this.f3368b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f3367a;
            AtomicReference atomicReference = h.f3364b;
            if (atomicReference.get() == null) {
                h hVar = new h(context);
                while (!atomicReference.compareAndSet(null, hVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(hVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        b();
        sb3.append(this.f3368b);
        Log.i("FirebaseApp", sb3.toString());
        kg.g gVar = this.f3370d;
        b();
        boolean zEquals = "[DEFAULT]".equals(this.f3368b);
        AtomicReference atomicReference2 = gVar.f9623f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (gVar) {
                    map = new HashMap(gVar.f9618a);
                }
                gVar.c(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((lh.d) this.f3374h.get()).b();
    }

    public final int hashCode() {
        return this.f3368b.hashCode();
    }

    public final String toString() {
        t0.j jVar = new t0.j((Object) this);
        jVar.g(this.f3368b, "name");
        jVar.g(this.f3369c, "options");
        return jVar.toString();
    }
}
