package pi;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13004c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile ej.a f13005a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f13006b;

    @Override // pi.e
    public final Object getValue() {
        Object obj = this.f13006b;
        n nVar = n.f13010a;
        if (obj != nVar) {
            return obj;
        }
        ej.a aVar = this.f13005a;
        if (aVar != null) {
            Object objA = aVar.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13004c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != nVar) {
                }
            }
            this.f13005a = null;
            return objA;
        }
        return this.f13006b;
    }

    public final String toString() {
        return this.f13006b != n.f13010a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
