package tj;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s0 extends uj.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f16443a = new AtomicReference(null);

    @Override // uj.d
    public final boolean a(uj.b bVar) {
        AtomicReference atomicReference = this.f16443a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(i0.f16381b);
        return true;
    }

    @Override // uj.d
    public final ti.c[] b(uj.b bVar) {
        this.f16443a.set(null);
        return uj.c.f17100a;
    }
}
