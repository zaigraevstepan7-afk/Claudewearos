package qb;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import b2.e;
import f1.j1;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f13332a;

    public a(b bVar) {
        this.f13332a = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        l.f(drawable, "d");
        b bVar = this.f13332a;
        j1 j1Var = bVar.f13334z;
        j1Var.setValue(Integer.valueOf(((Number) j1Var.getValue()).intValue() + 1));
        bVar.A.setValue(new e(c.a(bVar.f13333f)));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pi.e] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        l.f(drawable, "d");
        l.f(runnable, "what");
        ((Handler) c.f13335a.getValue()).postAtTime(runnable, j);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pi.e] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        l.f(drawable, "d");
        l.f(runnable, "what");
        ((Handler) c.f13335a.getValue()).removeCallbacks(runnable);
    }
}
