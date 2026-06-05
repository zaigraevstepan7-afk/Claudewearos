package w2;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f18303b;

    public /* synthetic */ j(t tVar, int i10) {
        this.f18302a = i10;
        this.f18303b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18302a) {
            case 0:
                t tVar = this.f18303b;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!tVar.B.isEmpty()) {
                    try {
                        ((ej.a) tVar.B.removeLast()).a();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                t tVar2 = this.f18303b;
                tVar2.X0 = false;
                MotionEvent motionEvent = tVar2.P0;
                fj.l.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                tVar2.L(motionEvent);
                return;
            case 2:
                t.p(this.f18303b.getRoot());
                return;
            default:
                t.p(this.f18303b.getRoot());
                return;
        }
    }
}
