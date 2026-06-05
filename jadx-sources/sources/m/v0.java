package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.a f11198b;

    public /* synthetic */ v0(l.a aVar, int i10) {
        this.f11197a = i10;
        this.f11198b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11197a) {
            case 0:
                ViewParent parent = this.f11198b.f9754d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                l.a aVar = this.f11198b;
                aVar.a();
                View view = aVar.f9754d;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    aVar.f9757z = true;
                    break;
                }
                break;
        }
    }
}
