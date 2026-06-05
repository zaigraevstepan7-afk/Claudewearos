package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final f6.b f1156a = new f6.b();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        f6.b bVar = this.f1156a;
        if (bVar != null) {
            if (bVar.f6648d) {
                f6.b.a(autoCloseable);
                return;
            }
            synchronized (bVar.f6645a) {
                autoCloseable2 = (AutoCloseable) bVar.f6646b.put(str, autoCloseable);
            }
            f6.b.a(autoCloseable2);
        }
    }

    public final void b() {
        f6.b bVar = this.f1156a;
        if (bVar != null && !bVar.f6648d) {
            bVar.f6648d = true;
            synchronized (bVar.f6645a) {
                try {
                    Iterator it = bVar.f6646b.values().iterator();
                    while (it.hasNext()) {
                        f6.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f6647c.iterator();
                    while (it2.hasNext()) {
                        f6.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f6647c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        f6.b bVar = this.f1156a;
        if (bVar == null) {
            return null;
        }
        synchronized (bVar.f6645a) {
            autoCloseable = (AutoCloseable) bVar.f6646b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
