package w2;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o2 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18347a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18349c;

    public o2(w5.y yVar, w5.n0 n0Var) {
        this.f18349c = yVar;
        this.f18348b = n0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f18347a) {
            case 0:
                break;
            default:
                w5.n0 n0Var = (w5.n0) this.f18348b;
                w5.t tVar = n0Var.f18698c;
                n0Var.k();
                w5.m.i((ViewGroup) tVar.Z.getParent(), ((w5.y) this.f18349c).f18785a).h();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f18347a) {
            case 0:
                ((View) this.f18348b).removeOnAttachStateChangeListener(this);
                ((f1.a2) this.f18349c).x();
                break;
        }
    }

    public o2(View view, f1.a2 a2Var) {
        this.f18348b = view;
        this.f18349c = a2Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
