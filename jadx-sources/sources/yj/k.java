package yj;

import java.util.concurrent.atomic.AtomicReferenceArray;
import vj.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f20332e;

    public k(long j, k kVar, int i10) {
        super(j, kVar, i10);
        this.f20332e = new AtomicReferenceArray(j.f20331f);
    }

    @Override // vj.r
    public final int g() {
        return j.f20331f;
    }

    @Override // vj.r
    public final void h(int i10, ti.h hVar) {
        this.f20332e.set(i10, j.f20330e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f18121c + ", hashCode=" + hashCode() + ']';
    }
}
