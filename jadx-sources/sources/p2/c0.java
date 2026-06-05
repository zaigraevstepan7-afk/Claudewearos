package p2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f12679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i10) {
        super(1);
        this.f12678a = i10;
        this.f12679b = d0Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f12678a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                e0 e0Var = this.f12679b.f12688b;
                if (e0Var != null) {
                    e0Var.invoke(motionEvent);
                    return pi.o.f13011a;
                }
                fj.l.l("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                e0 e0Var2 = this.f12679b.f12688b;
                if (e0Var2 != null) {
                    e0Var2.invoke(motionEvent2);
                    return pi.o.f13011a;
                }
                fj.l.l("onTouchEvent");
                throw null;
        }
    }
}
