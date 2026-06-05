package w2;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f18308a;

    public k0(l0 l0Var) {
        this.f18308a = l0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f18308a.f18312d.removeCallbacks(this);
        l0.i0(this.f18308a);
        l0 l0Var = this.f18308a;
        synchronized (l0Var.f18313e) {
            if (l0Var.C) {
                l0Var.C = false;
                ArrayList arrayList = l0Var.f18315z;
                l0Var.f18315z = l0Var.A;
                l0Var.A = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0.i0(this.f18308a);
        l0 l0Var = this.f18308a;
        synchronized (l0Var.f18313e) {
            if (l0Var.f18315z.isEmpty()) {
                l0Var.f18311c.removeFrameCallback(this);
                l0Var.C = false;
            }
        }
    }
}
