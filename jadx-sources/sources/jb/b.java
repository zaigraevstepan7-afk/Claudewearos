package jb;

import android.content.Context;
import android.view.OrientationEventListener;
import f1.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f8799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, a1 a1Var) {
        super(context);
        this.f8799a = a1Var;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        if (i10 == -1) {
            return;
        }
        h hVar = ((i10 < 0 || i10 >= 46) && (315 > i10 || i10 >= 361)) ? (46 > i10 || i10 >= 136) ? (225 > i10 || i10 >= 315) ? h.f8837b : h.f8839d : h.f8838c : h.f8837b;
        a1 a1Var = this.f8799a;
        if (hVar != ((h) a1Var.getValue())) {
            a1Var.setValue(hVar);
        }
    }
}
