package ti;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements c, vi.d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16337b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final c f16338a;
    private volatile Object result;

    public j(c cVar) {
        ui.a aVar = ui.a.f17085a;
        this.f16338a = cVar;
        this.result = aVar;
    }

    @Override // vi.d
    public final vi.d getCallerFrame() {
        c cVar = this.f16338a;
        if (cVar instanceof vi.d) {
            return (vi.d) cVar;
        }
        return null;
    }

    @Override // ti.c
    public final h getContext() {
        return this.f16338a.getContext();
    }

    @Override // ti.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            ui.a aVar = ui.a.f17086b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16337b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            ui.a aVar2 = ui.a.f17085a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16337b;
            ui.a aVar3 = ui.a.f17087c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f16338a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f16338a;
    }
}
