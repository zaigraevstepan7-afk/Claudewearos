package p2;

import android.view.MotionEvent;
import v2.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3.w f12695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(v3.w wVar, int i10) {
        super(1);
        this.f12694a = i10;
        this.f12695b = wVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f12694a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                v3.w wVar = this.f12695b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = wVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = wVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                break;
            case 1:
                r1 r1Var = (r1) obj;
                w2.t tVar = r1Var instanceof w2.t ? (w2.t) r1Var : null;
                v3.w wVar2 = this.f12695b;
                if (tVar != null) {
                    tVar.getAndroidViewsHandler$ui().removeViewInLayout(wVar2);
                    fj.y.b(tVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(tVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(wVar2));
                    wVar2.setImportantForAccessibility(0);
                }
                wVar2.removeAllViewsInLayout();
                break;
            default:
                this.f12695b.J = (ej.c) obj;
                break;
        }
        return pi.o.f13011a;
    }
}
