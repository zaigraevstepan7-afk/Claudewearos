package c;

import android.window.OnBackInvokedDispatcher;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1802a;

    /* renamed from: b, reason: collision with root package name */
    public final wh.s f1803b;

    /* renamed from: c, reason: collision with root package name */
    public final z f1804c;

    public b0(Runnable runnable) {
        this.f1802a = runnable;
        ac.h hVar = new ac.h(this, 5);
        wh.s sVar = new wh.s();
        sVar.f19379a = hVar;
        sVar.f19380b = new j6.g();
        new LinkedHashSet();
        sVar.f19381c = new LinkedHashSet();
        sVar.f19382d = new LinkedHashSet();
        this.f1803b = sVar;
        z zVar = new z();
        this.f1804c = zVar;
        sVar.b(zVar);
    }

    public final void a(androidx.lifecycle.t tVar, x xVar) {
        fj.l.f(xVar, "onBackPressedCallback");
        androidx.lifecycle.v vVarH = tVar.h();
        if (vVarH.f1141c == androidx.lifecycle.o.f1111a) {
            return;
        }
        w wVar = new w(xVar, new y(tVar, xVar));
        xVar.f1862a.add(wVar);
        wVar.g(false);
        wh.s.a(this.f1803b, wVar);
        a0 a0Var = new a0(wVar, this, vVarH);
        vVarH.a(a0Var);
        xVar.f1864c.add(a0Var);
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        j6.k kVar = new j6.k(onBackInvokedDispatcher, 0);
        wh.s sVar = this.f1803b;
        sVar.c(kVar, 1);
        sVar.c(new j6.k(onBackInvokedDispatcher, 1000000), 0);
    }
}
