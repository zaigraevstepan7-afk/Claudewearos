package w2;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m1 implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.x f18329a;

    public m1(com.google.android.gms.common.api.internal.x xVar) {
        this.f18329a = xVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        com.google.android.gms.common.api.internal.x xVar = this.f18329a;
        p pVar = (p) xVar.f3598d;
        if (!xVar.f3597c) {
            int i10 = xVar.f3596b;
            if (i10 == 1) {
                if (Math.abs(f10) > Math.abs(f11)) {
                    ((a2.q) pVar.f18351b.getFocusOwner()).g(f10 > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i10 == 2 && Math.abs(f11) > Math.abs(f10)) {
                ((a2.q) pVar.f18351b.getFocusOwner()).g(f11 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
