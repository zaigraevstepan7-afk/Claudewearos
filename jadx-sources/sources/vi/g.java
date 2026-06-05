package vi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(ti.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != ti.i.f16336a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // ti.c
    public final ti.h getContext() {
        return ti.i.f16336a;
    }
}
