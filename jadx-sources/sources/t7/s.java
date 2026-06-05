package t7;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.work.Worker;
import java.lang.reflect.Field;
import m.t0;
import t4.l0;
import w5.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16131b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f16130a = i10;
        this.f16131b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i10 = this.f16130a;
        Object obj = this.f16131b;
        switch (i10) {
            case 0:
                Worker worker = (Worker) obj;
                try {
                    worker.f1224f.h(worker.doWork());
                    return;
                } catch (Throwable th2) {
                    worker.f1224f.i(th2);
                    return;
                }
            case 1:
                w2.t tVar = (w2.t) obj;
                tVar.removeCallbacks(this);
                MotionEvent motionEvent = tVar.P0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i11 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i11 = 2;
                }
                w2.t tVar2 = (w2.t) obj;
                tVar2.M(motionEvent, i11, tVar2.Q0, false);
                return;
            case 2:
                w5.p pVar = (w5.p) obj;
                pVar.f18713p0.onDismiss(pVar.x0);
                return;
            case 3:
                w5.t tVar3 = (w5.t) obj;
                if (tVar3.f18758c0 != null) {
                    tVar3.k().getClass();
                    return;
                }
                return;
            case 4:
                ((i0) obj).z(true);
                return;
            case 5:
                w8.l lVar = (w8.l) obj;
                w8.a aVar = lVar.f18970b;
                aVar.n(0);
                w8.c cVar = w8.u.f18987k;
                aVar.s(24, 6, cVar);
                lVar.a(cVar);
                return;
            case 6:
                w8.c cVar2 = w8.u.f18987k;
                ((w8.a) obj).s(24, 3, cVar2);
                l7.n.g(cVar2);
                return;
            default:
                y4.d dVar = (y4.d) obj;
                t0 t0Var = dVar.f20214c;
                y4.a aVar2 = dVar.f20212a;
                if (dVar.H) {
                    if (dVar.F) {
                        dVar.F = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f20207e = jCurrentAnimationTimeMillis;
                        aVar2.f20209g = -1L;
                        aVar2.f20208f = jCurrentAnimationTimeMillis;
                        aVar2.f20210h = 0.5f;
                    }
                    if ((aVar2.f20209g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f20209g + aVar2.f20211i) || !dVar.e()) {
                        dVar.H = false;
                        return;
                    }
                    if (dVar.G) {
                        dVar.G = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        t0Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f20208f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar2.f20208f;
                    aVar2.f20208f = jCurrentAnimationTimeMillis2;
                    dVar.J.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f20206d));
                    Field field = l0.f15744a;
                    t0Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s(w8.a aVar, l7.n nVar) {
        this.f16130a = 6;
        this.f16131b = aVar;
    }
}
