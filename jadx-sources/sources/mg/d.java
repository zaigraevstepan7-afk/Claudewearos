package mg;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import rg.e0;
import rg.i0;
import ug.m;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final rg.k f11673a;

    /* renamed from: b, reason: collision with root package name */
    public final rg.h f11674b;

    /* renamed from: c, reason: collision with root package name */
    public final wg.g f11675c = wg.g.f19299f;

    public d(rg.k kVar, rg.h hVar) {
        this.f11673a = kVar;
        this.f11674b = hVar;
    }

    public final void a(l lVar) {
        e0 e0Var = new e0(this.f11673a, lVar, e());
        i0 i0Var = i0.f14425b;
        synchronized (i0Var.f14426a) {
            try {
                List arrayList = (List) i0Var.f14426a.get(e0Var);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    i0Var.f14426a.put(e0Var, arrayList);
                }
                arrayList.add(e0Var);
                if (!e0Var.f14407f.b()) {
                    rg.f fVarA = e0Var.a(wg.h.a(e0Var.f14407f.f19305a));
                    List arrayList2 = (List) i0Var.f14426a.get(fVarA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        i0Var.f14426a.put(fVarA, arrayList2);
                    }
                    arrayList2.add(e0Var);
                }
                boolean z2 = true;
                e0Var.f14410c = true;
                ug.l.c(!e0Var.f14408a.get());
                if (e0Var.f14409b != null) {
                    z2 = false;
                }
                ug.l.c(z2);
                e0Var.f14409b = i0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11673a.j(new j(this, e0Var, 1));
    }

    public final d b(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        rg.h hVar = this.f11674b;
        if (hVar.isEmpty()) {
            m.b(str);
        } else {
            m.a(str);
        }
        return new d(this.f11673a, hVar.e(new rg.h(str)));
    }

    public final Task c() {
        rg.k kVar = this.f11673a;
        kVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        kVar.j(new ad.f(5, kVar, this, taskCompletionSource, kVar, false));
        return taskCompletionSource.getTask();
    }

    public final String d() {
        rg.h hVar = this.f11674b;
        if (hVar.isEmpty()) {
            return null;
        }
        return hVar.y().f20592a;
    }

    public final wg.h e() {
        return new wg.h(this.f11674b, this.f11675c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && toString().equals(obj.toString());
    }

    public final void f(l lVar) {
        e0 e0Var = new e0(this.f11673a, lVar, e());
        i0 i0Var = i0.f14425b;
        synchronized (i0Var.f14426a) {
            try {
                List list = (List) i0Var.f14426a.get(e0Var);
                if (list != null && !list.isEmpty()) {
                    if (e0Var.f14407f.b()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            rg.f fVar = (rg.f) list.get(size);
                            if (!hashSet.contains(fVar.d())) {
                                hashSet.add(fVar.d());
                                fVar.g();
                            }
                        }
                    } else {
                        ((rg.f) list.get(0)).g();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11673a.j(new j(this, e0Var, 0));
    }

    public final Task g(Object obj) {
        rg.h hVar = this.f11674b;
        r rVarM = u0.l.m(hVar, null);
        Pattern pattern = m.f17083a;
        zg.c cVarZ = hVar.z();
        if (cVarZ != null && cVarZ.f20592a.startsWith(".")) {
            throw new c("Invalid write location: " + hVar.toString());
        }
        ah.a aVar = new ah.a();
        aVar.f457a = new ArrayList();
        aVar.f458b = 0;
        hVar.getClass();
        og.l lVar = new og.l(hVar);
        while (lVar.hasNext()) {
            aVar.f457a.add(((zg.c) lVar.next()).f20592a);
        }
        aVar.f458b = Math.max(1, aVar.f457a.size());
        for (int i10 = 0; i10 < aVar.f457a.size(); i10++) {
            aVar.f458b = ah.a.f((CharSequence) aVar.f457a.get(i10)) + aVar.f458b;
        }
        aVar.c();
        aVar.g(obj);
        Object objF = vg.b.f(obj);
        m.c(objF);
        r rVarB = u0.c.b(objF, rVarM);
        char[] cArr = ug.l.f17082a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ug.k kVar = new ug.k(taskCompletionSource);
        Task task = taskCompletionSource.getTask();
        this.f11673a.j(new b8.b(this, rVarB, new ug.g(task, kVar), 5));
        return task;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        rg.h hVarA = this.f11674b.A();
        rg.k kVar = this.f11673a;
        d dVar = hVarA != null ? new d(kVar, hVarA) : null;
        if (dVar == null) {
            return kVar.f14431a.toString();
        }
        try {
            return dVar.toString() + "/" + URLEncoder.encode(d(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            throw new c("Failed to URLEncode key: " + d(), e10);
        }
    }
}
