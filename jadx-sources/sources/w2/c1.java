package w2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f18217a;

    public c1(d1 d1Var) {
        this.f18217a = d1Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f18217a.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        d1 d1Var = this.f18217a;
        d1Var.f18231f.f1519a.clear();
        b3.d dVar = d1Var.f18232g;
        synchronized (dVar) {
            dVar.f1520a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        d1 d1Var = this.f18217a;
        d1Var.f18231f.f1519a.clear();
        b3.d dVar = d1Var.f18232g;
        synchronized (dVar) {
            dVar.f1520a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z2) {
        this.f18217a.f18243s.f18367a.setValue(Boolean.valueOf(z2));
    }
}
