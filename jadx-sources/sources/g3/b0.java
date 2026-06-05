package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f7039a = new b0();

    @Override // ej.c
    public final Object invoke(Object obj) {
        if (fj.l.b(obj, Boolean.FALSE)) {
            return new c2.w(c2.w.f3058h);
        }
        fj.l.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return new c2.w(c2.e0.c(((Integer) obj).intValue()));
    }
}
