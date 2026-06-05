package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1824a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1825b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f1827d;

    public j(m mVar) {
        this.f1827d = mVar;
    }

    public final void a(View view) {
        if (this.f1826c) {
            return;
        }
        this.f1826c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fj.l.f(runnable, "runnable");
        this.f1825b = runnable;
        View decorView = this.f1827d.getWindow().getDecorView();
        fj.l.e(decorView, "getDecorView(...)");
        if (!this.f1826c) {
            decorView.postOnAnimation(new ac.o(this, 4));
        } else if (fj.l.b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1825b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1824a) {
                this.f1826c = false;
                this.f1827d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1825b = null;
        v vVar = (v) this.f1827d.f1846z.getValue();
        synchronized (vVar.f1857b) {
            z2 = vVar.f1858c;
        }
        if (z2) {
            this.f1826c = false;
            this.f1827d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1827d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
