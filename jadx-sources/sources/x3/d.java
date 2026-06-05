package x3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends u2.b {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19812d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19813e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19814f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19815g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19816h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19812d = atomicReferenceFieldUpdater;
        this.f19813e = atomicReferenceFieldUpdater2;
        this.f19814f = atomicReferenceFieldUpdater3;
        this.f19815g = atomicReferenceFieldUpdater4;
        this.f19816h = atomicReferenceFieldUpdater5;
    }

    @Override // u2.b
    public final boolean b(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19815g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // u2.b
    public final boolean c(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19816h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // u2.b
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19814f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // u2.b
    public final void n(f fVar, f fVar2) {
        this.f19813e.lazySet(fVar, fVar2);
    }

    @Override // u2.b
    public final void o(f fVar, Thread thread) {
        this.f19812d.lazySet(fVar, thread);
    }
}
