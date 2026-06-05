package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13630a = new ThreadLocal();

    public static w0 a() {
        ThreadLocal threadLocal = f13630a;
        w0 w0Var = (w0) threadLocal.get();
        if (w0Var != null) {
            return w0Var;
        }
        h hVar = new h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }
}
