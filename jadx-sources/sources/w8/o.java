package w8;

import java.util.function.Consumer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18974a = 1;

    public /* synthetic */ o() {
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f18974a) {
            case 0:
                l7.n.g((c) obj);
                return;
            default:
                if (((b) obj) == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
                return;
        }
    }

    public /* synthetic */ o(l7.n nVar) {
    }
}
