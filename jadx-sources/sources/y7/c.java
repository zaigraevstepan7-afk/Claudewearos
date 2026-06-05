package y7;

import a8.h;
import a8.i;
import a8.j;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import t7.m;
import z7.d;
import z7.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements z7.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20232d = m.l("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f20233a;

    /* renamed from: b, reason: collision with root package name */
    public final z7.c[] f20234b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20235c;

    public c(Context context, f8.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20233a = bVar;
        this.f20234b = new z7.c[]{new z7.a((a8.a) j.A(applicationContext, aVar).f215a, 0), new z7.a((a8.b) j.A(applicationContext, aVar).f216b, 1), new z7.a((i) j.A(applicationContext, aVar).f218d, 4), new z7.a((h) j.A(applicationContext, aVar).f217c, 2), new z7.a((h) j.A(applicationContext, aVar).f217c, 3), new e((h) j.A(applicationContext, aVar).f217c), new d((h) j.A(applicationContext, aVar).f217c)};
        this.f20235c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f20235c) {
            try {
                for (z7.c cVar : this.f20234b) {
                    Object obj = cVar.f20462b;
                    if (obj != null && cVar.b(obj) && cVar.f20461a.contains(str)) {
                        m.g().c(f20232d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f20235c) {
            try {
                for (z7.c cVar : this.f20234b) {
                    if (cVar.f20464d != null) {
                        cVar.f20464d = null;
                        cVar.d(null, cVar.f20462b);
                    }
                }
                for (z7.c cVar2 : this.f20234b) {
                    cVar2.c(collection);
                }
                for (z7.c cVar3 : this.f20234b) {
                    if (cVar3.f20464d != this) {
                        cVar3.f20464d = this;
                        cVar3.d(this, cVar3.f20462b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f20235c) {
            try {
                for (z7.c cVar : this.f20234b) {
                    ArrayList arrayList = cVar.f20461a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f20463c.b(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
