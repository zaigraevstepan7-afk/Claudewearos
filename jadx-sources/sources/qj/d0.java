package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f13564a;

    static {
        String property;
        g0 g0Var;
        int i10 = vj.t.f18123a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            xj.e eVar = m0.f13601a;
            rj.d dVar = vj.n.f18117a;
            rj.d dVar2 = dVar.f14555f;
            g0Var = dVar;
            if (dVar == null) {
                g0Var = c0.C;
            }
        } else {
            g0Var = c0.C;
        }
        f13564a = g0Var;
    }
}
