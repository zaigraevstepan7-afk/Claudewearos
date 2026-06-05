package p0;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import c1.z3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f12588b;

    public /* synthetic */ a(h hVar, int i10) {
        this.f12587a = i10;
        this.f12588b = hVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f12587a) {
            case 0:
                ej.a aVar = (ej.a) obj;
                View view = this.f12588b.f12606a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new c(0, aVar));
                    }
                }
                return pi.o.f13011a;
            case 1:
                ActionMode actionMode = this.f12588b.f12613h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return pi.o.f13011a;
            case 2:
                ActionMode actionMode2 = this.f12588b.f12613h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return pi.o.f13011a;
            default:
                h hVar = this.f12588b;
                hVar.f12610e.d();
                return new z3(hVar, 10);
        }
    }
}
