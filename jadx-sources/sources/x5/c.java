package x5;

import android.util.Log;
import fj.l;
import w5.i0;
import w5.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19834a = b.f19833a;

    public static b a(t tVar) {
        while (tVar != null) {
            if (tVar.N != null && tVar.D) {
                tVar.o();
            }
            tVar = tVar.P;
        }
        return f19834a;
    }

    public static void b(e eVar) {
        if (i0.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(eVar.f19836a.getClass().getName()), eVar);
        }
    }

    public static final void c(t tVar, String str) {
        l.f(str, "previousFragmentId");
        b(new a(tVar, "Attempting to reuse fragment " + tVar + " with previous ID " + str));
        a(tVar).getClass();
    }
}
