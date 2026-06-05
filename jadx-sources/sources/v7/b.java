package v7;

import a8.e;
import ac.d;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import c8.i;
import d8.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t.m1;
import t7.m;
import u7.c;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements c, y7.b, u7.a {
    public static final String B = m.l("GreedyScheduler");
    public Boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f17874a;

    /* renamed from: b, reason: collision with root package name */
    public final k f17875b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.c f17876c;

    /* renamed from: e, reason: collision with root package name */
    public final a f17878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17879f;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f17877d = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final Object f17880z = new Object();

    public b(Context context, t7.b bVar, d dVar, k kVar) {
        this.f17874a = context;
        this.f17875b = kVar;
        this.f17876c = new y7.c(context, dVar, this);
        this.f17878e = new a(this, bVar.f16097e);
    }

    @Override // u7.c
    public final boolean a() {
        return false;
    }

    @Override // u7.a
    public final void b(String str, boolean z2) {
        synchronized (this.f17880z) {
            try {
                Iterator it = this.f17877d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f3121a.equals(str)) {
                        m.g().c(B, "Stopping tracking for " + str, new Throwable[0]);
                        this.f17877d.remove(iVar);
                        this.f17876c.b(this.f17877d);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u7.c
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.A;
        k kVar = this.f17875b;
        if (bool == null) {
            this.A = Boolean.valueOf(g.a(this.f17874a, kVar.f16841c));
        }
        boolean zBooleanValue = this.A.booleanValue();
        String str2 = B;
        if (!zBooleanValue) {
            m.g().i(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f17879f) {
            kVar.f16845g.a(this);
            this.f17879f = true;
        }
        m.g().c(str2, m1.i("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f17878e;
        if (aVar != null && (runnable = (Runnable) aVar.f17873c.remove(str)) != null) {
            ((Handler) aVar.f17872b.f12813b).removeCallbacks(runnable);
        }
        kVar.u0(str);
    }

    @Override // u7.c
    public final void d(i... iVarArr) {
        if (this.A == null) {
            this.A = Boolean.valueOf(g.a(this.f17874a, this.f17875b.f16841c));
        }
        if (!this.A.booleanValue()) {
            m.g().i(B, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f17879f) {
            this.f17875b.f16845g.a(this);
            this.f17879f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long jA = iVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iVar.f3122b == 1) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f17878e;
                    if (aVar != null) {
                        p7.k kVar = aVar.f17872b;
                        HashMap map = aVar.f17873c;
                        Runnable runnable = (Runnable) map.remove(iVar.f3121a);
                        if (runnable != null) {
                            ((Handler) kVar.f12813b).removeCallbacks(runnable);
                        }
                        e eVar = new e(24, aVar, iVar);
                        map.put(iVar.f3121a, eVar);
                        ((Handler) kVar.f12813b).postDelayed(eVar, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    t7.c cVar = iVar.j;
                    if (cVar.f16104c) {
                        m.g().c(B, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (cVar.f16109h.f16112a.size() > 0) {
                        m.g().c(B, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f3121a);
                    }
                } else {
                    m.g().c(B, m1.i("Starting work for ", iVar.f3121a), new Throwable[0]);
                    this.f17875b.t0(iVar.f3121a, null);
                }
            }
        }
        synchronized (this.f17880z) {
            try {
                if (!hashSet.isEmpty()) {
                    m.g().c(B, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f17877d.addAll(hashSet);
                    this.f17876c.b(this.f17877d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y7.b
    public final void e(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            m.g().c(B, m1.i("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f17875b.u0(str);
        }
    }

    @Override // y7.b
    public final void f(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            m.g().c(B, m1.i("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f17875b.t0(str, null);
        }
    }
}
