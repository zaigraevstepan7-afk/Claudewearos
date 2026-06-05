package w2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends qj.v {
    public static final pi.m F = u6.v.Q(g0.f18284z);
    public static final ag.a G = new ag.a(11);
    public boolean B;
    public boolean C;
    public final f1.e E;

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f18311c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f18312d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18313e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final qi.j f18314f = new qi.j();

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f18315z = new ArrayList();
    public ArrayList A = new ArrayList();
    public final k0 D = new k0(this);

    public l0(Choreographer choreographer, Handler handler) {
        this.f18311c = choreographer;
        this.f18312d = handler;
        this.E = new f1.e(choreographer, this);
    }

    public static final void i0(l0 l0Var) {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (l0Var.f18313e) {
                qi.j jVar = l0Var.f18314f;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (l0Var.f18313e) {
                    qi.j jVar2 = l0Var.f18314f;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (l0Var.f18313e) {
                if (l0Var.f18314f.isEmpty()) {
                    z2 = false;
                    l0Var.B = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    @Override // qj.v
    public final void e0(ti.h hVar, Runnable runnable) {
        synchronized (this.f18313e) {
            this.f18314f.addLast(runnable);
            if (!this.B) {
                this.B = true;
                this.f18312d.post(this.D);
                if (!this.C) {
                    this.C = true;
                    this.f18311c.postFrameCallback(this.D);
                }
            }
        }
    }
}
