package rg;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public g f14409b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14408a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f14410c = false;

    public abstract f a(wg.h hVar);

    public abstract wg.d b(wg.c cVar, wg.h hVar);

    public abstract void c(mg.b bVar);

    public abstract wg.h d();

    public abstract boolean e(f fVar);

    public abstract boolean f(int i10);

    public final void g() {
        g gVar;
        int i10 = 0;
        boolean z2 = true;
        if (!this.f14408a.compareAndSet(false, true) || (gVar = this.f14409b) == null) {
            return;
        }
        i0 i0Var = (i0) gVar;
        synchronized (i0Var.f14426a) {
            try {
                List list = (List) i0Var.f14426a.get(this);
                int i11 = 0;
                if (list != null) {
                    while (true) {
                        if (i11 >= list.size()) {
                            i11 = 0;
                            break;
                        } else {
                            if (list.get(i11) == this) {
                                list.remove(i11);
                                i11 = 1;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (list.isEmpty()) {
                        i0Var.f14426a.remove(this);
                    }
                }
                if (i11 == 0 && this.f14410c) {
                    z2 = false;
                }
                ug.l.c(z2);
                if (!d().b()) {
                    f fVarA = a(wg.h.a(d().f19305a));
                    List list2 = (List) i0Var.f14426a.get(fVarA);
                    if (list2 != null) {
                        while (true) {
                            if (i10 >= list2.size()) {
                                break;
                            }
                            if (list2.get(i10) == this) {
                                list2.remove(i10);
                                break;
                            }
                            i10++;
                        }
                        if (list2.isEmpty()) {
                            i0Var.f14426a.remove(fVarA);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14409b = null;
    }
}
