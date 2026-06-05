package vj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18090a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18091b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void b() {
        f18091b.set(this, null);
    }

    public final c c() {
        Object obj = f18090a.get(this);
        if (obj == b.f18083a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c cVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18091b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.d()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c cVarC2 = c();
            fj.l.c(cVarC2);
            while (cVarC2.d() && (cVarC = cVarC2.c()) != null) {
                cVarC2 = cVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cVarC2);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVarC2, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(cVarC2) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f18090a.set(cVar, cVarC2);
            }
            if (!cVarC2.d() || cVarC2.c() == null) {
                if (cVar == null || !cVar.d()) {
                    return;
                }
            }
        }
    }
}
