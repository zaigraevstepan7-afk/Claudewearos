package e8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends wd.a {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5813d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5814e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5815f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5816g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5817h;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5813d = atomicReferenceFieldUpdater;
        this.f5814e = atomicReferenceFieldUpdater2;
        this.f5815f = atomicReferenceFieldUpdater3;
        this.f5816g = atomicReferenceFieldUpdater4;
        this.f5817h = atomicReferenceFieldUpdater5;
    }

    @Override // wd.a
    public final void L(h hVar, h hVar2) {
        this.f5814e.lazySet(hVar, hVar2);
    }

    @Override // wd.a
    public final void M(h hVar, Thread thread) {
        this.f5813d.lazySet(hVar, thread);
    }

    @Override // wd.a
    public final boolean m(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5816g;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // wd.a
    public final boolean n(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5817h;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // wd.a
    public final boolean o(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5815f;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
