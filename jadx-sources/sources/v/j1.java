package v;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f17238a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final yj.c f17239b = new yj.c();

    public static final void a(j1 j1Var, h1 h1Var) {
        AtomicReference atomicReference = j1Var.f17238a;
        while (true) {
            h1 h1Var2 = (h1) atomicReference.get();
            if (h1Var2 != null && h1Var.f17215a.compareTo(h1Var2.f17215a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(h1Var2, h1Var)) {
                if (atomicReference.get() != h1Var2) {
                    break;
                }
            }
            if (h1Var2 != null) {
                h1Var2.f17216b.e(new g1("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
